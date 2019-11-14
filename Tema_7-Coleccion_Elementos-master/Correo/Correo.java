package Correo;

import java.util.ArrayDeque;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Correo
{
	ArrayDeque<carta> cartas = new ArrayDeque<carta>();
	
	public void encolar(carta carta)
	{
		cartas.push( carta );
	}
	
	public carta desEncolar()
	{
		return cartas.pollLast();
	}
	
	public void muestraCartasCola()
	{
		System.out.println("Las cartas en la cola son ");
		Iterator<carta> itr= cartas.iterator();
		
		while(itr.hasNext())
		{
			System.out.println( itr.next() );
		}
	}
	
	public static void main(String[] args)
	{
		Correo correo = new Correo();
		correo.encolar(new carta(1));
		correo.encolar(new carta(2));
		correo.encolar(new carta(3));
		correo.encolar(new carta(4));
		correo.encolar(new carta(5));
		correo.muestraCartasCola();
		carta carta = correo.desEncolar();
		
		System.out.println("Le damos al cartero la carta " + carta.id);
		carta = correo.desEncolar();
		System.out.println("Le damos al cartero la carta " + carta.id);
		correo.muestraCartasCola();
	}
	

