package Animales;

public class Murcielago extends Mamiferos implements PuedeVolar
{
	public void volar()
	{
		System.out.println("El murcielago VUELA");
	}
	
	public void caminar()
	{
		System.out.println("El murcielago CAMINA");
	}
}
