import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) throws IOException {
        var archi = new FileWriter("aleatoric.txt", true);
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int numRan1 = rand.nextInt(100) + 1;
        System.out.println("Numero de referencia: " + numRan1);

        System.out.println("Adivina el numero aleatrorio: ");
        int num1 = sc.nextInt();

        while (true) {
            if (num1 == numRan1) {
                System.out.println("Lo has adivinado!!!");
                break;
            } else {
                System.out.println("Prueba de nuevo: ");
                num1 = sc.nextInt();
            }
            archi.write(num1 + "\n");
        }

        archi.close();

        sc.close();
    }
}
