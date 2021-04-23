package gui;

import java.awt.event.ActionEvent;

public class Operations {
	public static int add(int a, int b) {

		

		System.out.println("Addition");
		return a+b;
		
	}
	public void actionPerformed(ActionEvent e) { //invoked automatically whenever you click on the registered component. Look Fenetre.java line 7
		String se = e.getActionCommand();
		//conditional method with type "char" as each button value has each 1 char value
		if( (se.charAt(0)) >= '0' && se.charAt(0) <= '9' || se.charAt(0) == '.') { //charAt(index position on panel) a.k.a first input String value
			

		}

	}
}

