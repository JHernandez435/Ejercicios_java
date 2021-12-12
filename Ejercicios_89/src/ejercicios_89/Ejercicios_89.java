package ejercicios_89;

import javax.swing.JOptionPane;

public class Ejercicios_89 {

    public static void main(String[] args) {
       
        int op=Integer.parseInt(JOptionPane.showInputDialog(null,"ELIGE UN TIPO DE MOTOR;"
            +"\n0) MOTOR:"      
            +"\n1) MOTOR:"      
            +"\n2) MOTOR:"      
            +"\n3) MOTOR"        
            +"\n4) SALIR"));        
            JOptionPane.showConfirmDialog(null,"¿Estas Seguro?","",JOptionPane.YES_NO_OPTION);        
            
            if (op>=5) {
                
                 switch (op){
                case 0:
                    JOptionPane.showMessageDialog(null,"No hay establecido un valor definido para el tipo","",JOptionPane.ERROR_MESSAGE);
                    break;
                case 1:  
                    JOptionPane.showMessageDialog(null,"“Agua”");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"“Gasolina”");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"“Hibrido”");
                }
                
                }else{
                JOptionPane.showMessageDialog(null,"“No existe un valor válido”");
            }
    }
    
}
