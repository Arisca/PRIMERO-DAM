package Ejercicio1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExcepcionVacio extends Exception
{

	private static final long serialVersionUID = 1L;
	
	ExcepcionVacio()
	 {
		JFrame f2 = new JFrame("Campo Vacio");   
		JPanel p2=new JPanel();
		JLabel l2 = new JLabel("Debes de darme una respuesta para continuar");
		   
		p2.add(l2);
		f2.add(p2);
		f2.setSize(500, 100);
		f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f2.setLocationRelativeTo(null); 
		f2.setVisible(true);
	 }

}
