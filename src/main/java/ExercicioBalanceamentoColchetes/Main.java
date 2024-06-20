/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioBalanceamentoColchetes;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        ExercicioBalanceamentoColchetes ex = new ExercicioBalanceamentoColchetes();
        
        ExercicioBalanceamentoColchetes.solve("{[)]}");
        ExercicioBalanceamentoColchetes.solve("{()]}");
                
        //boolean result = ex.verificaValidade("{[)]}");
        //System.out.println(result);
    }
}
