
public class Torre extends Figura 
{

	public Torre(String color, String nombre, int f, int c) 
	{
		super(color, nombre, f, c);
	}


	public boolean movimiento(int fi, int ci, int fila, int columna) 
	{
	
		if(fi==fila || ci== columna) 
		{
			System.out.println(" ");
			System.out.println("Se ha movido la ficha Torre a Fila "+fila +" Columna "+ columna);	
			return(true);
		}
		return false;
	}


	
}
