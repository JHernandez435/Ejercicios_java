package ejercicio_50;

import java.util.Scanner;

public class Ejercicio_50 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
    String respuesta;
	System.out.println("\033[30mHOLA, USTED ES \033[31mCULPABLE \033[30mO \033[31mINOCENTE:");
    respuesta = in.nextLine();
  
	System.out.println("\n\033[30mGracias por su respuesta "+"\033[35m"+respuesta);
	System.out.println("ES LA SIGUIENTE:");
        
    if( "culpable".equals(respuesta)) {
            System.out.println("\n\033[31mSOY CULPABLE,\033[30mMEREZCO LA CARCEL");           
        }else if("inocente".equals(respuesta)) {
            System.out.println("\033[31mSOY INOCENTE,\033[30mMEREZCO IR A CASA");  
        }
    }
    
}
