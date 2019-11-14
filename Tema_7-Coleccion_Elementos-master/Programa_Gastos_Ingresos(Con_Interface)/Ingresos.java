package Ejercicio1;

import java.util.ArrayList;

public class Ingresos
{
	private static final ArrayList<Integer> Ingresos = null;
	private String IDingreso;
	private String CODingreso;
	private int CANTingreso;
	
	public String getIDingreso()
	{
		return IDingreso;
	}
	public void setIDingreso(String IDingreso)
	{
		this.IDingreso = IDingreso;
	}
	public String getCODingreso()
	{
		return CODingreso;
	}
	public void setCODingreso(String CODingreso)
	{
		this.CODingreso = CODingreso;
	}
	public int getCANTingreso()
	{
		return CANTingreso;
	}
	public void setCANTingreso(int CANTingreso)
	{
		this.CANTingreso = CANTingreso;
	}
	
	public String toString ()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append("\n ID:\t" );
		sb.append(IDingreso);
		
		sb.append("\n Codigo:\t" );
		sb.append(CODingreso);
		
		sb.append("\n Cuantia en €:\t\t" );
		sb.append(CANTingreso);
		
		sb.append("\n");
		
		return sb.toString();
	}

	public static ArrayList<Integer> getIngresos()
	{
		return Ingresos;
	}
}

	