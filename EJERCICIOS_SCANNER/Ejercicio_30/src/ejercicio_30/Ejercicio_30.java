package ejercicio_30;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_30 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double xcentaje,numero;
	System.out.println("INGRESE EL VALOR DEL PORCENTAJE:");
    xcentaje = in.nextDouble();

	System.out.println("DIGITE EL VALOR DEL NUMERO A OPERAR:");
    numero = in.nextDouble();

	System.out.println("LA CORRESPONDIENTE OPERACION CON LOS VALORES ("+df.format(xcentaje)+"),("+df.format(numero)+") ES LA SIGUIENTE:");

    double porcentaje = (xcentaje/100)*numero;

	System.out.println("EL "+df.format(xcentaje)+"% DEL NUMERO INGRESADO ("+df.format(numero)+") ES ="+df.format(porcentaje));
        
    }
    
}
