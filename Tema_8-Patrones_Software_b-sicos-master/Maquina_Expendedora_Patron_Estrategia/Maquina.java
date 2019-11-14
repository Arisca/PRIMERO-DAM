package Ejercicio3;

public class Maquina
{
	Estrategia c;
	
	public void setEstrategia (Estrategia c)
	{
		this.c = c;
	}
	
	public void saludar ()
	{
		c.comosaludar();
	}
	
}
