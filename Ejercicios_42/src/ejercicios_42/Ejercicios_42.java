package ejercicios_42;

import javax.swing.JOptionPane;

public class Ejercicios_42 {

    public static void main(String[] args) {
        
        int hora=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LAS HORAS TRABAJADAS:"));
        int valor=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL VALOR CORRESPONDIENTE POR HORA:"));
        
       double salario= valor*hora, incremento=(salario*0.25)+salario;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+hora+")HORAS DE TRABAJO CON UN VALOR DE ($"+valor+") ES EL SIGUIENTE:"
        +"\nEL SALARIO TOTAL DEL TRABAJADOR ES =$"+salario
        +"\nEL SALARIO ACTUAL DEL TRABAJADOR + EL INCREMENTO DEL 25% ES =$"+incremento);        
        
    }
    
}
