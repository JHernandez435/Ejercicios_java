package ejercicios_67;

import javax.swing.JOptionPane;

public class Ejercicios_67 {

    public static void main(String[] args) {
       
        double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo de trabajo por dia, en horas:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+tiempo+"HORAS)"+", SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        double A=16000*tiempo,S=A*7,D=tiempo-40,E=D*20000,F=S+E;
        
        if(A<=70000) {
                    
            JOptionPane.showMessageDialog(null,"SE LE DEBE PAGAR AL EMPLEADOR UN EQUIVALENTE A $16000"
            + "\nEL SALARIO SEMANAL DEL EMPLEADOR ES EQUIVALENTE A $"+A);
         
        }else{
            
            JOptionPane.showMessageDialog(null,"SE LE DEBE PAGAR $16.000, MAS HORAS EXTRAS QUE EQUIVALEN A $20.000"
            + "\nEL SALARIO SEMANAL DEL EMPLEADOR ES EQUIVALENTE A $"+F);

        }  
	
    }
    
}
