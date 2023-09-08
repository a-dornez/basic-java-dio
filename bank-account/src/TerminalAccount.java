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
        System.out.println("This time, inform your first name: " );
         String clientsFirstName = scanner.next();
        System.out.println("Enter your last name: ");
         String clientsLastName = scanner.next();
        System.out.println("To finish, inform you initial deposit: ");
         double accountBalance = scanner.nextDouble();

        //printing user inputs
        System.out.println("\nHi, " + clientsFirstName + " " + clientsLastName + ", thank you for creating a account in our bank! Your agency is "
         + agencyNumber + ", account " + accountNumber + " and your account's balance is $" + accountBalance +
          ", avaliable for withdrawal.\n");
        System.out.println("We wish you a wonderful day!\n");
          
        scanner.close();
    }
}
