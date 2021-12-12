package ejercicio_10;
import java.util.Scanner;
public class Ejercicio_10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
	int num_1= 0,num_2= 0,suma= 0,resta= 0,multi= 0,divi= 0,mod= 0;

    System.out.println("Ingrese el primer valor a operar");
	num_1 = in.nextInt();
    System.out.println("Ingrese el primer valor a operar");
	num_2 = in.nextInt();

	suma= num_1+num_2;
	resta= num_1-num_2;
	multi= num_1*num_2;
	divi= num_1/num_2;
	mod= num_1%num_2;

	System.out.println("El resultado de la Suma entre "+num_1+" y "+num_2+" es ="+suma);
	System.out.println("El resultado de la Resta entre "+num_1+" y "+num_2+" es ="+resta);
	System.out.println("El resultado de la Multiplicacion entre "+num_1+" y "+num_2+" es ="+multi);
	System.out.println("El resultado de la Division entre "+num_1+" y "+num_2+" es ="+divi);
	System.out.println("El residuo de la division entre "+num_1+" y "+num_2+" es ="+mod);
    }
    
}
