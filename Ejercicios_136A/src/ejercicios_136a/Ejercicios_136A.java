package ejercicios_136a;

import java.util.Scanner;

public class Ejercicios_136A {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double A[]=new double[10];
        double B[]=new double[10];
        double C[]=new double[10];
        int suma1=0,suma2=0;
        for (int i = 0; i < 10; i++) {
            int par=i*2;
            int azar1=(int) (Math.random() * par);
            System.out.println("["+i+"]pares"+azar1);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < 10; i++) {    
            int impar=i*3;
            int azar2=(int) (Math.random() * impar);
            System.out.println("["+i+"]impares"+azar2);
        }
        for (int i = 0; i < 10; i++) {
            int par=i*2;
            int azar1=(int) (Math.random() * par);
            int impar=i*3;
            int azar2=(int) (Math.random() * impar);
            suma1=(int) (azar1+azar2); 
            System.out.println("la suma de las matrices es="+suma1);
        }
    }
    
}
