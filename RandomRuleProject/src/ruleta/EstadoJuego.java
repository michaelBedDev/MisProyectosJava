package ruleta;

import java.security.SecureRandom;

public class EstadoJuego {

	
	
	
	
	
	
	//HACER RETURN DE TIRADA BANCA Y ARRAY NUM APOSTADOS
	
	
	
	public EstadoJuego calcularEstadoJuego(Ruleta rule) {
		return null;
		
	}
}




//COMPROBACIÓN ROJO NEGRO / PAR IMPAR / FALTA PASA
void comprobacionRojoNegro0(int tirada) {
	/*CUALIDADES DE LA TIRADA*/
	String tiradaParidad;
	String tiradaPasaFalta;
	String tiradaRojoNegro;
	
	/*APLICAMOS ATRIBUTOS*/
	tiradaParidad = (tirada%2 == 0) ? "Par" : "Impar";
	tiradaPasaFalta = (tirada >= 19) ? "Pasa" : "Falta";
	
	/*TIRADA ROJO NEGRO O "0"*/
	if(tirada == 0) {
		System.out.println("Ha salido el " + tirada);
	}else if((tirada%2 ==0) && ((tirada>=1 && tirada <= 10) || (tirada>=19 && tirada<=28))) {
		tiradaRojoNegro = "Negro";
		System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
	}else if ((tirada%2 ==1) && ((tirada>=1 && tirada <= 10) || (tirada>=19 && tirada<=28))) {
		tiradaRojoNegro = "Rojo";
		System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
	}else if ((tirada%2 ==0) && ((tirada>=11 && tirada <= 18) || (tirada>=29 && tirada<=36))) {
		tiradaRojoNegro = "Rojo";
		System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
	}else if ((tirada%2 ==1) && ((tirada>=11 && tirada <= 18) || (tirada>=29 && tirada<=36))) {
		tiradaRojoNegro = "Negro";
		System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
	}	
	
	System.out.println();
	
	
	
	
	
    
    //METODO MENSAJE GANADOR o PERDEDOR
    void ganarPerder (int [] numerosApostados, int tirada) {
		int tiradaFinal= 99; //Si tirada aparece dentro del array de numeros apostados tiradaFinal == elemento, si no, la tirada será un numero imposible como 99
		for (int numero : numerosApostados) {
            if (numero == tirada) {
            	tiradaFinal = numero; 
            }else {   
            }
		}
		//si la tirada es 99 quiere decir que la la tirada no está dentro de tus números apostados y que has perdido. 
        if(tiradaFinal!=99) {
        	System.out.println("Enhorabuena, tu apuesta ha sido ganadora.");
        	double elemento = this.getBanca() + (this.apuestaFinal*36);
            System.out.println("Tu nueva cantidad es de " + elemento);
            this.setBanca(elemento);
            System.out.println();
        }else {
        	System.out.println("Lo sentimos, no has ganado esta vez.");
        	double elemento = this.getBanca();
            System.out.println("Tu nueva cantidad es de " + elemento);
            this.setBanca(elemento);
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