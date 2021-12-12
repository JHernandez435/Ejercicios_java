package ejercicio_26;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_26 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

    int distancia,tiempo;
	System.out.println("INGRESE EL VALOR DE LA DISTACIA A OPERAR:");
    distancia = in.nextInt();

	System.out.println("INGRESE EL VALOR DEL TIEMPO A OPERAR:");
    tiempo = in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERACION CON LOS VALORES("+distancia+"),("+tiempo+")");

    double velocidad = distancia/tiempo;

	System.out.println("La VELOCIDAD es ="+df.format(velocidad)+" V");

    }
    
}
