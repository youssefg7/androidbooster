import java.util.InputMismatchException;
import java.util.Scanner;

public class task {

    public static long addTwoNumbers(long x, long y) {
        return x + y;
    }

    public static long subTwoNumbers(long x, long y) {
        return x - y;
    }

    public static long multiplyTwoNumbers(long x, long y) {
        return x * y;
    }

    public static long divTwoNumbers(long x, long y) {
        return x / y;
    }

    public static long modTwoNumbers(long x, long y) {
        return x % y;
    }

    public static void main(String[] args) {
        int choice = 0;
        long x, y, result = 0;
        boolean success = true;
        System.out.println("Please choose an operation:");
        System.out.println("1- Addition.\t2-Subtraction\t3-Multiplication\t4-Division\t5-Remainder");
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 5 || choice < 1) {
                    System.out.println("You can only enter a number between 1 -> 5\nPlease re-enter your choice: ");
                    choice = Integer.parseInt(scanner.nextLine());
                }
            } catch (Exception e) {
                System.out.println("You must enter a NUMBER between 1 -> 5\nPlease re-enter your choice: ");
            }
        } while (choice == 0);

        try {
            System.out.println("Enter the first number x = ");
            x = scanner.nextLong();
        } catch (Exception e) {
            System.out.println("You can only enter numbers.\nPlease re-enter x = ");
            x = scanner.nextLong();
        }

        System.out.println("Enter the second number y = ");
        y = scanner.nextLong();

        switch (choice) {
            case 1:
                result = addTwoNumbers(x, y);
                break;
            case 2:
                result = subTwoNumbers(x, y);
                break;
            case 3:
                result = multiplyTwoNumbers(x, y);
                break;
            case 4:
                if (y == 0) {
                    System.out.println("Division by zero results in math error");
                    success = false;
                } else {
                    result = divTwoNumbers(x, y);
                }
                break;
            case 5:
                result = modTwoNumbers(x, y);
                break;
        }
        if (success) {
            System.out.println("Result = " + result);
        }
    }


}
