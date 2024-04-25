package Hanoi;
import java.util.*;

public class Torre {
	private ArrayList<Disco> palito;
	
	public Torre()
	{
		palito=new ArrayList<>();
	}
	
	public Disco cima()
	{ 	if (palito.isEmpty()) 
			return null;
		else
		
			return palito.get(palito.size()-1);
	}
	
	public void agregarDisco(Disco NuevoDisco)
	{
		if (palito.isEmpty() || NuevoDisco.getTamano()<=cima().getTamano())
		{
			palito.add(NuevoDisco);
		}
		else
		{
			System.out.println("No se puede introducir el disco por ser mas grande.");
		}
	}
	
	public Disco quitarDisco()
	{
		if (!palito.isEmpty())
		{
			return palito.remove(palito.size()-1);
		}
		else
		{
			return null;
		}
	}
	
	public ArrayList<Disco> getTorre()
	{
		return  palito;
	}
	    
	
	
}
