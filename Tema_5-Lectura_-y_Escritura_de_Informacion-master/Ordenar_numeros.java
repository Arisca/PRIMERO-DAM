/*
 * Tenemos un fichero con una serie de números los cuales queremos ordenar de
manera ascendente. El objetivo es que los números queden ordenados en el mismo fichero.
Para la resolución del problema crea una clase orden con un método ordena() que haga la
ordenación de los datos del fichero. Los números están cada uno en una línea del fichero y
el fichero cuenta con al menos 5 números.
 */

import java.io.*;
import java.util.StringTokenizer;

public class Ordenar_numeros
{
	private BufferedReader br;

	public void ordenar(String fichero)
	{
		try
		{
			File fe=new File(fichero);
			FileReader fr=new FileReader(fe);
			br = new BufferedReader(fr);
			String numeros=new String();
			String s;
			
			while((s=br.readLine())!=null)
			{
				numeros += s + " ";
			}
			
			StringTokenizer str;
			boolean ordenado = false;
			while (!ordenado)
			{
				ordenado=true;
				String anterior, posterior="";
				str=new StringTokenizer(numeros);
				str = new StringTokenizer(numeros);
				anterior=str.nextToken();
				numeros="";
				
				while(str.hasMoreTokens())
				{
					posterior=str.nextToken();
					if(Integer.parseInt(anterior)>Integer.parseInt(posterior))
					{
						String aux = anterior;
						anterior = posterior;
						posterior = aux;
						ordenado = false;
					}
					numeros += anterior + " ";
					anterior = posterior;
				}
				numeros += posterior;
				System.out.println(numeros);
			}
			
		File fs=new File(fichero);
		FileWriter fw= new FileWriter(fs);
		str= new StringTokenizer(numeros);
		
		while (str.hasMoreTokens())
		{
			fw.write(str.nextToken());
			fw.write("\r\n");
		}
			if (fw !=null) fw.close();
	}
	catch (FileNotFoundException fnf)
		{
			System.err.println("Fichero no encontrado " );
		}
		catch (IOException e)
		{
			System.err.println("Se ha producido una IOException");
			e.printStackTrace();
		}
		catch (Throwable e)
		{
			System.err.println("Error de programa" + e);
			e.printStackTrace();
		}
	}
	
		public static void main(String[] args)
		{
		Ordenar_numeros ON =new Ordenar_numeros();
		ON.ordenar("numeros.txt");
		}
	}
