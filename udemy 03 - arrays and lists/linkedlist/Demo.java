import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Tokyo");
        addInOrder(placesToVisit, "Madrid");
        addInOrder(placesToVisit, "Berlin");
        addInOrder(placesToVisit, "Oslo");
        addInOrder(placesToVisit, "San Diego");

        printList(placesToVisit);

        //  Let's adjust the order, but it doesn't actually change the memory locations.  It just adjusts the link location in memory
        placesToVisit.add(1, "Boston");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
        visit(placesToVisit);

    }

    //  THIS IS COOL!!!
    private static void printList(LinkedList<String> linkedList) {
        //  Iterator, a way of accessing items in a list.  LinkedLists automatically have them
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);  //  Gives a number.  If 0, means the value in the list is equal to the new city we want to add
            if (comparison == 0) {
                //  Equal, don't add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //  New city should appear before this one
                //  Stored alphabetically
                stringListIterator.previous();  //  Goes back to the previous record, allowing us to add in the proper order
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //  Move to the next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in list");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \nPress");
        System.out.println("0 - Quit");
        System.out.println("1 - Go to next city");
        System.out.println("2 - Go to previous city");
        System.out.println("3 - Display menu");

    }
}
