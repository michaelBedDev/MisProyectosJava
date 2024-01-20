package plantillas;

public class TrucoCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota = 8;
		
		String resultado = nota<=5 ? "Suspendido" : "Aprobado";
		
		System.out.println(resultado);
		
		//LO MISMO PERO CON BOOLEAN
		boolean resultadoB = nota<=5 ? false : true;
		System.out.println(resultadoB);
		
	}

}
