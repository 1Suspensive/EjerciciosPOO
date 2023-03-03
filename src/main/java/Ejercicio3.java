/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JEFERSON
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int salarioB;
        double rFuente,salarioN;
        
        salarioB = 5000*48*4;
        rFuente = salarioB*0.125;
        salarioN = salarioB- rFuente;
        
        System.out.println("El salario bruto es: "+salarioB+", la retencion en la fuente es: "+rFuente+", el salario neto es: " +salarioN);
                
    }
}
