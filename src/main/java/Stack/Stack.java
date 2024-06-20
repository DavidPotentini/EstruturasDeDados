/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author USER
 */
public class Stack {
    private Node top;
    private int height;
    
    public class Node{
        private Node next;
        private int value;
        
        public Node(int value){
            this.value = value;
        }
        
    }
    
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height++;
    }
    
    public void push(int value){
        Node newNode = new Node(value);
        
        if(height == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    
    public Node pop(){
        
        if(height == 0){
            return null;
        }
        
        Node temp = top;
        top = top.next;
        temp.next = null;
        
        height--;
        
        return temp;
    }
    
    public void print(){
        System.out.println("###################");
        Node reader = top;
        
            while(reader != null){
                System.out.println(reader.value);
                reader = reader.next;
            }
        System.out.println("###################");    
    }
    
    public void getTop(){
        if(height == 0){
            System.out.println("Pilha vazia");
        }else{
            System.out.println("Top: "+top.value);
        }
    }
    
    public void getHeight(){
        System.out.println("Height: "+height);
    }
}
