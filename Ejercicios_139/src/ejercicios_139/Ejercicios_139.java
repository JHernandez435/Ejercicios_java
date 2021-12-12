package ejercicios_139;
import java.util.Scanner;
public class Ejercicios_139 {

    static double area (double a,double b) {
        double reply;
        reply=(a*b)/2;
        return(reply);
    }
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        double reply,a,b;
        
        System.out.println("Digite la base del triangulo");
        a=sc.nextInt();
        System.out.println("Digite la altura del triangulo");
        b=sc.nextInt();
        reply=area(a,b);
        System.out.println("La suma es =:"+reply);
        
    }
    
}
