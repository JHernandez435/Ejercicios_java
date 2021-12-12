package ejercicios_103;

import javax.swing.JOptionPane;

public class Ejercicios_103 {

    public static void main(String[] args) {
        //http://lineadecodigo.com/java/invertir-una-cadena-con-java/
        String palabra="Programacion";
        String invest="";
        for (int i = palabra.length()-1; i >= 0; i--) { 
            invest=invest+palabra.charAt(i);

        }
          JOptionPane.showMessageDialog(null,invest); 
    }
    
}
