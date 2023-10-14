package ruleta;

import java.util.Scanner;

public class PreguntasApuesta {
	
	OpcionesApuesta opciones;

	double apuestaQuestion () {
		Scanner sc = new Scanner(System.in); /*IMPORT SCANNER*/

		System.out.println("Cuál es su cantidad inicial introducida? en €");
		float banca = sc.nextFloat(); /*SET CANTIDAD INICIAL*/
		
		while (banca > 0) {  /*SETEAMOS EL LOOP*/
			
			int apuestaUsuario; int cantidadApuesta; 
			
			System.out.println("A qué deseas apostar?");
			System.out.println("Número cualquiera \t [0]");
			System.out.println("Rojo \t\t[1]");
			System.out.println("Negro \t\t[2]");
			System.out.println("Par \t\t[3]");
			System.out.println("Impar \t\t[4]");
			System.out.println("Falta \t\t[5]");
			System.out.println("Pasa \t\t[6]");
			System.out.println("Columna 1 \t[7]");
			System.out.println("Columna 2 \t[8]");
			System.out.println("Columna 3 \t[9]");
			System.out.println("Docena 1-12 \t[10]");
			System.out.println("Docena 13-24 \t[11]");
			System.out.println("Docena 25-36 \t[12]");
			System.out.println("Sector del 0 \t[13]");
			System.out.println("Vecinos del 0 \t[14]");
			System.out.println("Huérfanos \t[15]");
			System.out.println("Serie 5/8 \t[16]");
			
			apuestaUsuario = sc.nextInt();
			
			int [] numerosApostados;
			int apuesta;
			
			switch (apuestaUsuario) {
				case 0:
					System.out.println("Introduzca los números que desea apostar separados por comas: ");
					String entradaNumerosApostados = sc.nextLine();
					
					String[] cadenaNumerosApostados = entradaNumerosApostados.split(",");
			        
			        // Crear una matriz de enteros para almacenar los números
			        numerosApostados = new int[cadenaNumerosApostados.length];
			        
			        // Convertir las cadenas a números enteros y almacenarlos en la matriz
			        for (int i = 0; i < cadenaNumerosApostados.length; i++) {
			        	numerosApostados[i] = Integer.parseInt(cadenaNumerosApostados[i]);
			        }
				case 1:
					numerosApostados = opciones.rojo;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					double apuestaFinal = apuesta/numerosApostados.length;
				case 2:
					numerosApostados = opciones.negro;
				case 3:
					numerosApostados = opciones.par;
				case 4:
					numerosApostados = opciones.impar;
				case 5:
					numerosApostados = opciones.falta;
				case 6:
					numerosApostados = opciones.pasa;
				case 7:
					numerosApostados = opciones.columna1;
				case 8:
					numerosApostados = opciones.columna2;
				case 9:
					numerosApostados = opciones.columna3;
				case 10:
					numerosApostados = opciones.num1_12;
				case 11:
					numerosApostados = opciones.num13_24;
				case 12:
					numerosApostados = opciones.num25_36;
				case 13:
					numerosApostados = opciones.sector_0;
				case 14:
					numerosApostados = opciones.vecinos_0;
				case 15:
					numerosApostados = opciones.huerfanos;
				case 16:
					numerosApostados = opciones.serie_58;
				default:
					System.out.println("Introduce un número válido por favor");
			}					
		}
		return banca apuestaFinal;
	}
}
