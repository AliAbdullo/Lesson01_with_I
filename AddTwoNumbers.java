import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("This program calculates sum of two numbers");

        System.out.print("Enter first number: ");
        double numberOne = cin.nextDouble();

        System.out.print("Enter second number: ");
        double numberTwo = cin.nextDouble();

        double sum = numberOne + numberTwo;
        System.out.println(numberOne+ " + " +numberTwo+" = "+ sum);
    }
}
