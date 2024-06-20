/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author USER
 */
public class LinkedList {
    private Node tail;
    private Node head;
    private int size;
    
    public class Node{
        private Node next;
        private String data;
        
        public Node(String data){
            this.data = data;
        }
    }
    
    public LinkedList(String data) {
        Node newNode = new Node(data);
        tail = newNode;
        head = newNode;
        size++;
    }
    
    public void print(){
        System.out.println("###################");
        Node reader = head;
        
        while(reader != null){
        System.out.println(reader);
        reader = reader.next;
        }
        System.out.println("###################");
    }
    
    public void append(String data){
        Node newNode = new Node(data);
        
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
        tail.next = newNode;
        tail = newNode;
        }
        size++;
    }
    
    public Node removeLast(){
        
        if(size == 0) return null;
        
        Node reader = head;
        Node last = null;
        
        while(reader.next != tail){
        reader = reader.next;
        }
        
        last = tail;
        tail = reader;
        tail.next = null;
        
        size--;
              
        if(size == 0){
            tail = null;
            head = null;
        }
        
        return last;
    }
    
    public void prepend(String data){
        Node newNode = new Node(data);
        
        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
        newNode.next = head;
        head = newNode;
        }
        size++;
    }
    
    public Node removeFirst(){
        if(size == 0) return null;
        
        Node temp = head;
        head = head.next;
        temp.next = null;
        
        size--;
        
        if(size == 0){
            head = null;
            tail = null;
        }
        
        return temp;
    }
    
    public Node get(int index){
        if(index<0 || index >= size) return null;
        Node reader = head;
            
        for(int i=0; i<index; i++){
            reader = reader.next;
        }
        
        return reader;
    }
    
    public boolean insert(String data, int index){
        if(index < 0 || index >=size) return false;
    
        if(index == 0){
            prepend(data);
            return true;
        }
        if(index == size){
            append(data);
            return true;
        }
       
        Node newNode = new Node(data);
        Node reader = get(index - 1);
        
        newNode.next = reader.next;
        reader.next = newNode;
        
        size++;
        
        return true;
    }
    
    public Node remove(int index){
        if(index < 0 || index >=size) return null;
        
        if(index == 0){
            return removeFirst();
        }
        if(index == size-1){
            return removeLast();
        }
        
        Node pre = get(index-1);
        Node temp = pre.next;
        
        pre.next = temp.next;
        temp.next = null;
        
        size--;
        
        return temp;
    }
    
    public void getTail(){
        if(this.tail == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Tail: "+tail.data);
        }
    }
    
    public void getHead(){
        if(this.head == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Head: "+head.data);
        }
    }
    
    public void getTamanho(){
        System.out.println("Tamanho " + size);
    }
    
    public void makeEmpty(){
        head = null;
        tail = null;
        size = 0;
    }
}

    
