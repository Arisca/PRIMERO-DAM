package Tema6;
import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JTextField textfield1,textfield2;
	private JButton boton1;
	public Formulario()
	{
		getContentPane().setLayout(null);
		textfield1=new JTextField();
		textfield1.setBounds(10,10,100,30);
		getContentPane().add(textfield1);
		textfield2=new JTextField();
		textfield2.setBounds(10,50,100,30);
		getContentPane().add(textfield2);
		boton1=new JButton("Sumar");
		boton1.setBounds(10,90,100,30);
		getContentPane().add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==boton1)
		{
			String cad1=textfield1.getText();
			String cad2=textfield2.getText();
			int x1=Integer.parseInt(cad1);
			int x2=Integer.parseInt(cad2);
			int suma=x1+x2;
			String total=String.valueOf(suma);
			setTitle(total);
		}
	}

	public static void main(String[] ar)
	{
		Formulario formulario1=new Formulario();
		formulario1.setBounds(10,10,250,200);
		formulario1.setVisible(true);
	}
}
