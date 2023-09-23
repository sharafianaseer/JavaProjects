import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class MyCalculator {

    public static void main (String[] args){
        int x, y;
        System.out.println("Welcome to my calculator");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        x=scanner.nextInt();
        System.out.println("Enter another number");
        y=scanner.nextInt();
        System.out.println("+ or - or * or /");
        char cal = scanner.next().charAt(0);
        int result=0;
        if (cal=='+')
            result = x+y;
        else if(cal=='-')
            result = x - y;
        else if (cal=='*')
            result=x*y;
        else if (cal=='/')
            result = x / y;
        System.out.println("Result=" +result);
    }

}
