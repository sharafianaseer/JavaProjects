package methods;

import java.util.Scanner;

public class Calculator {

    public static int sum(int a, int b)
    {
        return(a+b);
    }
    public static int sub(int a, int b)
    {
        return(a-b);
    }

    public static int mul(int a, int b)
    {
        return(a*b);
    }

    public static int div(int a, int b)
    {
        return(a/b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of two numbers is "+ sum(a,b));
        System.out.println("The difference of two numbers is "+ sub(a,b));
        System.out.println("The multiplication of two numbers is " + mul(a,b));
        System.out.println("The division of two numbers is "+ div(a,b));





    }
}
