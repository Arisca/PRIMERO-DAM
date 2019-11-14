package Ejercicio2;

abstract class Comprobador
{
	protected Comprobador sucesor;
	
	public void setSucesor (Comprobador sucesor)
	{
		this.sucesor = sucesor;
	}
	
	public abstract void comprobar (String cadena);
}
