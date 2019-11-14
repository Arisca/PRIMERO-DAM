package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExcepcionFallo extends Exception
{

	private static final long serialVersionUID = 1L;
	
	ExcepcionFallo()
	 {
		JFrame f2 = new JFrame("Has fallado!");   
		JPanel p2=new JPanel();
		JLabel l2 = new JLabel("Lo siento, pero la respuesta no es la correcta.");
		   
		p2.add(l2);
		f2.add(p2);
		f2.setSize(500, 100);
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f2.setLocationRelativeTo(null); 
		f2.setVisible(true);
	 }

}
