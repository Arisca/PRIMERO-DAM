package Ejercicio1;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Despedida extends JFrame
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
					Despedida frame = new Despedida();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Despedida()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 606, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		Image img = new ImageIcon (this.getClass().getResource("/Imagenes/E1/Despedida.jpg")).getImage();
		
		JLabel lblNewLabel = new JLabel("Has terminado el Juego");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
		lblNewLabel.setBounds(0, 0, 312, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblDemostrandoSerUn = new JLabel("Demostrando ser un ni\u00F1o muy listo");
		lblDemostrandoSerUn.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemostrandoSerUn.setForeground(Color.RED);
		lblDemostrandoSerUn.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
		lblDemostrandoSerUn.setBounds(146, 43, 444, 55);
		contentPane.add(lblDemostrandoSerUn);
		
		JLabel lblHastaLaProxima = new JLabel("Hasta la proxima!!");
		lblHastaLaProxima.setHorizontalAlignment(SwingConstants.CENTER);
		lblHastaLaProxima.setForeground(Color.RED);
		lblHastaLaProxima.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
		lblHastaLaProxima.setBounds(133, 307, 312, 55);
		contentPane.add(lblHastaLaProxima);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, -53, 728, 518);
		Fondo.setIcon(new ImageIcon (img));
		contentPane.add(Fondo);	
		
	}

}
