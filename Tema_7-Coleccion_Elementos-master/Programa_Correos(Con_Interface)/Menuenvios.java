package Ejercicio4;
import java.awt.EventQueue;
import java.util.ArrayDeque;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Menuenvios extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	ArrayDeque<String> Cartas = new ArrayDeque<String>();
	String Carta;
	String Envio;
	private JTextField Direccion;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Menuenvios frame = new Menuenvios();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Menuenvios()
	{
		Image img1 = new ImageIcon (this.getClass().getResource("/imagenes/FondoCorreos.png")).getImage();
		
		setTitle("Correo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1285, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Direcci\u00F3n del envio", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(272, 22, 676, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Direccion = new JTextField();
		Direccion.setFont(new Font("Verdana", Font.PLAIN, 19));
		Direccion.setBounds(6, 16, 660, 36);
		panel.add(Direccion);
		Direccion.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Registro de Direcciones", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(20, 157, 495, 227);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 16, 479, 204);
		panel_1.add(scrollPane);
		
		JTextArea Registrodirecciones = new JTextArea();
		Registrodirecciones.setEditable(false);
		Registrodirecciones.setRows(10);
		Registrodirecciones.setFont(new Font("Verdana", Font.PLAIN, 19));
		scrollPane.setViewportView(Registrodirecciones);
		Registrodirecciones.setWrapStyleWord(true);
		Registrodirecciones.setLineWrap(true);
		Registrodirecciones.append(String.valueOf(Cartas));	
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Envios para el cartero", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(750, 157, 495, 227);
		contentPane.add(panel_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 16, 479, 204);
		panel_2.add(scrollPane_1);
		
		JTextArea Cartero = new JTextArea();
		scrollPane_1.setViewportView(Cartero);
		Cartero.setWrapStyleWord(true);
		Cartero.setRows(10);
		Cartero.setLineWrap(true);
		Cartero.setFont(new Font("Verdana", Font.PLAIN, 19));
		Cartero.setEditable(false);
		
		JButton cola = new JButton("A\u00F1adir a la Cola");
		cola.setFont(new Font("Verdana", Font.PLAIN, 19));
		cola.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String Destino = Direccion.getText();
				Cartas.addFirst(Destino);
				Registrodirecciones.append(" ");
				Registrodirecciones.append(String.valueOf(Cartas.getFirst())+ '\n');
				Direccion.setText("");
			}
		});
		cola.setBounds(446, 92, 378, 27);
		contentPane.add(cola);
		
		JButton btnEnviarAlCartero = new JButton("");
		btnEnviarAlCartero.setIcon(new ImageIcon(Menuenvios.class.getResource("/imagenes/Enviar.jpg")));
		btnEnviarAlCartero.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (Cartas.size() == 0)
				{
					JOptionPane.showMessageDialog(null, "Actualmente no quedan cartas en la cola de envio");
				}
				else
				{
				String Envios = Cartas.getLast();
				Cartero.append(String.valueOf(Cartas.getLast())+ '\n');
				Registrodirecciones.append(" ");
				Registrodirecciones.append(String.valueOf("Cartas que quedan en la cola: " + Cartas.size() + '\n'));
				Cartas.remove(Envios);
				}
			}
		});
		btnEnviarAlCartero.setToolTipText("Enviar por orden de Cola");
		btnEnviarAlCartero.setBounds(572, 180, 135, 145);
		contentPane.add(btnEnviarAlCartero);
		
		JButton btnCartasEnCola = new JButton("Cartas en Cola");
		btnCartasEnCola.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "Actualmente hay " + Cartas.size() + " en la cola de envio");
			}
		});
		btnCartasEnCola.setFont(new Font("Verdana", Font.PLAIN, 19));
		btnCartasEnCola.setBounds(113, 395, 266, 27);
		contentPane.add(btnCartasEnCola);
		
		JLabel lblNewLabel = new JLabel("Enviar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(572, 328, 135, 27);
		contentPane.add(lblNewLabel);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 2, 1269, 459);
		Fondo.setIcon((new ImageIcon (img1)));
		contentPane.add(Fondo);
		
	}
}
