package ejercicio_32;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_32 {

    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double kilometro;
	System.out.println("INGRESE EL VALOR EN KILOMETROS A OPERAR:");
    kilometro = in.nextDouble();

    double conversion= kilometro*1000;

	System.out.println("LA CORRESPONDIENTE OPERACION CON EL VALOR("+df.format(kilometro)+") ES EL SIGUIENTE:");

	System.out.println("EL CONVERSION DE KILOMETROS A METROS ES ="+df.format(conversion)+" km");
    }
    
}
