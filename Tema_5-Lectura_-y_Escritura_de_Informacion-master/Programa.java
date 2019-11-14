/* Ejercicio 1:
 Realiza un programa en JAVA en el que muestres un menú que te permita 3 opciones:
• Creación de un fichero de texto (con el nombre que tú quieras) en el que
indiques en cada linea:
 Tu Nombre.
 Tus Apellidos.
 Tu Ciudad de Nacimiento.
• Mostrar por pantalla el contenido del fichero de texto creado
• Salir del Programa. */



package DatosPersonales;

import java.io.*;
import java.util.Scanner;

public class Programa
{

	private static Scanner teclado;
	static String nombre;
	static String apellido1;
	static String apellido2;
	static String nacimiento;
	
/////////////////////////////////////////////// MENU ////////////////////////////////////////////////	
	public static void Menu () throws Exception
		{
		teclado = new Scanner (System.in);
		int choose;
		
		do 
		{
			System.out.println ("*** Bienvenid@ al sistema de información de datos personales ***");
			System.out.println ("\n");
			System.out.println ("Elija una opción: ");
			System.out.println ("\n");
			System.out.println ("\t 1.- Introducir datos");
			System.out.println ("\t 2.- Lectura de datos");
			System.out.println ("\t 3.- Salir del programa");
			
			choose = teclado.nextInt ();
				switch (choose)
				{
					case 1:
					{
						Crearfichero();
						break;
					}
					case 2:
					{
						leerdatos(null);
						break;
					}
					case 3:
					{
						System.out.println("Gracias por utilizar nuestro sistema de información");
						System.out.println("\t Le esperamos para la próxima vez");
						break;
					}
					default :
					{
						System.out.println("\t\t_________________________________________");
						System.out.println("\t\t ERROR DE SISTEMA");
						System.out.println("\t\t Inicializando de nuevo el programa");
						System.out.println("\t\t ..............");
						System.out.println("\t\t_________________________________________");
						System.out.println ("\n");
						break;
					}
				}
			}
			while (choose != 3);
		
		}

/////////////////////////////////////////////// CREAR TXT Y METER DATOS ////////////////////////////////////////////////	
	private static void Crearfichero()
	{
		DataOutputStream dos = null;
		
		try
		{						
			FileOutputStream fos = new FileOutputStream ("Datos.txt");
			dos = new DataOutputStream (fos);
			escribirFichero (dos);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try 
			{
				if (dos != null)
				{
					dos.close();
				}
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
		
	}

	private static void escribirFichero(DataOutputStream dos) throws Exception
	{
		teclado = new Scanner (System.in);
		
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.next();
		System.out.print("Introduce tus apellidos: ");
		apellido1 = teclado.next();
		apellido2 = teclado.next();
		System.out.print("Introduce tu ciudad de nacimiento: ");
		nacimiento = teclado.next();
		System.out.println("\n");
		System.out.println("\t___________________________________________________");
		System.out.println("\t\t Sus datos han quedado registrados");
		System.out.println("\t\t Gracias");
		System.out.println("\t___________________________________________________");
		System.out.println("\n");
		
		dos.writeUTF(nombre);
		dos.writeUTF(apellido1);
		dos.writeUTF(apellido2);
		dos.writeUTF(nacimiento);
	}	

/////////////////////////////////////////////// LEER DATOS ////////////////////////////////////////////////	
	public static void leerdatos(String datos) throws FileNotFoundException, IOException
	{
		 FileReader f = new FileReader("datos.txt");
	     BufferedReader b = new BufferedReader(f);
	      
	     while((b.readLine())!=null)
	     {
	    	System.out.println("\n");
	 		System.out.println("\t___________________________________________________");
	 		System.out.println("\t Datos del sistema:");
	 		System.out.println("\n");
	        System.out.println("\t Nombre: \t\t"+nombre);
	        System.out.println("\t Apellidos: \t\t"+apellido1+" "+apellido2);
	        System.out.println("\t Lugar de nacimiento: \t" +nacimiento);
	        System.out.println("\t___________________________________________________");
	        System.out.println("\n\n");
	     }
	     b.close();
	
	}
/////////////////////////////////////////////// INICIALIZAR PROGRAMA ////////////////////////////////////////////////	
	public static void main(String[] args) throws Exception
	{
        Menu();
	}

	
}



							
			
	


