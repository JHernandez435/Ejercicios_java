package ejercicio_31;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_31 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double metro;
	System.out.println("INGRESE EL VALOR EN METROS A OPERAR:");
     metro = in.nextDouble();

    double conversion= metro*100;

	System.out.println("LA CORRESPONDIENTE OPERACION CON EL VALOR("+df.format(metro)+") ES EL SIGUIENTE:");

	System.out.println("EL CONVERSION DE METROS A CENTIMETROS ES ="+df.format(conversion)+" M");
        
    }
    
}
