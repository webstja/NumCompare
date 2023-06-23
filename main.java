public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }
        double number2 = scanner.nextDouble();
        if (number1 == number2) {
            System.out.println("The numbers are equal.");
        } else if (number1 < number2) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The second number is less than the first number");
        }
    }
}
