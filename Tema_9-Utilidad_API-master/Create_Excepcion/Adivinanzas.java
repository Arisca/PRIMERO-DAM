package Ejercicio1;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adivinanzas extends JFrame
{

	private static final long serialVersionUID = 1L;

	protected static final Component Adivinazas = null;
	
	private JPanel contentPane;
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Adivinanzas frame = new Adivinanzas();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Adivinanzas()
	{
		setTitle("Adivinanzas para Ni\u00F1os");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 351, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = new ImageIcon (this.getClass().getResource("/Imagenes/E1/Entrada.jpg")).getImage();
	
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 334, 301);
		Fondo.setIcon(new ImageIcon (img));
		contentPane.add(Fondo);
		
		JButton btnNewButton = new JButton("\u00BFComenzamos?");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Adivinanza1 A1 = new Adivinanza1();
				A1.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		btnNewButton.setBounds(64, 325, 197, 57);
		contentPane.add(btnNewButton);
		
	}
}
