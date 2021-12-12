package ejercicio_44;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_44 {


    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#");

    double num=0;
  	System.out.println("INGRESE EL NUMERO A OPERAR:");
    num = in.nextDouble();

	System.out.println("LA CORRESPONDIENTE OPERACION CON EL VALOR ("+df.format(num)+") ES EL SIGUIENTE:");
	System.out.println("");

    if(num>=0){
	System.out.println("EL NUMERO INGRESADO ES POSITIVO:("+df.format(num)+")");
    } else if (num <=0){
	System.out.println("EL NUMERO INGRESADO ES NEGATIVO:("+df.format(num)+")");
    } else {
	System.out.println("ERROR");
    }
    
    }
    
}
