package ejercicios_132;

import java.util.Scanner;

public class Ejercicios_132 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite el numero de filas:");
        int m=sc.nextInt();
         System.out.println("Digite el numero de columnas:");
        int n=sc.nextInt();
        
        double matriz[][]=new double[m][n];
        double A[][]=new double[m][n];
        double B[][]=new double[m][n];
        double C[][]=new double[m][n];
              
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
            System.out.println("Escriba los valores:"+"["+i+"]["+j+"]");
            A[i][j]=sc.nextDouble();
           }   
        }
         for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
            System.out.println("Escriba los valores:"+"["+i+"]["+j+"]");
            B[i][j]=sc.nextDouble();
           }   
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
            C[i][j]=A[i][j]-B[i][j];
           }   
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
                        System.out.println("["+C[i][j]+"]");

           }   
        }
    }
    
}
