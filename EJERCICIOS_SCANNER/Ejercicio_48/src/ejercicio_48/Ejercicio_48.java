package ejercicio_48;

import java.util.Scanner;

public class Ejercicio_48 {

    public static void main(String[] args) {
                
        Scanner in = new Scanner(System.in);
       
    double num_1,num_2,resultado;
	System.out.println("INGRESE EL PRIMER NUMERO A OPERAR:");
    num_1 = in.nextDouble();
	System.out.println("\nINGRESE EL SEGUNDO NUMERO A OPERAR:");
    num_2 = in.nextDouble();
  
	System.out.println("\nLA CORREPONDIENTE OPERACION CON LOS VALORES "+"\033[35m"+Math.round(num_1)+"\033[37m Y "+"\033[31m"+Math.round(num_2)+"\033[37m ES LA SIGUIENTE:");
	System.out.println("");
        
        resultado=Math.max(num_1,num_2);
        
        if(resultado==num_1) {
            System.out.println("\033[35mEL NUMERO MAYOR ES ="+Math.round(num_1));
            System.out.println("\033[32mEL NUMERO MENOR ES ="+Math.round(num_2));
            
            }else if (num_1%num_2>0){
                System.out.println("\033[35mEL NUMERO MAYOR ES ="+Math.round(num_2));
                System.out.println("\033[32mEL NUMERO MENOR ES ="+Math.round(num_1));                 
        }      
    }
    
}
