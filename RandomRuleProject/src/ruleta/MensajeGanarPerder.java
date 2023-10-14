package ruleta;

public class MensajeGanarPerder {

	void ganarPerder (int tirada, int numeroapostado, float banca, float apuesta) {
		
		if (numeroapostado == tirada) {
			banca += 35*apuesta; //CAMBIAR
			System.out.println("Has Ganado! Tu nueva cantidad es: " + banca + "€");
		}else if(numeroapostado != tirada) {
			banca -= apuesta;
			System.out.println("Has Perdido esta vez. Tu nueva cantidad es: " + banca + "€");
		}
		System.out.println();
		
	}
}
