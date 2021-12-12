package ejercicios_106;

import javax.swing.JOptionPane;

public class Ejercicios_106 {

    public static void main(String[] args) {
        
        int question=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cantidad de preguntas realizadas:"));
        int answer=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de respuestas correctas:"));
        
        int reply_1=question-answer;
        int reply_2=(question/100)*answer;
        
        if (reply_2>=90) {
            JOptionPane.showMessageDialog(null,"Nivel maximo");
        }            
        if (reply_2>=75 && reply_2<90) {
           JOptionPane.showMessageDialog(null,"Nivel medio");
        }
        if (reply_2>=50 && reply_2<75) {
            JOptionPane.showMessageDialog(null,"Nivel regular");
        }
        if (reply_2<50) {
            JOptionPane.showMessageDialog(null,"Fuera de rango");
        }
        
    }
    
}
