package trucosCoding;

public class TrucosArrays {

	//Metodo para copiar un array a una String
		public String copiarArrayToString(char [] miLista) {
			
			String cadena = "";
			for (char c : miLista) {
				cadena += c;
			}
			
			return cadena;
		}
		
		
		//Metodo pasar de String a Array
		//La cadena y el array deben de ser de la misma longitud
		public char [] copiarStringToArray(String cadena) {
			
			char [] miLista = new char [cadena.length()];
			for (int i=0; i<cadena.length(); i++) {
				miLista[i] = cadena.charAt(i);
			}
			
			return miLista;
		}
}
