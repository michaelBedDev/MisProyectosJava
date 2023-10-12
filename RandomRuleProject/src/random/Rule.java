package random;

import java.security.SecureRandom;
import java.util.Scanner;

public class Rule {


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
			int [] rojo = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
			int [] negro = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
			int [] par = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36};
			int [] impar = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35};
			int [] falta = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
			int [] pasa = {19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
			int [] columna1 = {1,4,7,10,13,16,19,22,25,28,31,34};
			int [] columna2 = {2,5,8,11,14,17,20,23,26,29,32,35};
			int [] columna3 = {3,6,9,12,15,18,21,24,27,30,33,36};
			int [] num1_12 = {1,2,3,4,5,6,7,8,9,10,11,12};
			int [] num13_24 = {13,14,15,16,17,18,19,20,21,22,23,24};
			int [] num25_36 = {25,26,27,28,29,30,31,32,33,34,35,36};
			int [] sector_0 = {12,35,3,26,0,32,35};
			int [] vecinos_cero = {22,18,29,7,28,12,35,3,26,0,32,15,19,4,21,2,25};
			int [] huerfanos = {1,20,14,31,9,17,34,6};
			int [] serie_58 = {27,13,36,11,30,8,23,10,5,24,16,33};
			
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

