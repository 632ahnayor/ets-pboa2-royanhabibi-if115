
/**
 * Write a description of class AdminAccess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class AdminAccess
{
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entering Admin Access");
        boolean finished = false;
        while(!finished) {
            System.out.println();
            System.out.println("Admin Access Menu");
            System.out.println("1. Show Coffee Stock");
            System.out.println("2. Show Transaction Log");
            System.out.println("0. Return to User Access");
            
            System.out.print("Enter input (0-2):");
            int input = scanner.nextInt();
            
            switch(input) {
                case 0:
                    System.out.println("Returning to User Access...");
                    finished = true;
                    break;
                case 1:
                    System.out.println("Fetching Coffee Stock...");
                    CoffeeStock.showStock();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Fetching Transaction Logs...");
                    TransactionLogs.showTransaction();
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid Input, Try Again.");
                    System.out.println();
                    break;
            }
        }
        
        scanner.close();
    }
    
    //method tampilkan log transaksi
    //method tampilkan stok kopi, 
    //jika stok mendekati habis, tampilan reminder refill
}
