package Tema7;

import java.util.Scanner;

public class busquedabin
{
	private static int[] lista;
	final static int POS=50; //numero de posiciones del array
	final static int LIMITE=1000; // numeros entre 1 y LIMITE
	private static Scanner teclado;
	
	public static int generaAleatorio()
	{
		return (int) (Math.random()*LIMITE+1);
	}
	
/*
public void cargar()
 	{
		lista=new int[10];
		for(int f=0;f<10;f++)
		{
		lista[f]=(int)(Math.random()*100);
		}
	}
*/
	
	public static void ordena(int array[])
	{
		int aux;
		for (int i = array.length; i>0; i--)
			for (int j = 0; j < i-1; j++)
				if (array[j] > array[j+1])
				{
					aux = array[j+1];
					array[j+1] = array [j];
					array[j] = aux;
				}
	}
	
	public static void muestra()
	{
		// System.out.println("\nVector ordenado por método burbuja.");
		for(int i=0;i<lista.length;i++)
		{
			System.out.print(lista[i]+" ");
		}
	}
	
	public static int buscabin(int [] a, int valor, int min, int max)
	{
		if(min>=max)
		{
			System.out.println("SALIDA PORQUE MIN>=MAX");
			return -1;
		}
		int mitad=(min+max)/2;
		System.out.print("\nmin="+min);
		System.out.print(" a[min]="+ a[min]);
		System.out.print(" max="+max);
		System.out.print(" a[max]="+a[max]);
		System.out.println(" mitad="+mitad);
		System.out.println(" a[mitad]="+a[mitad]);
		
		if (valor==a[mitad])
			return mitad;
		if (valor==a[min])
			return min;
		if (valor==a[max])
			return max;
		if (valor>a[mitad])
			return buscabin(a, valor, mitad+1, max);
		else
			return buscabin(a, valor, min, mitad-1);
	}
	
	public static void main(String[] args)
	{
		lista = new int[POS];
		int dato;
		teclado = new Scanner(System.in);
		for (int i = 0; i < POS; i++)
		{
			lista[i]=generaAleatorio();
		}
		
		System.out.println("Vector aleatorio: ");
		muestra();
		System.out.println("\nVector orednado: ");
		ordena(lista);
		muestra();
		System.out.println("\nIntroduce un valor entre 1 y 100 para buscar en el vector:");
					dato=teclado.nextInt();
		System.out.println("Buscando "+dato);
		System.out.print("El valor buscado entá en la posición: "+ buscabin(lista,dato,0,POS-1));
	}
}

