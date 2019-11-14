package Tema7;

import java.util.StringTokenizer;
public class Notas
{
	public static void main(String[] args)
	{
		StringTokenizer notas;
		notas = new StringTokenizer (" Juan Carlos\n 8.5\n Andrés\n 4.9\n Pedro\n3.8\n Juan \n 6.3", "\n");
		while (notas.hasMoreTokens())
			System.out.println("El alumno "+notas.nextToken()+" ha sacado un"+notas.nextToken());
}
}
