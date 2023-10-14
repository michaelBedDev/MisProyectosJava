package ruleta;

import java.security.SecureRandom;

public class GiroRuleta {

	int giroRule (int pausaVeces) throws InterruptedException {
		
		SecureRandom rand = new SecureRandom(); /*IMPORT RANDOM*/
		/*APLICAMOS UNA PAUSA EN SEGUNDOS*/
		System.out.println("No va más");
		
		//ARRAY PARA IMPRIMIR MENSAJE POR PANTALLA
        String[] lanzamientoBola = {"","Lanzamos la bolita","Gira, gira","AY ESE REBOTE"};
        for (int i = pausaVeces; i > 0; i--) {
        	System.out.println(lanzamientoBola[pausaVeces - i]); // Muestra el mensaje correspondiente
            Thread.sleep(2000); // Pausa durante 2 segundo (2000 milisegundos)
            }
        
        System.out.println();
		

        /*NUMERO RANDOM*/
        int upperbound = 37; /*NUMERO MAXIMO*/
		int tirada = rand.nextInt(upperbound);
		return tirada;
	}
}
