import java.util.Scanner;

public class IVR {

    public static void main(String[] args)
    {
        char option;
       do{
           System.out.println("Welcome to IVR services");
           System.out.println("Choose your options");
           System.out.println("Press 1 for to change language");
           System.out.println("Press 2 for new connection");
           System.out.println("Press 3 for existing connection");
           System.out.println("Press 4 for Ticket status");
           System.out.println("Press 5 for Customer service support");
           int a;
           Scanner scanner = new Scanner(System.in);
           a = scanner.nextInt();
           if (a < 1 || a > 5) {
               System.out.println("Enter a valid option");
           } else {
               char op = 0;

                   switch (a) {
                   case (1): {
                       do {
                       System.out.println("Press 1 for English");
                       System.out.println("Press 2 for French");
                       System.out.println("Press 3 for Spanish");
                       System.out.println("Press 4 for Italian");
                       System.out.println("Press 5 for German");
                       int b = scanner.nextInt();

                           switch (b) {
                               case (1):
                                   System.out.println("You choose English");
                                   break;
                               case (2):
                                   System.out.println("You choose French");
                                   break;
                               case (3):
                                   System.out.println("You choose Spanish");
                                   break;
                               case (4):
                                   System.out.println("You choose Italian");
                                   break;
                               case (5):
                                   System.out.println("You choose German");
                                   break;
                               default:
                                   System.out.println("Enter a valid option");
                           }
                           System.out.println("Press Y to go to previous menu");
                           op = scanner.next().charAt(0);
                       }while(op =='Y');
                   }
                   break;
                   case (2): {
                       System.out.println("Press 1 for Mobile connection");
                       System.out.println("Press 2 for Wifi connection");
                       System.out.println("Press 3 for Broadband connection");
                       System.out.println("Press 4 for TV connection");
                       System.out.println("Press 5 for Smart Solution");
                       int b = scanner.nextInt();
                       switch (b) {
                           case (1):
                               System.out.println("You choose new Mobile connection");
                               break;
                           case (2):
                               System.out.println("You choose new Wifi connection");
                               break;
                           case (3):
                               System.out.println("You choose new Broadband connection");
                               break;
                           case (4):
                               System.out.println("You choose new TV connection");
                               break;
                           case (5):
                               System.out.println("You choose new Smart Solution");
                               break;
                           default:
                               System.out.println("Enter a valid option");
                       }
                   }
                   break;
                   case (3): {
                       System.out.println("Press 1 for Mobile connection");
                       System.out.println("Press 2 for Wifi connection");
                       System.out.println("Press 3 for Broadband connection");
                       System.out.println("Press 4 for TV connection");
                       System.out.println("Press 5 for Smart Solution");
                       int b = scanner.nextInt();
                       switch (b) {
                           case (1): {
                               System.out.println("You have choose the option for mobile");
                               System.out.println("Press 1 for Trouble shooting");
                               System.out.println("Press 2 for Raise a ticket");
                               System.out.println("Press 3 for Customer service support");
                           }
                           break;
                           case (2): {
                               System.out.println("You have choose the option for Wifi");
                               System.out.println("Press 1 for Trouble shooting");
                               System.out.println("Press 2 for Raise a ticket");
                               System.out.println("Press 3 for Customer service support");
                           }
                           break;
                           case (3): {
                               System.out.println("You have choose the option for BroadBand");
                               System.out.println("Press 1 for Trouble shooting");
                               System.out.println("Press 2 for Raise a ticket");
                               System.out.println("Press 3 for Customer service support");
                           }
                           break;
                           case (4): {
                               System.out.println("You have choose the option for TV");
                               System.out.println("Press 1 for Trouble shooting");
                               System.out.println("Press 2 for Raise a ticket");
                               System.out.println("Press 3 for Customer service support");
                           }
                           break;
                           case (5): {
                               System.out.println("You have choose the option for Smart solution");
                               System.out.println("Press 1 for Trouble shooting");
                               System.out.println("Press 2 for Raise a ticket");
                               System.out.println("Press 3 for Customer service support");
                           }
                           default: {
                               System.out.println("Enter a valid option");
                           }
                       }
                   }
                   break;
                   case (4): {
                       System.out.println("Please enter the ticket number");
                       int ticket = scanner.nextInt();
                       System.out.println("Your ticket number is " + ticket);
                   }
                   break;
                   case (5): {
                       System.out.println("Please hold on for sometime. " +
                               "You will be connected to our customer care executive");
                   }
                   break;
                   default:
                       System.out.println("Enter a valid option..thank you");
               }

           }
           System.out.println("Do you want to continue: Y or N");
           option = scanner.next().charAt(0);
       }while(option !='N');


    }
}
