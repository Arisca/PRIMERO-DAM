package Tema6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class swingromano
	{
		private static JLabel ldecimal = new JLabel("Decimal:");
		private static JLabel lromano = new JLabel("Romano:");
		private static JFrame frame = new JFrame("Conversor Romano <> Decimal");
		private static JPanel panel1 = new JPanel();
		private static JPanel panel2 = new JPanel();
		private static JPanel panel3 = new JPanel();
		private static JPanel panel4 = new JPanel();
		private static JTextField txtromano = new JTextField();
		private static JTextField txtdecimal = new JTextField();
		private static JButton btntoromano = new JButton(">");
		private static JButton btntodecimal = new JButton("<");
		
		public static void colocaelementos()
		{
			panel1.add(ldecimal);
			panel1.add(txtdecimal);

			panel2.add(btntoromano);
			panel2.add(btntodecimal);

			panel3.add(lromano);
			panel3.add(txtromano);

			JLabel lnada0=new JLabel("");
			panel4.add(lnada0);

			panel4.add(panel1);
			JLabel lnada1=new JLabel("");
			panel4.add(lnada1);
			panel4.add(panel2);
			JLabel lnada2=new JLabel("");
			panel4.add(lnada2);
			panel4.add(panel3);
			JLabel lnada3=new JLabel("");
			panel4.add(lnada3);
			JLabel lnada4=new JLabel("");
			frame.getContentPane().add(lnada4);
			frame.getContentPane().add(panel4);
			JLabel lnada5=new JLabel("");
			frame.getContentPane().add(lnada5);

			frame.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
			
			btntoromano.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					toromano(e);
				}
			});
			
			btntodecimal.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					todecimal(e);
				}
			});
			
			frame.setLayout(new GridLayout(0,1));
			panel1.setLayout(new GridLayout(0,1));
			panel2.setLayout(new GridLayout(0,1));
			panel3.setLayout(new GridLayout(0,1));
			frame.pack();
			frame.setVisible(true);	
		}
		
		public static void toromano(ActionEvent e)
		{
			int dato;
			dato=Integer.parseInt(txtdecimal.getText().trim());
			txtromano.setText(decimalToRomano(dato));
		};

		public static void todecimal(ActionEvent e)
		{
			Integer idato= new Integer(romanoToDecimal(txtromano.getText()));
			String sdato = idato.toString();
			txtdecimal.setText(sdato);
		};
		
		public static int romanoToDecimal (String num)
		{
			String numromano = num.toUpperCase();
			int decimalNum=0;
			char cpos;
			int pos = 0;

			do
			{
				cpos = numromano.charAt(pos);
				switch(cpos)
				{
					case 'M':
						decimalNum += 1000; break;
						
					case 'D':
						decimalNum += 500; break;
						
					case 'C':
						if((pos+1)<numromano.length() && numromano.charAt(pos+1)=='M')
						{
							decimalNum += 900; pos++; break;
						}
						if((pos+1)<numromano.length() && numromano.charAt(pos+1)=='D')
						{
							decimalNum += 400; pos++; break;
						}
						decimalNum += 100; break;
						
					case 'L':
						decimalNum += 50; break;
						
					case 'x':
						if((pos+1)<numromano.length() && numromano.charAt(pos+1)=='C')
						{
							decimalNum += 90; pos++; break;
						}
						
						if((pos+1)<numromano.length() && numromano.charAt(pos+1)=='L')
						{
							decimalNum += 40; pos++; break;
						}
						decimalNum += 10; break;
						
					case 'V':
						decimalNum += 5; break;
						
					case 'I':
						if((pos+1)<numromano.length() && numromano.charAt(pos+1)=='x')
						{
						decimalNum += 9; pos++; break;
						}
						if((pos+1)<numromano.length() && numromano.charAt(pos+1)=='V')
						{
						decimalNum += 4; pos++; break;
						}
						decimalNum += 1; break;
					}
				pos++;
				
			}
			while(pos<numromano.length());
			return decimalNum;
		}
		
		public static String decimalToRomano(int dato)
		{
			int d=dato;
			String s="";
			while(d>0)
			{
				while (d>=1000)
					{
					d-=1000; s+="M";
					}
				while (d>=900)
					{
					d-=900; s+="CM";
					}
				while (d>=500)
					{
					d-=500; s+="D";
					}
				while (d>=400)
					{
					d-=400; s+="CD";
					}
				while (d>=100)
					{
					d-=100; s+="C";
					}
				while (d>=90)
					{
					d-=90; s+="XC";
					}
				while (d>=50)
					{
					d-=50; s+="L";
					}
				while (d>=40)
					{
					d-=40; s+="XL";
					}
				while (d>=10)
					{
					d-=10; s+="X";
					}
				while (d>=9)
					{
					d-=9; s+="IX";
					}
				while (d>=5)
					{
					d-=5; s+="V";
					}
				while (d>=4)
					{
					d-=4; s+="IV";
					}
				while (d>=1)
					{
					d-=1; s+="I";
					}
			}
			return s;
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
