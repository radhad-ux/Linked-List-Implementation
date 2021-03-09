class Node {
    // field 1: the data
    // in our case just an integer
    int elem;
    // field 2: the reference to the next node
    Node next;
    Node(int num) {
        this.elem = num;
        this.next = null;
    }
}

public class LinkedList {

    private Node first = null;

    public void add(int num) {
        // int num is available!

        // step 1: is the linked list still empty?
        if (first == null) {
            // in this case, the linked list is empty
            Node node = new Node(num); // node.next == null
            first = node;
        } else {
            // in this case, the linked list is *not* empty
            // this means, first != null

            // step 2: find the last node

            // Key: introduce a temporary variable!
            // we can then update this temporary variable,
            // without changing "first"!
            // important, since "first" should not be changed!
            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }
            // what do we know about "current"?
            // current.next == null
            // AWESOME!
            // it means, "current" is the last node!

            // step 3: create a new node with the given int "num"
            Node node = new Node(num);

            // step 4: change the reference of the last node to
            // point to the new node
            current.next = node;
        }

    }

    public int searchAnElement(int num) {
        int index = 0;
        if (first == null) {
            return -1;
        } else {
            Node current = first;
            while (current != null) {
                if (current.elem == num) {
                    return index;
                }
                index++;
                current = current.next;
            }
            return -1;
        }
    }
    public int getTheSize () {
        int incValue = 0;
        if (first == null) {
            return incValue;
        }
        Node current = first;
        while (current != null) {
            incValue = incValue + 1;
            current = current.next;
        }
        return incValue;
    }
    public int getAnElement ( int index) {
        int count = 0;//Index of the node we are currently looking at
        if(first == null) {
            return 0;
        } else {
            Node current = first;
            while (current != null) {
                if (count == index)
                    return current.elem;
                count++;
                current = current.next;
            }
            return 0;
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(15);
        list.add(25);
        list.add(30);
        System.out.println(list);
        list.searchAnElement(15);
        System.out.println(list.searchAnElement(15));
        list.getTheSize();
        System.out.println(list.getTheSize());
        list.getAnElement(2);
        System.out.println(list.getAnElement(2));

    }
}
