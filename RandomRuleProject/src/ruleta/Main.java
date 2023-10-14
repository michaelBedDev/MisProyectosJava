package ruleta;

public class Main {


	public static void main(String[] args) throws InterruptedException {
		
		
		Ruleta rule = new Ruleta();
		

		/*MÉTODO DIBUJAR MENSAJE INICIAL*/
		rule.dibujoprint.dibujoini(); //Print inicial

//AQUI HAY UN LOOP if BANCA > 0. QUIZAS SE DEBERIA INTRODUCIR TODO EL EL LOOP A PARTIR DE AQUI?
		/*METODO OPCIONES APUESTA*/
		rule.preguntas.apuestaQuestion(); //Preguntamos al usuario por su tipo de apuesta y cantidad
		
		//Get de las variables necesarias para calcular el retorno después de la apuesta del usuario
		Resultado resultado = rule.preguntas.apuestaQuestion();
		int[] numerosApostados = resultado.getNumerosApostados();
		double apuestaFinal = resultado.getApuestaFinal();
		float banca = resultado.getBanca();		
			
		/*MÉTODO TIRADA*/
	    rule.giro.tirada(); //Lanzamos la bolita 
			
	
		/*METODO ROJO NEGRO O 0*/
		rule.color_paridad.RojoNegro0(rule.giro.tirada());
			
			
		/*Otro temporizador más*//*METODO TIEMPO ESPERA*/
	    rule.pausa.tiempoEspera(2);
			
		/*MENSAJE DE GANADOR/PERDEDOR*/  
	    rule.mensaje.ganarPerder(numerosApostados, banca, apuestaFinal, rule.giro.tirada());
			
		
			
		}
	}

