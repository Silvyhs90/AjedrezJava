
public class Rey extends Figura
{

	public Rey (String color, String nombre, int fila, int columna) 
	{
		super(color, nombre, fila, columna);
	}

	
	
	public boolean movimiento(int fi, int ci, int fila, int columna) 
	{
		//movimiento diagonal de derecha a izquiera y viseversa
		
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
				System.out.println("Se ha movido la ficha Rey a Fila "+fila + " Columna "+columna);
				return(true);
		 }
			 // movimiento horizontal
			 if((fi==fila) && ((columna>=0)))
				{
				 System.out.println(" ");
					System.out.println("Se ha movido la ficha Rey a Fila "+fila + " Columna "+columna);
					return(true);			
				}
				if((ci==columna) && ((fila>=0))) // movimiento vertical  
				{
					System.out.println(" ");
					System.out.println("Se ha movido la ficha Rey a Fila "+fila + " Columna "+columna);
					return(true);			
				}		
				return (false);
	}





	

}
