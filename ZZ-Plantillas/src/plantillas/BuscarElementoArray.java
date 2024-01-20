package plantillas;

import java.util.Scanner;


public class BuscarElementoArray {
	public void buscarCientifico(Cientifico [] listaCientificos) {
		System.out.println("Introduce el nombre del cientifico a buscar: ");
		sc = new Scanner(System.in);
		String cientificoToSearch = sc.nextLine();

		for (Cientifico c : listaCientificos) {
			if (c!=null) {
				if (c.getNombre().equals(cientificoToSearch)){
					System.out.println(c);
				}
			}
		}
	}
}
