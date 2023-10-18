package ruleta;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ruleta {

	OpcionesApuesta opciones;
	int [] numerosApostados;
	double apuestaFinal;
	double banca;


    //DIBUJO INICIAL
    static void dibujoini () {
		
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
	
    
    //METODO LANZAR LA BOLA RULETA
    int tiradaRuleta () throws InterruptedException {
		
		/*NUMERO RANDOM*/
		SecureRandom rand = new SecureRandom(); /*IMPORT RANDOM*/
        int upperbound = 37; /*NUMERO MAXIMO*/
		int tirada = rand.nextInt(upperbound);
		
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
		return tirada;
    }
	
    
    
    //COMPROBACIÓN ROJO NEGRO / PAR IMPAR / FALTA PASA
    static void comprobacionRojoNegro0(int tirada) {
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
    }
    
    
    //METODO TEMPORIZADOR
    static void tiempoEspera (int pausaVeces) throws InterruptedException {
		for (int i = pausaVeces; i > 0; i--) {
	          Thread.sleep(1000); // Pausa durante 1 segundo (1000 milisegundos)
	    }
	}
    
    
    //METODO MENSAJE GANADOR o PERDEDOR
    static void ganarPerder (int [] numerosApostados, double banca, double apuestaFinal, int tirada) {
		
		for (int elemento : numerosApostados) {
            if (elemento == tirada) {
                System.out.println("Enhorabuena, tu apuesta ha sido ganadora.");
                System.out.println("Tu nueva cantidad es de " + (banca+apuestaFinal*36));   
            }else {
            	System.out.println("Lo sentimos, no has ganado esta vez.");
            	System.out.println("Tu nueva cantidad es de " + banca);
            }
        }
    }
    
    
    //GETTERS AND SETTERS
	public int[] getNumerosApostados() {
		return numerosApostados;
	}
	public void setNumerosApostados(int[] numerosApostados) {
		this.numerosApostados = numerosApostados;
	}
	public double getApuestaFinal() {
		return apuestaFinal;
	}
	public void setApuestaFinal(double apuestaFinal) {
		this.apuestaFinal = apuestaFinal;
	}
	public double getBanca() {
		return banca;
	}
	public void setBanca(double banca) {
		this.banca = banca;
	}

		
	
}

