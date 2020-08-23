
public class Caballo extends Figura 
{

	public Caballo (String color, String nombre, int fila, int columna) 
	{
		super(color, nombre, fila, columna);
	}


	public boolean movimiento(int fi, int ci, int fila, int columna) 
	{
		//El caballo tiene movimiento en L
		if(((fi+1) == fila) && ((ci+2)==columna) || ((fi+1)== fila) && ((ci-2) == columna))
		{
			return (true);
		}
		if(((fi-1)==fila)&&((ci+2)==columna)||((fi-1)==fila)&&((ci-2)==columna)) 
		{
			return(true);
		}
		if(((fi+2)==fila)&&((ci+1)==columna)||((fi+2)==fila)&&((ci-1)==columna)) 
		{
			return(true);
		}
		if(((fi-2)==fila)&&((ci+1)==columna)||((fi-2)==fila)&&((ci-1)==columna)) 
		{
			return(true);
			
		}
	
		return (false);
	}



}

