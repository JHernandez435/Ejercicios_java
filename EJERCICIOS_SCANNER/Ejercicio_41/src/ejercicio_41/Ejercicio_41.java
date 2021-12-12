package ejercicio_41;
import java.util.Scanner;

public class Ejercicio_41 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

    int edad;
  	System.out.println("DIGITE SU EDAD CORRESPONDIENTE:");
    edad = in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERACION CON EL VALOR ("+edad+") ES EL SIGUIENTE :");
	System.out.println("");

    if(edad >=18){
	System.out.println("EL USUARIO ES MAYOR DE EDAD: "+edad+" años");
        } else if (edad <=18){
	System.out.println("EL USUARIO ES MENOR DE EDAD: "+edad+" años");
        } else {
	System.out.println("ERROR");
        }
        
    }    
}
