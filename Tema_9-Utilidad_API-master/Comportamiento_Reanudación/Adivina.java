package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivina
{
	 private static Scanner teclado;

	public static void main(String[] args) {
	        teclado = new Scanner(System.in);

	        int numeroAdivinar = (int) (Math.random() * 100);
	       
	        int numero = 0;
	        int intentos = 0;
	        do {
	            boolean leido;
	            do {
	                System.out.println("Intenta adivinar un número entre 1 y 100");
	                try {
	                    intentos++;
	                    numero = teclado.nextInt();
	                    System.out.println("El numero introducido es: " + numero);
	                    leido = true;
	                } catch (InputMismatchException ex) {
	                    System.out.println("Debes de introducir números enteros!");
	                    teclado.next(); 
	                    leido = false;
	                }
	            } while (leido == false);

	            if (numero > numeroAdivinar) {
	                System.out.println("El numero es menor. Sigue intentando");

	            }
	            if (numero < numeroAdivinar) {
	                System.out.println("El numero es mayor. Sigue intentandolo");
	            }

	        } while (numero != numeroAdivinar);

	        System.out.println("Enhorabuena. Has acertado, el numero es: " + numeroAdivinar);
	        System.out.println("Y tan sólo te ha costado: " + intentos +"veces");

	    }

	}

