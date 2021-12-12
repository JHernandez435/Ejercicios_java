package ejercicio_45;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_45 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double numero;
  	System.out.println("INGRESE EL NUMERO A OPERAR:");
    numero = in.nextDouble();

	System.out.println("LA CORRESPONDIENTE OPERACION CON EL VALOR ("+df.format(numero)+") ES EL SIGUIENTE:");
	System.out.println("");

    if(numero%2==0) {
        
        System.out.println("EL NUMERO INGRESADO ES PAR:("+df.format(numero)+")");
        } else if(numero%2==1) {
            System.out.println("EL NUMERO INGRESADO ES IMPAR:("+df.format(numero)+")");
        }
    
    }
    
}
