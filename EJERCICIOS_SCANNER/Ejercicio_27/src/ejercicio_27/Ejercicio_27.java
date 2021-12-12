package ejercicio_27;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_27 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

    double nota1,nota2,nota3,nota4;
	System.out.println("INGRESE LA PRIMERA RESPECTIVA CALIFICACION:");
    nota1 = in.nextDouble(); 

	System.out.println("INGRESE LA SEGUNDA RESPECTIVA CALIFICACION:");
    nota2 = in.nextDouble();

	System.out.println("INGRESE LA TERCERA RESPECTIVA CALIFICACION:");
    nota3 = in.nextDouble();

	System.out.println("INGRESE LA CUARTA RESPECTIVA CALIFICACION:");
    nota4 = in.nextDouble();

	System.out.println("LA CORRESPONDIENTE OPERACION CON ("+nota1+"),("+nota2+"),("+nota3+"),("+nota4+") ES LA SIGUIENTE:");

    double nota_F = (nota1+nota2+nota3+nota4)/4;

	System.out.println("LA NOTA DEFINITVA es ="+nota_F);
    }
    
}
