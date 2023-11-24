package hangman;

import java.util.Scanner;

public class Ahorcao {
	private static final String[] words = {"program", "java", "hangman"};
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