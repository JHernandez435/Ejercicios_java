package ejercicios_44;

import javax.swing.JOptionPane;

public class Ejercicios_44 {

    public static void main(String[] args) {
        
        double promedio=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PROMEDIO DE SUSU TRES CALIFICACIONES PARCIALES:"));
        double examenf=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CALIFICACION DEL EXMEN FINAL:"));
        double trabajof=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CALIFICACION DEL TRABAJO FINAL:"));
        
        double resultado_1=promedio*0.45,resultado_2=examenf*0.35,resultado_3=trabajof*0.20,calificacionf=resultado_1+resultado_2+resultado_3;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+promedio+"), ("+examenf+"), ("+trabajof+") ES EL SIGUIENTE:"
        +"\nLA CALIFICACION FINAL DEL ESTUDIANTE ES ="+calificacionf);
    }
    
}
