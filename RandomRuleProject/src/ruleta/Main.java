package ruleta;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws InterruptedException {
		
		
		Ruleta rule = new Ruleta(); //ARREGLAR ESTO
	
		/*MÉTODO DIBUJAR MENSAJE INICIAL*/
		Ruleta.dibujoini();
		
		
		Scanner sc = new Scanner(System.in); /*IMPORT SCANNER*/
		
		
		/*SET CANTIDAD INICIAL*/
		System.out.println("Cuál es su cantidad inicial introducida? en €");
		rule.setBanca(sc.nextDouble()); /*SET CANTIDAD INICIAL*/   
		
		
	}
}
