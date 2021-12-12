package ejercicio_19;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_19 {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    int radio;
	System.out.println("INGRESE EL RADIO DEL CIRCULO:");
    radio= in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERACION CON ("+radio+") ES LA SIGUIENTE:");

    double area = Math.PI*Math.pow(radio,2);

	System.out.println("El Area del circulo es ="+df.format(area));
        
    }
    
}
