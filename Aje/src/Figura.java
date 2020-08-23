public abstract class Figura extends Ficha // si hago el metodo abstracto la clase tb tiene que ser abstract y figura hereda de ficha
{
	

	public Figura(String color, String nombre, int fila, int columna) 
	{
		super(color,nombre, fila, columna);
	
	}

	public abstract boolean movimiento(int fi, int ci, int fila, int columna); 
	//Metodo abstracto

}
