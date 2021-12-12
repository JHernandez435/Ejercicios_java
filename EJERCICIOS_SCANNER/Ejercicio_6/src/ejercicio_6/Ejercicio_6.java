package ejercicio_6;
import java.util.Scanner;
public class Ejercicio_6 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
	String nombre = "";
	String apellido = "";
	int edad = 0;

	System.out.println("¿Ingrese su nombre(s)?");
	nombre = in.nextLine();

	System.out.println("¿Ingrese su apellido(s)?");
	apellido = in.nextLine();

	System.out.println("¿Ingrese su correspondiente edad?");
	edad = in.nextInt();

	System.out.println("Su nombre completo es el siguiente:" + nombre +" "+ apellido + ",su edad correspondiente es: " + edad +" años");

    }
    
}
