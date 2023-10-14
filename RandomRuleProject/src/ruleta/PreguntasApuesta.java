package ruleta;

import java.util.Scanner;

public class PreguntasApuesta {
	
	OpcionesApuesta opciones;
	
	public Resultado apuestaQuestion () { /*CORREGIR EL TIPO DE DATO DEL QUE QUEREMOS RETURN*/
		Scanner sc = new Scanner(System.in); /*IMPORT SCANNER*/

		System.out.println("Cuál es su cantidad inicial introducida? en €");
		float banca = sc.nextFloat(); /*SET CANTIDAD INICIAL*/
		int [] numerosApostados;
		int apuesta;
		double apuestaFinal;
		/*NECESITAMOS RETURN DE NUMEROS APOSTADOS, APUESTA Y BANCA*/
		
		if (banca > 0) {  /*SETEAMOS EL LOOP*/ /*ARREGLAR EL LOOP*/
			
			/*HACEMOS PRINT AL USUARIO DE LAS APUESTAS POSIBLES Y RECOGEMOS SU OPCION DEL 1 AL 16 POR TECLADO*/
			int apuestaUsuario; 
			
			OpcionesApuesta print = new OpcionesApuesta(); //Instanciamos la variable con un nuevo objeto para hacer print
			print.printApuestasPosibles();

			//Recogemos por teclado el tipo de apuesta seleccionado por el usuario
			apuestaUsuario = sc.nextInt();
			
			/*Casos de apuesta del usuario*/
			
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
					apuestaFinal = apuesta/numerosApostados.length;
				case 2:
					numerosApostados = opciones.negro;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 3:
					numerosApostados = opciones.par;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 4:
					numerosApostados = opciones.impar;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 5:
					numerosApostados = opciones.falta;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 6:
					numerosApostados = opciones.pasa;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 7:
					numerosApostados = opciones.columna1;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 8:
					numerosApostados = opciones.columna2;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 9:
					numerosApostados = opciones.columna3;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 10:
					numerosApostados = opciones.num1_12;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 11:
					numerosApostados = opciones.num13_24;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 12:
					numerosApostados = opciones.num25_36;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 13:
					numerosApostados = opciones.sector_0;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 14:
					numerosApostados = opciones.vecinos_0;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 15:
					numerosApostados = opciones.huerfanos;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				case 16:
					numerosApostados = opciones.serie_58;
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					banca =- apuesta;
					apuestaFinal = apuesta/numerosApostados.length;
				default:
					System.out.println("Introduce un número válido por favor");
			}					
		}
		return new Resultado(numerosApostados, apuestaFinal, banca); //ARREGLAR ESTO
	
	}
	
}
