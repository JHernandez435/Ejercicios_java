package ejercicios_131;
import java.util.Scanner;
public class Ejercicios_131 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        double grupoA[]=new double[10];
        double grupoB[]=new double[10];
        int suma1=0,suma2=0,promedio1,promedio2,promedio3;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota final del grupo A");
            grupoA[i]=sc.nextDouble();
            suma1=(int) (suma1+grupoA[i]);
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota final del grupo B");
            grupoB[i]=sc.nextDouble(); 
            suma2=(int) (suma2+grupoA[i]);
        }
        promedio1=suma1/10;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota final del grupo B");
            grupoB[i]=sc.nextDouble();      
        }
        promedio2=suma2/10;
        promedio3=(suma2+suma1)/20;
        System.out.println("Promedio del grupo A"+promedio1);
        System.out.println("Promedio del grupo B"+promedio2);
        System.out.println("Promedio de los dos grupos"+promedio3);
    }
     
}
