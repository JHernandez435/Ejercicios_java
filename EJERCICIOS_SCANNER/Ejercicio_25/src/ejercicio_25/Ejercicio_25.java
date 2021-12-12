package ejercicio_25;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_25 {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    int primer_D,segundo_D,tercer_D;
	System.out.println("DIGITE EL PRIMER DATO:");
    primer_D = in.nextInt();

  	System.out.println("DIGITE EL SEGUNDO DATO:");
    segundo_D = in.nextInt();

 	System.out.println("DIGITE EL TERCER DATO:");
    tercer_D = in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERCACION CON LOS VALORES("+primer_D+"),("+segundo_D+"),("+tercer_D+")");

    double media_A = (primer_D+segundo_D+tercer_D)/2;

	System.out.println("La MEDIA ARITMETICA es ="+df.format(media_A));
    }
    
}
