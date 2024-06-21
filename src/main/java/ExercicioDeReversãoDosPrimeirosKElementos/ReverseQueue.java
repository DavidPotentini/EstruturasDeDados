/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioDeReversãoDosPrimeirosKElementos;

import java.util.Queue;

/**
 *
 * @author USER
 */
public class ReverseQueue {
    
    public Queue<Integer> reverseQueue(Queue<Integer> queue, int k){
        solveQueue(queue, k);
        int n = queue.size() - k;
        
        while(n-- > 0){
            int element = queue.remove();
            queue.add(element);
        }
        
        return queue;
    }
    
    private static void solveQueue(Queue<Integer> queue, int k){
        if(k == 0) return;
        int element = queue.remove();
        solveQueue(queue, k-1);
        queue.add(element);
    } 
}
