
public class Peon extends Figura
{

	public Peon (String color, String nombre, int fila, int columna) 
	{
		super(color, nombre, fila, columna);
	}
	
	

public boolean movimiento(int fi, int ci, int fila, int columna) 
{
	if(true) 
	{
		
		super.columna= columna; 
		super.fila= fila ;
		
		System.out.println(" ");
		System.out.println("Se ha movido la ficha Peon a Fila "+ fila+ " Columna "+columna);
		return(true);
		
	}
	
	
	return(false);
}

}
