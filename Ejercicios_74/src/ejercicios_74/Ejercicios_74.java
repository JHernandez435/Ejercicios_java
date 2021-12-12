package ejercicios_74;

import javax.swing.JOptionPane;

public class Ejercicios_74 {

    public static void main(String[] args) {
        
        double edad=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la edad corrspondiente, por favor"));
        String genero= JOptionPane.showInputDialog("Ingrese su respectiva genero,por favor");
        
        int azar=(int) (Math.random()*148);
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+edad+")EDAD,EL GENERO ES ("+genero+",)"
         + "\nSEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
   
        if ("masculino".equals(genero)) {
            
            double A=(210-edad)/10;
            JOptionPane.showMessageDialog(null,"el número de pulsaciones que debe tener el usuario("+genero+")"
            +"\npor cada 10 segundos de ejercicio aeróbico es ="+A);
            
        }else{
            
            double D=(220-edad)/10;
            JOptionPane.showMessageDialog(null,"el número de pulsaciones que debe tener el usuario("+genero+")"
            +"\npor cada 10 segundos de ejercicio aeróbico es ="+D);
            
        }
        
    }
    
}
