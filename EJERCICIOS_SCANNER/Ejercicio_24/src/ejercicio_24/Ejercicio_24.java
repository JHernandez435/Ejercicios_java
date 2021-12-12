package ejercicio_24;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio_24 {
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#");

    int Bmayor,Bmenor,altura;
	System.out.println("DIGITE LA BASE MAYOR DEL TRAPECIO:");
    Bmayor = in.nextInt();

	System.out.println("DIGITE LA BASE MENOR DEL TRAPECIO:");
    Bmenor = in.nextInt();

	System.out.println("DIGITE LA ALTURA DEL TRAPECIO:");
    altura = in.nextInt();

	System.out.println("LA CORRESPONDIENTE OPERACION CON LOS VALORES(BASE MAYOR,MENOR Y ALTURA)=("+Bmayor+"),("+Bmenor+"),("+altura+")");

    double area = (Bmayor+Bmenor/2)*altura;

	System.out.println("El AREA del TRAPECIO es (Bmayor+Bmenor/2)*altura)="+df.format(area));
    }
    
}
