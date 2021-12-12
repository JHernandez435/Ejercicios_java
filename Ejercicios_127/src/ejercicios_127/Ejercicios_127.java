package ejercicios_127;

import java.util.Scanner;

public class Ejercicios_127 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mes[]=new String[13];
        
        System.out.println("[1] Enero:");
	System.out.println("[2] Febrero:");
	System.out.println("[3] Marzo:");
	System.out.println("[4] Abril:");
	System.out.println("[5] Mayo:");
	System.out.println("[6] Junio:");
	System.out.println("[7]Julio:");
	System.out.println("[8] Agosto:");
	System.out.println("[9] Septiembre:");
	System.out.println("[10] Octubre:");
	System.out.println("[11] Noviembre:");
	System.out.println("[12] Diciembre:");
        
        mes[1]=" Enero, 30 dias";
	mes[2]=" Febrero, 29 dias";
	mes[3]=" Marzo, 31 dias";
	mes[4]=" Abril, 30 dias";
	mes[5]=" Mayo, 31 dias";
	mes[6]=" Junio, 30 dias ";
	mes[7]=" Julio, 31 dias";
	mes[8]=" Agosto, 31 dias";
	mes[9]=" Septiembre, 31 dias";
	mes[10]=" Octubre, 31 dias";
	mes[11]=" Noviembre, 30 dias";
	mes[12]=" Diciembre, 31 dias";
        
        System.out.println("Digite un numero de mes de su eleccion");
	int P=sc.nextInt();
	
	System.out.println("EL MES SELECCIONADO ES:"+mes[P]);

    }
    
}
