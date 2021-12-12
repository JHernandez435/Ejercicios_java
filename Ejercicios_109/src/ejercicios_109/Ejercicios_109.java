package ejercicios_109;

import javax.swing.JOptionPane;

public class Ejercicios_109 {

    public static void main(String[] args) {
        
        int age=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad:"));
        String gender=JOptionPane.showInputDialog(null,"Ingrese su genero:"
                + "\nRecuerde:\n1.Masculino\n2.Femenino:");
        
        if ("masculino".equals(gender) && age>=25) {
            JOptionPane.showMessageDialog(null,"El Usuario de ("+age+"años)("+gender+")"
                    + "\nPagar $350.000"); 
        }else if ("femenino".equals(gender) && age>=21) {
            JOptionPane.showMessageDialog(null,"El Usuario de ("+age+"años)("+gender+")"
                    + "\nPagar $250.000"); 
    
        }else{
            JOptionPane.showMessageDialog(null,"!!ERROR!!"
                    + "\nEDAD O GENERO INCORRECTOS","",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
