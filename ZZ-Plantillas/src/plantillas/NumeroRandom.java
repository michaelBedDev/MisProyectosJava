package plantillas;

import java.util.Random;

public class NumeroRandom {

	//Metodo generarTelefono
		public static long generarTelefono() {
			Random rand = new Random();
			long telefono = rand.nextLong(600000000,699999999);
			return telefono;
		}
}
