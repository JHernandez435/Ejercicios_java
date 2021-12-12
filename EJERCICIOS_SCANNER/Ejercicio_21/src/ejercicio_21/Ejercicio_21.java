package ejercicio_21;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_21 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

    int radio,altura;
	System.out.println("INGRESE EL RADIO DEL CILINDRO:");
    radio= in.nextInt();

	System.out.println("INGRESE LA ALTURA DEL CILINDRO:");
    altura = in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERACION CON ("+radio+") y ("+altura+") ES LA SIGUIENTE:");

    double area = (2*Math.PI)*(radio*altura);
    double volumen = Math.PI*(Math.pow(radio,2))*altura;

	System.out.println("El AREA del CILINDRO es ="+altura);
	System.out.println("El VOLUMEN del CILINDRO es ="+df.format(volumen));
    }
    
}
