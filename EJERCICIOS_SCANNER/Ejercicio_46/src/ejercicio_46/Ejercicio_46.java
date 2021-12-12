package ejercicio_46;
import java.util.Scanner;

public class Ejercicio_46 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
    double num_1,num_2;
	System.out.println("INGRESE EL PRIMER NUMERO A OPERAR:");
    num_1 = in.nextDouble();
	System.out.println("\nINGRESE EL SEGUNDO NUMERO A OPERAR:");
    num_2 = in.nextDouble();
  
	System.out.println("\nLA CORREPONDIENTE OPERACION CON LOS VALORES "+num_1+" Y "+num_2+" ES LA SIGUIENTE:");
	System.out.println("");

    if(num_1%num_2==0){
	    System.out.println("\033[31mLA DIVISION ES EXACTA:");
        } else if (num_1%num_2>0) {
            System.out.println("\033[31mLA DIVISION ES INEXACTA:");
            
        }
    }
    
}
