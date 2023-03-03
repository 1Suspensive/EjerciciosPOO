
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JEFERSON
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        n = sc.nextDouble();
        
        System.out.print("El cuadrado del número es: "+(Math.pow(n,2))+" el cubo del número es: "+(Math.pow(n,3)));
        
    }
}
