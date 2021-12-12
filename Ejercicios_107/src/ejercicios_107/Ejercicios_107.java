package ejercicios_107;

import javax.swing.JOptionPane;

public class Ejercicios_107 {

    public static void main(String[] args) {
        
         int day=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige una opcion:"
                 + "\n1.Lunes\n2.Martes\n3.Miercoles\n4.Jueves\n5.Viernes\n6.Sabado\n7.Domingo"));
         JOptionPane.showConfirmDialog(null,"¿Estas Seguro?","",JOptionPane.YES_NO_OPTION);
         switch (day) {
            case 1:
                JOptionPane.showMessageDialog(null,"1.Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"2.Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"3.Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"4.Juves");
                break;    
            case 5:
                JOptionPane.showMessageDialog(null,"5.Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"6.Sabado");
                break;    
            case 7:
                JOptionPane.showMessageDialog(null,"7.Domingo");
                break;    
        }
    }
    
}
