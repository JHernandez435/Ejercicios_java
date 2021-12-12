package ejercicio_40;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_40 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    double hora,minuto,segundo;
	System.out.println("INGRESE LA CANTIDAD DE HORAS:");
    hora = in.nextDouble();
	System.out.println("INGRESE LA CANTIDAD DE MINUTOS:");
    minuto = in.nextDouble();
	System.out.println("INGRESE LA CANTIDAD DE SEGUNDOS:");
    segundo = in.nextDouble();

    double resultado_1=hora*3.600,resultado_2=minuto*60,cantidad=resultado_1+resultado_2+segundo;

	System.out.println("LA CORRESPONDIENTE OPERACION CON LAS CANTIDADES DE "+df.format(hora)+" hora(s), "+df.format(minuto)+", minuto(s), "+df.format(segundo)+" segundo(s) ES EL SIGUIENTE:");
	System.out.println("LA CANTIDAD de segundos contenidos en las ("+df.format(hora)+" hora(s)) que se ingresaron es ="+resultado_1+" S");
	System.out.println("LA CANTIDAD de segundos contenidos en los ("+df.format(minuto)+" minuto(s)) que se ingresaron es ="+resultado_2+" S");
	System.out.println("LA CANTIDAD TOTAL de segundos contenidos en las tres cantidades ("+df.format(hora)+"hora(s)"+df.format(minuto)+"minuto(s)"+df.format(segundo)+"segundo(s)) ="+df.format(cantidad)+" S");

    }
    
}
