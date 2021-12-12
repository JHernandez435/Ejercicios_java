package ejercicios_4;

import javax.swing.JOptionPane;

public class Ejercicios_4 {

    public static void main(String[] args) {
        
        int op,suma,resta,multiplicacion;
        double division,mod;
        boolean salir = false;
        
        int num_1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero:")); 
        int num_2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero:"));
        
       while(!salir){
                
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"Escoge una opcion"+"\n1.Suma"+"\n2.Resta"+"\n3.Multiplicacion"+"\n4.Division"+"\n5.Mod"+"\n6.SALIR"));         
               
                 switch(op){
                case 1:
                    suma=num_1+num_2;
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+suma);
                break;
                case 2:
                    resta=num_1-num_2;      
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+resta);
                break;
                case 3:
                    multiplicacion=num_1*num_2;      
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+multiplicacion);
                case 4:
                    division=num_1/num_2;
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+division);
                break;
                case 5:
                    mod=num_1%num_2;
                    JOptionPane.showMessageDialog(null,"El Resutado de la operacion ="+mod);
                case 6:
                    salir=true;
                break;
                
                } 
        
            }
    }
    
}

