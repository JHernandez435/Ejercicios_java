package ejercicios_20;

import javax.swing.JOptionPane;

public class Ejercicios_20 {


    public static void main(String[] args) {
               
        int base=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL BASE NUMERO:"));
        int altura=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ALTURA NUMERO:"));
        
        double area = (base*altura)/2;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION ENTRE "+base+" y "+altura+" ES LAS SIGUIENTE:"+
        "\nEl Area del triangulo es igual a ("+base+"*"+altura+")/2="+area);
        
    }
    
}
