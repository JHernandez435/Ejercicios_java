import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_16{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  DecimalFormat df = new DecimalFormat("#");
  int lado= 0;

	System.out.println("Ingrese la distancia del lado del cuadrado");
	lado = in.nextInt();
  double area = Math.pow(lado,2);

	System.out.println("LA CORRESPONDIENTE OPERACICON CON:("+lado+"),ES LA SIGUIENTE:");

	System.out.println("El area del cuadrado es igual "+lado+"^2="+df.format(area)+"m2");
  }
}