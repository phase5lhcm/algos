package Trees;

public class Main {
    public static void main(String[] args){
//      TreeNode drinks = new TreeNode("Drinks");
//      TreeNode hotDrinks = new TreeNode("Hot");
//      TreeNode coldDrinks = new TreeNode("Cold");
//
//      TreeNode tea = new TreeNode("Tea");
//      TreeNode coffee = new TreeNode("Coffee");
//      TreeNode beer = new TreeNode("Beer");
//      TreeNode soda = new TreeNode("Soda");
//
//      drinks.addChildNode(hotDrinks);
//      drinks.addChildNode(coldDrinks);
//      hotDrinks.addChildNode(tea);
//      hotDrinks.addChildNode(coffee);
//      coldDrinks.addChildNode(beer);
//      coldDrinks.addChildNode(soda);
//      System.out.println(drinks.printChildren(0));

      BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
      BinaryNode n1 = new BinaryNode();
      n1.value = "N1";
      BinaryNode n2 = new BinaryNode();
      n2.value = "N2";
      BinaryNode n3 = new BinaryNode();
      n3.value = "N3";
      BinaryNode n4 = new BinaryNode();
      n4.value = "N4";
      BinaryNode n5 = new BinaryNode();
      n5.value = "N5";
      BinaryNode n6 = new BinaryNode();
      n6.value = "N6";
      BinaryNode n7 = new BinaryNode();
      n7.value = "N7";
      BinaryNode n8 = new BinaryNode();
      n8.value = "N8";
      BinaryNode n9 = new BinaryNode();
      n9.value = "N9";

      n1.left = n2;
      n1.right = n3;
      n2.left = n4;
      n2.right = n5;
      n3.left = n6;
      n3.right = n7;
      n4.left = n8;
      n4.right = n9;
      binaryTreeLL.rootNode = n1;

//      binaryTreeLL.preOrderTraversal(binaryTreeLL.rootNode);
//      binaryTreeLL.inOrderTraversal(binaryTreeLL.rootNode);
      binaryTreeLL.postOrderTraversal(binaryTreeLL.rootNode);
    }
}
