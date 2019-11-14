package Tema7;

import java.util.*;
import java.lang.Integer;

	public class Ejercicio1
	{
		private static Scanner sn;
		private Scanner sn2;
		private Scanner sn3;
		private Scanner sn4;
		private Scanner sn5;
		private Scanner sn6;
		private Scanner sn7;

		public static void main(String[] args)
		{
			Ejercicio1 menu = new Ejercicio1();
			
			ArrayList<Integer> mi_array = new ArrayList<Integer>();
			sn = new Scanner(System.in);
			boolean salir = false;
			int opcion;
			while (!salir)
			{
				System.out.println(" ");
				System.out.println("MENU");
				System.out.println("1. Insertar elementos enteros (al principio o al final)");
				System.out.println("2. Eliminar elementos");
				System.out.println("3. Obtener el valor de una posicion determinada");
				System.out.println("4. Asignar un valor a una posicion determinada");
				System.out.println("5. Sumar todos los elementos");
				System.out.println("6. Obtener la media de todos los elementos");
				System.out.println("7. Obtener el numero de elementos");
				System.out.println("8. Contar el numero de valores iguales a uno dado por teclado");
				System.out.println("9. Invertir la coleccion");
				System.out.println("10. Obtener el valor mayor de la coleccion");
				System.out.println("11. Obtener el valor menor de la colección");
				System.out.println("12. Indicar si un numero se encuentra dentro de la coleccion");
				System.out.println("13. Mostrar el contenido de la coleccion");
				System.out.println("14. SALIR");
				
				try
				{
					System.out.print("Elige una de las opciones: ");
					opcion = sn.nextInt();
					switch (opcion)
					{
					case 1:
						menu.Insertar(mi_array);
						break;
					case 2:
						menu.Eliminar(mi_array);
						break;
					case 3:
						menu.ObtenerValor(mi_array);
						break;
					case 4:
						menu.AsignarValor(mi_array);
						break;
					case 5:
						menu.SumaElementos(mi_array);
						break;
					case 6:
						menu.SumaElementos(mi_array);
						break;
					case 7:
						menu.MuestraSize(mi_array);
						break;
					case 8:
						menu.ValoresIguales(mi_array);
						break;
					case 9:
						menu.Invertir(mi_array);
						break;
					case 10:
						menu.ValorMayor(mi_array);
						break;
					case 11:
						menu.ValorMayor(mi_array);
						break;
					case 12:
						menu.ValorEnArray(mi_array);
						break;
					case 13:
						menu.MostrarColeccion(mi_array);
						break;
					case 14:
						salir = true;
						break;
					default:
						System.out.println("Solo numeros entre 1 y 14");
					}
				}
				catch (InputMismatchException e)
				{
					System.out.println("************************");
					System.out.println("Debes insertar un numero");
					System.out.println("************************");
					sn.next();
				}
			}
		}

		private void MostrarColeccion(ArrayList<Integer> mi_array)
		{
			if (mi_array.size()>0)
			{
				Iterator<Integer> it = mi_array.iterator();
				System.out.print("--> Mostrando Coleccion: ");
				while(it.hasNext())
					System.out.print(it.next() + " / ");
					System.out.println("");
			}
			else
			{
			System.out.println("El array esta vacio");
			}
		}

		private void ValorEnArray(ArrayList<Integer> mi_array)
		{
			sn2 = new Scanner(System.in);
			boolean seEncuentra = false;
			int elemento = 0;
				try
				{
					System.out.print("Introduce numero a buscar: ");
					elemento = sn2.nextInt();
					for (Integer lista : mi_array)
					{
						if (lista.equals(elemento))
						{
							seEncuentra = true;
						}
					}
					
					if (seEncuentra) System.out.println("El numero " + elemento + " se encuentra en la lista!");
					else System.out.println("El numero " + elemento + " NO se encuentra en la lista!");
				}
					catch (InputMismatchException e)
					{
						System.out.println("************************");
						System.out.println("Debes insertar un numero");
						System.out.println("************************");
						sn2.next();
					}
				}

		private void ValorMayor(ArrayList<Integer> mi_array)
		{
			if (mi_array.size()>0)
			{
				Integer max=mi_array.get(0);
				for(int i = 0; i < mi_array.size(); i++)
				{
					if(max < mi_array.get(i)) max = mi_array.get(i);
				}
				System.out.println("El valor mayor es: " + max);
			}
			else
			{
				System.out.println("El array esta vacio");
			}	
		}

		private void Invertir(ArrayList<Integer> mi_array)
		{
			System.out.println("Antes de invertir:");
			Collections.reverse(mi_array);
			System.out.println("Despues de invertir:");
			MostrarColeccion(mi_array);				
		}

		private void ValoresIguales(ArrayList<Integer> mi_array)
		{
			sn3 = new Scanner(System.in);
			int elemento = 0;
			int suma = 0;
				try
				{
					System.out.print("Introduce numero a buscar: ");
					elemento = sn3.nextInt();
				}
				catch (InputMismatchException e)
				{
					System.out.println("************************");
					System.out.println("Debes insertar un numero");
					System.out.println("************************");
					sn3.next();
				}
				Iterator<Integer> it = mi_array.iterator();
				while(it.hasNext())
				{
					Integer elem = it.next();
					if(elem.equals(elemento))
						suma++;
				}
			System.out.println("El número buscado se ha encontrado " + suma + " veces.");
		}

		private void MuestraSize(ArrayList<Integer> mi_array)
		{
			int numElementos = mi_array.size();
			System.out.println("--> El ArrayList tiene "+numElementos+" elementos.");	
		}

		private void SumaElementos(ArrayList<Integer> mi_array)
		{
			int suma = 0;
			for (int i=0; i<mi_array.size();i++)
			{
				suma = suma + mi_array.get(i);
			}
				System.out.println("La suma de todos los elementos es: " + suma);
			}

		private void AsignarValor(ArrayList<Integer> mi_array)
		{
			sn4 = new Scanner(System.in);
			int posicion;
			int valor;
			boolean ok=false;
			try
			{
				do
				{
					System.out.print("Introduce posicion de elemento a asignar (0...n): ");
					posicion = sn4.nextInt();
					if (ExistePosicion(mi_array,posicion)) ok = true;
					else System.out.println("La posicion " + posicion + " no existe");
				}
				while (!ok);
				System.out.print("Introduce elemento a asignar a posicion " + posicion +": ");
				valor = sn4.nextInt();
				mi_array.remove(posicion);
				mi_array.add(posicion, valor);
				MostrarColeccion(mi_array);
			}
			catch (InputMismatchException e)
			{
				System.out.println("************************");
				System.out.println("Debes insertar un numero");
				System.out.println("************************");
				sn4.next();
			}
		}
			
		private boolean ExistePosicion(ArrayList<Integer> mi_array, int posicion)
		{
			if (posicion < mi_array.size()) return true; 
			return false;
		}

		private void ObtenerValor(ArrayList<Integer> mi_array)
		{
			sn5 = new Scanner(System.in);
			int posicion;
				try
				{
					System.out.print("Introduce posicion de elemento a obtener (0...n): ");
					posicion = sn5.nextInt();
					if (ExistePosicion(mi_array,posicion)) System.out.println("El elemento en posicion" + posicion + " es: " + mi_array.get(posicion));
					else
					{
						System.out.println("Esa posicion no existe en el array que solo tiene " + mi_array.size() + " elementos");
					}
				}
				catch (InputMismatchException e)
				{
					System.out.println("************************");
					System.out.println("Debes insertar un numero");
					System.out.println("************************");
					sn5.next();
				}
		}

		private void Eliminar(ArrayList<Integer> mi_array)
		{
			sn6 = new Scanner(System.in);
			int posicion;
				try
				{
					System.out.print("Introduce posicion de elemento a eliminar (0...n): ");
					posicion = sn6.nextInt();
				if (ExistePosicion(mi_array, posicion))
				{
					mi_array.remove(posicion);
					System.out.println("Eliminando elemento en posicion " + posicion + ":");
					MostrarColeccion(mi_array);
					MuestraSize(mi_array);
				}
				else System.out.println("La posicion " + posicion + " no existe!");
				}
				catch (InputMismatchException e)
				{
					System.out.println("************************");
					System.out.println("Debes insertar un numero");
					System.out.println("************************");
					sn6.next();
				}
		}

		private void Insertar(ArrayList<Integer> mi_array)
		{
				sn7 = new Scanner(System.in);
				int numero;
				String tecladoString;
				try
				{
					System.out.print("Introduce numero a insertar: ");
					numero = sn7.nextInt();
					System.out.print("Insertar al principio? (s/n): ");
					tecladoString =sn7.next();
					switch (tecladoString)
					{
						case "s":
							System.out.println("Insertando numero al principio:");
							mi_array.add(0,numero);
							MostrarColeccion(mi_array);
							break;
						
						case "n":
							System.out.println("Insertando numero al final:");
							mi_array.add(mi_array.size(), numero);
							MostrarColeccion(mi_array);
							break;
						
						default:
							System.out.println("Solo 's' o 'n' por favor.");
					}
				}
					catch (InputMismatchException e)
					{
						System.out.println("************************");
						System.out.println("Debes insertar un numero");
						System.out.println("************************");
						sn7.next();
					}
				}
			
		}

