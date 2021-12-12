package ejercicio7_8;
public class Ejercicio7_8 {
   
    public static void main(String[] args) {
        
       int num_1= 8, num_2= 3, suma= 0,resta= 0,multi= 0,divi= 0,mod= 0;

System.out.println("La correspondiente operacion entre "+num_1+" y "+num_2+" son las siguientes:");
	
	suma= num_1+num_2;
	resta= num_1-num_2;
	multi= num_1*num_2;
	divi= num_1/num_2;
	mod= num_1%num_2;

	System.out.println("El resultado de la Suma entre "+ num_1 +" y "+ num_2 +" es ="+suma);
	
	System.out.println("El resultado de la Resta entre "+num_1+" y "+num_2+" es ="+resta);
	 
	System.out.println("El resultado de la Multiplicacion entre "+num_1+" y "+num_2+" es ="+multi);
	
	System.out.println("El resultado de la Division entre "+num_1+" y "+num_2+" es ="+divi);
	
	System.out.println("El residuo de la division entre "+num_1+" y "+num_2+" es ="+mod);
    }
    
}
