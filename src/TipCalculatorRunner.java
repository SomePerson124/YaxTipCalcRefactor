import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double cost = 0;

        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.println("Here are some suggested tip percentages: ");
        System.out.println("15%");
        System.out.println("20%");
        System.out.println("25%");
        System.out.print("What's the tip percentage? ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        if (tipPercentage < 15) {
            System.out.println("Are you sure you don't want to increase the tip percentage?");
            System.out.print("What's the tip percentage? ");
            tipPercentage = scan.nextInt();
            scan.nextLine();
        }

        TipCalculator tipCalculator = new TipCalculator(numPeople, tipPercentage);

        while (cost != -1) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost = scan.nextDouble();
            scan.nextLine();
            tipCalculator.addMeal(cost);
        }

        tipCalculator.addMeal(1);

        System.out.println("---------------------------------");
        System.out.println("Total bill before tip: $" + tipCalculator.getTotalBillBeforeTip());
        System.out.println("Total Percentage: " + tipCalculator.getTipPercentage() + "%");
        System.out.println("Total tip: $" + tipCalculator.tipAmount());
        System.out.println("Total bill with tip: $" + tipCalculator.totalBill());
        System.out.println("Per person cost before tip: $" + tipCalculator.perPersonCostBeforeTip());
        System.out.println("Tip per person: $" + tipCalculator.perPersonTipAmount());
        System.out.println("Total cost per person: $" + tipCalculator.perPersonTotalCost());

    }
}