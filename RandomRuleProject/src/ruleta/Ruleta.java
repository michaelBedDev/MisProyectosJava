package ruleta;

import java.util.Scanner;

public class Ruleta {

	private EstadoJuego estado;
	private Jugador jugador;
	private Menu menu;
	private double banca;
	private double cantidadApuesta;
	private int tirada;
	private int [] numApostados;
	private Scanner sc;

	
	//CONSTRUCTORES

	Ruleta(){
		//Asignamos menu
		Menu menu = new Menu();
		this.menu = menu;
		
		menu.dibujoini();
		
		/*SET CANTIDAD INICIAL*/
		System.out.println("Cuál es su cantidad inicial introducida? en €");
		this.sc = new Scanner(System.in);
		this.setBanca(sc.nextDouble()); /*SET CANTIDAD INICIAL*/   
	}

   
	
 
	
	//METODOS
	
	/*Mostrar Saldo Actual*/
	private void mostrarSaldo() {
		 System.out.println("Tu banca actual es de: " + this.getBanca());
	
	}




    //GETTERS AND SETTERS
	public EstadoJuego getEstado() {
		return estado;
	}

	public void setEstado(EstadoJuego estado) {
		this.estado = estado;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public double getBanca() {
		return banca;
	}

	public void setBanca(double banca) {
		this.banca = banca;
	}

	public double getCantidadApuesta() {
		return cantidadApuesta;
	}

	public void setCantidadApuesta(double cantidadApuesta) {
		this.cantidadApuesta = cantidadApuesta;
	}

	public int getTirada() {
		return tirada;
	}

	public void setTirada(int tirada) {
		this.tirada = tirada;
	}

	public int[] getNumApostados() {
		return numApostados;
	}

	public void setNumApostados(int[] numApostados) {
		this.numApostados = numApostados;
	}
}
	


