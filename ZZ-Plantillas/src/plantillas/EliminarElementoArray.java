package plantillas;

import java.util.Scanner;



public class EliminarElementoArray {

	public void eliminarCientifico(Cientifico [] listaCientificos) throws InterruptedException {
		System.out.println("Introduce el nombre del cientifico a eliminar: ");
		sc = new Scanner(System.in);
		String cientificoToDelete = sc.nextLine();
		int posicionCientifico = 0;
		for (Cientifico c : listaCientificos) {
			if (c!=null) {
				if (c.getNombre().equals(cientificoToDelete)){
					listaCientificos [posicionCientifico] = null;
					
					c.setNombre("");
					c.setApellidos("");
					c.setExp(null);
					c.setYearsTrabajados(0);
					c.setInvestigacionAsignada(null);
					
					Menu.barraCargando();
					System.out.println("Cientifico eliminado correctamente");
				}
				posicionCientifico++;
			}
		}
	}
	
}
