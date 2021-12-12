package ejercicios_63;

import javax.swing.JOptionPane;

public class Ejercicios_63 {
    
    public static void main(String[] args) {

    double salary=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario total, por favor:"));
    
    JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ($"+salary+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
    
     if(salary>=8281160*3) {
                    
            JOptionPane.showMessageDialog(null,"EL EMPLEADOR DEBE DECLARAR IMPUESTOS, POR QUE SU SALARIO ES =$"+salary);
         
        }else {
            
            JOptionPane.showMessageDialog(null,"EL EMPLEADOR DEBE DECLARAR IMPUESTOS, POR QUE SU SALARIO ES =$"+salary);
        } 
    
    }
}
