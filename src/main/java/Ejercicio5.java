
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JEFERSON
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double radio;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
        
        System.out.print("El area del circulo es: "+(Math.PI*Math.pow(radio,2))+" la longitud de la circunferencia es: "+(2*Math.PI*radio));
                
    }
}
