import javax.swing.JOptionPane;

public class Jugador 
{

	public Ficha color; // color de la pieza, blanco o negro
	public String nom; 
	public Table Tablero;
	
	// constructor del jugador
	
	public Jugador(String nom,Ficha color,Table tablero) 
	{
		this.nom=nom=JOptionPane.showInputDialog(null,"Ingrese Nombre: ");
		this.color=color;
		this.Tablero=tablero;
	}
	
	
	
}
