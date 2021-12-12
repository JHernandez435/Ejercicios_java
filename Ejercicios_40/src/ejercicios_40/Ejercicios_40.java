package ejercicios_40;

import javax.swing.JOptionPane;

public class Ejercicios_40 {

    public static void main(String[] args) {
        
        String articulo=JOptionPane.showInputDialog("INGRESE EL VALOR DEL ARTICULO:");
        double factura=Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL VALOR DE LA FACTURA"));
        
        double resultado = 0.16*factura;
        double valor = factura-resultado;
        
        JOptionPane.showMessageDialog(null,"LA CORRESPONDIENTE OPERACION CON LOS VALORES ("+articulo+") y (0.16%), ES EL SIGUIENTE:"
        +"\nEL PRECIO DEL PRODUCTO a pagar CON IVA es =$"+factura
        +"\nEl PRECIO DEL PRODUCTO a pagar SIN IVA es =$"+valor
        +"\nEL VALOR DEL IVA es =$"+resultado);
               
                
    }
    
}
