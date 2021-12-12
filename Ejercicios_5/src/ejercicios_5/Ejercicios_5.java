package ejercicios_5;

import javax.swing.JOptionPane;

public class Ejercicios_5 {

    public static void main(String[] args) {
        
        int op;
        boolean salir = false;
        
        int num_1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero para operar:")); 
        
       while(!salir){
                
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"Escoge una opcion"
               +"\n1.Cuadrado"+"\n2.Raiz Cuadrada"+"\n3.Seno"+"\n4.Coseno"+"\n5.Tangente"
               +"\n6.Valor Absoluto"+"\n7.Logaritmo Natural"+"\n8.Redondear un numero"
               +"\n9.Truncar un numero"+"\n10.Numero Aleatorio"+"\n11.SALIR"));
            
                switch(op){
                case 1:
                    double c=Math.pow(num_1,2);
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+c);
                break;
                case 2:
                    double RC=Math.sqrt(num_1);      
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+RC);
                break;
                case 3:
                    double seno=Math.sin(num_1);      
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+seno);
                case 4:
                    double coseno=Math.cos(num_1);
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+coseno);
                break;
                case 5:
                    double tangente=Math.tan(num_1);
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+tangente);
                    
                case 6:
                double abs=Math.abs(num_1);
                JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+abs);
                break;
                case 7:
                    double ln=Math.log(num_1);      
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+ln);
                break;
                case 8:
                    double redondear=Math.round(num_1);      
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+redondear);
                case 9:
                    double truncar=Math.ceil(num_1);
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+truncar);
                break;
                case 10:
                    int azar=(int) (Math.random()*num_1+1);
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+azar);
                case 11:
                    salir=true;
                break;
                
                } 
        
            }
    }
    
}

   
