package Taller_Clientes_LinkedList;

import java.util.Calendar;
/* Clase que permite obtener la fecha y hora actual en milisegundos */

public class Reloj
{
	public static long ahora()
	{
		return Calendar.getInstance().getTimeInMillis();
	}
}
