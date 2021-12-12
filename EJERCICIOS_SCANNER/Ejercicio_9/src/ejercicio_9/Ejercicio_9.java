package ejercicio_9;
import java.util.Scanner;
public class Ejercicio_9 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
	String nombre = "";
	String apellido = "";
	String dirreccion = "";
	String telefono = "";

	System.out.println("Ingrese su nombre(s)");
	nombre = in.nextLine();

	System.out.println("Ingrese su apellidos(s)");
	apellido = in.nextLine();

	System.out.println("Ingrese su dirreccion");
	dirreccion = in.nextLine();

	System.out.println("Ingrese su telefono");
	telefono = in.nextLine();

	System.out.println("Su nombre completo es el siguiente:" + nombre +" "+ apellido);
	System.out.println("Su direccion es:"+ dirreccion);
	System.out.println("Su respectivo telefono es:" + telefono);

    }
    
}
