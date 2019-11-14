package Ejercicio2;

class ComprobarLongitud extends Comprobador
{
	public void comprobar (String cadena)
	{
		if (cadena.length() > 5)
		{
			System.out.println("La cadena ==> " + cadena+ " <==  tiene MAS de 5 caracteres");
		}
		else
		{
			if (cadena.length() < 5)
			{
				System.out.println("La cadena ==> " +cadena+" <== tiene MENOS de 5 caracteres");
				if (sucesor!= null)
					sucesor.comprobar (cadena);
			}

		}
		if (sucesor!= null)
			sucesor.comprobar (cadena);
	}

}


