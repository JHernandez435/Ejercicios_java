package ejercicios_108;

import javax.swing.JOptionPane;

public class Ejercicios_108 {

    public static void main(String[] args) {
        
    
        int day=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige una opcion:"
                + "\n1.Enero\n2.Febrero\n3.Marzo\n4.Abril\n5.Mayo\n6.Junio\n7.Julio\n8.Agosto\n9.Septiembre"
                + "\n10.Octubre\n11.Nomvienbre\n12.Diciembre"));
         JOptionPane.showConfirmDialog(null,"¿Estas Seguro?","",JOptionPane.YES_NO_OPTION);
         switch (day) {
            case 1:
                JOptionPane.showMessageDialog(null,"1.Enero");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"2.Febrero");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"3.Marzo");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"4.Abril");
                break;    
            case 5:
                JOptionPane.showMessageDialog(null,"5.Mayo");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"6.Junio");
                break;    
            case 7:
                JOptionPane.showMessageDialog(null,"7.Julio");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"8.Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"9.Septimbre");
                break;    
            case 10:
                JOptionPane.showMessageDialog(null,"10.Octubre");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"11.Novimebre");
                break;    
            case 12:
                JOptionPane.showMessageDialog(null,"12.Diciembre");
                break;  
         }
    }
    
}
