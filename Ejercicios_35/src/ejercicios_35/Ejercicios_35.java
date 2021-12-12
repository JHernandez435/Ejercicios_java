package ejercicios_35;

import javax.swing.JOptionPane;

public class Ejercicios_35 {

    public static void main(String[] args) {
        

        int xcentaje=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL PORCENTAJE:"));
        int numero=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL VALOR DEL NUMERO A OPERAR:"));
        
        double Total = (xcentaje/100)*numero;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LOS VALORES ("+xcentaje+"),("+numero+") ES LA SIGUIENTE:"
        +"\nEL"+xcentaje+"% DEL NUMERO INGRESADO ("+numero+") ES ="+Total); 
    }
    
}
