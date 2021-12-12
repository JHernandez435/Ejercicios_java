package ejercicio_49;

import java.util.Scanner;

public class Ejercicio_49 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
    double actual,año,reply_1,reply_2;
	System.out.println("\033[31mINGRESE EL AÑO ACTUAL:\033[30m");
    actual = in.nextDouble();
	System.out.println("\033[31mINGRESE UN AÑO DIFERENTE:\033[30m");
    año = in.nextDouble();
  
	System.out.println("\nLA CORREPONDIENTE OPERACION CON LOS VALORES "+"\033[35m"+Math.round(actual)+"\033[30m Y "+"\033[35m"+Math.round(año));
	System.out.println("ES LA SIGUIENTE:");
        
        reply_1=año-actual;
        reply_2=actual-año;
        
    if(año>actual) {
            System.out.println("\n\033[37mLOS AÑOS FALTANTES PARA LLEGAR A ESE AÑO SON =\033[32m"+Math.round(reply_1));           
        }else if (actual%año>0){
            System.out.println("\033[30mLOS AÑOS QUE HAN TRASCURRIDO SON =\033[31m"+Math.round(reply_2));  
        }
    }
    
}
