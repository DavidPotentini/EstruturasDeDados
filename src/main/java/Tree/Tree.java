/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author USER
 */
public class Tree {
    public Node root;

    public class Node{
        private Node left;
        private Node right;
        private int value;
        
        public Node(int value){
        this.value = value;
        }
    }
    
    public void insert(int value){
        if(root == null) root = new Node(value);
        
        Node newNode = new Node(value);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(queue.size()>0){
            Node currentNode = queue.remove();
            
            if(currentNode.left == null){
                currentNode.left = newNode;
                break;
            }else{
                queue.add(currentNode.left);
            }
            
            if(currentNode.right == null){
                currentNode.right = newNode;
                break;
            }else{
                queue.add(currentNode.right);
            }
        }
    }
    
    public void preOrder(){
        preOrder(root);
    }
    
    private void preOrder(Node node) {
        //R E D
        
        if(node == null) return;
    
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }
    
    public void inOrder(){
        inOrder(root);
    }
    
    private void inOrder(Node node) {
        //E R D
        if(node == null) return;
        
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
        
    }
    
    public void posOrder(){
        posOrder(root);
    }
    
    private void posOrder(Node node){
        //E D R
        if(node == null) return;
        
        posOrder(node.left);
        posOrder(node.right);
        System.out.println(node.value);
    }

    public void BFS(){
        if (root == null) return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(queue.size()>0){
        Node currentNode = queue.remove();
        
            if(currentNode.left != null){
                queue.add(currentNode);
            }
            
            if(currentNode.right != null){
                queue.add(currentNode);
            }
            
            System.out.println(currentNode);
        }
        
    }
    
    
}
