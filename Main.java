import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sum;
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            
            System.out.println("Type in your first number: ");
            double number1 = scanner.nextDouble();
            System.out.println("Type in your second number: ");
            double number2 = scanner.nextDouble();
            System.out.println("Type in your arithmetic operations (+; -; /; *): ");
            String operation = scanner.next();
            switch (operation) {
                case "+" -> {
                    sum = number2 + number1;
                    System.out.format("Sum: %.2f", sum);
                }
                case "-" -> {
                    sum = number1 - number2;
                    System.out.format("Sum: %.2f", sum);
                }
                case "/" -> {
                    sum = number1 / number2;
                    System.out.format("Sum: %.2f", sum);
                }
                case "*" -> {
                    sum = number1 * number2;
                    System.out.format("Sum: %.2f", sum);
                }
                default -> System.out.println("That's not a operation!:");
            }

            System.out.println("\nDo you want another calculation? Y/N");
            input = scanner.next().toUpperCase();
        }while(input.equals("Y"));


    }
}