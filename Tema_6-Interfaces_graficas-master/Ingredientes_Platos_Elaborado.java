package TareasTema6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Ejercicio3 extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private JPanel jContentPane;
	private JLabel Imagencocina;
	

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try 
				{
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
		
	
	public Ejercicio3 () 
	{	
		setTitle("Chef 4000");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 367);
		jContentPane = new JPanel ();
		jContentPane.setToolTipText("");
		jContentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jContentPane);
		jContentPane.setLayout(null);
				
		JRadioButton Platococido = new JRadioButton("Cocido");
		Platococido.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Platococido.setFont(new Font("Dialog", Font.PLAIN, 20));
		Platococido.setBounds(125, 47, 87, 23);
		Platococido.setActionCommand("Platococido");
		Platococido.setSelected (true);
		jContentPane.add(Platococido);
				
		JRadioButton Platolentejas = new JRadioButton("Lentejas");
		Platolentejas.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Platolentejas.setFont(new Font("Dialog", Font.PLAIN, 20));
		Platolentejas.setBounds(290, 47, 105, 23);
		Platolentejas.setActionCommand("Platolentejas");
		Platolentejas.setSelected (true);
		jContentPane.add(Platolentejas);
		
		JRadioButton Platojudias = new JRadioButton("Judias");
		Platojudias.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Platojudias.setFont(new Font("Dialog", Font.PLAIN, 20));
		Platojudias.setBounds(462, 47, 87, 23);
		Platojudias.setActionCommand("Platojudias");
		Platojudias.setSelected (true);
		jContentPane.add(Platojudias);
		
		JCheckBox Lentejas = new JCheckBox("Lentejas");
		Lentejas.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Lentejas.setFont(new Font("Dialog", Font.PLAIN, 20));
		Lentejas.setBounds(34, 109, 111, 23);
		jContentPane.add(Lentejas);
		
		JCheckBox Chorizo = new JCheckBox("Chorizo");
		Chorizo.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Chorizo.setFont(new Font("Dialog", Font.PLAIN, 20));
		Chorizo.setBounds(34, 135, 111, 23);
		jContentPane.add(Chorizo);
				
		JCheckBox Cebolla = new JCheckBox("Cebolla");
		Cebolla.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Cebolla.setFont(new Font("Dialog", Font.PLAIN, 20));
		Cebolla.setBounds(34, 161, 111, 23);
		jContentPane.add(Cebolla);
		
		JCheckBox Garbanzos = new JCheckBox("Garbanzos");
		Garbanzos.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Garbanzos.setFont(new Font("Dialog", Font.PLAIN, 20));
		Garbanzos.setBounds(194, 109, 127, 23);
		jContentPane.add(Garbanzos);
		
		JCheckBox Morcilla = new JCheckBox("Morcilla");
		Morcilla.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Morcilla.setFont(new Font("Dialog", Font.PLAIN, 20));
		Morcilla.setBounds(194, 135, 127, 23);
		jContentPane.add(Morcilla);
		
		JCheckBox Zanahoria = new JCheckBox("Zanahoria");
		Zanahoria.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Zanahoria.setFont(new Font("Dialog", Font.PLAIN, 20));
		Zanahoria.setBounds(194, 161, 127, 23);
		jContentPane.add(Zanahoria);
		
		JCheckBox Judias = new JCheckBox("Judias");
		Judias.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Judias.setFont(new Font("Dialog", Font.PLAIN, 20));
		Judias.setBounds(352, 109, 111, 23);
		jContentPane.add(Judias);
		
		JCheckBox Colorante = new JCheckBox("Colorante");
		Colorante.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Colorante.setFont(new Font("Dialog", Font.PLAIN, 20));
		Colorante.setBounds(352, 135, 111, 23);
		jContentPane.add(Colorante);
		
		JCheckBox Pescado = new JCheckBox("Pescado");
		Pescado.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Pescado.setFont(new Font("Dialog", Font.PLAIN, 20));
		Pescado.setBounds(352, 161, 111, 23);
		jContentPane.add(Pescado);
		
		JCheckBox Nuez = new JCheckBox("Nuez Moscada");
		Nuez.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Nuez.setFont(new Font("Dialog", Font.PLAIN, 20));
		Nuez.setBounds(505, 109, 165, 23);
		jContentPane.add(Nuez);
		
		JCheckBox Laurel = new JCheckBox("Laurel");
		Laurel.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Laurel.setFont(new Font("Dialog", Font.PLAIN, 20));
		Laurel.setBounds(505, 135, 165, 23);
		jContentPane.add(Laurel);
		
		JCheckBox Pimenton = new JCheckBox("Piment\u00F3n");
		Pimenton.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		Pimenton.setFont(new Font("Dialog", Font.PLAIN, 20));
		Pimenton.setBounds(505, 161, 165, 23);
		jContentPane.add(Pimenton);
	
		ButtonGroup  Platos= new ButtonGroup ();
		Platos.add (Platococido);
		Platos.add (Platolentejas);
		Platos.add (Platojudias);
				
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent e)
			{	
				if (Platococido.isSelected())
				{
					if (Chorizo.isSelected())
					{
						if (Morcilla.isSelected())
						{
							if (Garbanzos.isSelected())
							{
								if (Zanahoria.isSelected())	
								{
									if (!Lentejas.isSelected())	
									{
										if (!Cebolla.isSelected())
										{
											if (!Judias.isSelected())
											{
												if (!Colorante.isSelected())
												{
													if (!Pescado.isSelected())
													{
														if (!Nuez.isSelected())
														{
															if (!Laurel.isSelected())
															{
																if (!Pimenton.isSelected())
																{
																	JOptionPane.showMessageDialog(btnComprobar, "CORRECTO");
																	return;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (Platolentejas.isSelected())
				{
					if (Lentejas.isSelected())
					{
						if (Chorizo.isSelected())
						{
							if (Cebolla.isSelected())
							{
								if (Zanahoria.isSelected())	
								{
									if (Pimenton.isSelected())	
									{
										if (!Garbanzos.isSelected())
										{
											if (!Morcilla.isSelected())
											{
												if (!Judias.isSelected())
												{
													if (!Colorante.isSelected())
													{
														if (!Pescado.isSelected())
														{
															if (!Nuez.isSelected())
															{
																if (!Laurel.isSelected())
																{
																	JOptionPane.showMessageDialog(btnComprobar, "CORRECTO");
																	return;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (Platojudias.isSelected())
				{
					if (Judias.isSelected())
					{
						if (Nuez.isSelected())
						{
							if (Laurel.isSelected())
							{
								if (Colorante.isSelected())	
								{
									if (Chorizo.isSelected())	
									{
										if (Cebolla.isSelected())
										{
											if (!Lentejas.isSelected())
											{
												if (!Garbanzos.isSelected())
												{
													if (!Morcilla.isSelected())
													{
														if (!Zanahoria.isSelected())
														{
															if (!Pescado.isSelected())
															{
																if (!Pimenton.isSelected())
																{
																	JOptionPane.showMessageDialog(btnComprobar, "CORRECTO");
																	return;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if (Pescado.isSelected())
				{
					JOptionPane.showMessageDialog(rootPane, "El pescado no se utiliza en ningun plato de los ofrecidos", "ERROR", HEIGHT, null);
					return;
				}
				else 
				{
					JOptionPane.showMessageDialog(rootPane, "Selección de productos incorrecto!", "ERROR", HEIGHT, null);
					return;
				}
			}
	
	});
		
		btnComprobar.setFont(new Font("Consolas", Font.PLAIN, 25));
		btnComprobar.setBounds(258, 237, 165, 42);
		jContentPane.add(btnComprobar);
		Image img = new ImageIcon (this.getClass().getResource("/imagenes/fondococina.jpg")).getImage();
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(10, 0, 695, 328);
		jContentPane.add(Fondo);
		
		Imagencocina = new JLabel ("");
		jContentPane.add(Imagencocina);
		Imagencocina.setIcon(new ImageIcon (img));
		Imagencocina.setBounds (-5, 0, 700, 328);
		
	}
}
	

