package Ejercicio1;

public class FachadaCalculadoraOps
{
	int numeroA = 0;
	int numeroB = 0;
	String operacion = null;
	
	public FachadaCalculadoraOps (int pa, int pb, String pOperacion)
	{
		this.numeroA = pa;
		this.numeroB = pb;
		this.operacion = pOperacion;
	}
	
	public int operacion ()
	{
		int resultado = 0;
		
		if (operacion.equals("+"))
		{
			SumaNumeros s = new SumaNumeros ();
			resultado = s.suma (numeroA, numeroB);
		}
		
		if (operacion.equals("-"))
		{
			RestaNumeros s = new RestaNumeros ();
			resultado = s.resta (numeroA, numeroB);
		}
		
		return resultado;
		
	}
}
