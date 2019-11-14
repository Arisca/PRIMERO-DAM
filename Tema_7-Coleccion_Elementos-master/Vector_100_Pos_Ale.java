package Tema7;

/*
 *  Programa que crea un vector de 100 posiciones con números aleatorios entre 1y 100.
 *  Una vez creado el vector el programa ordena el vector y muestra los números entre 1 y 100
 *  que no han sido almacenados.
 */

public class Propuesto8
{
	private static int[] lista;
	final static int POS=100; //número de posiciones del array
	final static int LIMITE=100; //Números entre 1..Límite
	
	public static int getaleatorio()
	{
		return (int) (Math.random()*LIMITE+1);
	}
	
	public static void ordena(int array[])
	{
		int aux;
		for (int i=array.length;i>0;i--)
		{
			for (int j=0;j<i-1;j++)
			{
				if (array[j]>array[j+1])
				{
					aux = array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
				}
			}
		}
	}
	
	public static void muestra()
	{
		for (int i=0;i<POS;i++)
		{
			System.out.print(lista[i]+" ");
		}
	}
	
	public static boolean encuentra( int num)
	{
		for (int i=0; i<POS; i++){
			if (lista[i] == num)
				return true;
			if (lista[i] > num)
				return false;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		lista = new int[POS];
		for (int i=0; i<POS; i++)
		{
			lista[i]=getaleatorio();
		}
		muestra();//se muestra el vector desordenado
		System.out.println("");
		ordena(lista); //ordenación por burbuja
		System.out.println("");
		muestra();//se muestra el vector ordenado
		System.out.println("");
		for (int i=0; i<POS; i++)
			if (!encuentra(i))
				System.out.println("El número "+ i + " no se encuentra en el vector");
		System.out.println("");
	}
}
