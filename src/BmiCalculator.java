import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: " );
        double height = scanner.nextDouble();

        weight = weight * 0.45359237;
        height = height * 0.0254;
        double bmi = weight / (height * height);

        System.out.println("BMI is " + bmi);
    }
}
