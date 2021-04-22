package gui;
import java.awt.Color;

import javax.swing.*;

public class Fenetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame maFenetre = new JFrame();
		maFenetre.setVisible(true);
		
        // create a label to display text
        JLabel l = new JLabel("panel label");
        
        // create a new buttons
        JButton b = new JButton("button1");
        JButton b1 = new JButton("button2");
        JButton b2 = new JButton("button3");
        
        // create a panel to add buttons
        JPanel p = new JPanel();
        
        // add buttons and textfield to panel
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l);
        
        // setbackground of panel
        p.setBackground(Color.red);
        
        // add panel to frame
        maFenetre.add(p);
        
        // set the size of frame
        maFenetre.setSize(300, 300);
	}

}

