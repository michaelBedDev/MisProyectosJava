package ruleta;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ruleta {

	private double banca;
	private double cantidadApuesta;
	private int tirada;
	private int [] numApostados;
	private int cuantosNumerosApostados;
	private double apuestaDividida;
	
	private Menu menu;
	private OpcionesApuesta opcionesApuesta;
	private Scanner sc;

	
	//CONSTRUCTORES

	
	Ruleta(){
		//Asignamos menu
		Menu menu = new Menu();
		this.menu = menu;
		
		menu.dibujoini();
		
		/*SET CANTIDAD INICIAL*/
		System.out.println("Cuál es su cantidad inicial introducida? en €");
		this.sc = new Scanner(System.in);
		do {
			this.setBanca(sc.nextDouble()); /*SET CANTIDAD INICIAL*/
			if (this.banca < 0)
				System.out.println("Por favor, introduce un número positivo. Inténtalo nuevamente");
		}while(this.banca < 0);
	}

   
	

	
	//METODOS
	
	public void jugar() throws InterruptedException {	

		OpcionesApuesta op = new OpcionesApuesta();
		this.opcionesApuesta = op;
		do {
			if (this.banca <= 0)
				break;
			op.printApuestasPosibles();
			
			seleccionarTipoApuesta(op);
			introducirImporteApuesta();
			
			tirarRuleta();
			comprobarTirada(this.tirada);
			
			ganarPerder(this.numApostados,this.tirada);
		}while(this.banca > 0);
	}
	
	
	
	
	
	
	
	//METODOS PRIVADOS
	
	private void mostrarSaldo() {
		/*Mostrar Saldo Actual*/
		 System.out.println("Tu banca actual es de: " + this.getBanca());
	
	}
	
	private void seleccionarTipoApuesta(OpcionesApuesta op) {
		/*Metodo seleccion 1-16*/
		int seleccion0_16;
		
		do {
			seleccion0_16 = sc.nextInt();
			sc.nextLine();
		}while (seleccion0_16 < 0 || seleccion0_16 > 16);
			
			
		/*Casos de apuesta del usuario*/
		switch (seleccion0_16) {
			case 0:
				System.out.println("Introduzca los números que desea apostar separados por comas: ");
				String entradaNumerosApostados = sc.nextLine();
				
				String[] entradaNumerosApostadosArrayString = entradaNumerosApostados.split(","); //Lo convertimos a array
		        
		        // Crear un array de int con la longitud del array string
		        int []numApostadosArrayInt = new int[entradaNumerosApostadosArrayString.length];
		        
		        // Convertir las cadenas a números enteros y almacenarlos en el array int
		        for (int i = 0; i < entradaNumerosApostadosArrayString.length; i++) {
		        	numApostadosArrayInt[i] = Integer.parseInt(entradaNumerosApostadosArrayString[i]);
		        	this.numApostados = numApostadosArrayInt;
		        }	
		        break;
		        
			case 1:
				this.numApostados = op.rojo;
				break;
			case 2:
				this.numApostados = op.negro;
				break;
			case 3:
				this.numApostados = op.par;
				break;
			case 4:
				this.numApostados = op.impar;
				break;
			case 5:
				this.numApostados = op.falta;
				break;
			case 6:
				this.numApostados = op.pasa;
				break;
			case 7:
				this.numApostados = op.columna1;
				break;
			case 8:
				this.numApostados = op.columna2;
				break;
			case 9:
				this.numApostados = op.columna3;
				break;
			case 10:
				this.numApostados = op.num1_12;
				break;
			case 11:
				this.numApostados = op.num13_24;
				break;
			case 12:
				this.numApostados = op.num25_36;
				break;
			case 13:
				this.numApostados = op.sector_0;
				break;
			case 14:
				this.numApostados = op.vecinos_0;
				break;
			case 15:
				this.numApostados = op.huerfanos;
				break;
			case 16:
				this.numApostados = op.serie_58;
				break;
			default:
				System.out.println("Introduce un número válido por favor");
				break;
		}
	}
				
	private void introducirImporteApuesta() {
		//Preguntar al usuario el importe a apostar
        System.out.println("Introduce el importe a apostar");
		int cantidadApuesta;
		 
		do {
			cantidadApuesta = sc.nextInt();
			if(cantidadApuesta > this.banca) {
			mostrarSaldo();
			System.out.println("Por favor, introduce un importe más bajo");
			}
		}while (cantidadApuesta > this.banca);
		
		this.cantidadApuesta = cantidadApuesta;
		this.banca -= this.cantidadApuesta;
		
		this.cuantosNumerosApostados = this.numApostados.length;
		
		 this.setApuestaDividida(this.cantidadApuesta/this.cuantosNumerosApostados);
	}
			
				
	

    private int tirarRuleta () throws InterruptedException {
    	//Metodo tirada ruleta
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
    private void comprobarTirada(int tirada) {
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
    	
    }
	
	
  //METODO MENSAJE GANADOR o PERDEDOR
    private void ganarPerder (int [] numerosApostados, int tirada) {
		boolean acierto = false; 
		for (int numero : numerosApostados) {
            if (numero == tirada) {
            	acierto = true; 
            }
		}
		
		
        if(acierto) {
        	System.out.println("Enhorabuena, tu apuesta ha sido ganadora.");
        	double cantidadFinal = this.getBanca() + (this.apuestaDividida*36);
            System.out.println("Tu nueva cantidad es de " + cantidadFinal);
            this.setBanca(cantidadFinal);
            System.out.println();
        }else {
        	System.out.println("Lo sentimos, no has ganado esta vez.");
        	double cantidadFinal = this.getBanca();
            System.out.println("Tu nueva cantidad es de " + cantidadFinal);
            this.setBanca(cantidadFinal);
            System.out.println();
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	


    //GETTERS AND SETTERS

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public double getBanca() {
		return banca;
	}

	public void setBanca(double banca) {
		this.banca = banca;
	}

	public double getCantidadApuesta() {
		return cantidadApuesta;
	}

	public void setCantidadApuesta(double cantidadApuesta) {
		this.cantidadApuesta = cantidadApuesta;
	}

	public int getTirada() {
		return tirada;
	}

	public void setTirada(int tirada) {
		this.tirada = tirada;
	}

	public int[] getNumApostados() {
		return numApostados;
	}

	public void setNumApostados(int[] numApostados) {
		this.numApostados = numApostados;
	}

	public OpcionesApuesta getOpcionesApuesta() {
		return opcionesApuesta;
	}

	public void setOpcionesApuesta(OpcionesApuesta opcionesApuesta) {
		this.opcionesApuesta = opcionesApuesta;
	}
	
	public int getCuantosNumerosApostados() {
		return cuantosNumerosApostados;
	}

	public void setCuantosNumerosApostados(int cuantosNumerosApostados) {
		this.cuantosNumerosApostados = cuantosNumerosApostados;
	}

	public double getApuestaDividida() {
		return apuestaDividida;
	}
	
	public void setApuestaDividida(double apuestaDividida) {
		this.apuestaDividida = apuestaDividida;
	}

}
	


