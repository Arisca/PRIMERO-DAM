package Tema6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Primitiva
{
	private static JLabel lcomplementario = new JLabel("Complementario:");
	private static JLabel lnada = new JLabel("");
	private static JLabel lnada2 = new JLabel("");
	private static JFrame frame = new JFrame("Generador de primitivas");
	private static JPanel panel1 = new JPanel();
	private static JPanel panel2 = new JPanel();
	private static JTextField[] txtnumeros;
	private static JButton btngenerar = new JButton("Generar");
	final static int LIMITE=50; //Números entre 1..Límite
	
	public static int getaleatorio()
	{
		return (int) (Math.random()*LIMITE+1);
	}
	
	public static void colocaelementos()
	{
		txtnumeros = new JTextField[6];
		for (int i = 0;i<6;i++)
		{
			txtnumeros[i]= new JTextField();
			if (i==5)
			{
				panel1.add(lcomplementario);
			}
			panel1.add(txtnumeros[i]);
		}
		
		frame.getContentPane().add(lnada);
		panel2.add(panel1);
		panel2.add(btngenerar);
		frame.getContentPane().add(panel2);
		frame.getContentPane().add(lnada2);

		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		btngenerar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				generarprimitiva(e);
			}
		});
		
		frame.setLayout(new GridLayout(3,1));
		panel1.setLayout(new GridLayout(1,0));
		panel2.setLayout(new GridLayout(2,1));
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void generarprimitiva(ActionEvent e)
	{
		int dato=0;
		int[] lista = new int[6];
		lista[0]=getaleatorio();
		for (int i=1;i<6;i++)
		{
			boolean lag=true;
			while (lag)
			{
				dato=getaleatorio();
				lag = false;
				for (int j=0;j<i;j++)
				{
					if (dato == lista[j]){ lag = true; }
				}
			}
			lista[i]=dato;
		}
		
		for (int i=0;i<6;i++)
		{
			Integer i1 = new Integer(lista[i]);
			txtnumeros[i].setText(i1.toString());
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
