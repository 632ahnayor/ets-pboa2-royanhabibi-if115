
/**
 * Write a description of class CoffeeSelection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Map;
import java.util.HashMap;

public class CoffeeSelection
{   
    public static String flavorSelect(int i) {
        switch(i) {
            case 1:
                return "Espresso";
            case 2:
                return "Latte";
            case 3:
                return "Cappuccino";
            default:
                return "Espresso";
        }
    }
    
    public static String sizeSelect(int i) {
        switch(i) {
            case 1:
                return "Small";
            case 2:
                return "Regular";
            case 3:
                return "Large";
            default:
                return "Regular";
            
        }
    }
    
}
