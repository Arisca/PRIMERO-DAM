package Ejercicio2;

class ComprobarInicial extends Comprobador
{
	public void comprobar(String cadena)
	{
		String _first=cadena.substring(0, 1);
		
		if (_first.toUpperCase().equals(_first))
		{
			System.out.println("La cadena ==> " + cadena + " <== empieza por MAYUSCULA");
		}
		else
		{
			if (_first.toLowerCase().equals(_first))
			{
				System.out.println("La cadena ==> " + cadena +" <== empieza por MINUSCULA");
			}
		}
		if (sucesor!= null)
			sucesor.comprobar (cadena);
	}
}
