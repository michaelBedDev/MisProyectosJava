package ruleta;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ruleta {

	private OpcionesApuesta opciones;
	private int [] numerosApostados;
	private double apuestaFinal;
	double apuesta;
	double banca = 1;

	
	//CONSTRUCTORES

	

   
	
 
	
    
    
    
    
    
    

    
    
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
	public OpcionesApuesta getOpciones() {
		return opciones;
	}
	public void setOpciones(OpcionesApuesta opciones) {
		this.opciones = opciones;
		
	}
	public double getApuesta() {
		return apuesta;
	}
	public void setApuesta(double apuesta) {
		this.apuesta = apuesta;
	}
	
}

