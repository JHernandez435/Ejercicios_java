package ejercicios_38;
import javax.swing.JOptionPane;
public class Ejercicios_38 {

    public static void main(String[] args) {
        
        double celsius=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL VALOR CELSIUS A OPERAR:"));
        
        double conversion= (celsius*9/5)+32;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON EL VALOR("+celsius+") ES EL SIGUIENTE:"
        +"\nEL CONVERSION DE CELSIUS A FAHRENHEINT ES ="+conversion+" F");
    }
    
}
