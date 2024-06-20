/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTree;

/**
 *
 * @author USER
 */
public class BinarySearchTree {
    private Node root;
    
    public class Node{
        private Node left;
        private Node right;
        private int value;
    
        public Node(int value){
            this.value = value;
        }
    }
    
    public void insert(int value){
        if (root == null) {
            root = new Node(value);
        }else{
            insert(root, value);
        }
    }
    
    private void insert(Node node, int value) {
        if(node == null) return;
        if(node.value == value) return;
        
        Node newNode = new Node(value);
        
        if(value > node.value){
            if(node.right == null){
                node.right = newNode;
            }else{
                insert(node.right, value);
            }
        }else{
            if(node.left == null){
                node.left = newNode;
            }else{
                insert(node.left, value);
            }
        }
    }
    
    public void contains(int value){
        contains(root, value);
    }
    
    private boolean contains(Node node, int value){
        if(node == null) return false;
        if(node.value == value) return true;
        
        if(value>node.value){
            return contains(node.right, value);
        }else{
            return contains(node.left, value);
        }
    }
    
    public int minValue(Node currentNode){
        
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        
        return currentNode.value;
    }
    
    public void deleteNode(int value){
        deleteNode(root, value);
    }
    
    public Node deleteNode(Node node, int value){
        if (node == null) return null;
        
        if (value > node.value){
            deleteNode(node.right, value);
        }else if(value < node.value){
            deleteNode(node.left, value);
        }else{
            if(node.left == null && node.right == null){
                return null;
            }
            else if(node.right == null){
                return node.left;
            }
            else if(node.left == null){
                return node.left;
            }else{
                int minValue = minValue(node.right);
                node.value = minValue;
                deleteNode(node.right, minValue);
            }
        }
        return node;
    }
}
