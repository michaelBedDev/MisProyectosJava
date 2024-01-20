package plantillas;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Menu {

	private static Scanner sc;
	
	public void seleccionarAccion()  {
		sc = new Scanner(System.in);
		
		System.out.println("[1] ");
		System.out.println("[2] ");
		System.out.println("[3] ");
		System.out.println("[4] ");
		System.out.println("[5] ");

		int seleccion = sc.nextInt();
		sc.nextLine();
		
		switch (seleccion) {
			case 1:
				TimeUnit.SECONDS.sleep(2);
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
}
