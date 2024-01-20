package plantillas;

public class ContarImpares {

	
	public static void main(String[] args) {
		
		int [] numeros = new int [6];
		int[] numerosPares = {1,2,3,4,5,6};
		int contadorPares = 0;
		
		for (int n : numerosPares) {
			if (n%2==0) {
				contadorPares++;
			}
		}
		
		System.out.println(contadorPares);
		System.out.println(numerosPares[0]);
		numerosPares[0] = 99;
		
		for (int n : numerosPares) {
			System.out.println(n);
			
		
		}
		String a = "A,AB,ABC,ABCD";
		String[] b = a.split(",");
		String c = b[0];
		System.out.println(c);
	}
	
}
