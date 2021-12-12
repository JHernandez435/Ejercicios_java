package ejercicios_126;

import java.util.Scanner;

public class Ejercicios_126 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo:");
        int n=sc.nextInt();
        String mun[]=new String[n];
              
        for (int i = 0; i < n-1; i++) {
            System.out.println("Digite los municipios a guardar:");
            String nombre=sc.next();
            mun[i]=nombre;
        }

        for (int i = 0; i < n-1; i++) {
            System.out.println("LOS MUNICIPIOS DE BOYACA INGRESADOS:"+mun[i]);
        }    
    }
    
}
