/*
 *   Crear una clase censura con un m�todo aplicaCensura() que
modifique ciertas palabras de un fichero. El m�todo toma un fichero de entrada y mediante
un fichero de censura crear� un fichero de salida con las modificaciones necesarias.
Ejemplo:
		FICHERO DE ENTRADA
			En un lugar de la mancha de cuyo nombre no quiero acordarme...
			vivia un hidalgo de adarga estrecha
		FICHERO CENSURA
			acordarme RECORDAR
 */

import java.io.*;
import java.util.StringTokenizer;

public class Modificador_palabras
{
	public void aplicaCensura(String fentrada,String fcensura,String fsalida)
	{
		try
		{
			File fe=new File(fentrada);
			FileReader fr=new FileReader(fe);
			BufferedReader br=new BufferedReader(fr);
			File fs=new File(fsalida);
			FileWriter fw=new FileWriter(fs);
			String s;
			
			while((s=br.readLine())!=null)
			{
				File fc=new File(fcensura);
				FileReader frc=new FileReader(fc);
				BufferedReader brc=new BufferedReader(frc);
				String scen;
				
				while((scen=brc.readLine())!=null)
				{
					StringTokenizer str;
					str=new StringTokenizer(scen);
					s=s.replace(str.nextToken(),str.nextToken());
				}
				
				System.out.println(s);
				fw.write(s);
				fw.write("\r\n");
				
				if (frc!=null) frc.close();
				}
			if (fw !=null) fw.close();
			if (fr !=null) fr.close();
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
		Modificador_palabras MP =new Modificador_palabras();
		MP.aplicaCensura("datos.txt","censura.txt","salida.txt");
	}
}


