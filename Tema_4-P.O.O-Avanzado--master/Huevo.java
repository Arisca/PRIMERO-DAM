package Huevo;

public class Huevo
{
	class yema
	{
		yema( )
			{
			System.out.println ("Inicializando yema… ");
			}
	}
	
	class clara
	{
		clara( )
		{
			System.out.println ("Inicializando clara… ");
		}
	}
	
	Huevo ( )
	{
		System.out.println ("Inicializando huevo… ");
	}
	
	yema hazYema ( )
	{
		return new yema( );
	}
	
	clara hazClara ( )
	{
		return new clara( );
	}
	
	public static void main (String[] args)
	{
		Huevo h = new Huevo( );
		yema y = h.hazYema( );
		clara c = h.hazClara( );
	}
}

