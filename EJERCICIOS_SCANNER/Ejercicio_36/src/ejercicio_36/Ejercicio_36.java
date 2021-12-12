package ejercicio_36;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_36 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double hora,valor;
	System.out.println("INGRESE LAS HORAS TRABAJADAS:");
    hora = in.nextDouble();

	System.out.println("DIGITE EL VALOR CORRESPONDIENTE POR HORA:");
    valor = in.nextDouble();  

    double salario= valor*hora;

	System.out.println("LA CORRESPONDIENTE OPERACION CON ("+df.format(hora)+")HORAS DE TRABAJO CON UN VALOR DE ($"+df.format(valor)+") ES EL SIGUIENTE:");

	System.out.println("EL SALARIO TOTAL DEL TRABAJADOR ES =$"+df.format(salario));  
    }
    
}
