package ejercicio_52;

import java.util.Scanner;

public class Ejercicio_52 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
    double A,reply_2,reply_3,reply_6,reply_7;
    int x,z,reply_1,reply_4,reply_5;
    
	System.out.println("Ingrese el precio del producto por unidad:");
    x = in.nextInt();
    
    	System.out.println("Ingrese el valor, de la cantidad de docenas que va a llevar:");
    z = in.nextInt();
    
        System.out.println("GRACIAS POR SU RESPUESTA, EL VALOR DEL PRODUCTO =$("+x+") LLEVARA LA CANTIDAD DE ("+z+") DOCENAS");
        System.out.println("SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        A=z*12;
        
        if(A>=36) {
            
            reply_1=x*z;
            reply_2=reply_1*0.15;
            reply_3=reply_1-reply_2;
            
            System.out.println("El MONTO DE LA COMPPRA ES =$"+reply_1);     
            System.out.println("El DESCUENTO(15%), DEL MONTO DE LA COMPPRA ES $="+reply_2); 
            System.out.println("El MONTO A PAGAR ES =$"+reply_3);
            
        }if(A>=48) {
            
           	reply_4=trunc(z/2);
		System.out.println("Por tu compra de ("+z+") docenas recibes ("+resultado_4+") obsequio(s)");
		
                
        }else {
            
           	reply_5=x*z;
		reply_6=reply_5*0.10;
		reply_7=reply_5-reply_6;
		
		System.out.println("El MONTO DE LA COMPPRA ES =$"+reply_5);
		System.out.println("El DESCUENTO(10%), DEL MONTO DE LA COMPPRA ES =$"+reply_6);
		System.out.println("El MONTO A PAGAR ES =$"+reply_7); 
                        
                
            
        }
    }
    
}
