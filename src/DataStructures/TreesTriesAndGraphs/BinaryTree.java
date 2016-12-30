package DataStructures.TreesTriesAndGraphs;

/**
 * Simple Binary tree representation
 * Created by dinu on 12/30/16.
 */
public class BinaryTree {

    BinaryTreeNode root;

    public static void preOrderTraversal(BinaryTreeNode root){
        if(root != null){
            System.out.println(root.data);
            if(root.leftChild != null){
                preOrderTraversal(root.leftChild);
            }
            if(root.rightChild != null){
                preOrderTraversal(root.rightChild);
            }
        }

    }

    public static void inOrderTraversal(BinaryTreeNode root){
        if(root != null){
            if(root.leftChild != null){
                inOrderTraversal(root.leftChild);
            }
            System.out.println(root.data);
            if(root.rightChild != null){
                inOrderTraversal(root.rightChild);
            }

        }

    }

    public static void postOrderTraversal(BinaryTreeNode root){
        if(root != null){
            if(root.leftChild != null){
                postOrderTraversal(root.leftChild);
            }
            if(root.rightChild != null){
                postOrderTraversal(root.rightChild);
            }
            System.out.println(root.data);

        }

    }
}

class BinaryTreeNode{
    int data;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
}