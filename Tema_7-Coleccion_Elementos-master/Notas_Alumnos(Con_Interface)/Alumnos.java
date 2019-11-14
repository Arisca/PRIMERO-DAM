 package Ejercicio3;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alumnos extends JFrame 
{		
		String [] Apellidos_Nombre = new String [30];
		{
		Apellidos_Nombre [ 0] = "Garrido Perez, Manuel"; 			Apellidos_Nombre [ 1] = "Caballer Gonzalez, Jose Antonio";		Apellidos_Nombre [ 2] = "Jimenez Galdós, Almudena";
		Apellidos_Nombre [ 3] = "Echevarria Quirós, Silvia";		Apellidos_Nombre [ 4] = "Barroso Martinez, Antonio";			Apellidos_Nombre [ 5] = "Pérez Garrido, Carolina";
		Apellidos_Nombre [ 6] = "Hernandez Martinez, Salvador";		Apellidos_Nombre [ 7] = "Diaz Diaz, Soledad";					Apellidos_Nombre [ 8] = "Fernandez Hernandez, Nicolás";
		Apellidos_Nombre [ 9] = "Amado Martín, Javier";				Apellidos_Nombre [10] = "Muñoz Mendoza, Amanda";				Apellidos_Nombre [11] = "Quirós Gutierrez, Jose Manuel";
		Apellidos_Nombre [12] = "Garcia Fuentes, Alfonso";			Apellidos_Nombre [13] = "Muñiz Rodiles, Maria Florentina";		Apellidos_Nombre [14] = "Calvo Lopez, Maria";
		Apellidos_Nombre [15] = "Martin Azabal, Javier";			Apellidos_Nombre [16] = "Gutierrez Calcio, Pablo";				Apellidos_Nombre [17] = "Lopez Reguilón, Isidoro";
		Apellidos_Nombre [18] = "García Fernandez, Santos";			Apellidos_Nombre [19] = "González Espinosa, Alba";				Apellidos_Nombre [20] = "Soriano Rodlriguez, Jose Luis";	
		Apellidos_Nombre [21] = "Zapico Lopez, Sandra";				Apellidos_Nombre [22] = "Bernabe Casanova, Francisco";			Apellidos_Nombre [23] = "Carreño Navarro, Monica";
		Apellidos_Nombre [24] = "Alonso Becerra, Jose";				Apellidos_Nombre [25] = "Garcia Muñiz, Iván";					Apellidos_Nombre [26] = "Martin Calvo, Esther";		
		Apellidos_Nombre [27] = "Garcia Martín, Erika";				Apellidos_Nombre [28] = "Campos Vique, Maria Belén";			Apellidos_Nombre [29] = "Casas Garcia, Esperanza";		
		}
	
		int [] Edad = new int [30];
		{
		Edad [ 0] = 30;		Edad [ 1] = 22;		Edad [ 2] = 25;		Edad [ 3] = 30;		Edad [ 4] = 20;		Edad [ 5] = 32;		Edad [ 6] = 24;		Edad [ 7] = 28;		Edad [ 8] = 29;		Edad [ 9] = 36;
		Edad [10] = 37;		Edad [11] = 24;		Edad [12] = 34;		Edad [13] = 23;		Edad [14] = 25;		Edad [15] = 26;		Edad [16] = 19;		Edad [17] = 50;		Edad [18] = 45;		Edad [19] = 40;
		Edad [20] = 35;		Edad [21] = 37;		Edad [22] = 33;		Edad [23] = 29;		Edad [24] = 28;		Edad [25] = 22;		Edad [26] = 33;		Edad [27] = 34;		Edad [28] = 38;		Edad [29] = 31;
		}
	
		String [] Curso = new String [30];
		{
		Curso [ 0] = "Primero";		Curso [ 1] = "Primero";		Curso [ 2] = "Primero";		Curso [ 3] = "Segundo";		Curso [ 4] = "Segundo";		Curso [ 5] = "Tercero";		Curso [ 6] = "Primero";
		Curso [ 7] = "Tercero";		Curso [ 8] = "Tercero";		Curso [ 9] = "Segundo";		Curso [10] = "Segundo";		Curso [11] = "Tercero";		Curso [12] = "Primero";		Curso [13] = "Primero";
		Curso [14] = "Segundo";		Curso [15] = "Tercero";		Curso [16] = "Segundo";		Curso [17] = "Tercero";		Curso [18] = "Tercero";		Curso [19] = "Tercero";		Curso [20] = "Segundo";	
		Curso [21] = "Primero";		Curso [22] = "Primero";		Curso [23] = "Tercero";		Curso [24] = "Tercero";		Curso [25] = "Primero";		Curso [26] = "Primero";		Curso [27] = "Tercero";	
		Curso [28] = "Primero";		Curso [29] = "Primero";
		}
	
		double [] Nota = new double [30];
		{
		Nota [ 0] = 5.5;		Nota [ 1] = 6;			Nota [ 2] = 8.5;		Nota [ 3] = 4;		Nota [ 4] = 5.5;		Nota [ 5] = 4;			Nota [ 6] = 6.5;	Nota [ 7] = 4;		
		Nota [ 8] = 4.3;		Nota [ 9] = 5.1;		Nota [10] = 9;			Nota [11] = 8;		Nota [12] = 7;			Nota [13] = 7.3;		Nota [14] = 5;		Nota [15] = 5.5;		
		Nota [16] = 8.2;		Nota [17] = 9.5;		Nota [18] = 6.2;		Nota [19] = 8.5;	Nota [20] = 7.5;		Nota [21] = 6.5;		Nota [22] = 7.5;	Nota [23] = 5.5;
		Nota [24] = 7.5;		Nota [25] = 10;			Nota [26] = 10;			Nota [27] = 10;		Nota [28] = 9.5;		Nota [29] = 8;
		}
		

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
					Alumnos frame = new Alumnos();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public Alumnos()
	{
		setTitle("Menu Notas Marzo 2019");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton todos = new JButton("Notas Alumnos");
		todos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				MostrarTodos();
			}

		});
		todos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		todos.setBounds(29, 186, 547, 46);
		contentPane.add(todos);
		
		JButton Media = new JButton("Nota media curso");
		Media.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				media();
			}
		});
		Media.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Media.setBounds(324, 264, 252, 46);
		contentPane.add(Media);
		
		JButton Mencion = new JButton("Mencion Especial");
		Mencion.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				MencionEspecial();
			}
		});
		Mencion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Mencion.setBounds(29, 264, 252, 46);
		contentPane.add(Mencion);
		
		Image img1 = new ImageIcon (this.getClass().getResource("/imagenes/fondo.jpg")).getImage();
		JLabel fondo = new JLabel("");
		contentPane.add(fondo);
		fondo.setIcon((new ImageIcon (img1)));
		fondo.setBounds(0, 0, 620, 415);
		contentPane.add(fondo);			
	}
	
	public void OrdenarporApellidos() 
	{
        for(int j=0;j<29;j++)
        {
            for(int i=0;i<29-j;i++) 
            {
                if (Apellidos_Nombre[i].compareTo(Apellidos_Nombre[i+1])>0) 
                {
                    String aux;
                    aux=Apellidos_Nombre[i];
                    Apellidos_Nombre[i]=Apellidos_Nombre[i+1];
                    Apellidos_Nombre[i+1]=aux;
                    
                    Double auxnota;
                    auxnota = Nota [i];
                    Nota[i]=Nota[i+1];
                    Nota[i+1]=auxnota;
                    
                    int auxedad;
                    auxedad = Edad [i];
                    Edad[i]=Edad[i+1];
                    Edad[i+1]=auxedad;
                    
                    String auxcurso;
                    auxcurso = Curso [i];
                    Curso[i]=Curso[i+1];
                    Curso[i+1]=auxcurso;
                }
            }    
        }
	}
	
	
	
	
	private void MostrarTodos ()
	{
		setTitle("Consulta Notas Marzo 2019");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 838);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img1 = new ImageIcon (this.getClass().getResource("/imagenes/fondo2.jpg")).getImage();
		
		JLabel lblNewLabel = new JLabel("Alumno");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 11, 271, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota.setForeground(Color.WHITE);
		lblNota.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNota.setBounds(326, 11, 86, 33);
		contentPane.add(lblNota);
		
		JTextArea Alumnos = new JTextArea();
		Alumnos.setRows(30);
		Alumnos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		Alumnos.setEditable(false);
		Alumnos.setBounds(45, 55, 271, 664);
		contentPane.add(Alumnos);
		
		JTextArea Notas = new JTextArea();
		Notas.setRows(30);
		Notas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		Notas.setEditable(false);
		Notas.setBounds(349, 55, 42, 664);
		contentPane.add(Notas);
				
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				new Alumnos().setVisible(true);
				setVisible(false);
					
			}
		});
		btnVolver.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnVolver.setBounds(111, 749, 369, 39);
		contentPane.add(btnVolver);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblCurso.setBounds(422, 11, 63, 33);
		contentPane.add(lblCurso);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblEdad.setBounds(505, 11, 63, 33);
		contentPane.add(lblEdad);
		
		JTextArea edad = new JTextArea();
		edad.setRows(30);
		edad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		edad.setEditable(false);
		edad.setBounds(515, 55, 42, 664);
		contentPane.add(edad);
		
		JTextArea Nivel = new JTextArea();
		Nivel.setRows(30);
		Nivel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		Nivel.setEditable(false);
		Nivel.setBounds(422, 55, 63, 664);
		contentPane.add(Nivel);
		
		JLabel Fondo2 = new JLabel("");
		Fondo2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Fondo2.setIcon((new ImageIcon (img1)));
		Fondo2.setBounds(0, -26, 707, 842);
		contentPane.add(Fondo2);
		
		OrdenarporApellidos();
			for(int i=0;i<Apellidos_Nombre.length; i++) 
			{
			 	Alumnos.append(Apellidos_Nombre[i] + '\n');
			}
			for (int i=0;i<Nota.length; i++)
			{
			 	Notas.append(String.valueOf(Nota[i])+ '\n');
			}
			for (int i=0;i<Edad.length; i++)
			{
			 	edad.append(String.valueOf(Edad[i])+ '\n');
			}
			for (int i=0;i<Curso.length; i++)
			{
			 	Nivel.append(String.valueOf(Curso[i])+ '\n');
			} 		
	}
	
	public void MencionEspecial() 
	{	
		setTitle("Menci\u00F3n Especial Marzo 2019");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img1 = new ImageIcon (this.getClass().getResource("/imagenes/fondo2.jpg")).getImage();
		
		JLabel lblNewLabel = new JLabel("Alumno: ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(77, 104, 94, 33);
		contentPane.add(lblNewLabel);
		
		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				new Alumnos().setVisible(true);
				setVisible(false);
					
			}
		});
		Volver.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Volver.setBounds(158, 294, 369, 39);
		contentPane.add(Volver);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setHorizontalAlignment(SwingConstants.LEFT);
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblCurso.setBounds(77, 148, 72, 33);
		contentPane.add(lblCurso);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.LEFT);
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblEdad.setBounds(77, 192, 62, 33);
		contentPane.add(lblEdad);

		JLabel lblNota = new JLabel("Nota:");
		lblNota.setHorizontalAlignment(SwingConstants.LEFT);
		lblNota.setForeground(Color.WHITE);
		lblNota.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblNota.setBounds(77, 232, 87, 33);
		contentPane.add(lblNota);
		
		JTextField NombreAlumno = new JTextField();
		NombreAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		NombreAlumno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		NombreAlumno.setBounds(173, 104, 333, 31);
		contentPane.add(NombreAlumno);
		NombreAlumno.setColumns(10);
		
		JTextField CursoAlumno = new JTextField();
		CursoAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		CursoAlumno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		CursoAlumno.setColumns(10);
		CursoAlumno.setBounds(173, 148, 333, 31);
		contentPane.add(CursoAlumno);
		
		JTextField EdadAlumno = new JTextField();
		EdadAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		EdadAlumno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		EdadAlumno.setColumns(10);
		EdadAlumno.setBounds(173, 194, 333, 31);
		contentPane.add(EdadAlumno);
		
		JTextField NotaAlumno = new JTextField();
		NotaAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		NotaAlumno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		NotaAlumno.setColumns(10);
		NotaAlumno.setBounds(173, 238, 333, 31);
		contentPane.add(NotaAlumno);
	
		
		JLabel lblPara = new JLabel("Para el alumno de mayor edad");
		lblPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblPara.setForeground(Color.CYAN);
		lblPara.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblPara.setBounds(0, 11, 697, 33);
		contentPane.add(lblPara);
		
		JLabel lblGraciasPorAsistir = new JLabel("Gracias por asistir");
		lblGraciasPorAsistir.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasPorAsistir.setForeground(Color.CYAN);
		lblGraciasPorAsistir.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblGraciasPorAsistir.setBounds(0, 42, 697, 33);
		contentPane.add(lblGraciasPorAsistir);
		JLabel Fondo2 = new JLabel("");
		Fondo2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Fondo2.setIcon((new ImageIcon (img1)));
		Fondo2.setBounds(0, -26, 697, 579);
		contentPane.add(Fondo2);
		
		double numeromayor;
		numeromayor = Edad [0];
		
		for (int i=0; i<Edad.length && i<Apellidos_Nombre.length && i<Curso.length && i<Nota.length; i++)
		{
			if (Edad[i]>numeromayor)
			{
				numeromayor = Edad [i];
				EdadAlumno.setText(String.valueOf(Edad[i]));
				NombreAlumno.setText(Apellidos_Nombre[i]);
				CursoAlumno.setText(Curso[i]);
				NotaAlumno.setText(String.valueOf(Nota[i]));
			}
		}
	}
	
	public void media ()
	{
		setTitle("Nota media del curso Marzo 2019");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img1 = new ImageIcon (this.getClass().getResource("/imagenes/fondo2.jpg")).getImage();
		
		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				new Alumnos().setVisible(true);
				setVisible(false);
					
			}
		});
		Volver.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Volver.setBounds(158, 294, 369, 39);
		contentPane.add(Volver);
		
		JTextField MediaCurso = new JTextField();
		MediaCurso.setHorizontalAlignment(SwingConstants.CENTER);
		MediaCurso.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		MediaCurso.setColumns(10);
		MediaCurso.setBounds(285, 164, 116, 31);
		contentPane.add(MediaCurso);
	
		
		JLabel lblPara = new JLabel("La nota media del curso");
		lblPara.setHorizontalAlignment(SwingConstants.CENTER);
		lblPara.setForeground(Color.CYAN);
		lblPara.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblPara.setBounds(0, 11, 697, 33);
		contentPane.add(lblPara);
		
		JLabel lblGraciasPorAsistir = new JLabel("De entre todos los asistentes");
		lblGraciasPorAsistir.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasPorAsistir.setForeground(Color.CYAN);
		lblGraciasPorAsistir.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblGraciasPorAsistir.setBounds(0, 42, 697, 33);
		contentPane.add(lblGraciasPorAsistir);
		
		JLabel lblDeEntreTodos = new JLabel("En Marzo 2019");
		lblDeEntreTodos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeEntreTodos.setForeground(Color.CYAN);
		lblDeEntreTodos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblDeEntreTodos.setBounds(0, 74, 697, 33);
		contentPane.add(lblDeEntreTodos);
		
		JLabel lblASidoDe = new JLabel("A sido de un exitoso:");
		lblASidoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblASidoDe.setForeground(Color.CYAN);
		lblASidoDe.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblASidoDe.setBounds(0, 106, 697, 33);
		contentPane.add(lblASidoDe);
		
		JLabel lblGraciasATodos = new JLabel("Gracias a todos por vuestro inter\u00E9s y participacion");
		lblGraciasATodos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasATodos.setForeground(Color.CYAN);
		lblGraciasATodos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		lblGraciasATodos.setBounds(-10, 206, 697, 33);
		contentPane.add(lblGraciasATodos);
		
		JLabel Fondo2 = new JLabel("");
		Fondo2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		Fondo2.setIcon((new ImageIcon (img1)));
		Fondo2.setBounds(0, -26, 697, 383);
		contentPane.add(Fondo2);
		
		double Media, Suma = 0.0;
		Media = Nota[0];
		
		for (int i=0; i<Nota.length; i++)
		{
			Suma += Nota[i];
			Media = Suma / Nota.length;
			MediaCurso.setText(String.valueOf(Math.round(Media * 100d) / 100d));
		}
		
	}
}

