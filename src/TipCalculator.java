import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuity = scanner.nextDouble() / 100.0;

        System.out.println("The gratuity is " + (subtotal * gratuity) + " and the " +
                "total is " + (subtotal * gratuity + subtotal));
    }
}
