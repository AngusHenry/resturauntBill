/*
 * Angus Henry
 * resturantBill.java
 *  This program creats a bill of a meal
 * March 6 2018 
 */

package resturantbill;

import java.text.DecimalFormat;
/**
 *
 * @author ANHEN3335
 */
public class ResturantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double costMeal, tax, costTotal;
        costMeal = 1346.24;
        tax = costMeal * 0.13;
        costTotal = costMeal + tax;
        
        DecimalFormat x = new DecimalFormat ("####.##");
        System.out.println ("Thank you for eating food");
        System.out.println ("Bill");
        System.out.println ("____________________________________________");
        System.out.println ("Meal: " + x.format(costMeal)+ "$");
        System.out.println ("Tax: " + x.format (tax)+ "$");
        System.out.println ("Total: " + x.format(costTotal) + "$");
    }
    
    
}



