package ejercicios_71;

import javax.swing.JOptionPane;

public class Ejercicios_71 {

    public static void main(String[] args) {
        
            double monto=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL MONTO TOTAL DE LA COMPRA,POR FAVOR"));
        
        JOptionPane.showMessageDialog(null,"GRACIAS POR SU RESPUESTA ("+monto+"),SEGUN SU RESPUESTA SE PUEDE AFIRMAR QUE:");
        
        if (monto>500.000) {
            
            double A=monto*0.55,S=monto*0.30,D=monto*0.15,F=D*0.20,G=F+D,H=A+S+D+F;
                    
            JOptionPane.showMessageDialog(null,"EL VALOR QUE DEBE INVERTIR LA EMPRESA ES ="+A
            +"\nEL PRESTAMO QUE DEBE PEDIR AL BANCO ES ="+S
            +"\nEL VALOR DEL CREDITO QUE SE DEBE PEDIR AL FABRICANTE ES ="+D
            +"\nEL VAOR DEL INTERES ES ="+F
            +"\nEL MONTO TOTAL QUE SE DEBE PAGARLE AL FABRICANTE ES ="+G
            +"\nEL RECAUDO TOTAL TENIENDO EN CUENTA TODOS LOS PROCESOS ES ="+H);
        }else{
            double Q=monto*0.55,W=monto*0.30,E=monto*0.20,R=E+W,T=Q+W+E;
                        
            JOptionPane.showMessageDialog(null,"EL VALOR QUE DEBE INVERTIR LA EMPRESA ES ="+Q
            +"\nEL PRESTAMO QUE DEBE PEDIR AL BANCO ES ="+W
            +"\nEL VAOR DEL INTERES ES ="+E
            +"\nEL MONTO TOTAL QUE SE DEBE PAGARLE AL FABRICANTE ES ="+R
            +"\nEL RECAUDO TOTAL TENIENDO EN CUENTA TODOS LOS PROCESOS ES ="+T);
            
        }
    }
    
}
