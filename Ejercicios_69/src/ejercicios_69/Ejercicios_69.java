package ejercicios_69;

import javax.swing.JOptionPane;

public class Ejercicios_69 {

    public static void main(String[] args) {
        
        double weather=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo que va realizar la actividad:"));
        String exercise= JOptionPane.showInputDialog("Ingrese la actividad que va a realizar:"
        +"\nRECORDAR:dormir o sentarse");
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+weather+")HORAS,LA ACTIVIDAD ES ="+exercise+","
        + " SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
               
        if("dormir".equals(exercise)) {
                    
            double A=1.08*weather;
            double S=534000-weather;
		
            JOptionPane.showMessageDialog(null,"LA CANTIDAD DE CALORIAS CONSUMIDAS EN LA ACTIVIDAD REALIZADA DURATE "+weather+" MINUTOS ES="+A
            +"\nTOTAL DE CALORIAS EN EL CUERPO DESPUES DE LA ACTIVIDAD SON ="+S);
        }else{
            
            double D=1.66*weather;
            double F=534000-D;
             JOptionPane.showMessageDialog(null,"LA CANTIDAD DE CALORIAS CONSUMIDAS EN LA ACTIVIDAD REALIZADA DURATE "+weather+" MINUTOS ES="+D
            +"\nTOTAL DE CALORIAS EN EL CUERPO DESPUES DE LA ACTIVIDAD SON ="+F);

        }  
       
    }
    
}
