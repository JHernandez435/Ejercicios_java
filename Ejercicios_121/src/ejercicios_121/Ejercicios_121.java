package ejercicios_121;

import java.util.Scanner;

public class Ejercicios_121 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int n=sc.nextInt();
        int arreglo[]=new int[n];
        int suma=0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("DIGITE LA(S) EDAD(S)["+i+"]");
            arreglo[i]=sc.nextInt();
            suma=suma+arreglo[i];
        }
        
        double promedio=suma/n;
        for (int i = 0; i < n; i++) {
            System.out.println("EDAD(DES) INGRESADA(S): ["+i+"]"+"="+arreglo[i]);
        }
        
        System.out.println("LA SUMA DE LAS EDADES ES :"+suma);
	System.out.println("SU PROMEDIO ES :"+promedio);
        
    }
    
}
