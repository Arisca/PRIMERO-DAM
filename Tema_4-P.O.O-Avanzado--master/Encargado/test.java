package Empleado.Encargado;

public class test
{
	public static void main (String[] args)
	{
	Empleado emple1 = new Empleado( );
	emple1.setSueldo(1200);
	Encargado encar1 = new Encargado( );
	encar1.setSueldo(1500);
	System.out.format ("Sueldo emple1 : %.2f", emple1.getSueldo( ));
	System.out.format ("\nSueldo encar1 : %.2f", encar1.getSueldo( ));
	}
}

