package trucosCoding;

import java.util.Random;
import java.util.Scanner;


public class Menu {

	private static Scanner sc;
	
	public void seleccionarAccion()  {
		sc = new Scanner(System.in);
		
		System.out.println("[1] para dar de alta a un cientifico  ");
		System.out.println("[2] para eliminar a un cientifico     ");
		System.out.println("[3] para calcular el presupuesto anual");
		System.out.println("[4] para Imprimir Departamento");
		System.out.println("[5] para Buscar un Cientifico");

		int seleccion = sc.nextInt();
		sc.nextLine();
		
		switch (seleccion) {
			case 1:

				break;
			case 2:

				break;
			case 3:
	
				break;
			case 4:

				break;
			case 5:

				break;
			case 99:

				
		}
	}
	
	
	
	/*public Pokemon generarPokemon() {
		Random rand = new Random();
		int numAleatorio = rand.nextInt();
		
		switch(numAleatorio) {
			case 1,2,3 -> Pokemon Squirtle = new Pokemon();
			
		}
	}*/
}
