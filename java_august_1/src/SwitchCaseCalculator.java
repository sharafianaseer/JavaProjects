import java.util.Scanner;

public class SwitchCaseCalculator {

    public static void main(String[] args) {
        int result=0;
        System.out.println("Welcome to my calculator");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        int in= scanner.nextInt();
            if (in<1 || in>5)
              System.out.println("Enter a valid option");
            else {
                System.out.println("Enter first number");
                int a = scanner.nextInt();
                System.out.println("Enter second number");
                int b = scanner.nextInt();
                switch (in) {
                    case (1):
                        result = a + b;
                        break;
                    case (2):
                        result = a - b;
                        break;
                    case (3):
                        result = a * b;
                        break;
                    case (4):
                        result = a / b;
                        break;
                    case (5):
                        result = a % b;
                        break;
                }
                System.out.println("the result is " + result);
            }

    }
}
