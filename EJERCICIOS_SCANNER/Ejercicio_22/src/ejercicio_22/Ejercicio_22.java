package ejercicio_22;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_22 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    int cateto_1,cateto_2;
	System.out.println("INGRESE EL PRIMER CATETO:");
    cateto_1= in.nextInt();

	System.out.println("INGRESE EL SEGUNDO CATETO:");
    cateto_2= in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERANCION CON LOS VALORES(CATETOS)= ("+cateto_1+") y ("+cateto_2+") ES LA SIGUIENTE:");

    double hipotenusa = (cateto_1*cateto_2)/2;

	System.out.println("La HIPOTENUSA del TRIANGULO correspondiente es ="+df.format(hipotenusa));
        
    }
    
}
