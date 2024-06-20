/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author USER
 */
public class Queue {
    private Node first;
    private Node last;
    private int length;
    
    public class Node{
        private Node next;
        private int value;
        
        public Node(int value){
            this.value = value;
        }
    }
    
    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }
    
    public void enqueue(int value){
        Node newNode = new Node(value);
        
        if(length == 0){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        
        length++;
    }
    
    public Node dequeue(){
        Node temp = first;
        
        if(length == 0)return null;
        
        if(length == 1){
            first = null;
            last = null;
        }else{
        first = first.next;
        temp.next = null;
        }
        
        length--;
        
        return temp;
    }
    
    public void getFirst(){
        if(first == null){
            System.out.println("Fila vazia");
        }else{
            System.out.println("Primeiro: "+ first.value);
        }
    }
    
    public void getLast(){
        if(last == null){
            System.out.println("Pilha vazia");
        }else{
            System.out.println("Ultimo: "+ last.value);
        }
    }
    
    public void getLength(){
        System.out.println("Tamanho: "+length);
    }
    
    public void print(){
        System.out.println("###################");
        Node temp = first;
        
        while(temp != null){
           System.out.println(temp.value);
           temp = temp.next;
        }
        System.out.println("###################");
    }
    
}
