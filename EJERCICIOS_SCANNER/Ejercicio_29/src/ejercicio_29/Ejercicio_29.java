package ejercicio_29;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_29 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double pesos;
	System.out.println("INGRESE EL VALOR(PESOS) A OPERAR:");
    pesos = in.nextDouble();

	System.out.println("LA CORREPONDIENTE OPERACION CON EL VALOR("+df.format(pesos)+") ES LA SIGUIENTE:");

    double conversion = pesos*0.00027;

	System.out.println("LA CONVERSION DE PESOS A EUROS ES ="+conversion);

    }
    
}
