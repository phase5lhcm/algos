package Trees;

import java.util.ArrayList;

// create a basic tree
public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChildNode(TreeNode node){
        this.children.add(node);
    }

    public String printChildren(int nodeLevel){
        StringBuilder returnVal;
        returnVal = new StringBuilder(" ".repeat(nodeLevel) + data + "\n");
        for(TreeNode node: this.children){
            returnVal.append(node.printChildren(nodeLevel + 1));
        }
        return returnVal.toString();
    }

}
