package ejercicio_23;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_23 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    int diametro;
	System.out.println("INGRESE EL DIAMETRO DE LA CIRCUNFERENCIA:");
    diametro= in.nextInt();
 
	System.out.println("LA CORRESPONDINTE OPERACION CON EL VALOR(DIAMETRO)=("+diametro+") ES LA SIGUIENTE:");

    double longitud = 2*Math.PI*diametro;

	System.out.println("La longitud de la CIRCUFERENCIA es (2*PI*"+diametro+")="+df.format(longitud));
       
    }
    
}
