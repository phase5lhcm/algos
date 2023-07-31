//Implementation of a Singly LinkedList
package LinkedLists.SinglyLinkedList;

public class SinglyLinkedList {
    // step 1 - Create head and tail properties
    public Node head;
    public Node tail;
    // we will increment size each time our list grows
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.nextNodeReference = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size += 1;
        return head;
    }
}
