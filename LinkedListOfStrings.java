import java.util.NoSuchElementException;

public class LinkedListOfStrings {
    private int N;          // size of list
    private Node first, last;     // first node of list


    // helper Node class
    private static class Node {
        private String item;
        private Node next;
    }

    public LinkedListOfStrings() {
        N = 0;
        first = null;
        last = null;
    }

    // is the list empty?
    public boolean isEmpty() {
        return first == null;
    }

    // number of elements on the stack
    public int size() {
        return N;
    }

    public void addBack(String item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }

    // add an element to the front of the list
    public void addFront(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    // delete and return the first item in the list
    public String delFront() {
        if (isEmpty()) throw new NoSuchElementException("No items in list");
        String item = first.item;      // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }

    public String delBack() {
        if (isEmpty()) {
            throw new NoSuchElementException("No items in list");
        }
        String item;
        if (size() == 1) {
            item = first.item;
            first = null;
            last = null;
        } else {
            Node current = first;
            while (current.next.next != null) {
                current = current.next;
            }
            item = current.next.item;
            current.next = null;
            last = current;
        }
        N--;
        return item;
    }

    // print out the list
    public void printList() {
        Node x = first;
        for (int i = 0; i < N; i++) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    // test client
    public static void main(String[] args) {
        LinkedListOfStrings list = new LinkedListOfStrings();
        list.addBack("einn");
        list.addBack("tveir");
        list.addBack("thrir");

        System.out.println("Number of items: " + list.size());
        for (int i = 0; i < 3; i++) {
            String item = list.delBack();
        }
        System.out.println("Number of items:" + list.size());
        
        list.printList();

    }

}
