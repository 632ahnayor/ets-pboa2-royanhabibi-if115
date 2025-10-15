
/**
 * Write a description of class CoffeeStock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Map;
import java.util.HashMap;

public class CoffeeStock
{
    //simpan tiap jenis kopi dan stoknya (Map<String, Integer>)
    //jika stok, hampir habis remind
    private static Map<String, Integer> stock = new HashMap<>();
    
    static {
        stock.put("Espresso", 5);
        stock.put("Latte", 3);
        stock.put("Cappuccino", 0);
        
    }
    
    public static boolean isAvailable(String flavor) {
        if(stock.containsKey(flavor)) {
            if(stock.get(flavor)>0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public static void decrementStock(String flavor) {
        if(isAvailable(flavor)) {
            int current = stock.get(flavor);
            if (current > 0) {
                stock.put(flavor, current-1);
            }
        }
    }
    
    public static void showStock() {
        System.out.println("Java Coffee Machine Stocks:");
        for(Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.print("- " + entry.getKey() + ": " + entry.getValue());
            if(entry.getValue()>2) {
                System.out.println(" 'Stock Available'");
            } else if (entry.getValue()<1) {
                System.out.println(" 'Stock Empty! Refill ASAP!'");
            } else {
                System.out.println(" 'Stock Almost Empty. Refill Soon!'");
            }
        }
        System.out.println();
    }
}
