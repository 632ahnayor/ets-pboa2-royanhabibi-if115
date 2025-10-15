
/**
 * Write a description of class PaymentVerification here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PaymentVerification
{
    public static double priceCalculate(int flavor, int size, int sugar, int milk) {
        double price=0;
        
        if(flavor==2) price+=1.50; //latte
        else if(flavor==3) price+=2.00; //cappucinno
        else price+=1.00; //espresso & default
        
        if(size==3) price+=1.00; //large
        
        if(sugar==3) price+=0.50; //extra
        
        if(milk==1) price+=1.00; //added
        
        return price;
    }
    
    public static int priceValidation(double payment, double price) {
        if(payment < price) return -1;
        return 0;
    }
}
