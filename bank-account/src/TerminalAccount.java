import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        WelcomeMessage salutation = new WelcomeMessage();

        WelcomeMessage.welcomeMessage();

        //receiving user data inputs
        System.out.println("Please, enter your agency's number: ");
         String agencyNumber = scanner.next();
        System.out.println("Now, enter you account number: ");
         int accountNumber = scanner.nextInt();
        System.out.println("Enter your first and last name: ");
         String clientsName = scanner.next() + " " + scanner.next(); 
        System.out.println("To finish, inform you initial deposit: ");
         double accountBalance = scanner.nextDouble();

        //printing user inputs
         System.out.println("\nHi, ".concat(clientsName).concat(", thank you for creating a account in our bank! Your agency is "
        .concat(agencyNumber).concat(", account ") + accountNumber +" ".concat(" and your account balance is $") 
        + accountBalance +" ".concat("avalaible for withdrawal.\n")));

        System.out.println("We wish you a wonderful day!\n");
          
        scanner.close();
    }
}
