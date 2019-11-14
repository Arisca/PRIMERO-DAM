package Ejercicio2;

class ComprobarNumero extends Comprobador
{

	public void comprobar(String cadena)
	{
		try
		{
			Integer.parseInt(cadena);
			System.out.println("La cadena ==> " + cadena+ " <== es un numero");
		}
		catch(Exception e)
		{
			System.out.println("La cadena ==> " + cadena+ " <== NO es un numero");
		}
		if (sucesor!= null)
			sucesor.comprobar (cadena);
	}

}
