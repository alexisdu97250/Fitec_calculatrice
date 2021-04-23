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
        
        // create new buttons
   
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

        
        
        JPanel ligne0 = new JPanel();
        ligne0.setLayout(new BoxLayout (ligne0, BoxLayout.LINE_AXIS));
        ligne0.add(l);
        // create a panel to add buttons
        JPanel ligne1 = new JPanel();
        
        // add buttons and textfield on line 1
       ligne1.setLayout(new BoxLayout (ligne1, BoxLayout.LINE_AXIS));
        ligne1.add(b1);
        ligne1.add(b2);
        ligne1.add(b3);
        
        //Idem ligne 2
        JPanel ligne2 = new JPanel();
        ligne2.setLayout(new BoxLayout (ligne2, BoxLayout.LINE_AXIS));
        
        ligne2.add(b4);
        ligne2.add(b5);
        ligne2.add(b6);
        
        //Ligne 3
        JPanel ligne3 = new JPanel();
        
        ligne3.setLayout(new BoxLayout (ligne3, BoxLayout.LINE_AXIS));
        ligne3.add(b7);
        ligne3.add(b8);
        ligne3.add(b9);
        
        //Ligne4
        JPanel ligne4 = new JPanel();
        ligne4.setLayout(new BoxLayout (ligne4, BoxLayout.LINE_AXIS));
        ligne4.add(o1);
        ligne4.add(b);
       
        
        //On crée 3 colonnes
        
        JPanel colonnes = new JPanel();
        colonnes.setLayout(new BoxLayout(colonnes, BoxLayout.PAGE_AXIS));
        colonnes.add(ligne0);
        colonnes.add(ligne1);
        colonnes.add(ligne2);
        colonnes.add(ligne3);
        colonnes.add(ligne4);
        
        maFenetre.getContentPane().add(colonnes);
        
        
        
        // setbackground of panel
      //  p.setBackground(Color.red);
        
        // add panel to frame
      //  maFenetre.add(p);
        
        // set the size of frame
        maFenetre.setSize(300, 300);
        
        //Associe les boutons et les fonctions
        //Recuperer les nombres entrï¿½s sur la calculatrice
        
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


