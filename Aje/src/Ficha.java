
public class Ficha 
{
	public String color; 
	public int fila;
	public int columna;
	public String nombre;
	
	public Ficha (String color, String nombre, int fila, int columna) 
	{
		this.color=color;
		this.fila=fila;
		this.columna=columna;
		this.nombre= nombre;
		
	}
	
	public void mostrarValor() 
	{
		
		System.out.print(nombre);
	}
	
}
