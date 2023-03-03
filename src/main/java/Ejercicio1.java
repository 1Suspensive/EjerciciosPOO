import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int edadJ,edadAl,edadAn;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cúal es la edad de Juan?: ");
        edadJ = sc.nextInt();
        
        System.out.println("La edad de Juan es: "+edadJ);
        edadAl = (2*edadJ)/3;
        System.out.println("La edad de Alberto es: "+ edadAl);
        edadAn = (4*edadJ)/3;
        System.out.println("La edad de Ana es: "+ edadAn);
        System.out.println("La edad de la mamá de Juan es: "+(edadJ+edadAn+edadAl));

        
    }
}
