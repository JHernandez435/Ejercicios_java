package ejercicios_118;

public class Ejercicios_118 {

    public static void main(String[] args) {
                
        int matriz1[] = new int[5];
        int matriz2[] = new int[5];
        int matrices[] = new int[5];
        
        matrices[0]=0;
	matrices[1]=1;
	matrices[2]=2;
	matrices[3]=3;
	matrices[4]=4;
	
	matriz1[0]=8;
	matriz1[1]=15;
	matriz1[2]=32;
	matriz1[3]=21;
	matriz1[4]=45;
	
	matriz2[0]=8;
	matriz2[1]=5;
	matriz2[2]=4;
	matriz2[3]=6;
	matriz2[4]=3;
	
	int A=matriz1[0]+matriz2[0];
	int B=matriz1[1]+matriz2[1];
	int C=matriz1[2]+matriz2[2];
	int D=matriz1[3]+matriz2[3];
	int E=matriz1[4]+matriz2[4];
        double media=(A+B+C+D+E)/10;
        System.out.println("**********************************");
	System.out.println("*INDICE:"+"*  "+matrices[0]+" *  "+matrices[1]+" *  "+matrices[2]+" *  "+matrices[3]+" *  "+matrices[4]+" * ");
	System.out.println("*********----*----*----*----*----*");
	System.out.println("*SUMA:  "+"* "+A+" * "+B+" * "+C+" * "+D+" * "+E+" * ");
	System.out.println("**********************************");
        System.out.println("*MEDIA: "+"* -------- "+media+" -------- *");
	System.out.println("**********************************");
    }
    
}
