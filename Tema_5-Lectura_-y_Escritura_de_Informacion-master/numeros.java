/*Realiza un programa en JAVA que lea un archivo creado en el bloc de notas llamado
numeros.txt que contiene varias líneas y en cada una de ellas un número. Luego, el
programa te la cantidad de números leídos y la suma de todos los números del fichero.*/


import java.io.*;
import java.util.StringTokenizer;

public class numeros
{

	public static void vernumeros ()
	{
		FileReader fr = null;
		try
		{
			File fichero  = new File ("numeros.txt");
			fr = new FileReader (fichero);
			BufferedReader br = new BufferedReader (fr);
			sumanumeros (br);
			cuentanumeros ();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				if (fr !=null)
				{
					fr.close();
				}
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	private static void sumanumeros (BufferedReader br) throws Exception
	{
		String linea;
		int suma = 0;
		int num;
		
		linea = br.readLine();
		
		while (linea !=null)
		{
			num = Integer.parseInt(linea);
			suma = suma + num;
			linea = br.readLine();
		}
		
		System.out.println("La suma de los numeros es: " +suma);
		
	}
	
	private static int cuentanumeros () throws Exception
	{
		int contador = 0;
		
		try
		{
			File fe = new File ("numeros.txt");
			FileReader fr = new FileReader (fe);
			BufferedReader br = new BufferedReader (fr);
			String s;
			while ((s=br.readLine())!=null)
			{
				StringTokenizer str;
				str = new StringTokenizer (s);
				contador += str.countTokens();
			}
			if (fr!= null)
				fr.close();
		}
		catch (FileNotFoundException fnf)
		{
			System.err.println("El archivo no se encuentra");
		}
		catch (IOException e)
		{
			System.err.println ("Se ha producido un error");
			e.printStackTrace ();
		}
		catch (Throwable e)
		{
			System.err.println("Error de programa");
			e.printStackTrace();
		}
		System.out.println("El fichero contiene : " + contador + " numeros");
		
		return contador;
		}
	
	
	
	
	public static void main (String [] args)
	{
		vernumeros ();
	}

}
