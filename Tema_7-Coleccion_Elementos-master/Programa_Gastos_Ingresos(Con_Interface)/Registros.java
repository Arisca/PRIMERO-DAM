package Ejercicio1;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Registros extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> IDingresos;
	private JComboBox<String> Concepto;
	private JTextField Cantidadingresada;
	protected int[] ListING;
	
	static ArrayList <Ingresos> ingresos = new ArrayList<Ingresos>();
	static ArrayList <Gastos> gastos = new ArrayList<Gastos>();
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Registros frame = new Registros();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Registros()
	{
		setTitle("Agregar Movimientos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 10, 662, 1020);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image FondoAgregar = new ImageIcon (this.getClass().getResource("/imagenes/Ingresos.jpg")).getImage();
		JButton Agregaringreso = new JButton("Agregar");
		Agregaringreso.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				RecogerIngresos();		
			}
		});
		Agregaringreso.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		Agregaringreso.setBounds(473, 350, 163, 47);
		contentPane.add(Agregaringreso);
		
		JButton btnVolverAlMenu = new JButton("Volver");
		btnVolverAlMenu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new IngresosGastos().setVisible(true);
				setVisible(false);
			}
		});
		btnVolverAlMenu.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnVolverAlMenu.setBounds(255, 350, 163, 47);
		contentPane.add(btnVolverAlMenu);
		
		JLabel VerLeyendaID = new JLabel("Tipo de Movimiento");
		VerLeyendaID.setHorizontalAlignment(SwingConstants.CENTER);
		VerLeyendaID.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 20));
		VerLeyendaID.setBounds(0, 37, 646, 41);
		contentPane.add(VerLeyendaID);
		
		JLabel lbleuros = new JLabel("\u20AC");
		lbleuros.setHorizontalAlignment(SwingConstants.CENTER);
		lbleuros.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 20));
		lbleuros.setBounds(448, 279, 52, 41);
		contentPane.add(lbleuros);
		
		JLabel lblCodigo = new JLabel("Concepto");
		lblCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodigo.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 20));
		lblCodigo.setBounds(0, 138, 646, 41);
		contentPane.add(lblCodigo);
		
		Cantidadingresada = new JTextField();
		Cantidadingresada.setHorizontalAlignment(SwingConstants.CENTER);
		Cantidadingresada.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		Cantidadingresada.setColumns(10);
		Cantidadingresada.setBounds(204, 274, 258, 45);
		contentPane.add(Cantidadingresada);
		
		IDingresos = new JComboBox<String>();
		IDingresos.setModel(new DefaultComboBoxModel<String>(new String[] {"Ingreso", "Gasto"}));
		IDingresos.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		IDingresos.setBounds(281, 86, 99, 41);
		contentPane.add(IDingresos);
		
		Concepto = new JComboBox<String>();
		Concepto.setModel(new DefaultComboBoxModel<String>(new String[] {"Clientes", "Servicios", "Mantenimiento", "Viajes", "Asesoria", "Otros"}));
		Concepto.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		Concepto.setBounds(238, 190, 180, 41);
		contentPane.add(Concepto);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 20));
		lblCantidad.setBounds(0, 237, 646, 41);
		contentPane.add(lblCantidad);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pantalla de Resultado de Calculos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane_1.setToolTipText("");
		scrollPane_1.setBounds(0, 830, 646, 151);
		contentPane.add(scrollPane_1);
		
		JTextArea listadocalculos = new JTextArea();
		scrollPane_1.setViewportView(listadocalculos);
		listadocalculos.setEditable(false);
		listadocalculos.setLineWrap(true);
		
		JButton Limpiar2 = new JButton("Limpiar Pantalla");
		Limpiar2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				listadocalculos.setText("");
			}
		});
		Limpiar2.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		scrollPane_1.setColumnHeaderView(Limpiar2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "Pantalla Muestra de Registros", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		scrollPane.setBounds(10, 428, 302, 391);
		contentPane.add(scrollPane);
		
		JTextArea Listado = new JTextArea();
		Listado.setEditable(false);
		scrollPane.setViewportView(Listado);
		
		JButton Limpiar1 = new JButton("Limpiar Pantalla");
		Limpiar1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Listado.setText("");
			}
		});
		Limpiar1.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		scrollPane.setColumnHeaderView(Limpiar1);
		
		JButton btnMostrar = new JButton("Mostrar Todo");
		btnMostrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Listado.setText(null);
					
				Listado.append(String.valueOf(ingresos) + '\n');
				Listado.append(String.valueOf(gastos) + '\n');
			}	
		});
		btnMostrar.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnMostrar.setBounds(43, 350, 163, 47);
		contentPane.add(btnMostrar);
		
		JButton btnSumaTotalIngresos = new JButton("Suma");
		btnSumaTotalIngresos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int SumaIngresos = 0;
				int SumaGastos = 0;
				
				for (Ingresos ingresos: ingresos)
				{
					SumaIngresos += ingresos.getCANTingreso();
				}
				for (Gastos gastos : gastos)
				{
					SumaGastos += gastos.getCANTgasto();
				}
				int CalculoTotal = SumaIngresos + SumaGastos;
				listadocalculos.setText("-> La suma total de los movimientos declarados son : "+ SumaIngresos + " Euros (En concepto de ingresos) y " + (SumaGastos) * (-1) +" Euros (En concepto de gastos)" + '\n'
				+ "Registrandose un balance final de: " + CalculoTotal + " Euros");
			}
		});
		btnSumaTotalIngresos.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnSumaTotalIngresos.setBounds(322, 457, 99, 47);
		contentPane.add(btnSumaTotalIngresos);
		
		JButton btnEliminarRegistro = new JButton("Eliminar Ingreso");
		btnEliminarRegistro.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				for (int contar = Integer.parseInt(JOptionPane.showInputDialog("Digame que registro ingresado desea eliminar")); contar <ingresos.size(); contar ++)
				{
					listadocalculos.setText(String.valueOf(ingresos.remove(contar) + "-> Este registro de ingreso ha sido eliminado"));
				}
			}
		});
		btnEliminarRegistro.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnEliminarRegistro.setBounds(322, 719, 314, 47);
		contentPane.add(btnEliminarRegistro);
		
		JButton btnMedia = new JButton("Media");
		btnMedia.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int SumaIngresos = 0;
				int SumaGastos = 0;
				
				for (Ingresos ingresos: ingresos)
				{
					SumaIngresos += ingresos.getCANTingreso();
				}
				for (Gastos gastos : gastos)
				{
					SumaGastos += gastos.getCANTgasto();
				}
				
				int RegistrosIngresos = ingresos.size();
				int RegistrosGastos = gastos.size();
				
				int MediaIngresos = (SumaIngresos / RegistrosIngresos);
				int MediaGastos = (SumaGastos / RegistrosGastos);
				
				listadocalculos.setText("-> La media calculada de movimientos declarados son : "+ MediaIngresos + " Euros (En concepto de ingresos) y " + (MediaGastos) * (-1) +" Euros (En concepto de gastos)");
				
			}
		});
		btnMedia.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnMedia.setBounds(322, 515, 99, 47);
		contentPane.add(btnMedia);
		
		JButton btnNumeroDeRegistros = new JButton("Registros");
		btnNumeroDeRegistros.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int RegistrosIngresos = ingresos.size();
				int RegistrosGastos = gastos.size();
				
				listadocalculos.setText("-> En total se han registrado : "+ RegistrosIngresos +" Ingresos" + " y " + RegistrosGastos +" Gastos");
			}
		});
		btnNumeroDeRegistros.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnNumeroDeRegistros.setBounds(443, 487, 193, 47);
		contentPane.add(btnNumeroDeRegistros);
		
		JButton btnInvertirMostrar = new JButton("Invertir Mostrar");
		btnInvertirMostrar.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Listado.setText(null);
				Collections.reverse(ingresos);
				{
				Listado.append(String.valueOf(ingresos) + '\n');
				}
				Collections.reverse(gastos);
				{
				Listado.append(String.valueOf(gastos) + '\n');
				}
			}
		});
		btnInvertirMostrar.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnInvertirMostrar.setBounds(443, 429, 193, 47);
		contentPane.add(btnInvertirMostrar);
		
		JButton btnVerIngresos = new JButton("Buscar Gasto");
		btnVerIngresos.addActionListener(new ActionListener()
		{
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e)
			{
				for (int contar = Integer.parseInt(JOptionPane.showInputDialog("Digame que registro de gastos desea visualizar")); contar <gastos.size(); contar ++)
				{
					listadocalculos.setText(String.valueOf(gastos.get(contar)));
					int n = JOptionPane.showConfirmDialog(null, "¿Deseas cambiarle su posicion de registro?");
					if (n == JOptionPane.YES_OPTION)
					{	
						int Nuevapos = Integer.parseInt(JOptionPane.showInputDialog("Indique en posición desearía visualizarlo"));
						{
							gastos.set(Nuevapos, (gastos.get(contar)));
							listadocalculos.setText("-> El registro ha cambiado su posición");
							break;
						}
					}
					else
					{
						listadocalculos.setText("-> El registro mantiene su posición");
						break;
					}
				}
			}
		});
		btnVerIngresos.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnVerIngresos.setBounds(443, 661, 193, 47);
		contentPane.add(btnVerIngresos);
		
		JButton btnMayor = new JButton("Mayor");
		btnMayor.addActionListener(new ActionListener()
		{			
			public void actionPerformed(ActionEvent e)
			{
				int Mayor1 = 0;
				int Mayor2 = 0;
				
				for (Ingresos ingresos: ingresos)
				{
					int numero = ingresos.getCANTingreso();
					if (Mayor1 < numero)
						Mayor1 = numero;
				}
				for (Gastos gastos: gastos)
				{
					int numero = gastos.getCANTgasto();
					if (Mayor2 < numero)
						Mayor2 = numero;
				}	
				listadocalculos.append(String.valueOf("-> El mayor de los ingresos introducidos corresponde a la cantidad de : " + Mayor1 + " Euros"+ '\n'
						+ "-> El mayor de los gastos introducidos corresponde a la cantidad de : " + Mayor2 + " Euros" + '\n'));
			}

		});
		btnMayor.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnMayor.setBounds(322, 573, 101, 47);
		contentPane.add(btnMayor);
		
		JButton btnMenor = new JButton("Menor");
		btnMenor.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				int Menor1 = 999999;
				int Menor2 = 999999;

				for (Ingresos ingresos: ingresos)
				{
					int numero = ingresos.getCANTingreso();
					if (Menor1 > numero)
						Menor1 = numero;
				}
				for (Gastos gastos: gastos)
				{
					int numero = gastos.getCANTgasto();
					if (Menor2 > numero)
						Menor2 = numero;
				}	
				listadocalculos.append(String.valueOf("-> El menor de los ingresos introducidos corresponde a la cantidad de : " + Menor1 + " Euros"+ '\n'
						+ "-> El menor de los gastos introducidos corresponde a la cantidad de : " + Menor2 + " Euros" + '\n'));
			}
			
		});
		btnMenor.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnMenor.setBounds(322, 631, 101, 47);
		contentPane.add(btnMenor);
		
		JButton btnBuscarCantidad = new JButton("Buscar Cantidad");
		btnBuscarCantidad.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int veces = 0;
				
				int Buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desee consultar, primero entre los ingresos"));
				{
					for (Ingresos ingresos: ingresos)
					{
						for (Gastos gastos: gastos)
						{
							if (Buscar == ingresos.getCANTingreso() || Buscar == gastos.getCANTgasto()*-1)
							{
								veces++;
								listadocalculos.setText("La cantidad de " + Buscar + " aparece " + veces + " veces en los registros");
							break;
							}
							else
							{
								listadocalculos.setText("-> La cantidad introducida no aparece en ningún registro");
							}
						}
					}
				}
			}
		});
		btnBuscarCantidad.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnBuscarCantidad.setBounds(442, 545, 193, 47);
		contentPane.add(btnBuscarCantidad);
		
		JButton btnVerGastos = new JButton("Buscar Ingreso");
		btnVerGastos.addActionListener(new ActionListener()
		{
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e)
			{
				for (int contar = Integer.parseInt(JOptionPane.showInputDialog("Digame que registro ingresado desea visualizar")); contar <ingresos.size(); contar ++)
				{
					listadocalculos.setText(String.valueOf(ingresos.get(contar)));
					int n = JOptionPane.showConfirmDialog(null, "¿Deseas cambiarle su posicion de registro?");
					if (n == JOptionPane.YES_OPTION)
					{	
						int Nuevapos = Integer.parseInt(JOptionPane.showInputDialog("Indique en posición desearía visualizarlo"));
						{
							ingresos.set(Nuevapos, (ingresos.get(contar)));
							listadocalculos.setText("-> El registro ha cambiado su posición");
							break;
						}
					}
					else
					{
						listadocalculos.setText("El registro mantiene su posición");
						break;
					}
				}
			}
		});
		btnVerGastos.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnVerGastos.setBounds(443, 603, 193, 47);
		contentPane.add(btnVerGastos);
		
		JButton btnEliminarGasto = new JButton("Eliminar Gasto");
		btnEliminarGasto.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				for (int contar = Integer.parseInt(JOptionPane.showInputDialog("Digame que registro ingresado desea eliminar")); contar <gastos.size(); contar ++)
				{
					listadocalculos.setText(String.valueOf(gastos.remove(contar) + "-> Este registro de gasto ha sido eliminado"));
				}
			}
		});
		btnEliminarGasto.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 20));
		btnEliminarGasto.setBounds(322, 772, 314, 47);
		contentPane.add(btnEliminarGasto);
		
		JLabel FondoING = new JLabel("");
		FondoING.setHorizontalAlignment(SwingConstants.CENTER);
		FondoING.setBounds(10, -59, 646, 936);
		FondoING.setIcon((new ImageIcon (FondoAgregar)));
		contentPane.add(FondoING);
	}
	
	private void RecogerIngresos ()
	{
		Ingresos aux = null;
		Gastos aux2 = null;
		
		switch (IDingresos.getSelectedIndex())
		{
			case 0:
			{
				String IDingreso = ("Ingreso");
				String CODingreso = (Concepto.getSelectedItem().toString());
				int CANTingreso = Integer.parseInt(Cantidadingresada.getText().toString());
		
				aux = new Ingresos ();
		
				aux.setIDingreso(IDingreso);
				aux.setCODingreso(CODingreso);
				aux.setCANTingreso(CANTingreso);
		
				ingresos.add(aux);
				JOptionPane.showMessageDialog(null, "El ingreso ha sido registrado");
				break;
			}
			case 1:
			{
				String IDgasto = ("Gasto");
				String CODgasto = (Concepto.getSelectedItem().toString());
				int CANTgasto = Integer.parseInt(Cantidadingresada.getText().toString());
		
				aux2 = new Gastos ();
		
				aux2.setIDgasto(IDgasto);
				aux2.setCODgasto(CODgasto);
				aux2.setCANTgasto(CANTgasto*-1);
		
				gastos.add(aux2);
				JOptionPane.showMessageDialog(null, "El gasto ha sido registrado");
				break;
			}
		}
		Cantidadingresada.setText("");
	}
}


