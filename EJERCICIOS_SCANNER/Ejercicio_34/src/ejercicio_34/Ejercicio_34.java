package ejercicio_34;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_34 {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("#");

    double pagar, descuento=0.15;
	System.out.println("INGRENSE EL VALOR DE LA COMPRA TOTAL:");
    pagar = in.nextDouble();

    double total = pagar-(pagar*descuento);

	System.out.println("LA CORRESPONDIENTE OPERACION CON EL VALOR("+df.format(pagar)+") ES EL SIGUIENTE:");

	System.out.println("EL PRECIO TOTAL A PAGAR + EL DESCUENTO ES =$"+df.format(total));  
        
    }
    
}
