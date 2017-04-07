import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        //  Arrays cannot be resized without creating a new array
        //  Java has Lists and Array Lists to deal with this problem

        //  A 'List' is an ordered collection (extends Collection interface)
        //  An 'Array List' inherits from 'Abstract List', basically acting as a resizable array

        //  ArrayList CRUD methods:
            //  .add(value)
            //  .get(index)
            //  .set(index, value)
            //  .remove(index)

        //  ArrayList uses .size() instead of .length

        //  ArrayList .contains(value) returns boolean if value exists in ArrayList

        //  ArrayList can search by value using .indexOv(value)
            //  If it doesn't exists, returns -1

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print instructions");
        System.out.println("\t 1 - To print grocery list");
        System.out.println("\t 2 - To add an item to list");
        System.out.println("\t 3 - To modify item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - Process the list");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please type the name of the item you'd like to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in the list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //  Even faster way of the previous
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        //  Convert ArrayList to Array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
