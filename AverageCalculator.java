import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;

        System.out.println("Introduce cuantos numeros quieres calcular: ");
        int num1 = scan.nextInt();

        for(int i = 0; i < num1; i++ ) {

            System.out.println("Ingresa el segundo numero: ");
            int num2 = scan.nextInt();
            result += num2;
        }
        System.out.println("El promedio es: " + result / num1);
    }
}
