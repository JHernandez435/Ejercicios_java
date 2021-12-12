package ejercicios_119;

import java.util.Scanner;

public class Ejercicios_119 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int n=sc.nextInt();
        String nombre[]=new String[n];
                
        for (int i = 0; i < n; i++) {
            System.out.println("Digite los nombres del arreglo["+i+"]");
            nombre[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
                System.out.println("NOMBRE INGRESADO:"+nombre[i]);
        }
    }
    
}
