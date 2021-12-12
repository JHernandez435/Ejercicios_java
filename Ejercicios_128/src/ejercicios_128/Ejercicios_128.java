package ejercicios_128;

import java.util.Scanner;

public class Ejercicios_128 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int n=sc.nextInt();
        double valor[]=new double[n];
              
        for (int i = 0; i < n-1; i++) {
            System.out.println("DIGITE LOS VALORES NUMERICOS");
            valor[i]=sc.nextDouble();
        }
        double b=0;

        for (int i = 0; i < n-1; i++) {
            
            if (valor[i]>b) {
                b=valor[i];
            }
            System.out.println("VALORES INGRESADOS: ["+i+"]"+"="+valor[i]);
        }    
        
	System.out.println("el mayor es ="+b);
    
    }
    
}
