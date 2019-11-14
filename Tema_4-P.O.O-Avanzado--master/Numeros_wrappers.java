/*
 *Realiza una clase en con un m�todo main que tome por teclado dos n�meros y
muestre la suma, multiplicaci�n, divisi�n y m�dulo. En el caso de que el segundo n�mero sea
0, el programa deber� de atrapar las excepciones que se puedan producir. Para la resoluci�n
de este problema necesitar�s utilizar wrappers. 
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
			System.out.print("Introduzca el primer n�mero:");
			String ln = buff.readLine();
			num1=Integer.parseInt(ln);
			System.out.print("Introduzca el segundo n�mero:");
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
			System.out.println("Divisi�n por cero");
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
