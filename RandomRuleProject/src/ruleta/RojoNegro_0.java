package ruleta;

public class RojoNegro_0 {

	static void RojoNegro0(int tirada) {
		/*CUALIDADES DE LA TIRADA*/
		String tiradaParidad = null;
		String tiradaPasaFalta = null;
		String tiradaRojoNegro = null;
		
		/*APLICAMOS ATRIBUTOS*/
		tiradaParidad = (tirada%2 == 0) ? "Par" : "Impar";
		tiradaPasaFalta = (tirada >= 19) ? "Pasa" : "Falta";
		
		/*TIRADA ROJO NEGRO O "0"*/
		if(tirada == 0) {
			System.out.println("Ha salido el " + tirada);
		}else if((tirada%2 ==0) && ((tirada>=1 && tirada <= 10) || (tirada>=19 && tirada<=28))) {
			tiradaRojoNegro = "Rojo";
			System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
		}else if ((tirada%2 ==1) && ((tirada>=1 && tirada <= 10) || (tirada>=19 && tirada<=28))) {
			tiradaRojoNegro = "Negro";
			System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
		}else if ((tirada%2 ==0) && ((tirada>=11 && tirada <= 18) || (tirada>=29 && tirada<=36))) {
			tiradaRojoNegro = "Negro";
			System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
		}else if ((tirada%2 ==1) && ((tirada>=11 && tirada <= 18) || (tirada>=29 && tirada<=36))) {
			tiradaRojoNegro = "Rojo";
			System.out.printf("%d, %S, %S y %S" ,tirada, tiradaRojoNegro, tiradaParidad, tiradaPasaFalta);
		}	
		
		System.out.println();
	}
}
