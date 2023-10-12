package random;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws InterruptedException {
		
		SecureRandom rand = new SecureRandom(); /*IMPORT RANDOM*/
		Scanner sc = new Scanner(System.in); /*IMPORT SCANNER*/
		
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
		System.out.println(" ".repeat(109) + "Versión 0.2");
		System.out.println();
		System.out.println();
		
		
		int upperbound = 37; /*NUMERO MAXIMO*/
		
		System.out.println("Cuál es su cantidad inicial introducida? en €");
		float banca = sc.nextFloat(); /*SET CANTIDAD INICIAL*/
		
		while (banca > 0) {  /*SETEAMOS EL LOOP*/
			
			int numeroapostado; int apuesta; char masNumeros;
			
			/*AÑADIMOS LOS ARRAYS Y LAS VARIABLES DE APUESTA*/
			
			
			/*añadimos numeros multiples como array y hacerpara dividir la apuesta entre el lenght de la array/*
			
			
			
			
			/*APOSTAMOS NUMERO Y CANTIDAD*/ //CAMBIAR PARA AÑADIR APUESTAS A MÁS NÚMEROS y añadir lo de las array
			//Ajustar para que la apuesta actual no pueda superar a la banca
			do {
				System.out.println("A qué número quieres apostarle? Selecciona número/s separados por comas.");
				System.out.println("Número/s: ");
				numeroapostado = sc.nextInt();
				System.out.println("Cantidad: ");
				apuesta = sc.nextInt();
				System.out.println("Deseas añadir más números? Pulsa S/N"); //CAMBIAR ESTO
				masNumeros = sc.next().charAt(0);
				
			}
			while ((masNumeros != 'N') & (apuesta <= banca));
			System.out.println();
			
			
			/*APLICAMOS UNA PAUSA EN SEGUNDOS*/
			System.out.println("No va más");
			int pausaVeces = 4;
			//ARRAY PARA IMPRIMIR MENSAJE POR PANTALLA
	        String[] lanzamientoBola = {"","Lanzamos la bolita","Gira, gira","AY ESE REBOTE"};
	        for (int i = pausaVeces; i > 0; i--) {
	        	System.out.println(lanzamientoBola[pausaVeces - i]); // Muestra el mensaje correspondiente
	            Thread.sleep(2000); // Pausa durante 2 segundo (2000 milisegundos)
	            }
	        
	        System.out.println();
			
	
	        /*NUMERO RANDOM*/
			int tirada = rand.nextInt(upperbound);
			
			/*CUALIDADES DE LA TIRADA*/
			String tiradaParidad = null;
			String tiradaPasaFalta = null;
			String tiradaRojoNegro = null;
			
			/*APLICAMOS ATRIBUTOS*/
			tiradaParidad = (tirada%2 == 0) ? "Par" : "Impar";
			tiradaPasaFalta = (tirada >= 19) ? "Pasa" : "Falta";
			
			/*TIRADA ROJO NEGRO O "0"*/
			if(tirada == 0) {
				System.out.println("Ha salido el " + tirada);
			}else if((tirada%2 ==0) && ((tirada>=1 && tirada <= 10) || (tirada>=19 && tirada<=28))) {
				tiradaRojoNegro = "Rojo";
				System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
			}else if ((tirada%2 ==1) && ((tirada>=1 && tirada <= 10) || (tirada>=19 && tirada<=28))) {
				tiradaRojoNegro = "Negro";
				System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
			}else if ((tirada%2 ==0) && ((tirada>=11 && tirada <= 18) || (tirada>=29 && tirada<=36))) {
				tiradaRojoNegro = "Negro";
				System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
			}else if ((tirada%2 ==1) && ((tirada>=11 && tirada <= 18) || (tirada>=29 && tirada<=36))) {
				tiradaRojoNegro = "Rojo";
				System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
			}	
			
			System.out.println();
			
			
			//Otro temporizador más
			 for (int i = pausaVeces; i > 0; i--) {
		            Thread.sleep(1000); // Pausa durante 1 segundo (1000 milisegundos)
		            }
			
			/*MENSAJE DE GANADOR/PERDEDOR*/  //AJUSTAR PARA NUEVOS TIPOS DE APUESTA
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
}

