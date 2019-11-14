/* Se trata de hacer un programa que escriba 3 objetos de tipo Persona en el fichero
personas.dat. A continuación, debe leer los objetos del fichero creado y mostrarlos por
pantalla.
Los argumentos de la clase persona son nif, nombre y edad */

import java.io.*;

public class Programa2
{
/////////////////////////////////////////////// CREAR FICHERO ////////////////////////////////////////////////	
	public static void main (String [] args) throws IOException
	{
		String [] DNI = {"78987654-W","54678987-V","765123321-S"};
		String [] nombre = {"Perico Los Palotes", "Maria Antoñeta Boloñesa", "Benedicto Fernandez Agüado"};
		String [] edad = {"35", "42","50"};
		
		File fs = new File ("personas.dat");
		
		try
		{
			FileWriter fw = new FileWriter (fs);
			for (String s: DNI)
			{
				fw.write(s,0,s.length());
				fw.write("\r\n");
			}
			for (String s: nombre)
			{
				fw.write(s,0,s.length());
				fw.write("\r\n");
			}
			for (String s: edad)
			{
				fw.write(s,0,s.length());
				fw.write("\r\n");
			}
			if (fw !=null)
				fw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

/////////////////////////////////////////////// LEER FICHERO ////////////////////////////////////////////////	
		
		File fe = new File ("personas.dat");
		if (fe.exists ())
		{
			try
			{
				FileReader fr = new FileReader (fs);
				BufferedReader br = new BufferedReader (fr);
				String s;
				while ((s=br.readLine())!=null)
				{
					System.out.println(s);
				}
				if (fr !=null)
					fr.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	
}
}

		
		
		

