import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //  A Linked List is another kind of list in Java
        //  Internally, an array or list will allocate space in memory to store data in the list (address)
            //  The first element in a list will hold an address, and each subsequent element will have a different address depending on the memory needed to store it
            //  Index / Address (this progresses by four bytes, but other types will vary)
            //  0 / 100
            //  1 / 104
            //  2 / 108

        Customer customer = new Customer("Barrett", 93.84);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(13.77);
        System.out.println("Balance for customer " + customer.getName() + " is $" + customer.getBalance());
        //  Changing the balance of anotherCustomer will change the balance of customer.
        //  anotherCustomer is pointing to one location in memory, not creating a new location.

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(5);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        intList.add(1, 2);
        System.out.println("Adding 2 to index position 1");
        //  Elements originally at position 1 and 2 have now been moved down in memory to make room for the new element
        //  Same in reverse, when elements are removed.  Elements moved up in memory to fill the gap
        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        //  A Linked List is an alternative to arrays.  It stores the its value, as well as the link to the next item's memory location
        //  This way, instead of shifting every changed item's location in memory, you can simply change the location link to the next item

    }
}
