package ejercicios_113;

public class Ejercicios_113 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[8][8];
         
        matriz[0][0]=11;
        matriz[0][1]=22;
        matriz[0][2]=33;
        matriz[0][3]=44;
        matriz[0][4]=55;
        matriz[0][5]=66;
        matriz[0][6]=77;
        matriz[0][7]=88;
        
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
