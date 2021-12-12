package ejercicios_45;

import javax.swing.JOptionPane;

public class Ejercicios_45 {

    public static void main(String[] args) {
        
        double hora=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE HORAS:"));
        double minuto=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE MINUTOS:"));
        double segundo=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE SEGUNDOS:"));
        
        double resultado_1=hora*3.600,resultado_2=minuto*60,cantidad=resultado_1+resultado_2+segundo;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LAS CANTIDADES DE "+hora+" hora(s), "+minuto+", minuto(s), "+segundo+" segundo(s) ES EL SIGUIENTE:"
        +"\nLA CANTIDAD de segundos contenidos en las ("+hora+") hora(s)) que se ingresaron es ="+resultado_1+" S"
        +"\nLA CANTIDAD de segundos contenidos en los ("+minuto+") minuto(s)) que se ingresaron es ="+resultado_2+" S"        
        +"\nLA CANTIDAD TOTAL de segundos contenidos en las tres cantidades ("+hora+"hora(s)"+minuto+"minuto(s)"+segundo+"segundo(s)) ="+cantidad+" S");
        
    }
}
