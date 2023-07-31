package LinkedLists.SinglyLinkedList;

public class Main {
    public static void main(String[] args){
        SinglyLinkedList sLL = new SinglyLinkedList();
       // sLL.createSinglyLinkedList(5);
      //  System.out.println(sLL.head.value); // prints 5

        sLL.insertIntLinkedList(6,0);
     //   System.out.println(sLL.head.value); // prints 6
    //    System.out.println(sLL.head.nextNodeReference.value); // prints 5
        sLL.insertIntLinkedList(7, 1);
        sLL.insertIntLinkedList(8, 2);
        sLL.insertIntLinkedList(9, 3);
        sLL.traverseSinglyLinkedList();
      //  sLL.searchNode(9);
        sLL.deleteNode(3);
        sLL.traverseSinglyLinkedList();

    }

}
