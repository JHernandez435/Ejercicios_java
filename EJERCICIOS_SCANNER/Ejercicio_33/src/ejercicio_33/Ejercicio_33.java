package ejercicio_33;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_33 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double celsius= 0;
	System.out.println("INGRESE EL VALOR CELSIUS A OPERAR:");
    celsius = in.nextDouble();

    double conversion= (celsius*9/5)+32;

	System.out.println("LA CORRESPONDIENTE OPERACION CON EL VALOR("+df.format(celsius)+") ES EL SIGUIENTE:");

	System.out.println("EL CONVERSION DE CELSIUS A FAHRENHEINT ES ="+df.format(conversion)+" F");
    }
    
}
