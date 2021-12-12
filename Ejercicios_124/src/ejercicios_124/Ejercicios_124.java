package ejercicios_124;

import java.util.Scanner;

public class Ejercicios_124 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int n=sc.nextInt();
        int numero[]=new int[n];
        int a=0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("DIGITE LOS NUMEROS CORRESPONDINTES:");
            numero[i]=sc.nextInt();
            if (numero[i]>0) {
                a=a+1;
            }  
        }

        for (int i = 0; i < n; i++) {
            System.out.println("["+i+"]"+"["+numero[i]+"]");
        }    
       System.out.println("LA CANTIDAD DE NUMEROS POSITIVOS ES =:["+a+"]");
    }
    
}
