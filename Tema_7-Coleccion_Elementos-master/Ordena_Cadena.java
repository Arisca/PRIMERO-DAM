package Tema7;

import java.util.Scanner;

public class test
{
	private static String [] lista;
	final static int POS=10; // número de posiciones del array
	
	public static void ordena(String array[])
	{
		String aux = new String();
		for (int i = array.length; i>0 ; i--)
			for (int j = 0; j < i-1; j++)
				if (array[j].compareTo(array[j+1])>0)
				{
					aux = array[j+1];
					array[j+1] = array [j];
					array[j] = aux;
				}
	}
	
	public static void muestra()
	{
		//System.out.println("Vector ordenado por método burbuja.");
		for(int i=0; i<POS ;i++)
			System.out.print(lista [i]+ " ");
	}
	
	public static void main(String[] args)
	{
		Scanner ln = new Scanner (System.in);
		lista = new String[POS];
		System.out.println("Introduce 10 cadenas para ordenarlas ");
		for(int i=0;i< POS; i++)
		{
			lista[i] = ln.next();
		}
		System.out.println("Las 10 cadenas introducidas son: ");
		muestra( ); //muestra el vector desordenado
		ordena(lista); // ordena por metodo burbuja
		System.out.println("\nLas 10 cadenas ordenadas son: ");
		muestra( ); //muestra el vector ordenado
		System.out.println(" ");
	}
}
