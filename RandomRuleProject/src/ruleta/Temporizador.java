package ruleta;

public class Temporizador {

	static void tiempoEspera (int pausaVeces) throws InterruptedException {
		for (int i = pausaVeces; i > 0; i--) {
	          Thread.sleep(1000); // Pausa durante 1 segundo (1000 milisegundos)
	    }
	}
	
}
