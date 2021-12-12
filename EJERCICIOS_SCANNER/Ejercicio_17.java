import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_17{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  DecimalFormat df = new DecimalFormat("#");
  int largo= 0,ancho= 0;

	System.out.println("INGRESE EL LARGO DEL RECTANGULO");
	largo= in.nextInt();

	System.out.println("INGRESE EL ANCHO DEL RECTANGULO");
	ancho= in.nextInt();

  double perimetro = (largo+ancho)*2;

	System.out.println("LA CORRESPONDIENTE OPERACICON CON:("+largo+" y "+ancho+"), ES LA SIGUIENTE:");

	System.out.println("El perimetro del rectagulo es igual a la suma de sus lados "+largo+" y "+ancho);

	System.out.println("El perimetro del rectangulo seria igual a "+df.format(perimetro));

  }
}