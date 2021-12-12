package ejercicios_15;

import javax.swing.JOptionPane;

public class Ejercicios_15 {

    public static void main(String[] args) {
        
        int num_1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL PRIMER NUMERO:"));
        int num_2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SEGUNDO NUMERO:"));
        
        JOptionPane.showMessageDialog(null,"La correspondiente operacion entre: "
        +num_1+" y "+num_2+" son las siguientes:");
        
        int suma= num_1+num_2;
	int resta= num_1-num_2;
	int multi= num_1*num_2;
	double divi= num_1/num_2;
	double mod= num_1%num_2;
        
        JOptionPane.showMessageDialog(null,"El resultado de la Suma entre "+ num_1 +" y "+ num_2 +" es ="+suma
        +"\nEl resultado de la Resta entre "+ num_1 +" y "+ num_2 +" es ="+resta
        +"\nEl resultado de la Multiplicacion entre "+ num_1 +" y "+ num_2 +" es ="+multi
        +"\nEl resultado de la Division entre "+ num_1 +" y "+ num_2 +" es ="+divi
        +"\nEl resultado de la MOD entre "+ num_1 +" y "+ num_2 +" es ="+mod);
    }
    
}
