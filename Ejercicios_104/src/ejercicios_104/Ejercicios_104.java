package ejercicios_104;

import javax.swing.JOptionPane;

public class Ejercicios_104 {

    public static void main(String[] args) {
       
        int inventory=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese inventario del producto:"));
        
        if (inventory==0) {
            JOptionPane.showMessageDialog(null,"STOCK=0"
                    + "\nESTADO=|Sin inventario|");
        }
        if (inventory>=1 && inventory<=10) {
            JOptionPane.showMessageDialog(null,"STOCK=1 hasta 10"
                    + "\nESTADO=|Por terminarse|");
        }
        if (inventory>=11 && inventory<=29) {
            JOptionPane.showMessageDialog(null,"STOCK=11 hasta 29"
                    + "\nESTADO=|Bajo|");
        }
        if (inventory>=30 && inventory<=59) {
            JOptionPane.showMessageDialog(null,"STOCK=30 hasta 59"
                    + "\nESTADO=|Intermedio|");
        }
        if (inventory>=60 && inventory<=79) {
            JOptionPane.showMessageDialog(null,"STOCK=60 hasta 79"
                    + "\nESTADO=|Normal|");
        }
        if (inventory>=80) {
            JOptionPane.showMessageDialog(null,"STOCK=Mayor o igual a 80"
                    + "\nESTADO=|Full|");
        }
    }
    
}
