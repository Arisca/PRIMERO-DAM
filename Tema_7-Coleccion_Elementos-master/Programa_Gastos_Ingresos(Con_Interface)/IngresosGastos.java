package Ejercicio1;

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

public class IngresosGastos extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public static void main(String[] args)
{
		EventQueue.invokeLater(new Runnable()
{
			public void run() {
				try
				{
					IngresosGastos frame = new IngresosGastos();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public IngresosGastos()
	{
		setTitle("Contabilidad de Ingresos y Gastos de Empresas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img1 = new ImageIcon (this.getClass().getResource("/imagenes/Contabilidad.jpg")).getImage();
		
		JButton IngresosButton = new JButton("Comenzar");
		IngresosButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				new Registros().setVisible(true);
				setVisible(false);
			}
		});
		IngresosButton.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		IngresosButton.setBounds(164, 145, 271, 47);
		contentPane.add(IngresosButton);
		
		JLabel lblNewLabel = new JLabel("Contabiliza los movimientos de tu empresa");
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		lblNewLabel.setBounds(100, 11, 436, 38);
		contentPane.add(lblNewLabel);
		
		JLabel FondoINGAST = new JLabel("");
		FondoINGAST.setBounds(-11, -53, 661, 462);
		FondoINGAST.setIcon((new ImageIcon (img1)));
		contentPane.add(FondoINGAST);
	}
}
