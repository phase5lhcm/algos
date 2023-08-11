package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    public BinaryNode rootNode;

    public BinaryTreeLL(){
        this.rootNode = null;
    }

    // preorder traversal - root node to left subtree to right subtree (runs thru left subtree of right subtree then right nodes of right subtree)
    // and ends and the rightmost node of the right subtree
    void preOrderTraversal(BinaryNode node){
        // base condition
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        // now we visit all nodes in left subtree
        // we will do this recursively
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // in-order traversal - left subtree then right subtree and ends at the deepest, rightmost node of the right subtree
    void inOrderTraversal(BinaryNode node){
        // base condition (if our node is null, then there is no child node(s)
        if(node == null){
            return;
        }

        // we begin by visiting the left sub-tree. We do this recursively
        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        // we then visit the right sub-tree
        inOrderTraversal(node.right);

    }

    // post order traversal - left node to right node to root node in zig-zag method
    void postOrderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");

    }

    // Level order traversal - travels from root node to leftmost node of left subtree to rightmost node of right subtree
    // for each level in the tree. Implemented with a Queue to make use of the FIFO method
    void levelOrder(){
        // step 1 - create a Queue
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(rootNode);

        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }

    }

}
