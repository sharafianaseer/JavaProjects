import java.util.Scanner;

public class MobileClass {

    public static void mobile(String name)
    {
        System.out.println("Calling " + name);
    }

    public static void main(String[] args)
    {
        System.out.println("Whom you want to call?");
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        mobile(name);

    }
}
