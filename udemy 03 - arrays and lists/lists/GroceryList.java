//  Import ArrayList
import java.util.ArrayList;

public class GroceryList {

    //  ArrayLists must designate what type it is between < and >.  In this case, String
    private ArrayList<String> groceryList = new ArrayList<String>();

    //  Method to add an item to the grocery list
    public void addGroceryItem(String item) {
        //  ArrayList includes .add() method to automatically append an element to the ArrayList
        groceryList.add(item);
    }

    //  Get current list
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //  Method to print list contents
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list:");
        for (int i = 0; i < groceryList.size(); i++) {
            //  Note that ArrayLists use .get(index) rather than [index]
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //  Method to replace items in the grocery list
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    //  Overloaded method
    public void modifyGroceryItem(int position, String newItem) {
        //  ArrayList .set(index, value) method
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    //  Method to remove item from the grocery list
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    //  Overloaded method
    public void removeGroceryItem(int position) {
        //  ArrayList .remove(index) method
        groceryList.remove(position);
    }

    //  Method to find an item by name
    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }
}
