package ejercicios_80;

import javax.swing.JOptionPane;

public class Ejercicios_80 {

    public static void main(String[] args) {
        
        double imeca=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor de la inversion total:"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+imeca+"), SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (imeca>170) {
            
            int op=Integer.parseInt(JOptionPane.showInputDialog(null,"LA FABRICA TIENE DOS OPCIONES;"
            +"\n1) FRENAR DURATE UNA SEMANA LA PRODUCCION"      
            +"\n2) CONTINUAR PRODUCCION PERO DEBERA DAR EL 50% DE LOS INGRESOS DE ESA SEMANA "));        
                        
            switch (op){
                case 1:
                    JOptionPane.showMessageDialog(null,"1) FRENAR LA PRODUCCION DURATE UNA SEMANA");
                    break;
                case 2:  
                    double x=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE EL VALOR DE LOS INGRESOS DE LA SEMANA"));
                    double F=x*0.50;
                    JOptionPane.showMessageDialog(null,"EL MOTO A DAR ES IGUAL A "+F+""
                    + "\nQUE EQUIVALE AL 50% DE LOS INGRESOS DE LA SEMANA");
                    break;
            }   
        }else{
           JOptionPane.showMessageDialog(null,"LA FABRICA TIENE NIVELES DE IMEC MENORES O IGUALES A 170"
           + "\nENTOCES LA FABRICA NO SE LE ASIGNA NI MULTA,NI SANCION. GRACIAS");
        }
        
    }
    
}
