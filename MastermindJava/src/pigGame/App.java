package pigGame;

public class App {
	
	
	public static void main(String[] args) {
	

	

		Jugador jugador1 = new Jugador();
		Jugador IA = new Jugador();
	
		for(;;){
			jugador1.tirarDadoJugador();
			if (jugador1.getPuntuacionAcumulada() >= 100) {
				System.out.println("¡Enhorabuena! Has ganado.");
				break;
			}
			IA.tirarDadoIA();
			if (IA.getPuntuacionAcumulada() >= 100) {
				System.out.println("¡Enhorabuena! Has ganado.");
				break;
			}
		}
		
		System.out.println(jugador1.getPuntuacionAcumulada() > IA.getPuntuacionAcumulada() ? "Ha ganado el jugador con una puntuación de " + jugador1.getPuntuacionAcumulada(): "Ha ganado la IA con una puntuación de " + IA.getPuntuacionAcumulada());
		
		
		
		
	}
}
