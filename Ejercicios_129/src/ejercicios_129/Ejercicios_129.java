package ejercicios_129;

import java.util.Scanner;

public class Ejercicios_129 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el numero de personas:");
        int n=sc.nextInt();
        double valor[]=new double[n];
        double suma=0;
        
        for (int i = 0; i < n-1; i++) {
            System.out.println("DIGITE LA(S) EDAD(S)");
            valor[i]=sc.nextDouble();
            suma=suma+valor[i];
        }
        double promedio=suma/n;

        for (int i = 0; i < n-1; i++) {
          System.out.println("EDAD(DES) INGRESADA(S): ["+i+"]"+"="+valor[i]);
        }    
        
	System.out.println("EL TOTAL DE LAS EDADES ES :"+suma);
	System.out.println("SU PROMEDIO ES :"+promedio);
    }
    
}
