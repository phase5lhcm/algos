package Trees;

public class Main {
    public static void main(String[] args){
      TreeNode drinks = new TreeNode("Drinks");
      TreeNode hotDrinks = new TreeNode("Hot");
      TreeNode coldDrinks = new TreeNode("Cold");

      TreeNode tea = new TreeNode("Tea");
      TreeNode coffee = new TreeNode("Coffee");
      TreeNode beer = new TreeNode("Beer");
      TreeNode soda = new TreeNode("Soda");

      drinks.addChildNode(hotDrinks);
      drinks.addChildNode(coldDrinks);
      hotDrinks.addChildNode(tea);
      hotDrinks.addChildNode(coffee);
      coldDrinks.addChildNode(beer);
      coldDrinks.addChildNode(soda);
      System.out.println(drinks.printChildren(0));
    }
}
