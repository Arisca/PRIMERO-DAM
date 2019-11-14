package Tema6;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class traductor
	{
		 private static JLabel ldecimal = new JLabel("Inglés: ");
		 private static JLabel lromano = new JLabel("Español: ");
		 private static JFrame frame = new JFrame("traductor");
		 private static JPanel panel1 = new JPanel();
		 private static JPanel panel2 = new JPanel();
		 private static JPanel panel3 = new JPanel();
		 private static JPanel panel4 = new JPanel();
		 private static JTextField txtingles = new JTextField();
		 private static JTextField txtespanol = new JTextField();
		 private static JButton btntoromano = new JButton("->");
		 private static JButton btntodecimal = new JButton("<-");
		 public static void colocaelementos()
		 {
			 panel1.add(ldecimal);
			 panel1.add(txtingles);
			 panel2.add(btntoromano);
			 panel2.add(btntodecimal);
			
			 panel3.add(lromano);
			 panel3.add(txtespanol);
			
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
					 txtespanol.setText(engtosp(e));
				 }
			 });
			 
			 btntodecimal.addActionListener(new ActionListener()
			 {
				 public void actionPerformed(ActionEvent e)
				 {
					 txtingles.setText(sptoeng(e));
				 }
			 });
			 
			 frame.setLayout(new GridLayout(0,1));
			 panel1.setLayout(new GridLayout(0,1));
			 panel2.setLayout(new GridLayout(0,1));
			 panel3.setLayout(new GridLayout(0,1));
			 frame.pack();
			 frame.setVisible(true);
		 }
		 
		 public static String engtosp(ActionEvent ev)
		 {
			 File fe = new File("ingles.dic");
			 File fd = new File("espanol.dic");
			 if (fe.exists())
			 {
				 try
				 {
					 FileReader fr = new FileReader(fe);
					 BufferedReader br = new BufferedReader(fr);
					 String s;

					 FileReader fs = new FileReader(fd);
					 BufferedReader bs = new BufferedReader(fs);
					 String t;
					 
					 while((s = br.readLine()) != null && (t=bs.readLine())!=null)
					 {
						 if (s.trim().equals(txtingles.getText().trim().toUpperCase())){
							 System.out.println(s.toUpperCase() + "---" + txtingles.getText().trim().toUpperCase());
							 return t;
						 }
					 }
					 
					 if (fr != null) fr.close();
				 }
				 catch(IOException e)
				 {
					 e.printStackTrace();
				 }
			 }
			 return "No existe";
		 };
		 
		 public static String sptoeng(ActionEvent ev)
		 {
			 File fe = new File("espanol.dic");
			 File fd = new File("ingles.dic");
			 if (fe.exists())
			 {
				 try
				 {
					 FileReader fr = new FileReader(fe);
					 BufferedReader br = new BufferedReader(fr);
					 String s;

					 FileReader fs = new FileReader(fd);
					 BufferedReader bs = new BufferedReader(fs);
					 String t;
					 while((s = br.readLine()) != null && (t = bs.readLine()) != null)
					 {
						 if (s.trim().equals(txtespanol.getText().trim().toUpperCase())){
							 System.out.println(s.toUpperCase() + "---" + txtespanol.getText().trim().toUpperCase());
							 return t;
						 }
					 }
					 
					 if (fr != null) fr.close();
				 }
				 catch(IOException e)
				 {
					 e.printStackTrace();
				 }
			 }
			 
			 return "No existe";
		 };

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
