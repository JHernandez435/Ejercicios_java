package ejercicios_32;

import javax.swing.JOptionPane;

public class Ejercicios_32 {

    public static void main(String[] args) {
        
        double nota1=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA PRIMERA RESPECTIVA CALIFICACION:"));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA SEGUNDA RESPECTIVA CALIFICACION:"));
        double nota3=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA TERCERA RESPECTIVA CALIFICACION:"));
        double nota4=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CUARTA RESPECTIVA CALIFICACION:"));
        
        double notaF = (nota1+nota2+nota3+nota4)/4;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+nota1+"),("+nota2+"),("+nota3+"),("+nota4+") ES LA SIGUIENTE:"
        +"\nLA NOTA DEFINITVA es ="+notaF);
    }
    
}
