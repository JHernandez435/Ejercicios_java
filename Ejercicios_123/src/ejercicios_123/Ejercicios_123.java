package ejercicios_123;

public class Ejercicios_123 {

    public static void main(String[] args) {
        
        int numero[]=new int[8];
        
         for (int i = 0; i < 8-1; i++) {
             
            numero[i]= (int) (Math.random()*100+1); 
            System.out.println("LOS NUMEROS SON: ["+i+"]"+"="+numero[i]);
            
        }
    }
    
}
