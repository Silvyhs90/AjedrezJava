import java.util.Scanner;

public class Table 
{
	public Figura Tablero[][]= new Figura [8][8]; 
	
	
	public void generartablero()
	{
		for(int c=0;c < Tablero[1].length;c++)
		{
			Tablero[1][c]= new Peon("negro","♟", c,1);
		
		}

	Tablero[6][0]= new Peon("blanco","♙", 6, 0);
	Tablero[6][1]= new Peon("blanco","♙", 6, 1);
	Tablero[6][2]= new Peon("blanco","♙", 6 ,2);
	Tablero[6][3]= new Peon("blanco","♙", 6 ,3);
	Tablero[6][4]= new Peon("blanco","♙", 6 ,4);
	Tablero[6][5]= new Peon("blanco","♙", 6, 5);
	Tablero[6][6]= new Peon("blanco","♙", 6 , 6);
	Tablero[6][7]= new Peon("blanco","♙",6 , 7);
	
		
	Tablero[0][2]= new Alfil("negro","♝",0, 2);
	Tablero[0][5]= new Alfil("negro","♝",0, 5);
	Tablero[7][2]= new Alfil("blanco","♗",7, 2);
	Tablero[7][5]= new Alfil("blanco","♗",7, 5);
	
	Tablero[0][0]= new Torre("negro",  "♜",0, 0);
	Tablero[0][7]= new Torre("negro",  "♜",0,7);
	Tablero[7][0]= new Torre("blanco", "♖",7,0 );
	Tablero[7][7]= new Torre("blanco", "♖",7, 7);
	
	
	Tablero[0][1]= new Caballo("negro", "♞",0, 1);
	Tablero[0][6]= new Caballo("negro", "♞",0, 6);
	Tablero[7][1]= new Caballo("blanco","♘",7, 1);
	Tablero[7][6]= new Caballo("blanco","♘", 7, 6);
	
	Tablero[0][4]= new Rey("negro","♚",0, 4);
	Tablero[0][3]= new Reina("negro","♚",0, 3);
	Tablero[7][4]= new Rey("blanco","♔",7, 4);
	Tablero[7][3]= new Reina("blanco","♔",7, 3);
	
	}

	
	public void mostrarTablero() 
	{
		System.out.println(" ");
		
		for(int f=0;f < Tablero.length;f++) 
		{
			for(int c=0;c < Tablero[0].length;c++) 
			{
				if(Tablero[f][c] != null) 
				{	System.out.print("|");
					Tablero[f][c].mostrarValor();
					System.out.print("|"); //dejo espacio luego de dibujo
				}
				else 
				{
					//si no hay pieza mostrar raya baja
					System.out.print("|☒|");	
				}
				
			}
			System.out.println(" ");
		}
	}
	public boolean moverPieza() 
	{
		int fi; int ci; int fila ; int columna;
		boolean t;
		do 
		{
			Scanner opcion = new Scanner(System.in);
			
			System.out.println(" Ingrese Fila de Origen ");
			fi = opcion.nextInt();
			System.out.println(" Ingrese Columna de Origen ");
			ci = opcion.nextInt();
			System.out.println(" Ingrese Fila de Destino ");
			fila = opcion.nextInt();
			System.out.println(" Ingrese Columna de Destino ");
			columna = opcion.nextInt();
			
		t=Tablero[fi][ci].movimiento(fi, ci, fila, columna);
		
		if(t==true) 
		{
			if(Tablero[fila][columna]==null) 
			{
				Tablero[fila][columna]=Tablero[fi][ci];
				Tablero[fi][ci]=null;
				System.out.println("Se ha movido la pieza exitosamente la pieza" + Tablero[fila][columna].color);
				
				return(true);
			}
			 if(Tablero[fila][columna]!=null)
			{
					System.out.println("Casillero Ocupado por la pieza "+ Tablero[fila][columna].nombre);

			}
			return(true);
			
		}
		
		}while(t==false);
	
		return(false);
		
	}
	

	
}
