package ruleta;

public class OpcionesApuesta {

	int [] rojo = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
	int [] negro = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
	int [] par = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36};
	int [] impar = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35};
	int [] falta = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
	int [] pasa = {19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
	int [] columna1 = {1,4,7,10,13,16,19,22,25,28,31,34};
	int [] columna2 = {2,5,8,11,14,17,20,23,26,29,32,35};
	int [] columna3 = {3,6,9,12,15,18,21,24,27,30,33,36};
	int [] num1_12 = {1,2,3,4,5,6,7,8,9,10,11,12};
	int [] num13_24 = {13,14,15,16,17,18,19,20,21,22,23,24};
	int [] num25_36 = {25,26,27,28,29,30,31,32,33,34,35,36};
	int [] sector_0 = {12,35,3,26,0,32,35};
	int [] vecinos_0 = {22,18,29,7,28,12,35,3,26,0,32,15,19,4,21,2,25};
	int [] huerfanos = {1,20,14,31,9,17,34,6};
	int [] serie_58 = {27,13,36,11,30,8,23,10,5,24,16,33};
	
	void printApuestasPosibles () {
		System.out.println("A qué deseas apostar?");
		System.out.println("Número cualquiera \t [0]");
		System.out.println("Rojo \t\t[1]");
		System.out.println("Negro \t\t[2]");
		System.out.println("Par \t\t[3]");
		System.out.println("Impar \t\t[4]");
		System.out.println("Falta \t\t[5]");
		System.out.println("Pasa \t\t[6]");
		System.out.println("Columna 1 \t[7]");
		System.out.println("Columna 2 \t[8]");
		System.out.println("Columna 3 \t[9]");
		System.out.println("Docena 1-12 \t[10]");
		System.out.println("Docena 13-24 \t[11]");
		System.out.println("Docena 25-36 \t[12]");
		System.out.println("Sector del 0 \t[13]");
		System.out.println("Vecinos del 0 \t[14]");
		System.out.println("Huérfanos \t[15]");
		System.out.println("Serie 5/8 \t[16]");
	}
	
}
