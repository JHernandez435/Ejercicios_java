package ejercicio_43;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_43 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double num_1,num_2;
  	System.out.println("INGRESE EL PRIMER VALOR A OPERAR:");
    num_1 = in.nextInt();
  	System.out.println("INGRESE EL SEGUNDO VALOR A OPERAR:");
    num_2 = in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERACION CON LOS VALORES ("+df.format(num_1)+") Y ("+df.format(num_2)+") ES EL SIGUIENTE :");
	System.out.println("");

    double suma= num_1+num_2;

    if(suma <100){
	System.out.println("LA SUMA DE LOS VALORES INSERTADOS POR EL USUARIO ES ="+df.format(suma)+" ES MENOR QUE (100)");
    } else if (suma >100){
	System.out.println("LA SUMA DE LOS VALORES INSERTADOS POR EL USUARIO ES ="+df.format(suma)+" ES MAYOR QUE (100)");
    } else {
	System.out.println("*********");
	System.out.println("*¡ERROR!*");
	System.out.println("*********");
    }
    
    }
    
}
