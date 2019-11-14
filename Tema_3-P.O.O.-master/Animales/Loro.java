package Animales;

public class Loro extends Aves implements PuedeVolar
{
	public void caminar()
	{
		System.out.println("El loro CAMINA");
	}
	public void volar()
	{
		System.out.println("El loro VUELA");
	}
}
