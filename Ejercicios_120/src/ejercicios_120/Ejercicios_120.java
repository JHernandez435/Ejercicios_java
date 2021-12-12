package ejercicios_120;

import java.util.Scanner;

public class Ejercicios_120 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int n=sc.nextInt();
        String nombre[]=new String[n];
                
        for (int i = 0; i < n; i++) {
            System.out.println("DIGITE LOS ELEMENTO(S)["+i+"]");
            nombre[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
                System.out.println("ELEMENTO(S) INGRESADO(S): ["+i+"]"+"="+nombre[i]);
        }
    }
    
}
