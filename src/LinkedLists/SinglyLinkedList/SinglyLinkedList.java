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

    // Insert a node at any given location
    public void insertIntLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        // check if the linkedlist is already created
        // we will know this if head is null
        // if head is null, create a linked list
        if(head == null){
            // create a singly linked list with at least one node
            createSinglyLinkedList(nodeValue);
            return;
        } else if(location == 0){
            // if a node already exists, go ahead and re-assign the references
            node.nextNodeReference = head;
            head = node;
        } else if (location >= size) { // add the node to the end of the list
            node.nextNodeReference = null;
            tail.nextNodeReference = node;
            tail = node;

        } else { // add the node to a specified location
            Node tempNode = head;
            int index = 0;
            while(index < location -1){ // loop thru the list to find where we are inserting the node
                tempNode = tempNode.nextNodeReference;
                index++;
            }
            Node nextNode = tempNode.nextNodeReference;
            tempNode.nextNodeReference = node;
            node.nextNodeReference = nextNode;
        }
        size += 1;
    }
}