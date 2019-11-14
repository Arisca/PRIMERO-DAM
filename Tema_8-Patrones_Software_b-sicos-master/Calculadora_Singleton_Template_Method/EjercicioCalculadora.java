package Ejercicio1;

public class EjercicioCalculadora
{
	public static void main(String[] args)
	{
		int a=7;
		int b=4;
		String operacion="-";
		
		LoggingSingleton.getInstance().log("Se usa calculadora para hacer: "+a+" "+ operacion +" "+b);
		FachadaCalculadoraOps calc = new FachadaCalculadoraOps(a, b, operacion);
		calc.operacion();
		}

}
