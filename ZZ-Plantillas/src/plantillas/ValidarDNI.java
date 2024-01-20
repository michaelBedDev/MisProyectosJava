package plantillas;

public class ValidarDNI {
	
	//METODO VALIDAR DNI
		private static boolean validarDNI(String dni) {
			
			//Comprobamos longitud del DNI
			if (dni.length() !=9) {
				System.out.println("Longitud equivocada, inténtelo de nuevo");
				return false;
			}
			//Comprobamos que los 8 primeros dígitos sean números
			for(int i=0; i<8;i++) {
				if (!Character.isDigit(dni.charAt(i))) {
					System.out.println("Los 8 primeros caracteres no son números, inténtelo de nuevo");
					return false;
				}
			}
			//Comprobamos que el último número sea una letra
			if(!Character.isLetter(dni.charAt(8))) {
				System.out.println("El último caracter no es una letra, inténtelo de nuevo");
				return false;
			}

			//Comprobamos que la letra introducida sea correcta
			return comprobarLetraDNI(dni);
		}
		
		//METODO VALIDAR LETRA DNI
		private static boolean comprobarLetraDNI(String dni) {
			int numDNI = Integer.parseInt(dni.substring(0,8)); //Extraemos el numero de DNI
			numDNI %= 23; //Dividimos entre 23 para saber la letra
			String letraDNI = switch (numDNI) {
				case 0 -> "T";
				case 1 -> "R";
				case 2 -> "W";
				case 3 -> "A";
				case 4 -> "G";
				case 5 -> "M";
				case 6 -> "Y";
				case 7 -> "F";
				case 8 -> "P";
				case 9 -> "D";
				case 10 -> "X";
				case 11 -> "B";
				case 12 -> "N";
				case 13 -> "J";
				case 14 -> "Z";
				case 15 -> "S";
				case 16 -> "Q";
				case 17 -> "V";
				case 18 -> "H";
				case 19 -> "L";
				case 20 -> "C";
				case 21 -> "K";
				case 22 -> "E";
				default -> ("Unexpected value: " + numDNI);
			};
			
			//Comprobamos si la letra resultante equivale a la letra introducida
				if (letraDNI.equals(Character.toString(dni.charAt(8)))) 
					return true;
				else 
					System.out.println("Letra equivocada, inténtelo de nuevo");
					return false;
			}
}
