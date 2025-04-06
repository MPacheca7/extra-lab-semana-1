import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");

        String word = sc.nextLine();
        word = word.toLowerCase(); // minusculas

        int vowels = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++; // aumenta a la siguiente letra
            }
        }
        System.out.println("Hay " + vowels + " vocales.");
        sc.close();
    }
}
