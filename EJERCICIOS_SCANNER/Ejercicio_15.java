import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio_15{
  public static void main(String args[]){

  Scanner in = new Scanner(System.in);
  DecimalFormat df = new DecimalFormat("#");
  int base= 0,altura= 0;
   
	System.out.println("Ingrese el valor de la base del triangulo");
	base = in.nextInt();

	System.out.println("Ingrese el valor de la altura del trinagulo");
	altura = in.nextInt();

  double area = (base*altura)/2;

	System.out.println("LA CORRESPONDIENTE OPERACION ENTRE "+base+" y "+altura+" ES LAS SIGUIENTE:");

	System.out.println("El Area del triangulo es igual a ("+base+"*"+altura+")/2="+df.format(area));

 }
}