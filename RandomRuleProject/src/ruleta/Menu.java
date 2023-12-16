package ruleta;

public class Menu {
	
	//METODOS
    
    
    /*DIBUJO INICIAL*/
    public void dibujoini () {
		
		/*DIBUJO INICIAL*/
		System.out.println("*".repeat(120));
		System.out.println("*".repeat(120));
		System.out.println("**                                                                                                                    **");
		System.out.println("**                                                                                                                    **");
		System.out.println("**  ####       #              ####     ##     ######   ######    ####      ####   ##   ##   #####    #####     ##     **");
		System.out.println("**   ##       ###            ##  ##   ####     ##  ##   ##  ##    ##      ##  ##  ##   ##  ##   ##  ##   ##   ####    **");
		System.out.println("**   ##      ##  #          ##       ##  ##    ##  ##   ##  ##    ##     ##       ##   ##  ##   ##  #        ##  ##   **");
		System.out.println("**   ##      ##  ##         ##       ##  ##    #####    #####     ##     ##       #######  ##   ##   #####   ##  ##   **");
		System.out.println("**   ##   #  ######         ##       ######    ##       ## ##     ##     ##       ##   ##  ##   ##       ##  ######   **");
		System.out.println("**   ##  ##  ##  ##          ##  ##  ##  ##    ##       ##  ##    ##      ##  ##  ##   ##  ##   ##  ##   ##  ##  ##   **");
		System.out.println("**  #######  ##  ##           ####   ##  ##   ####     #### ##   ####      ####   ##   ##   #####    #####   ##  ##   **");
		System.out.println("**                                                                                                                    **");
		System.out.println("**                                                                                                                    **");
		System.out.println("*".repeat(120));
		System.out.println("*".repeat(120));
		System.out.println();
		System.out.println(" ".repeat(109) + "Versión 0.4");
		System.out.println();
		System.out.println();
	}
    
    /*METODO TEMPORIZADOR*/
    public static void tiempoEspera (int pausaVeces) throws InterruptedException {
		for (int i = pausaVeces; i > 0; i--) {
	          Thread.sleep(1000); // Pausa durante 1 segundo (1000 milisegundos)
	    }
	}
    
}}}
    
    
    
  //ARREGLAR LA BANCA NO PUEDE SER NEGATIVA		
	
  		do {

  			/*HACEMOS PRINT AL USUARIO DE LAS APUESTAS POSIBLES Y RECOGEMOS SU OPCION DEL 0 AL 16 POR TECLADO*/
  			OpcionesApuesta.printApuestasPosibles();

  			//Recogemos por teclado el tipo de apuesta seleccionado por el usuario (opciones 0-16)
  			int apuestaUsuario = sc.nextInt();
  			do {
  			
  				 //Preguntamos al usuario el importe a apostar
  				int cuantosNumerosApostados; //longitud de la array de lo que apostó el usuario
  				sc.nextLine();
  					
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
  					        	//Introducir el importe a apostar
  					        	System.out.println("Introduce el importe a apostar");
  								rule.setApuesta(sc.nextInt());
  								rule.setBanca(rule.banca-=rule.apuesta);
  								cuantosNumerosApostados = rule.getNumerosApostados().length;
  								rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  					        break;
  						case 1:
  							rule.setNumerosApostados(seleccion.rojo);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 2:
  							rule.setNumerosApostados(seleccion.negro);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 3:
  							rule.setNumerosApostados(seleccion.par);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 4:
  							rule.setNumerosApostados(seleccion.impar);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 5:
  							rule.setNumerosApostados(seleccion.falta);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 6:
  							rule.setNumerosApostados(seleccion.pasa);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 7:
  							rule.setNumerosApostados(seleccion.columna1);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 8:
  							rule.setNumerosApostados(seleccion.columna2);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 9:
  							rule.setNumerosApostados(seleccion.columna3);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 10:
  							rule.setNumerosApostados(seleccion.num1_12);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 11:
  							rule.setNumerosApostados(seleccion.num13_24);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 12:
  							rule.setNumerosApostados(seleccion.num25_36);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 13:
  							rule.setNumerosApostados(seleccion.sector_0);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 14:
  							rule.setNumerosApostados(seleccion.vecinos_0);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 15:
  							rule.setNumerosApostados(seleccion.huerfanos);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						case 16:
  							rule.setNumerosApostados(seleccion.serie_58);
  							System.out.println("Introduce el importe a apostar");
  							rule.setApuesta(sc.nextInt());
  							rule.setBanca(rule.banca-=rule.apuesta);
  							cuantosNumerosApostados = rule.getNumerosApostados().length;
  							rule.setApuestaFinal(rule.apuesta/cuantosNumerosApostados);
  							break;
  						default:
  						System.out.println("Introduce un número válido por favor");
  							break;
  					}
  /*NO FUNCIONA*/	
  			} while (apuestaUsuario <= 0 && apuestaUsuario >= 16); 
  			
  	
  			/*MÉTODO TIRADA*/
  			int tirada = rule.tiradaRuleta(); //Lanzamos la bolita 
  			
  			/*METODO ROJO NEGRO O 0*/
  			rule.comprobacionRojoNegro0(tirada);
  			
  			/*Otro temporizador más*//*METODO TIEMPO ESPERA*/
  			Ruleta.tiempoEspera(2);
  			
  			/*MENSAJE DE GANADOR/PERDEDOR*/ 
  			rule.ganarPerder(rule.getNumerosApostados(), tirada);
  	
  		}while (rule.banca >0);
  	}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
