package ejercicio_20;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_20 {
  
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

    int diametro= 0;
	System.out.println("INGRESE EL DIAMETRO DEL CIRCULO:");
    diametro= in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERACION CON ("+diametro+") ES L A SIGUIENTE:");

    double area = (Math.PI*Math.pow(diametro,2))/4;

	System.out.println("El AREA del circulo es ="+df.format(area));

    }
    
}
