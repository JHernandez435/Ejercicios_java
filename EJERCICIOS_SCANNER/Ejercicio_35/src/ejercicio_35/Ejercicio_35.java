package ejercicio_35;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_35 {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    String articulo= "";
    double factura;

	System.out.println("INGRESE EL NOMBRE DEL ARTICULO:");
    articulo = in.nextLine();

	System.out.println("DIGITE EL VALOR DE LA FACTURA:");
    factura = in.nextDouble();

    double resultado = 0.16*factura;
    double valor = factura-resultado;

	System.out.println("LA CORRESPONDIENTE OPERACION CON LOS VALORES ("+articulo+") y (0.16%), ES EL SIGUIENTE:");
	System.out.println("EL PRECIO DEL PRODUCTO a pagar CON IVA es =$"+df.format(factura));
	System.out.println("El PRECIO DEL PRODUCTO a pagar SIN IVA es =$"+df.format(valor));
	System.out.println("EL VALOR DEL IVA es =$"+df.format(resultado));
    }
    
}
