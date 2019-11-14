package Tema6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

	public class Chef
	{
		 private static JLabel lrespuesta = new JLabel("---");
		 private static JFrame frame = new JFrame("Chef 4000");
		 private static JPanel panel1 = new JPanel();
		 private static JPanel panel2 = new JPanel();
		 private static JPanel panel3 = new JPanel();
		 private static JPanel panel4 = new JPanel();
		 private static JPanel panel5 = new JPanel();
		 private static JPanel panel6 = new JPanel();
		 private static JPanel panel7 = new JPanel();
		 private static JPanel pingre = new JPanel();
		 private static JRadioButton rbtncocido = new JRadioButton("Cocido");
		 private static JRadioButton rbtnlentejas = new JRadioButton("Lentejas");
		 private static JRadioButton rbtnjudias = new JRadioButton("Judias");
		 private static JCheckBox chklentejas = new JCheckBox("Lentejas");
		 private static JCheckBox chkgarbanzos = new JCheckBox("Garbanzos");
		 private static JCheckBox chkjudias = new JCheckBox("Judias");
		 private static JCheckBox chknuez = new JCheckBox("Nuez Moscada");
		 private static JCheckBox chkchorizo = new JCheckBox("Chorizo");
		 private static JCheckBox chkmorcilla = new JCheckBox("Morcilla");
		 private static JCheckBox chkcolorante = new JCheckBox("Colorante");
		 private static JCheckBox chklaurel = new JCheckBox("Laurel");
		 private static JCheckBox chkcebolla = new JCheckBox("Cebolla");
		 private static JCheckBox chkzanahoria = new JCheckBox("zanahoria");
		 private static JCheckBox chkpescado = new JCheckBox("Pescado");
		 private static JCheckBox chkpimenton = new JCheckBox("Pimentón");
		 private static JButton btncomprobar = new JButton("Comprobar");
		 
		 public static void colocaelementos()
		 {
			 panel1.add(rbtncocido);
			 panel1.add(rbtnlentejas);
			 panel1.add(rbtnjudias);
			 rbtncocido.setSelected(true);
			 panel2.add(chklentejas);
			 panel2.add(chkchorizo);
			 panel2.add(chkcebolla);
			
			 panel3.add(chkgarbanzos);
			 panel3.add(chkmorcilla);
			 panel3.add(chkzanahoria);
			
			 panel4.add(chkjudias);
			 panel4.add(chkcolorante);
			 panel4.add(chkpescado);
			 panel5.add(chknuez);
			 panel5.add(chklaurel);
			 panel5.add(chkpimenton);
			
			 pingre.add(panel2);
			 pingre.add(panel3);
			 pingre.add(panel4);
			 pingre.add(panel5);
			
			 panel6.add(btncomprobar);
			 panel7.add(lrespuesta);

			 frame.getContentPane().add(panel1);
			 frame.getContentPane().add(pingre);
			 frame.getContentPane().add(panel6);
			 frame.getContentPane().add(panel7);
			 frame.addWindowListener(new WindowAdapter()
			 
			 {
				 public void windowClosing(WindowEvent e)
				 {
					 System.exit(0);
				 }
			 });
			 
			 btncomprobar.addActionListener(new ActionListener()
			 {
				 public void actionPerformed(ActionEvent e)
				 {
					 comprobar();
				 }
			 });
			frame.setLayout(new GridLayout(0,1));
			panel2.setLayout(new GridLayout(0,1));
			panel3.setLayout(new GridLayout(0,1));
			panel4.setLayout(new GridLayout(0,1));
			panel5.setLayout(new GridLayout(0,1));
			pingre.setLayout(new GridLayout(1,3));
			frame.pack();
			frame.setVisible(true);
		 }
		 
		 public static void comprobar()
		 {
			 lrespuesta.setText("Incorrecto");
			 if (rbtncocido.isSelected() && !chklentejas.isSelected() && chkgarbanzos.isSelected() &&
					 !chkjudias.isSelected() && !chknuez.isSelected() && chkchorizo.isSelected() &&chkmorcilla.isSelected() &&
					 !chkcolorante.isSelected() && !chklaurel.isSelected() && !chkcebolla.isSelected() &&chkzanahoria.isSelected() &&
					 !chkpescado.isSelected() && !chkpimenton.isSelected())
			 {
				 lrespuesta.setText("Correcto");
			 }
			 
			 if (rbtnlentejas.isSelected() && chklentejas.isSelected() && !chkgarbanzos.isSelected() &&
					 !chkjudias.isSelected() && !chknuez.isSelected() && chkchorizo.isSelected() &&
					 !chkmorcilla.isSelected() && !chkcolorante.isSelected() && !chklaurel.isSelected() && chkcebolla.isSelected() &&
					 chkzanahoria.isSelected() && !chkpescado.isSelected() && chkpimenton.isSelected())
			 {
				 lrespuesta.setText("Correcto");
			 }
			 
			 if (rbtnjudias.isSelected() && !chklentejas.isSelected() && !chkgarbanzos.isSelected() &&
					 chkjudias.isSelected() && chknuez.isSelected() && chkchorizo.isSelected() &&
					 !chkmorcilla.isSelected() && chkcolorante.isSelected() && chklaurel.isSelected() && chkcebolla.isSelected()
					 && !chkzanahoria.isSelected() && !chkpescado.isSelected() && !chkpimenton.isSelected())
			 {
				 lrespuesta.setText("Correcto");
			 }
		 }
		 
		 public static void main(String[] args)
		 {
			 try
			 {
				 UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			 }
			 catch (Exception e) { }
			 colocaelementos();
		 }
}
