public class Alfil extends Figura //las fichas heredan de figura
{

	public Alfil (String color, String nombre, int fila, int columna) 
	{
		super(color, nombre, fila, columna);
	}


	public boolean movimiento(int fi, int ci, int fila, int columna) // si dos casillas estan en la misma diagonal de izquierda a derecha 
	//c1 – f1 == c2 – f2 o de derecha a izquierda c1 + f1 == c2 + f2
	{
	
		 if((fi!=fila) && (ci!=columna))
	  {
			int col,fil;
			 
			if(ci < columna) 
			{
					col=columna-ci;
			}
			else 
			{
				col=ci-columna;
			}
			
			if(fi < fila) 
			{
					fil=fila-fi;
			}
			else
			{
			fil=fi-fila;
			}
				
			if(fil==col) 
			{
				
			}
			System.out.println(" ");
			System.out.println("Se ha movido la ficha Alfil a Fila "+fila + " Columna "+columna);
			return(true);
	}
		 if((fi!=fila) && (ci!=columna))
	  {
			int col,fil;
			 
			if(ci > columna) 
			{
					col=columna+ci;
			}
			else 
			{
				col=ci+columna;
			}
			
			if(fi > fila) 
			{
					fil=fila+fi;
			}
			else
			{
			fil=fi+fila;
			}
				
			if(fil==col) 
			{
				
			}
			System.out.println(" ");
			System.out.println("Se ha movido la ficha Alfil a Fila "+fila + " Columna "+columna);
			return(true);
	}
			return (false);
	}


	

}
