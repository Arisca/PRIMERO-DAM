package TareasTema6;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Excepcionpassword3 extends Exception
{
	private static final long serialVersionUID = 1L;

	Excepcionpassword3()
	 {
		   JFrame f2 = new JFrame("Tercer requisito de contraseña");   
		   JPanel p2=new JPanel();
		   JLabel l2 = new JLabel("La contraseña debe incluir al menos una letra mayúscula");
		   
		   p2.add(l2);
		   f2.add(p2);
		   f2.setSize(500, 100);
		   f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		   f2.setLocationRelativeTo(null); 
		   f2.setVisible(true);
	} 
}
