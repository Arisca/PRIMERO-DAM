package TareasTema6;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.NumberFormatException;
import javax.swing.*;
import java.util.regex.Pattern;
import java.awt.Color;

public class Ejercicio5 extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NumeroDecimal;
	private JTextField NumeroRomano;
	private JLabel fondo;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Ejercicio5 frame = new Ejercicio5();
					frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio5()
	{
		setTitle("Conversor Decimal <<<>>> Romano");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDecimal = new JLabel("Decimal");
		lblDecimal.setForeground(Color.WHITE);
		lblDecimal.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 26));
		lblDecimal.setBounds(67, 153, 132, 32);
		contentPane.add(lblDecimal);
		
		JLabel lblRomano = new JLabel("Romano");
		lblRomano.setForeground(Color.WHITE);
		lblRomano.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 26));
		lblRomano.setBounds(346, 153, 106, 32);
		contentPane.add(lblRomano);
		
		NumeroDecimal = new JTextField();
		NumeroDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroDecimal.setFont(new Font("Yu Gothic", Font.PLAIN, 19));
		NumeroDecimal.setBounds(67, 196, 143, 32);
		contentPane.add(NumeroDecimal);
		NumeroDecimal.setColumns(10);
		
		NumeroRomano = new JTextField();
		NumeroRomano.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroRomano.setFont(new Font("Yu Gothic", Font.PLAIN, 19));
		NumeroRomano.setColumns(10);
		NumeroRomano.setBounds(309, 196, 143, 32);
		contentPane.add(NumeroRomano);
		
		JButton ToRomano = new JButton(">>>");
		ToRomano.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				 try {
					 	int valor = Integer.parseInt(NumeroDecimal.getText());
	                    String Roman =  Romanos.intoroman(valor);
	                    NumeroRomano.setText("" + Roman);
	                } 
				 	catch (NumberFormatException ex) 
				 	{
	                    NumeroRomano.setText("Error");
	                }
				
			}
		});
		ToRomano.setBounds(220, 170, 79, 34);
		contentPane.add(ToRomano);
		
		JButton ToDecimal = new JButton("<<<");
		ToDecimal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String valor = (NumeroRomano.getText());
				String RomanoMayuscula = valor.toUpperCase();
				
				if (!(Pattern.matches("^[MCDLXVI]+$", (CharSequence) RomanoMayuscula)))
			 	{
					NumeroDecimal.setText("ERROR");
				}
				else
				{
					int decimal = 0;
					int largo = RomanoMayuscula.length();
					int numero = 0;
					int anterior = 0;
					
					for (int i = largo - 1; i >= 0 ;i--)
					{
						char x = RomanoMayuscula.charAt(i);
						x = Character.toUpperCase(x);
						
						switch (x)
						{
							case 'I':
								anterior = numero;
								numero = 1;
								break;
							case 'V':
								anterior = numero;
								numero = 5;
								break;
							case 'X':
								anterior = numero;
								numero = 10;
								break;
							case 'L':
								anterior = numero;
								numero = 50;
								break;
							case 'C':
								anterior = numero;
								numero = 100;
								break;
							case 'D':
								anterior = numero;
								numero = 500;
								break;
							case 'M':
								anterior = numero;
								numero= 1000;
								break;
						}
						if (numero <anterior)
						{
							decimal = decimal - numero;
						}
						else
							decimal = decimal + numero;
						}
					
					NumeroDecimal.setText((String.valueOf(decimal)));
				}
			}
		});
		ToDecimal.setBounds(220, 215, 79, 34);
		contentPane.add(ToDecimal);
		Image img = new ImageIcon (this.getClass().getResource("/imagenes/fondoromano.jpg")).getImage();
		
		fondo = new JLabel("");
		fondo.setIcon(new ImageIcon (img));
		fondo.setBounds(0, -13, 618, 408);
		contentPane.add(fondo);
		
	}

}
