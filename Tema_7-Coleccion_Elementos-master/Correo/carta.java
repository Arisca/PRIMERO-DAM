package Correo;

import java.util.ArrayDeque;
import java.util.Iterator;

class carta
{
	int id;
	
	carta(int id)
	{
		this.id = id;
	}

	public String toString()
	{
		return Integer.toString(id);
	}
}