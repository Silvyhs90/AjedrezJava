public class Ajedrez  // controla la logica del juego 
{

	public static void main(String[] args) 
	{
		Table t1 = new Table();
		
		t1.generartablero();
		t1.mostrarTablero();
		
		Ficha f1 = new Ficha(" Blanco", null, 0, 0);
		Ficha f2 = new Ficha(" Negro", null, 0, 0);
		
		
		Jugador j1= new Jugador("Jugador1 ",f1, t1);
		t1.moverPieza();
		t1.mostrarTablero();
		
		
		Jugador j2= new Jugador("Jugador2 ",f2, t1);
		t1.moverPieza();
		t1.mostrarTablero();
	
	
		
		//falta armar una estructura de repeticion para que juegue el jugador 1 , despues el 2 y asi sucesivamente.
		// armar el verificado de piezas si estan ok y el movimiento comer (que deberia ser algo parecido al de borrar de la agenda, si "como" esa pieza se deberia borrar.
		

		
		
			
		
		
		
	}

}
