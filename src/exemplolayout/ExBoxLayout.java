/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author agarridogarcia
 */
public class ExBoxLayout {
     public void amosarVentana(){
        JFrame marco=new JFrame("***BOXLAYOUTS***");
        marco.setSize(400,400);
        marco.setVisible(true);
        JPanel panel=new JPanel();
        JButton bot1=new JButton("boton 1");
        JButton bot2=new JButton("boton 2");
        JButton bot3=new JButton("boton 3");
        JButton bot4=new JButton("boton 4");
        JButton bot5=new JButton("boton 5");
        
        //panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
         panel.add(bot1);
        panel.add(bot2);
        panel.add(bot3);
        panel.add(bot4);
        panel.add(bot5);
        
        marco.add(panel);
         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         marco.setVisible(true);
     
     }
}
