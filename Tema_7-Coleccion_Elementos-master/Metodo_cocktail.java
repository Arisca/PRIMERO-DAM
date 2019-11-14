package Tema7;

public class coctail
{
	private static int [] lista;
	final static int POS=50; // número de posiciones del array
	final static int LIMITE=100; // números entre 1 y LIMITE
	
	public static int getAleatorio()
	{
		return (int)(Math.random()*LIMITE+1);
	}
	
	public static void ordena_cocktail(int array[])
	{
		int i=0, j=array.length-1;
		while (i<j)
		{
			for (int k = i; k<j; k++) // direccion -->
				if (array[k] > array[k+1])
				{
					int temp = array[k];
					array[k] = array [k+1];
					array[k+1] = temp;
				}
			j--;
			
			for (int k = j; k>i; k--) // direccion <--
				if (array[k] < array[k-1])
				{
					int temp = array[k];
					array[k] = array [k-1];
					array[k-1] = temp;
				}
			i++;
		}
	}
	
	public static void muestra()
	{
		for(int i=0;i< POS;i++)
			System.out.print(lista [i]+ " ");
	}
	
	public static void main(String[] args)
	{
		lista = new int[POS];
		for(int f=0;f< POS; f++)
			lista[f] = getAleatorio();
		System.out.println("Vector aleatorio.");
		muestra( ); //muestra el vector desordenado
		System.out.println("\n\nVector ordenado por método cocktail sort.");
		ordena_cocktail(lista); // ordena por metodo burbuja
		muestra( ); //muestra el vector ordenado
		System.out.println(" ");
	}
}
