package ejercicios_134;

import java.util.Scanner;

public class Ejercicios_134 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int m=20;
        int n=20;        
         double matriz[][]=new double[m][n];
         int a=0;
         
          for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n-1; j++) {
            System.out.println("Escriba las notas parciales:"+"["+i+"]["+j+"]");
            matriz[i][j]=sc.nextDouble();
           }   
        }
          
           for (int i = 0; i < m-1; i++) {
               int suma=0;
            for (int j = 0; j < n-1; j++) {
                double C=suma+matriz[i][j];
            }   
            double promedio=suma/2;
            System.out.println("Estudiante:No"+","+","+i+1+"="+promedio);
        }
    }
    
}
