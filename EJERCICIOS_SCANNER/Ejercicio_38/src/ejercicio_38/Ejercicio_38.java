package ejercicio_38;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_38 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double salario;
	System.out.println("INGRESE EL VALOR DE SUS SALARIO MENSUAL:");
    salario = in.nextDouble();  

    double afiliacion= 0.04*salario, salariototal=(afiliacion*2)-salario;

	System.out.println("LA CORRESPONDIENTE OPERACION CON ("+df.format(salario)+") ES EL SIGUIENTE:");

	System.out.println("EL VALOR A DESCONTAR DEL SALRIO PARA EL SISTEMA DE SALUD ES =$"+df.format(afiliacion));
	System.out.println("EL VALOR A DESCONTAR DEL SALRIO PARA EL SISTEMA DE PENSIONES ES =$"+df.format(afiliacion));
	System.out.println("EL SALARIO A GANAR ES =$"+df.format(salariototal));
    }
    
}
