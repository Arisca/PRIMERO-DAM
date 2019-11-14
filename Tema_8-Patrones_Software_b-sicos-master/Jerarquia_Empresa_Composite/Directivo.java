package Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

class Directivo extends EmpleadoBase
{
	String nombre;
	String puesto;
	ArrayList<EmpleadoBase> empleados = new ArrayList <EmpleadoBase>();

	public Directivo (String nombre, String puesto)
	{
		this.nombre = nombre;
		this.puesto = puesto;
	}
	
	public void add (EmpleadoBase empleadobase)
	{
		empleados.add(empleadobase);
	}
	
	public EmpleadoBase getChild (int i)
	{
		return empleados.get(i);
	}
	
	public void print()
	{
		System.out.println("");
		System.out.println("Nombre : " + this.nombre);
		System.out.println("Puesto : " + this.puesto);
		System.out.println("Empleados a su cargo : ");
		
		Iterator <EmpleadoBase> empleadosIterator = empleados.iterator();
		
			while (empleadosIterator.hasNext())
			{
				EmpleadoBase empleadobase = empleadosIterator.next();
				empleadobase.print();
			}
	}
	
	public void remove (EmpleadoBase empleadobase)
	{
		empleados.remove(empleadobase);
	}

}
