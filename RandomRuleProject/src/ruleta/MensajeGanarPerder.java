package ruleta;

public class MensajeGanarPerder {

	static void ganarPerder (int [] numerosApostados, float banca, double apuestaFinal, int tirada) {
		
		
		for (int elemento : numerosApostados) {
            if (elemento == tirada) {
                System.out.println("Enhorabuena, tu apuesta ha sido ganadora.");
                System.out.println("Tu nueva cantidad es de " + (banca+apuestaFinal*36));   
            }else {
            	System.out.println("Lo sentimos, no has ganado esta vez.");
            	System.out.println("Tu nueva cantidad es de " + banca);
            }
        }
		
	}
}
