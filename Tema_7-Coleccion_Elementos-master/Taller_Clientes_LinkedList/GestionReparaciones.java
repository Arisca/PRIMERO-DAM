package Taller_Clientes_LinkedList;

import java.util.*;

public class GestionReparaciones
{//Attributos
	private LinkedList<FichaVehiculo> lista = new LinkedList<FichaVehiculo>();
/**Metodo que a�ade un vehiculo para ser arreglado con una fecha
* de entrada
* @param nombre
* @param matricula */
	
	public void anadeVehiculo(String nombre, String matricula)
	{
		long f= Reloj.ahora();
		FichaVehiculo fich = new FichaVehiculo(nombre, matricula, f);
		//creamos un nuevo veh�culo
		lista.add(fich); //a�adimos
	}
/**Metodo que a�ade una fecha de reparacion a un vehiculo
* @param matricula */
	public void reparado(String matricula)
	{
		boolean encontrado =false;
		int i=0;
		while(!encontrado && i<lista.size())
		{//condiciones que ha de cumplir(todas)
			if(lista.get(i).matricula().equals(matricula) && lista.get(i).fechaReparacion()==0)
			{
				lista.get(i).modificaFechaReparacion(Reloj.ahora());
				encontrado=true;
			}
			else
			{
				i++;
			}
		}
			if(encontrado==true)
			{
				System.out.println("Fecha de reparaci�n modificada correctamente");
			}
			else
			System.out.println("Error al modificar la fecha de reparaci�n del veh�culo "+ matricula);
		}
			/**Metodo que a�ade una fecha de salida a un vehiculo
			* @param matricula */
	
			public void fechaSalidaTaller(String matricula)
			{
				boolean encontrado =false;
				int i=0;
				while(!encontrado && i<lista.size())
				{
					//condiciones que ha de cumplir(todas)
					if(lista.get(i).matricula().equals(matricula) && lista.get(i).fechaSalida()==0 && lista.get(i).estaArreglado())
					{
						lista.get(i).modificaFechaSalida(Reloj.ahora());
						encontrado=true;
					}
					else
					{
						i++;
					}
				}
				if(encontrado==true)
				{
					System.out.println("Fecha de salida modificada correctamente");
				}
				else
				{
					System.out.println("Error al modificar la fecha de salida del veh�culo "+ matricula);
				}
			}
			/**Borramos la primera fecha de un vehiculo
			* @return */
			public boolean eliminarPrimerRegistro()
			{
			if(lista.isEmpty())
			{
				return false;
			}
			else
			{
				lista.removeFirst();
				return true;
			}
		}
	}

