package ejercicios_130;

import java.util.Scanner;

public class Ejercicios_130 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);

        double valor[]=new double[5];
        
        int suma=0,K=0,K2=0;  
      
        for (int i = 0; i < 5; i++) {
            System.out.println("DIGITE LO(S) PESO(S) DE LAS PERSONAS");
            valor[i]=sc.nextDouble();
            suma=(int) (suma+valor[i]);
        }
        int promedio=suma/5;

        for (int i = 0; i < 5; i++) {
            if (valor[i]>promedio) {
                K=K+1;
            }   
        } 
        for (int i = 0; i < 5; i++) {
            if (valor[i]<promedio) {
                K2=K2+1;
            }   
        } 
        
	System.out.println("El promedio del peso de las 5 personas es ="+promedio);
    	System.out.println(K+"Superiores al promedio del peso");
    	System.out.println(K2+"Inferiores al promedio del peso");
    }
    
}
