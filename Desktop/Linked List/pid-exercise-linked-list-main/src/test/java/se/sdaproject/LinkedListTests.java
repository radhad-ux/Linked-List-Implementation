package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }
    @Test
    int searchNumberInList(){
        LinkedList list = new LinkedList();
        list.indexOf(first);
        String expected = "The element found at index 0"
        assertEquals(list.toString(), expected);
    }
    @Test
    int getElementAtGivenIndex(){
        LinkedList list = new LinkedList();
        list.get(0);
        String expected = "The element at given index is 5"
        assertEquals(list.toString(), expected);
    }
    @Test
    int sizeOfTheList(){
        LinkedList list = new LinkedList();
        list.size();
        String expected = "The size of the List is 4"
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }
}
