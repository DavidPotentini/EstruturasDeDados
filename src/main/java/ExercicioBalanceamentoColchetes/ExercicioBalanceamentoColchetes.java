/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioBalanceamentoColchetes;


import java.util.Set;
import java.util.Stack;

/**
 *
 * @author USER
 */
public class ExercicioBalanceamentoColchetes {
    /*
    public class Node{
        private String value;
        
        public Node(String value){
            this.value = value;
        }
    }
    
    public boolean verificaValidade(String expressao){
        Stack<Node> stack = new Stack<>();
        
        for(int i=0; i<expressao.length(); i++){
            String str = String.valueOf(expressao.charAt(i));
            if(str.equals("[") || str.equals("(") || str.equals("{")){
                Node newNode = new Node(str);
                stack.push(newNode);
            }else if(str.equals("]") || str.equals(")") || str.equals("}")){
                if (stack.isEmpty()) {
                    return false;
                }
                Node lastNode = stack.peek();

                if(lastNode.value.equals("[") && str.equals("]")){
                    stack.pop();
                }
                else if(lastNode.value.equals("(") && str.equals(")")){
                    stack.pop();
                }
                else if(lastNode.value.equals("{") && str.equals("}")){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    */
    
    public static boolean solve(String expression){
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();
        
        for(char c: expression.toCharArray()){
            if(openSymbols.contains(c)) stack.push(c);
            if(closeSymbols.contains(c)){
                if(stack.isEmpty()) return false;
                var open = stack.pop();
                if(open == '(' && c != ')') return false;
                if(open == '[' && c != ']') return false;
                if(open == '{' && c != '}') return false;
            }
        }
        return stack.isEmpty();
    }
    

}
