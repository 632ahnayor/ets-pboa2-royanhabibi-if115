
/**
 * Write a description of class CoffeeOptional here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CoffeeOptional
{   
    public static String sugarSelect(int i) {
        switch(i) {
            case 0:
                return "No sugar";
            case 1:
                return "Less sugar";
            case 2:
                return "Normal sugar";
            case 3:
                return "Extra sugar";
            default:
                return "Normal sugar";
        }
    }

    
    public static String milkSelect(int i) {
        switch(i) {
            case 0:
                return "No milk";
            case 1:
                return "Added milk";
            default:
                return "No milk";
        }
    }
}
