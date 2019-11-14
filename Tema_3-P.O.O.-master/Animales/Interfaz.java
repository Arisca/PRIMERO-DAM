package Animales;

public class Interfaz
{
	
	 public static void main(String arg[])
	 {
	 Murcielago m1=new Murcielago();
	 m1.volar();
	 m1.caminar();
	 System.out.println("");
	 Gato g1=new Gato();
	 g1.caminar();
	 g1.nadar();
	 System.out.println("");
	 Tigre t1=new Tigre();
	 t1.caminar();
	 t1.nadar();
	 System.out.println("");
	 Loro l1=new Loro();
	 l1.caminar();
	 l1.volar();
	 System.out.println("");
	 Avestruz a1=new Avestruz();
	 a1.caminar();
	 }
}
