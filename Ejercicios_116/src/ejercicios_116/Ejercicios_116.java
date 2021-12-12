package ejercicios_116;

public class Ejercicios_116 {

    public static void main(String[] args) {
       
        int matriz[][] = new int[8][8];
         
        matriz[0][0]=10;
        matriz[0][1]=20;
        matriz[0][2]=30;
        matriz[0][3]=40;
        matriz[0][4]=50;
        matriz[0][5]=60;
        matriz[0][6]=70;
        matriz[0][7]=80;
        
        matriz[1][0]=0;
        matriz[1][1]=1;
        matriz[1][2]=2;
        matriz[1][3]=3;
        matriz[1][4]=4;
        matriz[1][5]=5;
        matriz[1][6]=6;
        matriz[1][7]=7;
                
        System.out.println("*************************************************");
        System.out.println("*VALOR:  *"+matriz[0][0]+" * "+matriz[0][1]+" * "+matriz[0][2]+" * "+matriz[0][3]+" * "
                +matriz[0][4]+" * "+matriz[0][5]+" * "+matriz[0][6]+" * "+matriz[0][7]+" *");
        System.out.println("*INDICE: * "+matriz[1][0]+" *  "+matriz[1][1]+" *  "+matriz[1][2]+" *  "+matriz[1][3]+" *  "
                +matriz[1][4]+" *  "+matriz[1][5]+" *  "+matriz[1][6]+" *  "+matriz[1][7]+" *");
        System.out.println("*************************************************");
    }
    
}
