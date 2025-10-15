
/**
 * Write a description of class TransactionLogs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class TransactionLogs
{
    private static int id=1;
    //private Set<String> Detail;
    private static Map<Integer, Set<String>> log = new HashMap<>();
    
    public static void addTransaction(String flavor, String size, String sugar, String milk) {
        Set<String> detail = new HashSet<>();
        detail.add("Flavor: " + flavor);
        detail.add("Size: " + size);
        detail.add("Sugar: " + sugar);
        detail.add("Milk: " + milk);
        log.put(id,detail);
        id++;
    }
    
    public static void showTransaction(){
        System.out.println("Java Coffee Machine Transaction Logs: ");
        if(log.isEmpty()) {
            System.out.println("Transaction log empty");
        } else {
            for(Map.Entry<Integer, Set<String>> entry: log.entrySet()) {
                System.out.print(entry.getKey() + "\t");
                for(String detail : entry.getValue()) {
                    System.out.print(detail + "\t");
                }
            }
        }
    }
}
