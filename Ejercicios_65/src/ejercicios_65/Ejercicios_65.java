package ejercicios_65;
import javax.swing.JOptionPane;
public class Ejercicios_65 {

    public static void main(String[] args) {
        
       double salary=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario total,por favor:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+salary+")"+", SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if(salary<3) {
                    
            JOptionPane.showMessageDialog(null,"PAGAR LOS ARTICULOS EN EFECTIVO");
         
        }else{
            
            JOptionPane.showMessageDialog(null,"PAGAR LOS ARTICULOS CON TARGETA DE CREDITO"); 

        }       
                
    }
    
}
