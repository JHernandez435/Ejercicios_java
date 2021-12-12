package ejercicio11_12_13_14;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio11_12_13_14 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");
    int valor= 0;

	System.out.println("Ingrese el valor a operar");
	valor = in.nextInt();

    double raizC = Math.sqrt(valor);
    double doble = valor*2;
    double cuadrado = Math.pow(valor,2);
    double cubo = Math.pow(valor,3);

	System.out.println("Las correspondientes operaciones con el valor ("+valor+"), son las siguientes:");

  	System.out.println("La raiz cuadrada de "+valor+", es="+df.format(raizC));
	System.out.println("El numero doble de "+valor+", es="+df.format(doble));
	System.out.println("El numero "+valor+", al cuadrado es="+df.format(cuadrado));
	System.out.println("El numero "+valor+", al cubo es="+df.format(cubo));
    }
    
}
