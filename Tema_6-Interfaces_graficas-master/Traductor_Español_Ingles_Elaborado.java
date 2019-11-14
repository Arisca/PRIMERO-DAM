package TareasTema6;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio4 extends JFrame 
{

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel FondoTraductor;
	private JLabel Imagenbanderas;
	private JTextField Palabra;
	private JTextField Traducida;
	private JLabel NoPalabra;
	
	String [] ESP = new String [100];
	{ESP [ 0] = "hola"; 		ESP [ 1] = "adios"; 	ESP [ 2] = "mañana"; 	ESP [ 3] = "hoy"; 		ESP [ 4] = "ayer"; 		ESP [ 5] = "hora"; 		ESP [ 6] = "ahora"; 	ESP [ 7] = "despues"; 		ESP [ 8] = "tarde"; 		ESP [ 9] = "pronto"; 
	 ESP [10] = "perro"; 		ESP [11] = "gato"; 		ESP [12] = "paloma";	ESP [13] = "aguila";	ESP [14] = "buho"; 		ESP [15] = "tortuga"; 	ESP [16] = "periquito";	ESP [17] = "caballo "; 		ESP [18] = "pez"; 			ESP [19] = "oveja "; 
	 ESP [20] = "casi"; 		ESP [21] = "ya"; 		ESP [22] = "vale"; 		ESP [23] = "tambien"; 	ESP [24] = "siempre"; 	ESP [25] = "nunca"; 	ESP [26] = "otro "; 	ESP [27] = "algo"; 			ESP [28] = "hay"; 			ESP [29] = "porque";
	 ESP [30] = "principio"; 	ESP [31] = "mejorar"; 	ESP [32] = "empeorar";	ESP [33] = "grande"; 	ESP [34] = "pequeño"; 	ESP [35] = "guapo"; 	ESP [36] = "feo"; 		ESP [37] = "inteligente"; 	ESP [38] = "tonto"; 		ESP [39] = "valiente";
	 ESP [40] = "alto"; 		ESP [41] = "bajo"; 		ESP [42] = "gordo"; 	ESP [43] = "flaco"; 	ESP [44] = "arbol"; 	ESP [45] = "policia";	ESP [46] = "medico"; 	ESP [47] = "panadero"; 		ESP [48] = "profesor"; 		ESP [49] = "estudiante";
	 ESP [50] = "amarillo"; 	ESP [51] = "rojo"; 		ESP [52] = "verde"; 	ESP [53] = "azul"; 		ESP [54] = "rosa"; 		ESP [55] = "blanco"; 	ESP [56] = "negro"; 	ESP [57] = "naranja"; 		ESP [58] = "marron"; 		ESP [59] = "gris";
	 ESP [60] = "coche"; 		ESP [61] = "bicicleta";	ESP [62] = "autobus"; 	ESP [63] = "tren";		ESP [64] = "avion"; 	ESP [65] = "barco"; 	ESP [66] = "globo"; 	ESP [67] = "moto"; 			ESP [68] = "camion"; 		ESP [69] = "manzana";
	 ESP [70] = "puerta";		ESP [71] = "ventana"; 	ESP [72] = "casa"; 		ESP [73] = "suelo"; 	ESP [74] = "entrada"; 	ESP [75] = "cocina"; 	ESP [76] = "habitacion";ESP [77] = "baño"; 			ESP [78] = "salon"; 		ESP [79] = "garaje";
	 ESP [80] = "saltar"; 		ESP [81] = "correr"; 	ESP [82] = "estudiar"; 	ESP [83] = "jugar"; 	ESP [84] = "bailar"; 	ESP [85] = "cantar"; 	ESP [86] = "comer"; 	ESP [87] = "caminar"; 		ESP [88] = "mover"; 		ESP [89] = "tocar";
	 ESP [90] = "mesa"; 		ESP [91] = "silla"; 	ESP [92] = "mueble"; 	ESP [93] = "nevera"; 	ESP [94] = "congelador";ESP [95] = "armario"; 	ESP [96] = "ropa"; 		ESP [97] = "espejo"; 		ESP [98] = "escritorio";	ESP [99] = "libreta";}
		 		
	String [] ING = new String [100];
	{ING [ 0] = "hello"; 		ING [ 1] = "goodbye"; 		ING [ 2] = "tomorrow"; 	ING [ 3] = "today"; 	ING [ 4] = "yesterday";	ING [ 5] = "hour"; 		ING [ 6] = "now"; 		ING [ 7] = "after"; 		ING [ 8] = "late"; 			ING [ 9] = "soon"; 
	 ING [10] = "dog"; 			ING [11] = "cat"; 			ING [12] = "pigeon";	ING [13] = "eagle";		ING [14] = "owl"; 		ING [15] = "turtle"; 	ING [16] = "parakeet";	ING [17] = "horse "; 		ING [18] = "fish"; 			ING [19] = "sheep "; 
	 ING [20] = "almost"; 		ING [21] = "already"; 		ING [22] = "ok"; 		ING [23] = "also"; 		ING [24] = "always"; 	ING [25] = "never"; 	ING [26] = "other "; 	ING [27] = "something"; 	ING [28] = "there is";		ING [29] = "because";
	 ING [30] = "start"; 		ING [31] = "to get better"; ING [32] = "worsen";	ING [33] = "big"; 		ING [34] = "small"; 	ING [35] = "pretty"; 	ING [36] = "ugly"; 		ING [37] = "inteligent"; 	ING [38] = "silly"; 		ING [39] = "valiant";
	 ING [40] = "high"; 		ING [41] = "low"; 			ING [42] = "fat"; 		ING [43] = "skinny"; 	ING [44] = "tree"; 		ING [45] = "police";	ING [46] = "doctor"; 	ING [47] = "baker"; 		ING [48] = "teacher"; 		ING [49] = "student";
	 ING [50] = "yellow"; 		ING [51] = "red"; 			ING [52] = "green"; 	ING [53] = "blue"; 		ING [54] = "pink"; 		ING [55] = "white"; 	ING [56] = "black"; 	ING [57] = "orange"; 		ING [58] = "brown"; 		ING [59] = "gray";
	 ING [60] = "car"; 			ING [61] = "bike";			ING [62] = "bus"; 		ING [63] = "train";		ING [64] = "airplane"; 	ING [65] = "ship"; 		ING [66] = "ballon"; 	ING [67] = "motorcycle"; 	ING [68] = "truck"; 		ING [69] = "apple";
	 ING [70] = "door";			ING [71] = "window"; 		ING [72] = "house"; 	ING [73] = "ground"; 	ING [74] = "entry"; 	ING [75] = "kitchen"; 	ING [76] = "bedroom";	ING [77] = "bathroom"; 		ING [78] = "sitting room"; 	ING [79] = "garage";
	 ING [80] = "jump"; 		ING [81] = "run"; 			ING [82] = "study"; 	ING [83] = "play"; 		ING [84] = "dance"; 	ING [85] = "sing"; 		ING [86] = "eat"; 		ING [87] = "walk"; 			ING [88] = "move"; 			ING [89] = "touch";
	 ING [90] = "table"; 		ING [91] = "chair"; 		ING [92] = "fitment"; 	ING [93] = "fridge"; 	ING [94] = "freezer";	ING [95] = "wardrobe"; 	ING [96] = "clothes"; 	ING [97] = "mirror"; 		ING [98] = "desk";			ING [99] = "notebook";}
	
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					Ejercicio4 frame = new Ejercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejercicio4() 
	{
		setTitle("Traductor Espa\u00F1o <<<->>> Ingl\u00E9s");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon (this.getClass().getResource("/imagenes/FondoTraductor.jpg")).getImage();
		Image img2 = new ImageIcon (this.getClass().getResource("/imagenes/fondotraductor.png")).getImage();
		
		NoPalabra = new JLabel("");
		NoPalabra.setForeground(Color.RED);
		NoPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		NoPalabra.setFont(new Font("Caladea", Font.PLAIN, 20));
		NoPalabra.setBounds(328, 302, 218, 35);
		contentPane.add(NoPalabra);
		
		JLabel lblNewLabel = new JLabel("Palabra");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Reem Kufi", Font.PLAIN, 20));
		lblNewLabel.setBounds(103, 110, 181, 30);
		contentPane.add(lblNewLabel);
		
		JButton Traducir = new JButton("Traducir");
		Traducir.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String Coger = (Palabra.getText());
				
				int idioma [] = BuscarIdioma (Coger, ESP, ING);
				
				switch (idioma [0])
				{
				case 1:
					ESPING (0,idioma[1] ,ESP, ING);
					break;
				case 2:
					INGESP (0,idioma[1] ,ING, ESP);
					break;
				default:
					NoPalabra.setText("Palabra no encontrada");
					
					break;				
				}
			}

			protected int[] BuscarIdioma (String Coger, String[] ESP, String[] ING) 
			{
				int idioma [] = new int [2];
		
				for (int i = 0; i <100; i++) 
				{
					if(Coger.equals(ESP[i]))
					{
						idioma[0]=1;
						idioma[1]=i;
					}
					else if(Coger.equals(ING[i]))
					{
						idioma[0]=2;
						idioma[1]=i;
					}
				}
				return idioma;
			}
		});
		Traducir.setFont(new Font("Reem Kufi", Font.PLAIN, 20));
		Traducir.setBounds(376, 189, 130, 55);
		contentPane.add(Traducir);
		
		Palabra = new JTextField();
		Palabra.setHorizontalAlignment(SwingConstants.CENTER);
		Palabra.setFont(new Font("Caladea", Font.PLAIN, 20));
		Palabra.setBounds(103, 151, 181, 35);
		contentPane.add(Palabra);
		Palabra.setColumns(10);
		
		JLabel lblPalabraEnIngls = new JLabel("Traducci\u00F3n");
		lblPalabraEnIngls.setHorizontalAlignment(SwingConstants.CENTER);
		lblPalabraEnIngls.setFont(new Font("Reem Kufi", Font.PLAIN, 20));
		lblPalabraEnIngls.setBounds(103, 228, 181, 30);
		contentPane.add(lblPalabraEnIngls);
		
		Traducida = new JTextField();
		Traducida.setHorizontalAlignment(SwingConstants.CENTER);
		Traducida.setFont(new Font("Caladea", Font.PLAIN, 20));
		Traducida.setColumns(10);
		Traducida.setBounds(103, 269, 181, 35);
		contentPane.add(Traducida);
		
		Imagenbanderas = new JLabel ("");
		contentPane.add(Imagenbanderas);
		Imagenbanderas.setIcon(new ImageIcon (img2));
		Imagenbanderas.setBounds (398, 47, 93, 64);
		
		FondoTraductor = new JLabel (""); 
		contentPane.add(FondoTraductor);
		FondoTraductor.setIcon(new ImageIcon (img));
		FondoTraductor.setBounds (0, 0, 632, 413);
	}
	
	
	
	private void ESPING(int idioma, int i, String[] ESP, String[] ING)
	{
		if (idioma == 0)
		{
			Traducida.setText(ING[i]);
			NoPalabra.setText(null);
		}
	}

	protected void INGESP(int idioma, int i, String[] ING, String[] ESP)
	{	
		if (idioma == 1)
		{
			Traducida.setText(ESP[i]);
			NoPalabra.setText(null);
		}
	}

	
}
	
