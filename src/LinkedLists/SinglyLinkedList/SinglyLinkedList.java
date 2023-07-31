//Implementation of a Singly LinkedList
package LinkedLists.SinglyLinkedList;

public class SinglyLinkedList {
    // step 1 - Create head and tail properties
    public Node head;
    public Node tail;
    // we will increment size each time our list grows
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
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
    public void insertIntLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        // check if the linkedlist is already created
        // we will know this if head is null
        // if head is null, create a linked list
        if (head == null) {
            // create a singly linked list with at least one node
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
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
            while (index < location - 1) { // loop thru the list to find where we are inserting the node
                tempNode = tempNode.nextNodeReference;
                index++;
            }
            Node nextNode = tempNode.nextNodeReference;
            tempNode.nextNodeReference = node;
            node.nextNodeReference = nextNode;
        }
        size += 1;
    }

    // Traverse a SinglyLinkedList
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("The linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println("temp node value: " + tempNode.value);
                if (i != size - 1) {
                    System.out.println(" ->");
                }
                tempNode = tempNode.nextNodeReference;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    boolean searchNode(int nodeValue) {
        // if head is not null then our linked list does exist
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.nextNodeReference;

            }
        }
        System.out.println("Node not found");
        return false;
    }

    // Deleting a node from a SinglyLinkedList
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The list does not exist");
            return;
        } else if (location == 0) {
            // first node is deleted from memory
            head = head.nextNodeReference;
            size -= 1;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.nextNodeReference;
            }
            // deletion if we have one element in list
            if (tempNode == head) {
                tail = head = null;
                size -= 1;
                return;
            }
            // deletion if we have more than one element in our list
            tempNode.nextNodeReference = null;
            tail = tempNode;
            size -= 1;
        } else {
            // deletion given location
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.nextNodeReference;
            }
            tempNode.nextNodeReference = tempNode.nextNodeReference.nextNodeReference;
            size -= 1;
        }
    }

    // Delete an entire SinglyLinkedList
    public void deleteEntireSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("Entire list successfully deleted");
    }
}

