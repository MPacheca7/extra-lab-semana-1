import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de tu tabla de multiplicacion: ");
        int num1 = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num1 + " x " + i + " = " + (num1 * i));
        }
        sc.close();
    }
}
