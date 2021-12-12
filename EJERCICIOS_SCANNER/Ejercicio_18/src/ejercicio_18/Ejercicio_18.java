package ejercicio_18;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_18 {

       public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

    int diag_1,diag_2;
  	System.out.println("INGRESE LA PRIMERA DIAGONAL");
    diag_1= in.nextInt();

	System.out.println("INGRESE LA SEGUNDA DIAGONAL");
    diag_2= in.nextInt();

    double diagonal = Math.sqrt(Math.pow(largo,2)+Math.pow(ancho,2));

	System.out.println("El calculo de la diagonal es igual RC("+diag_1+"^2,"+diag_2+"^2)");

	System.out.println("La diagonal es igual a "+df.format(diagonal));

    }
    
}
