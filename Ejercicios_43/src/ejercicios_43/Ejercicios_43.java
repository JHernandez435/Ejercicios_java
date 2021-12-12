package ejercicios_43;

import javax.swing.JOptionPane;

public class Ejercicios_43 {

    public static void main(String[] args) {
        
        double salario=Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL VALOR DE LA FACTURA"));
        
        double afiliacion= 0.04*salario, salariototal=(afiliacion*2)-salario;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+salario+"), ES EL SIGUIENTE:"
        +"\nEL VALOR A DESCONTAR DEL SALRIO PARA EL SISTEMA DE SALUD ES =$"+afiliacion
        +"\nEL VALOR A DESCONTAR DEL SALRIO PARA EL SISTEMA DE PENSIONES ES =$"+afiliacion
        +"\nEL SALARIO ACTUAL DEL TRABAJADOR + EL INCREMENTO DEL 25% ES =$"+salariototal); 
    }
    
}
