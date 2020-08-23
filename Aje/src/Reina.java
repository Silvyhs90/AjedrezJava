
public class Reina extends Figura 
{

	public Reina (String color, String nombre, int fila, int columna) {
		super(color, nombre, fila, columna);
	}


	public boolean movimiento(int fi, int ci, int fila, int columna) //mismos movimientos que el rey, se puede desplazar por donde quiera 
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
			 
			 if((fi==fila) && ((columna>=0)))
				{
				 System.out.println(" ");
					System.out.println("Se ha movido la ficha Alfil a Fila "+fila + " Columna "+columna);
					return(true);			
				}
				if((ci==columna) && ((fila>=0)))  
				{
					System.out.println(" ");
					System.out.println("Se ha movido la ficha Alfil a Fila "+fila + " Columna "+columna);
					return(true);			
				}		
				return (false);
	}


	

}
