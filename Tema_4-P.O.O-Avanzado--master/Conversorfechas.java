import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Realiza una clase conversorfechas que tenga los siguientes métodos:
*	▪ String normaltoAmericano(String). Este método convierte una fecha en formato normal
*		dd/mm/yyyy a formato americano mm/dd/yyyy.
*	▪ String americanotonormal(String). Este método realiza el paso contrario, convierte
*		fechas en formato americano a formato normal.
*
 */
public class Conversorfechas
{
	public String normalToAmericano(String s)
	{
		return s.substring(3,5)+"/"+s.substring(0,2)+"/"+s.substring(6);
	}
	
	public String americanoToNormal(String s)
	{
		return s.substring(3,5)+"/"+s.substring(0,2)+"/"+s.substring(6);
	}
	
	 public static void main(String[] args) throws IOException
	{
		 Conversorfechas s = new Conversorfechas();
		 InputStreamReader isr = new InputStreamReader(System.in);
		 BufferedReader buff = new BufferedReader(isr);
		 System.out.println("Introduzca el la fecha en formato normal dd/mm/aaaa :");
		 String fecha = buff.readLine();
		 System.out.println(s.normalToAmericano(fecha));
		 System.out.println("Introduzca el la fecha en formato americano mm/dd/aaaa :");
		 fecha = buff.readLine();
		 System.out.println(s.americanoToNormal(fecha));
	}
} 
