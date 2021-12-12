package ejercicios_26;

import javax.swing.JOptionPane;

public class Ejercicios_26 {

    public static void main(String[] args) {
        
        int radio=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL RADIO DEL CILINDRO:"));
        int altura=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA ALTURA DEL CILINDRO:"));
        
        double area = (2*Math.PI)*(radio*altura);
        double volumen = Math.PI*(Math.pow(radio,2))*altura;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON ("+radio+") y ("+altura+") ES LA SIGUIENTE:"
        +"\nEl AREA del CILINDRO es ="+altura
        +"\nEl VOLUMEN del CILINDRO es ="+volumen);       
        
    }
    
}
