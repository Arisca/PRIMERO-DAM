package Tema7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E5
{
	 public static class Alumno implements Comparable<Alumno>
	 {
		 String apellidos_nombre;
		 int edad;
		 int curso; // utilizo el tipo int por si necesito ordenar alumnos por curso
		 double nota;
		 
		 public Alumno(String apellidos_nombre, int edad, int curso, double nota)
		 {
			 this.apellidos_nombre = apellidos_nombre;
			 this.edad = edad;
			 this.curso = curso;
			 this.nota = nota;
		 }
		 
		 public String getApellidos_nombre()
		 {
			 return apellidos_nombre;
		 }
		 
		 public void setApellidos_nombre(String apellidos_nombre)
		 {
			 this.apellidos_nombre = apellidos_nombre;
		 }
		 
		 public int getEdad()
		 {
		 return edad;
		 }
		 
		 public void setEdad(int edad)
		 {
			 this.edad = edad;
		 }
		 
		 public int getCurso()
		 {
			 return curso;
		 }
		 
		 public void setCurso(int curso)
		 {
			 this.curso = curso;
		 }
		 
		 public double getNota()
		 {
			 return nota;
		 }
		 
		 public void setNota(double nota)
		 {
			 this.nota = nota;
		 }
		 
		 public String toString()
		 {
			 return "Alumno {" +
					 "apellidos_nombre = '" + apellidos_nombre + '\'' +
					 ", edad = " + edad +
					 ", curso = " + curso +
					 ", nota = " + nota +
					 '}';
		 }
		
		 public int compareTo(Alumno o)
		 {
			 for (int i = 0; i < this.apellidos_nombre.length() && i <
					 o.apellidos_nombre.length(); i++)
		 		{
			 		if (this.apellidos_nombre.charAt(i) < o.apellidos_nombre.charAt(i))
			 			return -1;
			 		if (this.apellidos_nombre.charAt(i) > o.apellidos_nombre.charAt(i))
			 			return 1;
		 		}
			 return 0;
		 }
	}
		 Set<Alumno> set;
		private static Scanner scanner;


		 public E5()
		 {
			 set = new TreeSet<Alumno>();
		 }
		 
		 void addAlumno(Alumno a)
		 {
			 this.set.add(a);
		 }
		 
		 void notaMedia()
		 {
			 double sum = 0;
			 for (Alumno a : set)
			 {
				 sum += a.getNota();
			 }
			 System.out.println("Nota media: " + sum / set.size());
		 }
		 
		 void mayor()
		 {
			 Alumno mayor = new Alumno("Nadie",0,0,0);
			 for (Alumno a : set)
			 {
				 if (mayor.getEdad() < a.getEdad())
				 {
					 mayor = a;
				 }
			 }
			 System.out.println(mayor.toString());
		 }
		 
		 void mostrarOrdenado()
		 {
			 System.out.println(set.toString());
		 }
		 
		 public static void main(String[] args)
		 {
			 E5 e = new E5();
			 scanner = new Scanner(System.in);
			 int option = 0;
			 boolean running = true;
			 String nombre;
			 int edad;
			 int curso;
			 double nota;
			 while (running)
			 {
				 switch (option)
				 {
				 	case 0: // menu
				 		System.out.println("MENU\n" +
				 				"0. MOSTRAR MENU\n" +
				 				"1. AÑADIR ALUMNO\n" +
				 				"2. MOSTRAR NOTA MEDIA\n" +
				 				"3. MOSTRAR ALUMNOS ORDENADOS\n" +
				 				"4. MOSTRAR MAYOR ALUMNO \n" +
				 				"5. FINALIZAR PROGRAMA");
				 			break;
				 			
				 	case 1: // aÃ±adir alumno
				 		System.out.println("Introduzca el nombre del alumno:");
				 			nombre = scanner.next();
				 		System.out.println("Introduzca la edad del alumno:");
				 			edad = scanner.nextInt();
				 		System.out.println("Introduzca el curso del alumno:");
				 			curso = scanner.nextInt();
				 		System.out.println("Introduzca la nota del alumno:");
				 			nota = scanner.nextDouble();
				 		e.addAlumno(new Alumno(nombre, edad, curso, nota));
				 		break;
				 		
				 	case 2: // mostrar nota media
				 		e.notaMedia();
				 		break;
				 		
				 	case 3: // mostrar alumnos ordenados
				 		e.mostrarOrdenado();
				 		break;
				 		
				 	case 4: // Mostrar mayor alumno
				 		e.mayor();
				 		break;
				 		
				 	case 5: // finalizar programa
				 		System.out.println("Gracias por utilizar este programa.");
				 		running = false;
				 		break;
				 		
				 	default: // opción no válida
				 		System.out.println("La opciÃ³n introducida no es vÃ¡lida.");
				 		break;
				 }
				 if (option != 5)
				 {
					 System.out.println("Elija una opción: ");
					 option = scanner.nextInt();
				 }
			 }
		 }
	}
