package hangman;

import java.util.Scanner;

public class Ahorcao {
	private static final String[] words = {"perro", "gato", "casa", "jardín", "felicidad", "tristeza", "montaña", "playa", "computadora", "ventana", "amistad", "libro", "avión", "estrella", "café", "silla", "felicidad", "trabajo", "sueño", "música", "familia", "bosque", "río", "cielo", "sol", "luna", "estudiante", "profesor", "teléfono", "chocolate", "tierra", "agua", "fuego", "aire", "pelota", "amor", "odio", "arte", "película", "foto", "pizza", "reloj", "calle", "puente", "tren", "pintura", "feliz", "triste", "corazón", "alma", "felicidad", "tristeza", "viaje", "zapatos", "bolsa", "risa", "llanto", "flor", "viaje", "mariposa", "pájaro", "computadora", "red", "playa", "océano", "palabra", "silencio", "pintura", "escultura", "abrazo", "beso", "vino", "cerveza", "fiesta", "viaje", "sueño", "despertar", "esperanza", "cambio", "aventura", "risas", "travesura", "color", "blanco", "negro", "rojo", "azul", "verde", "amarillo", "naranja", "rosa", "gris", "morado", "comida", "fruta", "vegetal", "carne", "postre", "dulce", "salado", "calor", "frío", "invierno", "verano", "otoño", "primavera", "viento", "tormenta", "arcoíris", "montaña", "valle", "desierto", "ciudad", "campo", "tecnología", "innovación", "progreso", "retroceso", "historia", "futuro", "pasado", "presente", "moda", "diseño", "fotografía", "fotógrafo", "fotografía", "arquitectura", "edificio", "puerta", "ventana", "piso", "techo", "pared", "viaje", "destino", "maleta", "carretera", "camino", "aventura", "explorar", "descubrir", "misterio", "magia", "ciencia", "investigación", "experimento", "descubrimiento", "conocimiento", "sabiduría", "educación", "aprendizaje", "escuela", "profesor", "alumno", "pizarra", "tiza", "libro", "lectura", "escritura", "poesía", "novela", "verso", "prosa", "teatro", "actuación", "escenario", "película", "director", "actor", "actriz", "cámara", "sonido", "música", "ritmo", "melodía", "instrumento", "pintura", "cuadro", "artista", "galería", "exposición", "museo", "escultura", "estatua", "forma", "textura", "color", "lienzo", "almohada", "sábana", "manta", "sueño", "despertar", "insomnio", "descanso", "siesta", "energía", "café", "taza"};
	   private static String word = words[(int) (Math.random() * words.length)];
	    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Escribe una letra o una palabra");
            System.out.println(asterisk);
            String guess = sc.next();
            if (guess.length() > 1) {
                if (guess.equals(word)) {
                    System.out.println("Correcto! Has ganado! La palabra era " + word);
                    return;
                } else {
                    count++;
                    hangmanImage();
                }
            } else {
                hang(guess);
            }
        }
        sc.close();
    }

	    public static void hang(String guess) {
	        String newasterisk = "";
	        for (int i = 0; i < word.length(); i++) {
	            if (word.charAt(i) == guess.charAt(0)) {
	                newasterisk += guess.charAt(0);
	            } else if (asterisk.charAt(i) != '*') {
	                newasterisk += word.charAt(i);
	            } else {
	                newasterisk += "*";
	            }
	        }

	        if (asterisk.equals(newasterisk)) {
	            count++;
	            hangmanImage();
	        } else {
	            asterisk = newasterisk;
	        }
	        if (asterisk.equals(word)) {
	            System.out.println("Correcto! Has ganado! La palabra era " + word);
	        }
	    }

	    public static void hangmanImage() {
	        if (count == 1) {
	            System.out.println("Wrong guess, try again");
	            System.out.println("  __\n");
	        }
	        if (count == 2) {
	            System.out.println("Wrong guess, try again");
	            System.out.println("  __\n |\n |\n |\n |\n_|___\n");
	        }
	        if (count == 3) {
	            System.out.println("Wrong guess, try again");
	            System.out.println("  ____\n |\n |\n |\n |\n_|___\n");
	        }
	        if (count == 4) {
	            System.out.println("Wrong guess, try again");
	            System.out.println("  ____\n |    |\n |\n |\n |\n_|___\n");
	        }
	        if (count == 5) {
	            System.out.println("Wrong guess, try again");
	            System.out.println("  ____\n |    |\n |    O\n |\n |\n_|___\n");
	        }
	        if (count == 6) {
	            System.out.println("Wrong guess, try again");
	            System.out.println("  ____\n |    |\n |    O\n |   /|\\\n |\n_|___\n");
	        }
	        if (count == 7) {
	            System.out.println("GAME OVER!");
	            System.out.println("  ____\n |    |\n |    O\n |   /|\\\n |   / \\\n_|___\n");
	        }
	    }
	}