package Ejercicio3;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
	private static final int numCajeras = 2;
	
	public static void main(String[] args) 
	{
		 ArrayList<Cliente>clientes = new ArrayList<Cliente>();
		 
	        clientes.add(new Cliente("Cliente 1", new int[] { 1, 4, 3, 8, 2 }));
	        clientes.add(new Cliente("Cliente 2", new int[] { 1, 1, 1, 1, 1 }));
	        clientes.add(new Cliente("Cliente 3", new int[] { 2, 5, 6, 1, 3 }));
	        clientes.add(new Cliente("Cliente 4", new int[] { 3, 2, 3, 2, 1 }));
	        clientes.add(new Cliente("Cliente 5", new int[] { 2, 1, 1, 3, 1 }));
	        clientes.add(new Cliente("Cliente 6", new int[] { 1, 2, 2, 2, 2 }));
	        clientes.add(new Cliente("Cliente 7", new int[] { 5, 3, 3, 4, 5 }));
	        clientes.add(new Cliente("Cliente 8", new int[] { 6, 3, 2, 5, 8 }));
	        clientes.add(new Cliente("Cliente 9", new int[] { 1, 2, 1, 1, 1 }));
	        clientes.add(new Cliente("Cliente 10", new int[] { 2, 2, 2, 2, 2 }));
		
	        long init = System.currentTimeMillis();
	        
	        ExecutorService executor = Executors.newFixedThreadPool(numCajeras);
	        for (Cliente cliente: clientes)
	        {
	        	Runnable cajera = new Cajera (cliente, init);
	            executor.execute(cajera);
	        }
	        executor.shutdown();
	        while (!executor.isTerminated())
	        {
	        	
	        }
	        
	        long fin = System.currentTimeMillis();
	        System.out.println("Tiempo total de procesamiento: "+(fin-init)/1000+" Segundos");
		}

	}

