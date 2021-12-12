package ejercicios_125;

import java.util.Scanner;

public class Ejercicios_125 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int n=sc.nextInt();
        String pais[]=new String[n];
              
        for (int i = 0; i < n-1; i++) {
            System.out.println("Digite los paises a guardar:");
            String nombre=sc.next();
            pais[i]=nombre;
        }

        for (int i = 0; i < n-1; i++) {
            System.out.println(""+pais[i]);
        }    
        System.out.println("Digite la posicion de su eleccion");
	int P=sc.nextInt();
	
	System.out.println("EL PAIS SELECCIONADO ES:"+pais[P]);
    }
    
}
