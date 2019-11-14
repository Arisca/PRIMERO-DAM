package TareasTema6;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;




public class Ejercicio2 extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel Fondo;
	private JTextField txtE_1;
	private JTextField txtE_2;
	private JTextField txtE_3;
	private JTextField txtE_4;
	private JTextField txtC;
	private JLabel ImagenPrimi;
	private JLabel Imgcartelprimi;
	
	
			public static void main(String[] args)
			{
			
				EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						try
						{
							Ejercicio2 frame = new Ejercicio2();
							frame.setVisible(true);
							frame.setSize(455, 300);
							frame.setVisible(true);
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
			}
		});
	}
	
	public Ejercicio2() 
	{
		setForeground(new Color(0, 102, 0));
		setAlwaysOnTop(true);
		setBackground(new Color(0, 153, 0));
		setTitle("Generador de primitivas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Fondo = new JPanel();
		Fondo.setBackground(SystemColor.textHighlightText);
		Fondo.setBorder(null);
		setContentPane(Fondo);
		Fondo.setLayout(null);
		
		JTextField txtE = new JTextField();
		txtE.setHorizontalAlignment(SwingConstants.CENTER);
		txtE.setBackground(UIManager.getColor("Button.background"));
		txtE.setForeground(new Color(0, 153, 51));
		txtE.setEditable(false);
		txtE.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 25));
		txtE.setBounds(51, 109, 43, 35);
		Fondo.add(txtE);
		txtE.setColumns(10);
		txtE_1 = new JTextField();
		txtE_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtE_1.setForeground(new Color(0, 153, 0));
		txtE_1.setEditable(false);
		txtE_1.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 25));
		txtE_1.setColumns(10);
		txtE_1.setBounds(104, 109, 43, 35);
		Fondo.add(txtE_1);
		txtE_2 = new JTextField(2);
		txtE_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtE_2.setForeground(new Color(0, 153, 0));
		txtE_2.setEditable(false);
		txtE_2.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 25));
		txtE_2.setColumns(10);
		txtE_2.setBounds(157, 109, 43, 35);
		Fondo.add(txtE_2);
		txtE_3 = new JTextField(2);
		txtE_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtE_3.setForeground(new Color(0, 153, 0));
		txtE_3.setEditable(false);
		txtE_3.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 25));
		txtE_3.setColumns(10);
		txtE_3.setBounds(210, 109, 43, 35);
		Fondo.add(txtE_3);
		txtE_4 = new JTextField(2);
		txtE_4.setHorizontalAlignment(SwingConstants.CENTER);
		txtE_4.setForeground(new Color(0, 153, 51));
		txtE_4.setEditable(false);
		txtE_4.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 25));
		txtE_4.setColumns(10);
		txtE_4.setBounds(263, 109, 43, 35);
		Fondo.add(txtE_4);
		txtC = new JTextField(2);
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setForeground(new Color(0, 153, 51));
		txtC.setEditable(false);
		txtC.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 25));
		txtC.setColumns(10);
		txtC.setBounds(349, 109, 43, 35);
		Fondo.add(txtC);
		
		JLabel lblComplementario = new JLabel("Complementario");
		lblComplementario.setForeground(new Color(0, 153, 0));
		lblComplementario.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblComplementario.setBounds(297, 140, 137, 27);
		Fondo.add(lblComplementario);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Random rnd = new Random();
				int t = (rnd.nextInt(99));
				txtE.setText(String.valueOf(t));
								
				int t1 = (rnd.nextInt(99));
				txtE_1.setText(String.valueOf(t1));
				
				int t2 = (rnd.nextInt(99));
				txtE_2.setText(String.valueOf(t2));
				
				int t3 = (rnd.nextInt(99));
				txtE_3.setText(String.valueOf(t3));
				
				int t4 = (rnd.nextInt(99));
				txtE_4.setText(String.valueOf(t4));
				
				int tC = (rnd.nextInt(99));
				txtC.setText(String.valueOf(tC));
			}
		});
		btnGenerar.setBackground(UIManager.getColor("Button.light"));
		btnGenerar.setForeground(new Color(0, 153, 0));
		btnGenerar.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnGenerar.setBounds(144, 187, 142, 35);
		Fondo.add(btnGenerar);
		Image img = new ImageIcon (this.getClass().getResource("/imagenes/Primitiva.jpg")).getImage();
		Image img2 = new ImageIcon (this.getClass().getResource("/imagenes/PrimitivaCartel.jpg")).getImage();
		
		Imgcartelprimi = new JLabel("");
		Imgcartelprimi.setIcon(new ImageIcon (img2));
		Imgcartelprimi.setBounds(263, 216, 171, 45);
		Fondo.add(Imgcartelprimi);
		
		ImagenPrimi = new JLabel("");
		ImagenPrimi.setIcon(new ImageIcon (img));
		ImagenPrimi.setBounds(-87, -37, 400, 272);
		Fondo.add(ImagenPrimi);
		
		
		
		
		
		
			
	}
}
