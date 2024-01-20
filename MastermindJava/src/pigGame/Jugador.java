package pigGame;

import java.util.Random;
import java.util.Scanner;

public class Jugador {

	private int puntuacionRonda = 0;
	private int puntuacionAcumulada = 0;
	private Scanner sc;
	
	
	public void tirarDadoJugador() {
		
		Random dado = new Random();
		sc = new Scanner(System.in);
		char pregunta;
		
		
		do {
			int tiradaDado = dado.nextInt(1,7);
			
			if (tiradaDado == 1) {
				this.puntuacionRonda = 0;
				System.out.println("Oh no, ha salido el 1. Tu puntuación acumulada es " + this.puntuacionAcumulada);
				break;
			}
			
			System.out.println("Ha salido el " + tiradaDado);
			this.puntuacionRonda += tiradaDado;
			
			System.out.println("Quieres volver a tirar el dado? [S/N]");
			pregunta = sc.next().toUpperCase().charAt(0);
		
		} while (pregunta == 'S');
		
		System.out.printf("Has acumulado %d puntos en esta ronda \n", this.puntuacionRonda);
		this.puntuacionAcumulada += this.puntuacionRonda;
		System.out.println("Tu puntuación acumulada es de " + this.puntuacionAcumulada);
		this.puntuacionRonda = 0;
		System.out.println();
	}

	
	public void tirarDadoIA() {
		Random dado = new Random();
		
		Random randIA = new Random();
		int numVecesIA = randIA.nextInt(1,5); //minimo 1 tirada máximo 4
		
		for(int i=1; i<=numVecesIA; i++) {
			int tiradaDado = dado.nextInt(1,7);
			if (tiradaDado == 1) {
				this.puntuacionRonda = 0;
				System.out.println("Oh no, ha salido el 1. La puntuación acumulada de la IA es " + this.puntuacionAcumulada);
				break;
			}
		
			System.out.println("Ha salido el " + tiradaDado);
			this.puntuacionRonda += tiradaDado;
		
		}
		
		System.out.printf("La IA ha acumulado %d puntos en esta ronda \n", this.puntuacionRonda);
		this.puntuacionAcumulada += this.puntuacionRonda;
		System.out.println("La puntuación acumulada de la IA es de " + this.puntuacionAcumulada);
		this.puntuacionRonda = 0;
		System.out.println();
	}
	
	
	
	//GETTERS & SETTERS
	public int getPuntuacionRonda() {
		return puntuacionRonda;
	}

	public void setPuntuacionRonda(int puntuacionRonda) {
		this.puntuacionRonda = puntuacionRonda;
	}

	public int getPuntuacionAcumulada() {
		return puntuacionAcumulada;
	}

	public void setPuntuacionAcumulada(int puntuacionAcumulada) {
		this.puntuacionAcumulada = puntuacionAcumulada;
	}
}
