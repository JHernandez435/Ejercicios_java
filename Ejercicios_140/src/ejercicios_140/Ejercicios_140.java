package ejercicios_140;

import java.util.Scanner;

public class Ejercicios_140 {

static int mayor (int a,int b) {
     int may1,may2,may3,may4;
        may1=a+b;
        may2=a-b;
        may3=a*b;
        may4=a/b;        
        
        return(may1)+(may2)+(may3)+(may4);
       
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int may,a,b;
        System.out.println("Digite una opcion:");
        int op=sc.nextInt();
        switch (op) {
            case 1:
            System.out.println("Digite el valor del primer numero");
            a=sc.nextInt();
            System.out.println("Digite el valor del segundo numero");
            b=sc.nextInt();
            int may1=mayor(a,b);
            System.out.println("La suma es =:"+may1);
                break;
            case 2:
            System.out.println("Digite el valor del primer numero");
            a=sc.nextInt();
            System.out.println("Digite el valor del segundo numero");
            b=sc.nextInt();
            int may2=mayor(a,b);
            System.out.println("La suma es =:"+may2);
                break;
            case 3:
            System.out.println("Digite el valor del primer numero");
            a=sc.nextInt();
            System.out.println("Digite el valor del segundo numero");
            b=sc.nextInt();
            int may3=mayor(a,b);
            System.out.println("La suma es =:"+may3); 
                break;
            case 4:
            System.out.println("Digite el valor del primer numero");
            a=sc.nextInt();
            System.out.println("Digite el valor del segundo numero");
            b=sc.nextInt();
            int may4=mayor(a,b);
            System.out.println("La suma es =:"+may4);
                break;
        }
       
    }
    
}
