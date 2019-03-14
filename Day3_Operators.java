public class Day3_Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalTip, totalTax;
        int total;

        totalTip = meal_cost * ((double)tip_percent/100);
        totalTax = meal_cost * ((double) tax_percent/100);
        total = (int) Math.round(meal_cost + totalTip + totalTax);
        System.out.println(total);
        
    }
}