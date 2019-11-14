package Ejercicio2;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Numeros extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private int [] array;
	private int [] Todos = new int []   {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
			51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
	
		
	private JPanel contentPane;
	private JTextField a0;
	private JTextField a1;
	private JTextField a2;
	private JTextField a3;
	private JTextField a4;
	private JTextField a5;
	private JTextField a6;
	private JTextField a7;
	private JTextField a8;
	private JTextField a9;
	private JTextField a10;
	private JTextField a15;
	private JTextField a20;
	private JTextField a11;
	private JTextField a16;
	private JTextField a21;
	private JTextField a12;
	private JTextField a17;
	private JTextField a22;
	private JTextField a13;
	private JTextField a14;
	private JTextField a18;
	private JTextField a19;
	private JTextField a23;
	private JTextField a24;
	private JTextField b0;
	private JTextField b5;
	private JTextField b10;
	private JTextField b15;
	private JTextField b20;
	private JTextField b21;
	private JTextField b16;
	private JTextField b11;
	private JTextField b6;
	private JTextField b1;
	private JTextField b2;
	private JTextField b7;
	private JTextField b12;
	private JTextField b17;
	private JTextField b22;
	private JTextField b23;
	private JTextField b18;
	private JTextField b13;
	private JTextField b8;
	private JTextField b3;
	private JTextField b4;
	private JTextField b9;
	private JTextField b14;
	private JTextField b19;
	private JTextField b24;
	private JTextField c0;
	private JTextField c5;
	private JTextField c10;
	private JTextField c15;
	private JTextField c20;
	private JTextField c21;
	private JTextField c16;
	private JTextField c11;
	private JTextField c6;
	private JTextField c1;
	private JTextField c2;
	private JTextField c7;
	private JTextField c12;
	private JTextField c17;
	private JTextField c22;
	private JTextField c23;
	private JTextField c18;
	private JTextField c13;
	private JTextField c8;
	private JTextField c3;
	private JTextField c4;
	private JTextField c9;
	private JTextField c14;
	private JTextField c19;
	private JTextField c24;
	private JTextField d0;
	private JTextField d5;
	private JTextField d10;
	private JTextField d15;
	private JTextField d20;
	private JTextField d21;
	private JTextField d16;
	private JTextField d11;
	private JTextField d6;
	private JTextField d1;
	private JTextField d2;
	private JTextField d7;
	private JTextField d12;
	private JTextField d17;
	private JTextField d22;
	private JTextField d23;
	private JTextField d18;
	private JTextField d13;
	private JTextField d8;
	private JTextField d3;
	private JTextField d4;
	private JTextField d9;
	private JTextField d14;
	private JTextField d19;
	private JTextField d24;
	private JButton btnMostarNmerosElegidos;
	private JTextField txtB;
	private JTextField txtI;
	private JTextField txtN;
	private JTextField txtG;
	private JTextField txtO;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel Boleto1;
	private JLabel Boleto2;
	private JLabel Boleto3;
	private JLabel Boleto4;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Numeros frame = new Numeros();
					frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public Numeros() 
	{
		
		setTitle("MaxiBingo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 957);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		a0 = new JTextField();
		a0.setBackground(new Color(100, 149, 237));
		a0.setFont(new Font("Dialog", Font.ITALIC, 20));
		a0.setEditable(false);
		a0.setHorizontalAlignment(SwingConstants.CENTER);
		a0.setText("");
		a0.setBounds(48, 118, 46, 35);
		contentPane.add(a0);
		a0.setColumns(10);
		
		a1 = new JTextField();
		a1.setFont(new Font("Dialog", Font.ITALIC, 20));
		a1.setEditable(false);
		a1.setHorizontalAlignment(SwingConstants.CENTER);
		a1.setText("");
		a1.setColumns(10);
		a1.setBounds(104, 118, 46, 35);
		contentPane.add(a1);
		
		a2 = new JTextField();
		a2.setBackground(new Color(100, 149, 237));
		a2.setFont(new Font("Dialog", Font.ITALIC, 20));
		a2.setEditable(false);
		a2.setHorizontalAlignment(SwingConstants.CENTER);
		a2.setText("");
		a2.setColumns(10);
		a2.setBounds(160, 118, 46, 35);
		contentPane.add(a2);
		
		a3 = new JTextField();
		a3.setFont(new Font("Dialog", Font.ITALIC, 20));
		a3.setEditable(false);
		a3.setHorizontalAlignment(SwingConstants.CENTER);
		a3.setText("");
		a3.setColumns(10);
		a3.setBounds(216, 118, 46, 35);
		contentPane.add(a3);
		
		a4 = new JTextField();
		a4.setBackground(new Color(100, 149, 237));
		a4.setFont(new Font("Dialog", Font.ITALIC, 20));
		a4.setEditable(false);
		a4.setHorizontalAlignment(SwingConstants.CENTER);
		a4.setText("");
		a4.setColumns(10);
		a4.setBounds(272, 118, 46, 35);
		contentPane.add(a4);
		
		a5 = new JTextField();
		a5.setFont(new Font("Dialog", Font.ITALIC, 20));
		a5.setEditable(false);
		a5.setHorizontalAlignment(SwingConstants.CENTER);
		a5.setText("");
		a5.setColumns(10);
		a5.setBounds(48, 164, 46, 35);
		contentPane.add(a5);
		
		a6 = new JTextField();
		a6.setBackground(new Color(100, 149, 237));
		a6.setFont(new Font("Dialog", Font.ITALIC, 20));
		a6.setEditable(false);
		a6.setHorizontalAlignment(SwingConstants.CENTER);
		a6.setText("");
		a6.setColumns(10);
		a6.setBounds(104, 164, 46, 35);
		contentPane.add(a6);
		
		a7 = new JTextField();
		a7.setFont(new Font("Dialog", Font.ITALIC, 20));
		a7.setEditable(false);
		a7.setHorizontalAlignment(SwingConstants.CENTER);
		a7.setText("");
		a7.setColumns(10);
		a7.setBounds(160, 164, 46, 35);
		contentPane.add(a7);
		
		a8 = new JTextField();
		a8.setBackground(new Color(100, 149, 237));
		a8.setFont(new Font("Dialog", Font.ITALIC, 20));
		a8.setEditable(false);
		a8.setHorizontalAlignment(SwingConstants.CENTER);
		a8.setText("");
		a8.setColumns(10);
		a8.setBounds(216, 164, 46, 35);
		contentPane.add(a8);
		
		a9 = new JTextField();
		a9.setFont(new Font("Dialog", Font.ITALIC, 20));
		a9.setEditable(false);
		a9.setHorizontalAlignment(SwingConstants.CENTER);
		a9.setText("");
		a9.setColumns(10);
		a9.setBounds(272, 164, 46, 35);
		contentPane.add(a9);
		
		a10 = new JTextField();
		a10.setBackground(new Color(100, 149, 237));
		a10.setFont(new Font("Dialog", Font.ITALIC, 20));
		a10.setEditable(false);
		a10.setHorizontalAlignment(SwingConstants.CENTER);
		a10.setText("");
		a10.setColumns(10);
		a10.setBounds(48, 210, 46, 35);
		contentPane.add(a10);
		
		a15 = new JTextField();
		a15.setFont(new Font("Dialog", Font.ITALIC, 20));
		a15.setEditable(false);
		a15.setHorizontalAlignment(SwingConstants.CENTER);
		a15.setText("");
		a15.setColumns(10);
		a15.setBounds(48, 258, 46, 35);
		contentPane.add(a15);
		
		a20 = new JTextField();
		a20.setBackground(new Color(100, 149, 237));
		a20.setFont(new Font("Dialog", Font.ITALIC, 20));
		a20.setEditable(false);
		a20.setHorizontalAlignment(SwingConstants.CENTER);
		a20.setText("");
		a20.setColumns(10);
		a20.setBounds(48, 306, 46, 35);
		contentPane.add(a20);
		
		a11 = new JTextField();
		a11.setFont(new Font("Dialog", Font.ITALIC, 20));
		a11.setEditable(false);
		a11.setHorizontalAlignment(SwingConstants.CENTER);
		a11.setText("");
		a11.setColumns(10);
		a11.setBounds(104, 210, 46, 35);
		contentPane.add(a11);
		
		a16 = new JTextField();
		a16.setBackground(new Color(100, 149, 237));
		a16.setFont(new Font("Dialog", Font.ITALIC, 20));
		a16.setEditable(false);
		a16.setHorizontalAlignment(SwingConstants.CENTER);
		a16.setText("");
		a16.setColumns(10);
		a16.setBounds(104, 258, 46, 35);
		contentPane.add(a16);
		
		a21 = new JTextField();
		a21.setFont(new Font("Dialog", Font.ITALIC, 20));
		a21.setEditable(false);
		a21.setHorizontalAlignment(SwingConstants.CENTER);
		a21.setText("");
		a21.setColumns(10);
		a21.setBounds(104, 306, 46, 35);
		contentPane.add(a21);
		
		a12 = new JTextField();
		a12.setBackground(new Color(100, 149, 237));
		a12.setFont(new Font("Dialog", Font.ITALIC, 20));
		a12.setEditable(false);
		a12.setHorizontalAlignment(SwingConstants.CENTER);
		a12.setText("");
		a12.setColumns(10);
		a12.setBounds(160, 210, 46, 35);
		contentPane.add(a12);
		
		a17 = new JTextField();
		a17.setFont(new Font("Dialog", Font.ITALIC, 20));
		a17.setEditable(false);
		a17.setHorizontalAlignment(SwingConstants.CENTER);
		a17.setText("");
		a17.setColumns(10);
		a17.setBounds(160, 258, 46, 35);
		contentPane.add(a17);
		
		a22 = new JTextField();
		a22.setBackground(new Color(100, 149, 237));
		a22.setFont(new Font("Dialog", Font.ITALIC, 20));
		a22.setEditable(false);
		a22.setHorizontalAlignment(SwingConstants.CENTER);
		a22.setText("");
		a22.setColumns(10);
		a22.setBounds(160, 306, 46, 35);
		contentPane.add(a22);
		
		a13 = new JTextField();
		a13.setFont(new Font("Dialog", Font.ITALIC, 20));
		a13.setEditable(false);
		a13.setHorizontalAlignment(SwingConstants.CENTER);
		a13.setText("");
		a13.setColumns(10);
		a13.setBounds(216, 210, 46, 35);
		contentPane.add(a13);
		
		a14 = new JTextField();
		a14.setBackground(new Color(100, 149, 237));
		a14.setFont(new Font("Dialog", Font.ITALIC, 20));
		a14.setEditable(false);
		a14.setHorizontalAlignment(SwingConstants.CENTER);
		a14.setText("");
		a14.setColumns(10);
		a14.setBounds(272, 210, 46, 35);
		contentPane.add(a14);
		
		a18 = new JTextField();
		a18.setBackground(new Color(100, 149, 237));
		a18.setFont(new Font("Dialog", Font.ITALIC, 20));
		a18.setEditable(false);
		a18.setHorizontalAlignment(SwingConstants.CENTER);
		a18.setText("");
		a18.setColumns(10);
		a18.setBounds(216, 258, 46, 35);
		contentPane.add(a18);
		
		a19 = new JTextField();
		a19.setFont(new Font("Dialog", Font.ITALIC, 20));
		a19.setEditable(false);
		a19.setHorizontalAlignment(SwingConstants.CENTER);
		a19.setText("");
		a19.setColumns(10);
		a19.setBounds(272, 258, 46, 35);
		contentPane.add(a19);
		
		a23 = new JTextField();
		a23.setFont(new Font("Dialog", Font.ITALIC, 20));
		a23.setEditable(false);
		a23.setHorizontalAlignment(SwingConstants.CENTER);
		a23.setText("");
		a23.setColumns(10);
		a23.setBounds(216, 306, 46, 35);
		contentPane.add(a23);
		
		a24 = new JTextField();
		a24.setBackground(new Color(100, 149, 237));
		a24.setFont(new Font("Dialog", Font.ITALIC, 20));
		a24.setEditable(false);
		a24.setHorizontalAlignment(SwingConstants.CENTER);
		a24.setText("");
		a24.setColumns(10);
		a24.setBounds(272, 306, 46, 35);
		contentPane.add(a24);
		
		b0 = new JTextField();
		b0.setBackground(new Color(60, 179, 113));
		b0.setText("");
		b0.setHorizontalAlignment(SwingConstants.CENTER);
		b0.setFont(new Font("Dialog", Font.ITALIC, 20));
		b0.setEditable(false);
		b0.setColumns(10);
		b0.setBounds(414, 118, 46, 35);
		contentPane.add(b0);
		
		b5 = new JTextField();
		b5.setText("");
		b5.setHorizontalAlignment(SwingConstants.CENTER);
		b5.setFont(new Font("Dialog", Font.ITALIC, 20));
		b5.setEditable(false);
		b5.setColumns(10);
		b5.setBounds(414, 164, 46, 35);
		contentPane.add(b5);
		
		b10 = new JTextField();
		b10.setText("");
		b10.setHorizontalAlignment(SwingConstants.CENTER);
		b10.setFont(new Font("Dialog", Font.ITALIC, 20));
		b10.setEditable(false);
		b10.setColumns(10);
		b10.setBounds(414, 210, 46, 35);
		contentPane.add(b10);
		
		b15 = new JTextField();
		b15.setText("");
		b15.setHorizontalAlignment(SwingConstants.CENTER);
		b15.setFont(new Font("Dialog", Font.ITALIC, 20));
		b15.setEditable(false);
		b15.setColumns(10);
		b15.setBounds(414, 258, 46, 35);
		contentPane.add(b15);
		
		b20 = new JTextField();
		b20.setBackground(new Color(60, 179, 113));
		b20.setText("");
		b20.setHorizontalAlignment(SwingConstants.CENTER);
		b20.setFont(new Font("Dialog", Font.ITALIC, 20));
		b20.setEditable(false);
		b20.setColumns(10);
		b20.setBounds(414, 306, 46, 35);
		contentPane.add(b20);
		
		b21 = new JTextField();
		b21.setText("");
		b21.setHorizontalAlignment(SwingConstants.CENTER);
		b21.setFont(new Font("Dialog", Font.ITALIC, 20));
		b21.setEditable(false);
		b21.setColumns(10);
		b21.setBounds(470, 306, 46, 35);
		contentPane.add(b21);
		
		b16 = new JTextField();
		b16.setBackground(new Color(60, 179, 113));
		b16.setText("");
		b16.setHorizontalAlignment(SwingConstants.CENTER);
		b16.setFont(new Font("Dialog", Font.ITALIC, 20));
		b16.setEditable(false);
		b16.setColumns(10);
		b16.setBounds(470, 258, 46, 35);
		contentPane.add(b16);
		
		b11 = new JTextField();
		b11.setText("");
		b11.setHorizontalAlignment(SwingConstants.CENTER);
		b11.setFont(new Font("Dialog", Font.ITALIC, 20));
		b11.setEditable(false);
		b11.setColumns(10);
		b11.setBounds(470, 210, 46, 35);
		contentPane.add(b11);
		
		b6 = new JTextField();
		b6.setBackground(new Color(60, 179, 113));
		b6.setText("");
		b6.setHorizontalAlignment(SwingConstants.CENTER);
		b6.setFont(new Font("Dialog", Font.ITALIC, 20));
		b6.setEditable(false);
		b6.setColumns(10);
		b6.setBounds(470, 164, 46, 35);
		contentPane.add(b6);
		
		b1 = new JTextField();
		b1.setText("");
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setFont(new Font("Dialog", Font.ITALIC, 20));
		b1.setEditable(false);
		b1.setColumns(10);
		b1.setBounds(470, 118, 46, 35);
		contentPane.add(b1);
		
		b2 = new JTextField();
		b2.setText("");
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		b2.setFont(new Font("Dialog", Font.ITALIC, 20));
		b2.setEditable(false);
		b2.setColumns(10);
		b2.setBounds(526, 118, 46, 35);
		contentPane.add(b2);
		
		b7 = new JTextField();
		b7.setText("");
		b7.setHorizontalAlignment(SwingConstants.CENTER);
		b7.setFont(new Font("Dialog", Font.ITALIC, 20));
		b7.setEditable(false);
		b7.setColumns(10);
		b7.setBounds(526, 164, 46, 35);
		contentPane.add(b7);
		
		b12 = new JTextField();
		b12.setBackground(new Color(60, 179, 113));
		b12.setText("");
		b12.setHorizontalAlignment(SwingConstants.CENTER);
		b12.setFont(new Font("Dialog", Font.ITALIC, 20));
		b12.setEditable(false);
		b12.setColumns(10);
		b12.setBounds(526, 210, 46, 35);
		contentPane.add(b12);
		
		b17 = new JTextField();
		b17.setText("");
		b17.setHorizontalAlignment(SwingConstants.CENTER);
		b17.setFont(new Font("Dialog", Font.ITALIC, 20));
		b17.setEditable(false);
		b17.setColumns(10);
		b17.setBounds(526, 258, 46, 35);
		contentPane.add(b17);
		
		b22 = new JTextField();
		b22.setText("");
		b22.setHorizontalAlignment(SwingConstants.CENTER);
		b22.setFont(new Font("Dialog", Font.ITALIC, 20));
		b22.setEditable(false);
		b22.setColumns(10);
		b22.setBounds(526, 306, 46, 35);
		contentPane.add(b22);
		
		b23 = new JTextField();
		b23.setText("");
		b23.setHorizontalAlignment(SwingConstants.CENTER);
		b23.setFont(new Font("Dialog", Font.ITALIC, 20));
		b23.setEditable(false);
		b23.setColumns(10);
		b23.setBounds(582, 306, 46, 35);
		contentPane.add(b23);
		
		b18 = new JTextField();
		b18.setBackground(new Color(60, 179, 113));
		b18.setText("");
		b18.setHorizontalAlignment(SwingConstants.CENTER);
		b18.setFont(new Font("Dialog", Font.ITALIC, 20));
		b18.setEditable(false);
		b18.setColumns(10);
		b18.setBounds(582, 258, 46, 35);
		contentPane.add(b18);
		
		b13 = new JTextField();
		b13.setText("");
		b13.setHorizontalAlignment(SwingConstants.CENTER);
		b13.setFont(new Font("Dialog", Font.ITALIC, 20));
		b13.setEditable(false);
		b13.setColumns(10);
		b13.setBounds(582, 210, 46, 35);
		contentPane.add(b13);
		
		b8 = new JTextField();
		b8.setBackground(new Color(60, 179, 113));
		b8.setText("");
		b8.setHorizontalAlignment(SwingConstants.CENTER);
		b8.setFont(new Font("Dialog", Font.ITALIC, 20));
		b8.setEditable(false);
		b8.setColumns(10);
		b8.setBounds(582, 164, 46, 35);
		contentPane.add(b8);
		
		b3 = new JTextField();
		b3.setText("");
		b3.setHorizontalAlignment(SwingConstants.CENTER);
		b3.setFont(new Font("Dialog", Font.ITALIC, 20));
		b3.setEditable(false);
		b3.setColumns(10);
		b3.setBounds(582, 118, 46, 35);
		contentPane.add(b3);
		
		b4 = new JTextField();
		b4.setBackground(new Color(60, 179, 113));
		b4.setText("");
		b4.setHorizontalAlignment(SwingConstants.CENTER);
		b4.setFont(new Font("Dialog", Font.ITALIC, 20));
		b4.setEditable(false);
		b4.setColumns(10);
		b4.setBounds(638, 118, 46, 35);
		contentPane.add(b4);
		
		b9 = new JTextField();
		b9.setText("");
		b9.setHorizontalAlignment(SwingConstants.CENTER);
		b9.setFont(new Font("Dialog", Font.ITALIC, 20));
		b9.setEditable(false);
		b9.setColumns(10);
		b9.setBounds(638, 164, 46, 35);
		contentPane.add(b9);
		
		b14 = new JTextField();
		b14.setText("");
		b14.setHorizontalAlignment(SwingConstants.CENTER);
		b14.setFont(new Font("Dialog", Font.ITALIC, 20));
		b14.setEditable(false);
		b14.setColumns(10);
		b14.setBounds(638, 210, 46, 35);
		contentPane.add(b14);
		
		b19 = new JTextField();
		b19.setText("");
		b19.setHorizontalAlignment(SwingConstants.CENTER);
		b19.setFont(new Font("Dialog", Font.ITALIC, 20));
		b19.setEditable(false);
		b19.setColumns(10);
		b19.setBounds(638, 258, 46, 35);
		contentPane.add(b19);
		
		b24 = new JTextField();
		b24.setBackground(new Color(60, 179, 113));
		b24.setText("");
		b24.setHorizontalAlignment(SwingConstants.CENTER);
		b24.setFont(new Font("Dialog", Font.ITALIC, 20));
		b24.setEditable(false);
		b24.setColumns(10);
		b24.setBounds(638, 306, 46, 35);
		contentPane.add(b24);
		
		c0 = new JTextField();
		c0.setText("");
		c0.setHorizontalAlignment(SwingConstants.CENTER);
		c0.setFont(new Font("Dialog", Font.ITALIC, 20));
		c0.setEditable(false);
		c0.setColumns(10);
		c0.setBounds(48, 486, 46, 35);
		contentPane.add(c0);
		
		c5 = new JTextField();
		c5.setBackground(new Color(255, 192, 203));
		c5.setText("");
		c5.setHorizontalAlignment(SwingConstants.CENTER);
		c5.setFont(new Font("Dialog", Font.ITALIC, 20));
		c5.setEditable(false);
		c5.setColumns(10);
		c5.setBounds(48, 532, 46, 35);
		contentPane.add(c5);
		
		c10 = new JTextField();
		c10.setBackground(new Color(255, 192, 203));
		c10.setText("");
		c10.setHorizontalAlignment(SwingConstants.CENTER);
		c10.setFont(new Font("Dialog", Font.ITALIC, 20));
		c10.setEditable(false);
		c10.setColumns(10);
		c10.setBounds(48, 578, 46, 35);
		contentPane.add(c10);
		
		c15 = new JTextField();
		c15.setBackground(new Color(255, 192, 203));
		c15.setText("");
		c15.setHorizontalAlignment(SwingConstants.CENTER);
		c15.setFont(new Font("Dialog", Font.ITALIC, 20));
		c15.setEditable(false);
		c15.setColumns(10);
		c15.setBounds(48, 626, 46, 35);
		contentPane.add(c15);
		
		c20 = new JTextField();
		c20.setText("");
		c20.setHorizontalAlignment(SwingConstants.CENTER);
		c20.setFont(new Font("Dialog", Font.ITALIC, 20));
		c20.setEditable(false);
		c20.setColumns(10);
		c20.setBounds(48, 674, 46, 35);
		contentPane.add(c20);
		
		c21 = new JTextField();
		c21.setBackground(new Color(255, 192, 203));
		c21.setText("");
		c21.setHorizontalAlignment(SwingConstants.CENTER);
		c21.setFont(new Font("Dialog", Font.ITALIC, 20));
		c21.setEditable(false);
		c21.setColumns(10);
		c21.setBounds(104, 674, 46, 35);
		contentPane.add(c21);
		
		c16 = new JTextField();
		c16.setText("");
		c16.setHorizontalAlignment(SwingConstants.CENTER);
		c16.setFont(new Font("Dialog", Font.ITALIC, 20));
		c16.setEditable(false);
		c16.setColumns(10);
		c16.setBounds(104, 626, 46, 35);
		contentPane.add(c16);
		
		c11 = new JTextField();
		c11.setBackground(new Color(255, 192, 203));
		c11.setText("");
		c11.setHorizontalAlignment(SwingConstants.CENTER);
		c11.setFont(new Font("Dialog", Font.ITALIC, 20));
		c11.setEditable(false);
		c11.setColumns(10);
		c11.setBounds(104, 578, 46, 35);
		contentPane.add(c11);
		
		c6 = new JTextField();
		c6.setText("");
		c6.setHorizontalAlignment(SwingConstants.CENTER);
		c6.setFont(new Font("Dialog", Font.ITALIC, 20));
		c6.setEditable(false);
		c6.setColumns(10);
		c6.setBounds(104, 532, 46, 35);
		contentPane.add(c6);
		
		c1 = new JTextField();
		c1.setBackground(new Color(255, 192, 203));
		c1.setText("");
		c1.setHorizontalAlignment(SwingConstants.CENTER);
		c1.setFont(new Font("Dialog", Font.ITALIC, 20));
		c1.setEditable(false);
		c1.setColumns(10);
		c1.setBounds(104, 486, 46, 35);
		contentPane.add(c1);
		
		c2 = new JTextField();
		c2.setBackground(new Color(255, 192, 203));
		c2.setText("");
		c2.setHorizontalAlignment(SwingConstants.CENTER);
		c2.setFont(new Font("Dialog", Font.ITALIC, 20));
		c2.setEditable(false);
		c2.setColumns(10);
		c2.setBounds(160, 486, 46, 35);
		contentPane.add(c2);
		
		c7 = new JTextField();
		c7.setBackground(new Color(255, 192, 203));
		c7.setText("");
		c7.setHorizontalAlignment(SwingConstants.CENTER);
		c7.setFont(new Font("Dialog", Font.ITALIC, 20));
		c7.setEditable(false);
		c7.setColumns(10);
		c7.setBounds(160, 532, 46, 35);
		contentPane.add(c7);
		
		c12 = new JTextField();
		c12.setText("");
		c12.setHorizontalAlignment(SwingConstants.CENTER);
		c12.setFont(new Font("Dialog", Font.ITALIC, 20));
		c12.setEditable(false);
		c12.setColumns(10);
		c12.setBounds(160, 578, 46, 35);
		contentPane.add(c12);
		
		c17 = new JTextField();
		c17.setBackground(new Color(255, 192, 203));
		c17.setText("");
		c17.setHorizontalAlignment(SwingConstants.CENTER);
		c17.setFont(new Font("Dialog", Font.ITALIC, 20));
		c17.setEditable(false);
		c17.setColumns(10);
		c17.setBounds(160, 626, 46, 35);
		contentPane.add(c17);
		
		c22 = new JTextField();
		c22.setBackground(new Color(255, 192, 203));
		c22.setText("");
		c22.setHorizontalAlignment(SwingConstants.CENTER);
		c22.setFont(new Font("Dialog", Font.ITALIC, 20));
		c22.setEditable(false);
		c22.setColumns(10);
		c22.setBounds(160, 674, 46, 35);
		contentPane.add(c22);
		
		c23 = new JTextField();
		c23.setBackground(new Color(255, 192, 203));
		c23.setText("");
		c23.setHorizontalAlignment(SwingConstants.CENTER);
		c23.setFont(new Font("Dialog", Font.ITALIC, 20));
		c23.setEditable(false);
		c23.setColumns(10);
		c23.setBounds(216, 674, 46, 35);
		contentPane.add(c23);
		
		c18 = new JTextField();
		c18.setText("");
		c18.setHorizontalAlignment(SwingConstants.CENTER);
		c18.setFont(new Font("Dialog", Font.ITALIC, 20));
		c18.setEditable(false);
		c18.setColumns(10);
		c18.setBounds(216, 626, 46, 35);
		contentPane.add(c18);
		
		c13 = new JTextField();
		c13.setBackground(new Color(255, 192, 203));
		c13.setText("");
		c13.setHorizontalAlignment(SwingConstants.CENTER);
		c13.setFont(new Font("Dialog", Font.ITALIC, 20));
		c13.setEditable(false);
		c13.setColumns(10);
		c13.setBounds(216, 578, 46, 35);
		contentPane.add(c13);
		
		c8 = new JTextField();
		c8.setText("");
		c8.setHorizontalAlignment(SwingConstants.CENTER);
		c8.setFont(new Font("Dialog", Font.ITALIC, 20));
		c8.setEditable(false);
		c8.setColumns(10);
		c8.setBounds(216, 532, 46, 35);
		contentPane.add(c8);
		
		c3 = new JTextField();
		c3.setBackground(new Color(255, 192, 203));
		c3.setText("");
		c3.setHorizontalAlignment(SwingConstants.CENTER);
		c3.setFont(new Font("Dialog", Font.ITALIC, 20));
		c3.setEditable(false);
		c3.setColumns(10);
		c3.setBounds(216, 486, 46, 35);
		contentPane.add(c3);
		
		c4 = new JTextField();
		c4.setText("");
		c4.setHorizontalAlignment(SwingConstants.CENTER);
		c4.setFont(new Font("Dialog", Font.ITALIC, 20));
		c4.setEditable(false);
		c4.setColumns(10);
		c4.setBounds(272, 486, 46, 35);
		contentPane.add(c4);
		
		c9 = new JTextField();
		c9.setBackground(new Color(255, 192, 203));
		c9.setText("");
		c9.setHorizontalAlignment(SwingConstants.CENTER);
		c9.setFont(new Font("Dialog", Font.ITALIC, 20));
		c9.setEditable(false);
		c9.setColumns(10);
		c9.setBounds(272, 532, 46, 35);
		contentPane.add(c9);
		
		c14 = new JTextField();
		c14.setBackground(new Color(255, 192, 203));
		c14.setText("");
		c14.setHorizontalAlignment(SwingConstants.CENTER);
		c14.setFont(new Font("Dialog", Font.ITALIC, 20));
		c14.setEditable(false);
		c14.setColumns(10);
		c14.setBounds(272, 578, 46, 35);
		contentPane.add(c14);
		
		c19 = new JTextField();
		c19.setBackground(new Color(255, 192, 203));
		c19.setText("");
		c19.setHorizontalAlignment(SwingConstants.CENTER);
		c19.setFont(new Font("Dialog", Font.ITALIC, 20));
		c19.setEditable(false);
		c19.setColumns(10);
		c19.setBounds(272, 626, 46, 35);
		contentPane.add(c19);
		
		c24 = new JTextField();
		c24.setText("");
		c24.setHorizontalAlignment(SwingConstants.CENTER);
		c24.setFont(new Font("Dialog", Font.ITALIC, 20));
		c24.setEditable(false);
		c24.setColumns(10);
		c24.setBounds(272, 674, 46, 35);
		contentPane.add(c24);
		
		d0 = new JTextField();
		d0.setText("");
		d0.setHorizontalAlignment(SwingConstants.CENTER);
		d0.setFont(new Font("Dialog", Font.ITALIC, 20));
		d0.setEditable(false);
		d0.setColumns(10);
		d0.setBounds(414, 486, 46, 35);
		contentPane.add(d0);
		
		d5 = new JTextField();
		d5.setBackground(new Color(240, 230, 140));
		d5.setText("");
		d5.setHorizontalAlignment(SwingConstants.CENTER);
		d5.setFont(new Font("Dialog", Font.ITALIC, 20));
		d5.setEditable(false);
		d5.setColumns(10);
		d5.setBounds(414, 532, 46, 35);
		contentPane.add(d5);
		
		d10 = new JTextField();
		d10.setText("");
		d10.setHorizontalAlignment(SwingConstants.CENTER);
		d10.setFont(new Font("Dialog", Font.ITALIC, 20));
		d10.setEditable(false);
		d10.setColumns(10);
		d10.setBounds(414, 578, 46, 35);
		contentPane.add(d10);
		
		d15 = new JTextField();
		d15.setBackground(new Color(240, 230, 140));
		d15.setText("");
		d15.setHorizontalAlignment(SwingConstants.CENTER);
		d15.setFont(new Font("Dialog", Font.ITALIC, 20));
		d15.setEditable(false);
		d15.setColumns(10);
		d15.setBounds(414, 626, 46, 35);
		contentPane.add(d15);
		
		d20 = new JTextField();
		d20.setText("");
		d20.setHorizontalAlignment(SwingConstants.CENTER);
		d20.setFont(new Font("Dialog", Font.ITALIC, 20));
		d20.setEditable(false);
		d20.setColumns(10);
		d20.setBounds(414, 674, 46, 35);
		contentPane.add(d20);
		
		d21 = new JTextField();
		d21.setBackground(new Color(240, 230, 140));
		d21.setText("");
		d21.setHorizontalAlignment(SwingConstants.CENTER);
		d21.setFont(new Font("Dialog", Font.ITALIC, 20));
		d21.setEditable(false);
		d21.setColumns(10);
		d21.setBounds(470, 674, 46, 35);
		contentPane.add(d21);
		
		d16 = new JTextField();
		d16.setText("");
		d16.setHorizontalAlignment(SwingConstants.CENTER);
		d16.setFont(new Font("Dialog", Font.ITALIC, 20));
		d16.setEditable(false);
		d16.setColumns(10);
		d16.setBounds(470, 626, 46, 35);
		contentPane.add(d16);
		
		d11 = new JTextField();
		d11.setBackground(new Color(240, 230, 140));
		d11.setText("");
		d11.setHorizontalAlignment(SwingConstants.CENTER);
		d11.setFont(new Font("Dialog", Font.ITALIC, 20));
		d11.setEditable(false);
		d11.setColumns(10);
		d11.setBounds(470, 578, 46, 35);
		contentPane.add(d11);
		
		d6 = new JTextField();
		d6.setText("");
		d6.setHorizontalAlignment(SwingConstants.CENTER);
		d6.setFont(new Font("Dialog", Font.ITALIC, 20));
		d6.setEditable(false);
		d6.setColumns(10);
		d6.setBounds(470, 532, 46, 35);
		contentPane.add(d6);
		
		d1 = new JTextField();
		d1.setBackground(new Color(240, 230, 140));
		d1.setText("");
		d1.setHorizontalAlignment(SwingConstants.CENTER);
		d1.setFont(new Font("Dialog", Font.ITALIC, 20));
		d1.setEditable(false);
		d1.setColumns(10);
		d1.setBounds(470, 486, 46, 35);
		contentPane.add(d1);
		
		d2 = new JTextField();
		d2.setText("");
		d2.setHorizontalAlignment(SwingConstants.CENTER);
		d2.setFont(new Font("Dialog", Font.ITALIC, 20));
		d2.setEditable(false);
		d2.setColumns(10);
		d2.setBounds(526, 486, 46, 35);
		contentPane.add(d2);
		
		d7 = new JTextField();
		d7.setBackground(new Color(240, 230, 140));
		d7.setText("");
		d7.setHorizontalAlignment(SwingConstants.CENTER);
		d7.setFont(new Font("Dialog", Font.ITALIC, 20));
		d7.setEditable(false);
		d7.setColumns(10);
		d7.setBounds(526, 532, 46, 35);
		contentPane.add(d7);
		
		d12 = new JTextField();
		d12.setText("");
		d12.setHorizontalAlignment(SwingConstants.CENTER);
		d12.setFont(new Font("Dialog", Font.ITALIC, 20));
		d12.setEditable(false);
		d12.setColumns(10);
		d12.setBounds(526, 578, 46, 35);
		contentPane.add(d12);
		
		d17 = new JTextField();
		d17.setBackground(new Color(240, 230, 140));
		d17.setText("");
		d17.setHorizontalAlignment(SwingConstants.CENTER);
		d17.setFont(new Font("Dialog", Font.ITALIC, 20));
		d17.setEditable(false);
		d17.setColumns(10);
		d17.setBounds(526, 626, 46, 35);
		contentPane.add(d17);
		
		d22 = new JTextField();
		d22.setText("");
		d22.setHorizontalAlignment(SwingConstants.CENTER);
		d22.setFont(new Font("Dialog", Font.ITALIC, 20));
		d22.setEditable(false);
		d22.setColumns(10);
		d22.setBounds(526, 674, 46, 35);
		contentPane.add(d22);
		
		d23 = new JTextField();
		d23.setBackground(new Color(240, 230, 140));
		d23.setText("");
		d23.setHorizontalAlignment(SwingConstants.CENTER);
		d23.setFont(new Font("Dialog", Font.ITALIC, 20));
		d23.setEditable(false);
		d23.setColumns(10);
		d23.setBounds(582, 674, 46, 35);
		contentPane.add(d23);
		
		d18 = new JTextField();
		d18.setText("");
		d18.setHorizontalAlignment(SwingConstants.CENTER);
		d18.setFont(new Font("Dialog", Font.ITALIC, 20));
		d18.setEditable(false);
		d18.setColumns(10);
		d18.setBounds(582, 626, 46, 35);
		contentPane.add(d18);
		
		d13 = new JTextField();
		d13.setBackground(new Color(240, 230, 140));
		d13.setText("");
		d13.setHorizontalAlignment(SwingConstants.CENTER);
		d13.setFont(new Font("Dialog", Font.ITALIC, 20));
		d13.setEditable(false);
		d13.setColumns(10);
		d13.setBounds(582, 578, 46, 35);
		contentPane.add(d13);
		
		d8 = new JTextField();
		d8.setText("");
		d8.setHorizontalAlignment(SwingConstants.CENTER);
		d8.setFont(new Font("Dialog", Font.ITALIC, 20));
		d8.setEditable(false);
		d8.setColumns(10);
		d8.setBounds(582, 532, 46, 35);
		contentPane.add(d8);
		
		d3 = new JTextField();
		d3.setBackground(new Color(240, 230, 140));
		d3.setText("");
		d3.setHorizontalAlignment(SwingConstants.CENTER);
		d3.setFont(new Font("Dialog", Font.ITALIC, 20));
		d3.setEditable(false);
		d3.setColumns(10);
		d3.setBounds(582, 486, 46, 35);
		contentPane.add(d3);
		
		d4 = new JTextField();
		d4.setText("");
		d4.setHorizontalAlignment(SwingConstants.CENTER);
		d4.setFont(new Font("Dialog", Font.ITALIC, 20));
		d4.setEditable(false);
		d4.setColumns(10);
		d4.setBounds(638, 486, 46, 35);
		contentPane.add(d4);
		
		d9 = new JTextField();
		d9.setBackground(new Color(240, 230, 140));
		d9.setText("");
		d9.setHorizontalAlignment(SwingConstants.CENTER);
		d9.setFont(new Font("Dialog", Font.ITALIC, 20));
		d9.setEditable(false);
		d9.setColumns(10);
		d9.setBounds(638, 532, 46, 35);
		contentPane.add(d9);
		
		d14 = new JTextField();
		d14.setText("");
		d14.setHorizontalAlignment(SwingConstants.CENTER);
		d14.setFont(new Font("Dialog", Font.ITALIC, 20));
		d14.setEditable(false);
		d14.setColumns(10);
		d14.setBounds(638, 578, 46, 35);
		contentPane.add(d14);
		
		d19 = new JTextField();
		d19.setBackground(new Color(240, 230, 140));
		d19.setText("");
		d19.setHorizontalAlignment(SwingConstants.CENTER);
		d19.setFont(new Font("Dialog", Font.ITALIC, 20));
		d19.setEditable(false);
		d19.setColumns(10);
		d19.setBounds(638, 626, 46, 35);
		contentPane.add(d19);
		
		d24 = new JTextField();
		d24.setText("");
		d24.setHorizontalAlignment(SwingConstants.CENTER);
		d24.setFont(new Font("Dialog", Font.ITALIC, 20));
		d24.setEditable(false);
		d24.setColumns(10);
		d24.setBounds(638, 674, 46, 35);
		contentPane.add(d24);
		
		JButton btnNewButton = new JButton("Generar Cartones");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int [] Numeros = new int [100];
				Random rnd = new Random ();
				for (int i=0; i<100; i++)
				{
					Numeros [i] = (rnd.nextInt(100));
					
						a0.setText(String.valueOf(Numeros[i]));		
						Numeros [i] = (rnd.nextInt(100));
						a1.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a2.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a3.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a4.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a5.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a6.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a7.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a8.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a9.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a10.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a11.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a12.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a13.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a14.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a15.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a16.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a17.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a18.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a19.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a20.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a21.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a22.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a23.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						a24.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						
						b0.setText(String.valueOf(Numeros[i]));		
						Numeros [i] = (rnd.nextInt(100));
						b1.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b2.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b3.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b4.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b5.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b6.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b7.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b8.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b9.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b10.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b11.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b12.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b13.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b14.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b15.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b16.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b17.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b18.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b19.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b20.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b21.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b22.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b23.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						b24.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						
						c0.setText(String.valueOf(Numeros[i]));		
						Numeros [i] = (rnd.nextInt(100));
						c1.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c2.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c3.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c4.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c5.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c6.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c7.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c8.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c9.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c10.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c11.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c12.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c13.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c14.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c15.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c16.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c17.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c18.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c19.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c20.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c21.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c22.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c23.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						c24.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						
						d0.setText(String.valueOf(Numeros[i]));		
						Numeros [i] = (rnd.nextInt(100));
						d1.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d2.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d3.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d4.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d5.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d6.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d7.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d8.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d9.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d10.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d11.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d12.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d13.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d14.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d15.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d16.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d17.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d18.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d19.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d20.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d21.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d22.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d23.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
						d24.setText(String.valueOf(Numeros[i]));
						Numeros [i] = (rnd.nextInt(100));
				}
			}
				
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(48, 798, 244, 51);
		contentPane.add(btnNewButton);
		
		btnMostarNmerosElegidos = new JButton("N\u00FAmeros generados sin carton");
		btnMostarNmerosElegidos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				GeneradordeNumerosRapido();
			}
		});
		
		btnMostarNmerosElegidos.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		btnMostarNmerosElegidos.setBounds(329, 803, 375, 41);
		contentPane.add(btnMostarNmerosElegidos);
		
		txtB = new JTextField();
		txtB.setText("B");
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		txtB.setEditable(false);
		txtB.setColumns(10);
		txtB.setBounds(48, 72, 46, 35);
		contentPane.add(txtB);
		
		txtI = new JTextField();
		txtI.setText("I");
		txtI.setHorizontalAlignment(SwingConstants.CENTER);
		txtI.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		txtI.setEditable(false);
		txtI.setColumns(10);
		txtI.setBounds(104, 72, 46, 35);
		contentPane.add(txtI);
		
		txtN = new JTextField();
		txtN.setText("N");
		txtN.setHorizontalAlignment(SwingConstants.CENTER);
		txtN.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		txtN.setEditable(false);
		txtN.setColumns(10);
		txtN.setBounds(160, 72, 46, 35);
		contentPane.add(txtN);
		
		txtG = new JTextField();
		txtG.setText("G");
		txtG.setHorizontalAlignment(SwingConstants.CENTER);
		txtG.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		txtG.setEditable(false);
		txtG.setColumns(10);
		txtG.setBounds(216, 72, 46, 35);
		contentPane.add(txtG);
		
		txtO = new JTextField();
		txtO.setText("O");
		txtO.setHorizontalAlignment(SwingConstants.CENTER);
		txtO.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		txtO.setEditable(false);
		txtO.setColumns(10);
		txtO.setBounds(272, 72, 46, 35);
		contentPane.add(txtO);
		
		textField = new JTextField();
		textField.setText("B");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(414, 72, 46, 35);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("I");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(470, 72, 46, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("N");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(526, 72, 46, 35);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("G");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(582, 72, 46, 35);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("O");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(638, 72, 46, 35);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("B");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(48, 440, 46, 35);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("I");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(104, 440, 46, 35);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("N");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(160, 440, 46, 35);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("G");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(216, 440, 46, 35);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("O");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(272, 440, 46, 35);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("B");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(414, 440, 46, 35);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("I");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(470, 440, 46, 35);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("N");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(526, 440, 46, 35);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("G");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(582, 440, 46, 35);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("O");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(638, 440, 46, 35);
		contentPane.add(textField_14);
		
		Image FondoBoleto = new ImageIcon (this.getClass().getResource("/imagenes/FondoBoleto.jpg")).getImage();
		Image FondoBingo = new ImageIcon (this.getClass().getResource("/imagenes/FondoBingo.jpg")).getImage();
		Boleto1 = new JLabel("");
		Boleto1.setBounds(28, 53, 311, 305);
		Boleto1.setIcon (new ImageIcon (FondoBoleto));
		contentPane.add(Boleto1);
		
		Boleto2 = new JLabel("");
		Boleto2.setBounds(397, 53, 305, 298);
		Boleto2.setIcon (new ImageIcon (FondoBoleto));
		contentPane.add(Boleto2);
				
		Boleto3 = new JLabel("");
		Boleto3.setBounds(28, 424, 311, 305);
		Boleto3.setIcon (new ImageIcon (FondoBoleto));
		contentPane.add(Boleto3);
		
		Boleto4 = new JLabel("");
		Boleto4.setBounds(397, 424, 311, 298);
		Boleto4.setIcon (new ImageIcon (FondoBoleto));
		contentPane.add(Boleto4);
		
		JLabel Bingo = new JLabel("");
		Bingo.setBounds(-184, 0, 1022, 929);
		Bingo.setIcon (new ImageIcon (FondoBingo));
		contentPane.add(Bingo);
	}
		
	public void GeneradordeNumerosRapido()
	{			
		setTitle("Generacion r\u00E1pida y ordenada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 930);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				new Numeros().setVisible(true);
				setVisible(false);
			}
		});
		Volver.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 20));
		Volver.setBounds(414, 809, 310, 51);
		contentPane.add(Volver);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(230, 230, 250));
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "N\u00FAmeros que SI saldr\u00EDan", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(16, 40, 356, 749);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(230, 230, 250));
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "N\u00FAmeros que NO saldr\u00EDan", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(382, 40, 356, 749);
		contentPane.add(panel_1);
		
		JTextArea NumerosqueSI = new JTextArea();
		NumerosqueSI.setBounds(10, 23, 336, 715);
		panel.add(NumerosqueSI);
		NumerosqueSI.setEditable(false);
		NumerosqueSI.setFont(new Font("Sitka Text", Font.ITALIC, 16));
		NumerosqueSI.setColumns(10);
		NumerosqueSI.setLineWrap(true);

		JTextArea NumerosqueNO = new JTextArea();
		NumerosqueNO.setLineWrap(true);
		NumerosqueNO.setFont(new Font("Sitka Text", Font.ITALIC, 16));
		NumerosqueNO.setEditable(false);
		NumerosqueNO.setColumns(10);
		NumerosqueNO.setBounds(10, 23, 336, 715);
		panel_1.add(NumerosqueNO);
		
		JLabel lblNewLabel = new JLabel("Generaci\u00F3n r\u00E1pida de los n\u00FAmeros que pueden salir ");
		lblNewLabel.setToolTipText("Hola");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Text", Font.ITALIC, 20));
		lblNewLabel.setBounds(63, 0, 610, 51);
		contentPane.add(lblNewLabel);

		cargar ();
		orden();

		for (int f = 0; f < array.length; f++) 
		{	
			NumerosqueSI.append(String.valueOf(array[f])+ '\t');		
		}
		
		for (int i = 0; i < Todos.length; i++)
		{
	        boolean EsNumeroFaltante = true;
	        for (int j = 0; j < array.length ; j++)
	        {
	            if (array[j] == Todos[i])
	            {
	                EsNumeroFaltante = false;
	            }
	        }
	        if (EsNumeroFaltante)
	        {
	        	NumerosqueNO.append(String.valueOf(Todos[i])+ '\t');  
	        }

	    }
	}
	
	private void cargar()
	{
		array = new int [100];
		for (int f=0 ; f<100; f++)
		{
			array [f] = (int)(Math.random()*100);
		}
	}
	
	private void orden()
	{
		int minimo, aux;
		for (int i = 0 ; i < array.length; i ++)
		{
			minimo = i;
			for (int j = i + 1; j < array.length; j++)
				if (array[j] < array[minimo])
					minimo = j;
				aux = array [minimo];
				array [minimo] = array [i];
				array [i] = aux;
		}
	}
}


	
	




