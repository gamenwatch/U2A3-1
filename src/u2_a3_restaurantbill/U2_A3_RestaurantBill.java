/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_restaurantbill;

/**
 *Jacob Lacey
 *26 Sept 2018
 *To Calculate and Output/Print a Bill for a Meal @ a Restaurant (ESM)
 */

//Bring in text format
import java.text.*;

public class U2_A3_RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables
        double pastaPrice = 15.25;
        double sodaPrice = 2.52;
        //sales tax 13%
        double hst = 0.13;
        double foodCost = 0.00;
        double taxCost = 0.00;
        double totalCost = 0.00;
        
        //Declare Decimal (Money) Format
        DecimalFormat moneyCanadian = new DecimalFormat ("$###.##CAN");
        
        //algorithm for the total cost of food
        foodCost = pastaPrice + sodaPrice;
        //algorithm for the tax total
        taxCost = hst*foodCost;
        //algorithm for the total cost of the meal
        totalCost = taxCost + foodCost;
        
        //print bill
        System.out.println("East Side Marios Bill");
        System.out.println("*********************\n");
        System.out.println("Spicy Pasta:  \t\t"+moneyCanadian.format(pastaPrice));
        System.out.println("Diet Root Beer:\t\t"+moneyCanadian.format(sodaPrice)+"\n");
        System.out.println("HST:           \t\t"+moneyCanadian.format(taxCost));
        System.out.println("--------------------------------");
        System.out.println("TOTAL:        \t\t"+moneyCanadian.format(totalCost));
        
    }
    
}
