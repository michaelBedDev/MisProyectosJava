package ruleta;

import java.security.SecureRandom;

public class Ruleta {

	OpcionesApuesta opcionesApuesta;
	Dibujo dibujoprint;
	GiroRuleta giro;
	Temporizador pausa;
	
	void tirada () throws InterruptedException {
		
		
		
		/*NUMERO RANDOM*/
		SecureRandom rand = new SecureRandom(); /*IMPORT RANDOM*/
        int upperbound = 37; /*NUMERO MAXIMO*/
		int tirada = rand.nextInt(upperbound);
		
		/*APLICAMOS UNA PAUSA EN SEGUNDOS*/
		System.out.println("No va más");
		int pausaVeces = 4;
		
		
		//ARRAY PARA IMPRIMIR MENSAJE POR PANTALLA
        String[] lanzamientoBola = {"","Lanzamos la bolita","Gira, gira","AY ESE REBOTE"};
        for (int i = pausaVeces; i > 0; i--) {
        	System.out.println(lanzamientoBola[pausaVeces - i]); // Muestra el mensaje correspondiente
            Thread.sleep(2000); // Pausa durante 2 segundo (2000 milisegundos)
            }
        
        System.out.println();
	}
}
