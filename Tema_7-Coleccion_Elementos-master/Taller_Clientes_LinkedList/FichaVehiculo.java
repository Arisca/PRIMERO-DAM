package Taller_Clientes_LinkedList;

public class FichaVehiculo
{
	private long entrada, reparacion, salida;
	private String modelo;
	private String matricula;
	
	public FichaVehiculo(String m, String ma, long e)
	{ /**Constructor*/
		modelo=m;
		matricula=ma;
		entrada=e;
		reparacion=0;
		salida=0;
	}
	
	public String matricula()
	{
		return matricula;
	}
	
	public String modelo()
	{
		return modelo;
	}
	
	public void modificaFechaEntrada(long fecha_entrada)
	{
		entrada=fecha_entrada;
	}
	
	public void modificaFechaSalida(long fecha_salida)
	{
		entrada=fecha_salida;
	}
	
	public void modificaFechaReparacion(long fecha_reparacion)
	{
		entrada=fecha_reparacion;
	}
	
	public boolean estaArreglado()
	{
		if(reparacion!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public long fechaReparacion()
	{/*******Observadores de las fechas de reparación y salida****/
		return reparacion;
	}
	public long fechaSalida()
	{
		return salida;
	}
}

