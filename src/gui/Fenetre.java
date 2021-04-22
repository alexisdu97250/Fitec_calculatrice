package gui;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

class Fenetre extends JFrame implements ActionListener { // Template JFrame, extends from support Swing component, ActionListener for the method addActionListener and ActionPerformed
    
    static JFrame maFenetre; // declared attribut to create JFrame

    String opr0, op1, op3; //Button has String type value on input, here to store all the input string operator and operands (1 + 2 = 3)


    calculator() {
        opr0 = op1 = op3 = ""; //
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maFenetre = new JFrame();

		maFenetre.setVisible(true);
		
        // create a label to display text
        JLabel l = new JLabel("panel label");
        
        //Creer une fenetre d'affichage dans l'Interface (voir setBounds)
        
        // create a new buttons
        //Voir comment bien placer les boutons
        JButton b = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton o1 = new JButton("+");

        
        // create a panel to add buttons
        JPanel p = new JPanel();
        
        // add buttons and textfield to panel
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(o1);

        p.add(l);
        
        
        
        // setbackground of panel
        p.setBackground(Color.red);
        
        // add panel to frame
        maFenetre.add(p);
        
        // set the size of frame
        maFenetre.setSize(300, 300);
        
        //Associe les boutons et les fonctions
        //Recuperer les nombres entr�s sur la calculatrice
        
        //Addition
        o1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Operations.add(2,6);
        		//Recuperer le numero ecrit avant et demander le numero apres
        		//Afficher le resultat sur la fenetre
        	}
        });
        //Multiplication
        //Division
        //Soustraction
	}
}


