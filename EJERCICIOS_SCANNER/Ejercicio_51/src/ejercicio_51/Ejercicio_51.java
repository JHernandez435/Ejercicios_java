package ejercicio_51;
import java.util.Scanner;

public class Ejercicio_51 {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
       
    int hora,minuto,reply_1,reply_2,reply_3;
	System.out.println("Ingrese el \033[31mtiempo \033[30mgenerado en \033[31mhoras:");
    hora = in.nextInt();
    
    	System.out.println("\033[30mingrese el \033[31mtiempo \033[30mgenerado en \033[31mminutos:");
    minuto = in.nextInt();
    
    reply_1=hora*60;    
    reply_2=reply_1+minuto;
    reply_3=1500*reply_2;
    
        System.out.println("\033[30mEL VALOR QUE DEBE A PAGAR EL CLIENTE ES =\033[35m" +reply_3);             
           
    }
}
