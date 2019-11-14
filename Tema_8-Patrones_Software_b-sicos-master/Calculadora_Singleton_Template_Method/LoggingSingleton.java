package Ejercicio1;

public class LoggingSingleton
{
	int DEBUG = 1;
	private static LoggingSingleton miLogSingleton = new LoggingSingleton();
	
	private LoggingSingleton ()
	{
		log ("Probando calculadora");
		log ("");
	}
	
	public static LoggingSingleton getInstance ()
	{
		return miLogSingleton;
	}
	
	public void log (String contenido)
	{
		if (DEBUG == 1)
		{
			System.out.println(contenido);
		}
	}
	
}
