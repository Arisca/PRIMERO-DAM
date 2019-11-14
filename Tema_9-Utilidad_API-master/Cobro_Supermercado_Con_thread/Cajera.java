package Ejercicio3;

public class Cajera implements Runnable
{
	private Cliente cliente;
	private long tiempoinicial;
	
	public Cajera (Cliente cliente, long tiempoinicial)
	{
		this.cliente = cliente;
		this.tiempoinicial = tiempoinicial;
	}
	
	public void run()
	{
		System.out.println("La cajera " + Thread.currentThread().getName() 
				+ " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre() 
				+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.tiempoinicial) / 1000 + "seg");
		
		for (int i = 0; i < this.cliente.getCarroCompra().length; i++)
		{ 
			this.esperarXsegundos(cliente.getCarroCompra()[i]);
			System.out.println("Procesado el producto " + (i + 1) + " del " + this.cliente.getNombre()+ 
                    "->Tiempo: " + (System.currentTimeMillis() - this.tiempoinicial) / 1000 + "seg");
		}		
		System.out.println("La cajera " + Thread.currentThread().getName() + " HA TERMINADO DE PROCESAR " 
				+ this.cliente.getNombre() + " EN EL TIEMPO: "
				+ (System.currentTimeMillis() - this.tiempoinicial) / 1000 + "seg");
	}
	private void esperarXsegundos(int segundos)
	{
		try 
		{
			Thread.sleep(segundos * 1000);
		}
		catch (InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
}

