package ejercicio_39;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_39 {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
  
    double promedio,examenf,trabajof;
	System.out.println("INGRESE EL PROMEDIO DE SUS TRES CALIFICACIONES PARCIALES:");
    promedio = in.nextDouble();
	System.out.println("INGRESE LA CALIFICACION DEL EXAMEN FINAL:");
    examenf = in.nextDouble();
	System.out.println("INGRESE LA CALIFICACION DEL TRABAJO FINAL:");
    trabajof = in.nextDouble();

    double resultado_1=promedio*0.45,resultado_2=examenf*0.35,resultado_3=trabajof*0.20,calificacionf=resultado_1+resultado_2+resultado_3;

	System.out.println("LA CORRESPONDIENTE OPERACION CON ("+promedio+"), ("+examenf+"), ("+trabajof+") ES EL SIGUIENTE:");

	System.out.println("LA CALIFICACION FINAL DEL ESTUDIANTE ES ="+df.format(calificacionf));
    }
    
}
