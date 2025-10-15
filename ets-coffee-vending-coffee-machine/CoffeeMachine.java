
/**
 * Write a description of class CoffeeMachine here.
 *
 * @author (Royan)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finished = false;
        while (!finished) {
            System.out.println();
            System.out.println();
            System.out.println("Welcome to Java Coffee Machine!");
            System.out.println();
            System.out.println("Please choose your coffee flavor:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Cappuccino");
            System.out.print("Enter choice (1-3): ");
            int flavorChoice = scanner.nextInt();
            if(flavorChoice==1410) {
                AdminAccess.main();
                continue;
            } else if (flavorChoice==2025) {
                System.out.println("Shutting down...");
                finished = true;
                continue;
            }
            String flavorSelected = 
            CoffeeSelection.flavorSelect(flavorChoice);
            System.out.println(flavorSelected + " selected.");
            System.out.println();
            
            boolean stockAvailable = CoffeeStock.isAvailable(flavorSelected);
            
            if(stockAvailable==false) { 
                System.out.println("We're sorry, " + flavorSelected + " is not in stock.");
                System.out.println("Please choose another flavor or come back another time.");
                continue;
            }
            
            
            System.out.println("Please choose your coffee size:");
            System.out.println("1. Small");
            System.out.println("2. Regular");
            System.out.println("3. Large");
            System.out.print("Enter choice (1-3): ");
            int sizeChoice = scanner.nextInt();
            String sizeSelected = 
            CoffeeSelection.sizeSelect(sizeChoice);
            System.out.println(sizeSelected + " selected.");
            System.out.println();
    
            
            System.out.println("Please choose sugar level:");
            System.out.println("0. No sugar");
            System.out.println("1. Less sugar");
            System.out.println("2. Normal sugar");
            System.out.println("3. Extra sugar");
            System.out.print("Enter choice (0-3): ");
            int sugarChoice = scanner.nextInt();
            String sugarSelected = 
            CoffeeOptional.sugarSelect(sugarChoice);
            System.out.println(sugarSelected + " selected.");
            System.out.println();
    
            
            System.out.println("Please choose milk addition:");
            System.out.println("0. No milk");
            System.out.println("1. Added milk");
            System.out.print("Enter choice (0-1): ");
            int milkChoice = scanner.nextInt();
            String milkSelected = 
            CoffeeOptional.milkSelect(milkChoice);
            System.out.println(milkSelected + " selected.");
            System.out.println();
            
            System.out.println("Calculating price...");
            double price = 
            PaymentVerification.priceCalculate(
            flavorChoice, sizeChoice, sugarChoice, milkChoice);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Error while calculating price.");
            }
            System.out.println("Your total is $" + price);
            System.out.println();
    
            
            System.out.println("Please enter payment amount:");
            double payment = scanner.nextDouble();
            int paymentFlag = 
            PaymentVerification.priceValidation(payment, price);
            if (paymentFlag==-1) {
                System.out.println("Insufficient payment. Transaction cancelled.");
                continue;
            }
            System.out.println();
    
            CoffeeStock.decrementStock(flavorSelected);
            
            System.out.println("Making your " + sizeSelected + " " 
            + flavorSelected);
            System.out.println("with " + sugarSelected 
            + " and " + milkSelected + "...");
            System.out.println("Please wait...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println("Error while making coffee.");
            }
            System.out.println();
                    
            System.out.println("Your coffee is ready! Enjoy!");
            TransactionLogs.addTransaction(
            flavorSelected, sizeSelected, sugarSelected, milkSelected);
            //CoffeeStock.showStock();
            
        }
        
        scanner.close();
        
        return;
    }
}
