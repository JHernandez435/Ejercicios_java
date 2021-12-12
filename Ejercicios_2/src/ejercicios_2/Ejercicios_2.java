package ejercicios_2;

import javax.swing.JOptionPane;

public class Ejercicios_2 {


    public static void main(String[] args) {
  
        int a=30+60,b=67-80,e=67*32,h=20-(4*3)+10,j=(3-4)*(5*6),k=13-4*(5-2)+3*(2+8),w=(int) (Math.random()*20+1),
        x=(int) Math.pow(12,2),y=(int) Math.pow(50,2),z=(int) Math.pow(45,2),z1=(int) Math.pow(68,2);
        double c=300/25,d=80%20,f=(8+9)/4,g=9+(14/5),i=Math.sqrt(4)+(10+5),l=6*(7*5-4*6)+81%9-6,m=Math.sin(25),n=Math.cos(35),o=Math.tan(70)
        ,p=Math.sin(32),q=Math.cos(47),r=Math.tan(80),s=Math.log(20),t=Math.floor(85.9),u=Math.ceil(87.4),v=Math.round(14.85);
        
                
        JOptionPane.showMessageDialog(null,"Valores:"+"\nA: 30+60=: "+a+"\nB: 67-80=: "+b+"\nC: 300/25: "+c+"\nD: 80%20: "+d+"\nE: 67*32: "+e+
            "\nF: (8+9)/4 "+f+"\nG: 9+(14/5) "+g+"\nH: 20-(4*3)+10 "+h+"\nI: 4+(10+5) "+i+"\nJ: 3-4(5*6) "+j+"\nK:13-4*(5-2) "+k+"\nL: 6*(7*5-4*6)+81%9-6 "+l+
            "\nM: sin(25) "+m+"\nN: Math.cos(35)="+n+"\nO: tan(70) "+o+"\nP: sin(32)="+p+"\nQ:cos(47)="+q+"\nR:tan(80)="+r+"\nS:log(20)="+s+"\nT:Truncar debajo="+t+
            "\nU:trucar encima="+u+"\nV:Redondear="+v+"\nW:Azar="+w+"\nX:Cuadrado="+x+"\nY:Cuadrado="+y+"\nZ:Cuadrado="+z+"\nZ1:Cuadrado="+z1+"       "+JOptionPane.INFORMATION_MESSAGE);
    }
    
}
