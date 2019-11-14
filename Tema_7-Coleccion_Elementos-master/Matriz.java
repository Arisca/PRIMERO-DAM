package Tema7;

import java.math.*;

public class matriz
{
	public static void main (String[] args)
	{
		int [] [] matriz = new int [5] [8];
		for (int i = 0; i<5; i++)
			for (int j = 0; j<5; j++)
				matriz[i] [j] = (int)(Math.random()*100)+1;
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				System.out.format ("%4d",matriz[i] [j]);
				System.out.print (" ");
			}
			System.out.println (" ");
		}
	}
}
