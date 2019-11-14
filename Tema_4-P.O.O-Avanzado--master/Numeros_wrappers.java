/*
 *Realiza una clase en con un método main que tome por teclado dos números y
muestre la suma, multiplicación, división y módulo. En el caso de que el segundo número sea
0, el programa deberá de atrapar las excepciones que se puedan producir. Para la resolución
de este problema necesitarás utilizar wrappers. 
 */
import java.io.*;

public class Numeros_wrappers
{
	int num1;
	int num2;
	
	public void leeNumeros()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);
		try
		{
			System.out.print("Introduzca el primer número:");
			String ln = buff.readLine();
			num1=Integer.parseInt(ln);
			System.out.print("Introduzca el segundo número:");
			ln = buff.readLine();
			num2=Integer.parseInt(ln);
		}
		catch(IOException e)
		{
			System.err.println("Se ha producido una IOException");
			e.printStackTrace();
		}
		catch (Throwable e)
		{
			System.err.println("Error de programa: " + e);
			e.printStackTrace();
		}
	}
	
	public void muestraNumeros()
	{
		try
		{
			System.out.println(num1+num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num1%num2);
		}
		catch (ArithmeticException e)
		{
			System.out.println("División por cero");
		}
		catch (Exception e)
		{
			System.out.println("Se produjo un error en el programa");
		}
	}
	
	public static void main(String[] args)
	{
		Numeros_wrappers t = new Numeros_wrappers();
		t.leeNumeros();
		t.muestraNumeros();
	}
}
