package Ejercicio1;

import java.util.ArrayList;

public class Gastos
{
	private static final ArrayList<Integer> Gastos = null;
	private String IDgasto;
	private String CODgasto;
	private int CANTgasto;
		
	public String getIDgasto()
	{
		return IDgasto;
	}
	public void setIDgasto(String IDgasto)
	{
		this.IDgasto = IDgasto;
	}
	public String getCODgasto()
	{
		return CODgasto;
	}

	public void setCODgasto(String CODgasto)
	{
		this.CODgasto = CODgasto;
	}

	public int getCANTgasto()
	{
		return CANTgasto;
	}

	public void setCANTgasto(int CANTgasto)
	{
		this.CANTgasto = CANTgasto;
	}

	public String toString ()
	{
		StringBuilder sb2 = new StringBuilder();
			
		sb2.append("\n");
		sb2.append("\n ID:\t" );
		sb2.append(IDgasto);
			
		sb2.append("\n Codigo:\t" );
		sb2.append(CODgasto);
			
		sb2.append("\n Cuantia en €:\t\t" );
		sb2.append(CANTgasto);
		sb2.append("\n");
			
		return sb2.toString();
	}

	public static ArrayList<Integer> getGastos()
	{
			return Gastos;
	}
	
}


