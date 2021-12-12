package ejercicios_135;

import java.util.Scanner;

public class Ejercicios_135 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite el numero de filas:");
        int m=sc.nextInt();
         System.out.println("Digite el numero de columnas:");
        int n=sc.nextInt();
        
        double matriz[][]=new double[m][n];
              
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
            System.out.println("Escriba las notas parciales:"+"["+i+"]["+j+"]");
            matriz[i][j]=sc.nextDouble();
           }   
        }
         for (int i = 0; i < n-1; i++) {
             int suma=0;
            for (int j = 0; j < m-1; j++) {
                double C=suma+matriz[i][j];
           }   
            double promedio=suma/n;
             System.out.println("Estudiante:No"+","+","+i+1+"="+promedio);
           }

    }
    
}
