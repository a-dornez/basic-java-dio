import java.util.Locale;
import java.util.Scanner;

public class Counter {

    public static void main(String[] args) throws InvalidParametersException {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome\n");

        //asks and reads user inputs
        System.out.println("You must insert two integers in ascending order");
        System.out.println("Insert the first number:");
         int firstNumber = scanner.nextInt();
        System.out.println("Insert the second number:");
         int secondNumber = scanner.nextInt();

        System.out.print("\n");
         
        //calls counter method
        counter(firstNumber, secondNumber);

        System.out.print("\n");

        scanner.close();
    }

    static void counter (int firstNumber, int secondNumber) throws InvalidParametersException {
        
        //validates inputs and executes counting
        if ( firstNumber > secondNumber ){
           throw new InvalidParametersException("Second parameter must be greater than first parameter");     
        }
        else {
            int repetitionsLimit = secondNumber - firstNumber;

            //counts from firstNumber to secondNumber
            for ( int i = 1; i <= repetitionsLimit; i++ ) {
                
                int currentNumber = firstNumber + i;

                System.out.println("Printing number " + i + ": " + currentNumber);
            }
        }    
    }
}

