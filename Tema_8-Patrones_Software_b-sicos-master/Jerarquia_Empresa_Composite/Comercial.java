package Ejercicio4;

class Comercial extends EmpleadoBase
{
	private String nombre;
	
	public Comercial (String nombre)
	{
		this.nombre = nombre;
	}
	public void print()
	{
		System.out.println("\t \t \t Nombre : " + this.nombre );
	}

}
