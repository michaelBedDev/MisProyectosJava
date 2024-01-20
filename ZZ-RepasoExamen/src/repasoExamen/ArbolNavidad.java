package repasoExamen;

public class ArbolNavidad {

    public static void main(String[] args) {
        dibujarArbol();
        mostrarMensaje();
        System.out.println();
        mostrarMensajeDam();
        
    }

    private static void dibujarArbol() {
        int altura = 6;

        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            // la condicion 2 * i + 1 determina el numero de estrellas que se impriman x linea
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
            esperar(500);
        }

        for (int i = 0; i < altura - 1; i++) {
            System.out.print(" ");
        }

        System.out.println("|||");
    }
    
    private static void mostrarMensaje() {
    	String navidad = "Feliz Navidad!";
    	char letra;
    	for(int i=0;i<navidad.length();i++) {
    		letra=navidad.charAt(i);
    		System.out.print(letra);
    		esperar(500);
    		
    		
    		
    	}
    	
    }
    
    private static void mostrarMensajeDam() {
    	String navidad = "*1ºDAM*";
    	char letra;
    	for(int i=0;i<navidad.length();i++) {
    		letra=navidad.charAt(i);
    		System.out.print(letra);
    		esperar(500);
    		
    		
    		
    	}
    	
    }

    private static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}