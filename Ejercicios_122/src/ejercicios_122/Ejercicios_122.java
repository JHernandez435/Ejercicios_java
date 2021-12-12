package ejercicios_122;

import java.util.Scanner;

public class Ejercicios_122 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String nombre[]=new String[3];
        int numero[]=new int[4];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("DIGITE LOS NOMBRES CORREPONDINTES:");
            nombre[i]=sc.next();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("LOS NOMBRES INGRESADOS SON: ["+i+"]"+"="+nombre[i]);
        }
        
         for (int i = 0; i < 3; i++) {
            System.out.println("DIGITE LOS NUMEROS CORRESPONDINTES:");
            numero[i]=sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("LOS NUMEROS INGRESADADOS SON: ["+i+"]"+"="+numero[i]);
        }
    }
    
}
