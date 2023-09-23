import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println(number<0?"Negative number":"Positive number");
    }
}
