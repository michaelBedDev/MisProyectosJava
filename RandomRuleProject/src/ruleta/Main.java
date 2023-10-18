package ruleta;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws InterruptedException {
		
		
		Ruleta rule = new Ruleta();
	
		/*MÉTODO DIBUJAR MENSAJE INICIAL*/
		Ruleta.dibujoini();
		

		//AQUI HAY UN LOOP if BANCA > 0
		while (rule.banca > 0) {
			
			Scanner sc = new Scanner(System.in); /*IMPORT SCANNER*/

			/*SET CANTIDAD INICIAL*/
			System.out.println("Cuál es su cantidad inicial introducida? en €");
			
			rule.setBanca(sc.nextDouble()); /*SET CANTIDAD INICIAL*/                                                                                        //??????????????????????
			

			/*HACEMOS PRINT AL USUARIO DE LAS APUESTAS POSIBLES Y RECOGEMOS SU OPCION DEL 1 AL 16 POR TECLADO*/
			OpcionesApuesta.printApuestasPosibles();

			//Recogemos por teclado el tipo de apuesta seleccionado por el usuario (opciones 1-16)
			int apuestaUsuario = sc.nextInt();
			int apuesta; //Preguntamos al usuario el importe a apostar
				
			OpcionesApuesta seleccion = new OpcionesApuesta();
			/*Casos de apuesta del usuario*/
			switch (apuestaUsuario) {
				case 0:
					System.out.println("Introduzca los números que desea apostar separados por comas: ");
					String entradaNumerosApostados = sc.nextLine();
					
					String[] cadenaNumerosApostados = entradaNumerosApostados.split(",");
			        
			        // Crear una matriz de enteros para almacenar los números
			        int []seleccionApuesta = new int[cadenaNumerosApostados.length];
			        
			        // Convertir las cadenas a números enteros y almacenarlos en la matriz
			        for (int i = 0; i < cadenaNumerosApostados.length; i++) {
			        	seleccionApuesta[i] = Integer.parseInt(cadenaNumerosApostados[i]);
			        	rule.setNumerosApostados(seleccionApuesta);
			        }
			        break;
				case 1:
					rule.setNumerosApostados(seleccion.rojo);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 2:
					rule.setNumerosApostados(seleccion.negro);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 3:
					rule.setNumerosApostados(seleccion.par);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 4:
					rule.setNumerosApostados(seleccion.impar);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 5:
					rule.setNumerosApostados(seleccion.falta);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 6:
					rule.setNumerosApostados(seleccion.pasa);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 7:
					rule.setNumerosApostados(seleccion.columna1);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 8:
					rule.setNumerosApostados(seleccion.columna2);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 9:
					rule.setNumerosApostados(seleccion.columna3);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 10:
					rule.setNumerosApostados(seleccion.num1_12);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 11:
					rule.setNumerosApostados(seleccion.num13_24);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 12:
					rule.setNumerosApostados(seleccion.num25_36);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 13:
					rule.setNumerosApostados(seleccion.sector_0);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 14:
					rule.setNumerosApostados(seleccion.vecinos_0);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 15:
					rule.setNumerosApostados(seleccion.huerfanos);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				case 16:
					rule.setNumerosApostados(seleccion.serie_58);
					System.out.println("Introduce el importe a apostar");
					apuesta = sc.nextInt();
					rule.setBanca(rule.banca-=apuesta);
					rule.setApuestaFinal(apuesta/rule.getNumerosApostados().length);
					break;
				default:
					System.out.println("Introduce un número válido por favor");
					break;
			}
			sc.close();
			
			
	
			/*MÉTODO TIRADA*/
			int tirada = rule.tiradaRuleta(); //Lanzamos la bolita 
			
			/*METODO ROJO NEGRO O 0*/
			Ruleta.comprobacionRojoNegro0(tirada);
			
			/*Otro temporizador más*//*METODO TIEMPO ESPERA*/
			Ruleta.tiempoEspera(2);
			
			/*MENSAJE DE GANADOR/PERDEDOR*/  
			Ruleta.ganarPerder(rule.getNumerosApostados(), rule.getBanca(), rule.getApuestaFinal(), tirada);
	    
		}
	}
}
