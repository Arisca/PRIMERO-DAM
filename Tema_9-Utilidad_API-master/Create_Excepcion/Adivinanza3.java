package Ejercicio1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Adivinanza3 extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Adivinanza3 frame = new Adivinanza3();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Adivinanza3()
	{
		setTitle("Adivianza 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 687, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = new ImageIcon (this.getClass().getResource("/Imagenes/E1/A3.jpg")).getImage();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u00BFQu\u00E9 es?", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(196, 364, 278, 85);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBounds(6, 16, 266, 62);
		panel.add(textField);
		textField.setForeground(Color.BLUE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String respuesta = textField.getText();
				comprobar(respuesta);	
			}

			private void comprobar(String respuesta)
			{
								
				if(respuesta.equalsIgnoreCase("Leon") == true)
				{
					Adivinanza4 A4 = new Adivinanza4();
					A4.setVisible(true);
					setVisible(false);
					
					JFrame f2 = new JFrame("CORRECTO!");   
					JPanel p2=new JPanel();
					JLabel l2 = new JLabel("Has acertado! Continuemos jugando");   
					p2.add(l2);
					f2.getContentPane().add(p2);
					f2.setSize(500, 100);
					f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					f2.setLocationRelativeTo(A4); 
					f2.setVisible(true);
		
				}
				else
				{
					try
					{
						if (respuesta != "Leon")
							throw new ExcepcionFallo();
					}
					catch(ExcepcionFallo e1){}
					try
					{
						if (respuesta != "leon")
							throw new ExcepcionFallo();
					}
					catch(ExcepcionFallo e1){}		
					try
					{
						if (textField.getText().equals(""))
							throw new ExcepcionVacio();
					}
					catch(ExcepcionVacio e2){}	
					}
			}
			
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnNewButton.setBounds(275, 445, 129, 41);
		contentPane.add(btnNewButton);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(25, -52, 671, 515);
		Fondo.setIcon(new ImageIcon (img));
		contentPane.add(Fondo);	
	}

}
