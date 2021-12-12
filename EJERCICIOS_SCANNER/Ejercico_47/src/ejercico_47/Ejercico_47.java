package ejercico_47;

import java.util.Scanner;

public class Ejercico_47 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
    double num_1,num_2;
	System.out.println("INGRESE EL PRIMER NUMERO A OPERAR:");
    num_1 = in.nextDouble();
	System.out.println("\nINGRESE EL SEGUNDO NUMERO A OPERAR:");
    num_2 = in.nextDouble();
  
	System.out.println("\nLA CORREPONDIENTE OPERACION CON LOS VALORES "+Math.round(num_1)+" Y "+Math.round(num_2)+" ES LA SIGUIENTE:");
	System.out.println("");
        
        
            if(num_1==0 & num_2==0){
        
            }else if(num_1%num_2==0){
                    System.out.println("\033[32mLA DIVISION ES EXACTA:");
            }else if (num_1%num_2>0){
                    System.out.println("\033[32mLA DIVISION ES INEXACTA:");
               
            } else {
                System.out.println("\033[31mLA VARIABLE INGRESADA NO CUMPLE LA CONDICION");        
          
        }
    }
    
}
