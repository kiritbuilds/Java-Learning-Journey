import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Income Tax Calculator ---");
        System.out.print("Please enter your annual income (e.g., 650000): ₹");
        float income = input.nextFloat();

        float tax = 0; // Shuru mein tax ko zero maan lete hain

        // Condition 1: 2.5 Lakh se kam income
        if (income < 250000) {
            tax = 0;
        }
        // Condition 2: 2.5 Lakh se 5 Lakh ke beech income
        else if (income >= 250000 && income < 500000) {
            // Sirf 2.5L se upar wali amount par 5% tax
            tax = 0.05f * (income - 250000);
        }
        // Condition 3: 5 Lakh se 10 Lakh ke beech income
        else if (income >= 500000 && income < 1000000) {
            // Pehle slab ka fix tax (12500) + 5L se upar wali amount par 20%
            tax = 12500f + 0.20f * (income - 500000);
        }
        // Condition 4: 10 Lakh se upar income
        else {
            // Pehle do slab ka fix tax (12500 + 100000) + 10L se upar wali amount par 30%
            tax = 112500f + 0.30f * (income - 1000000);
        }

        System.out.println("-------------------------------------");
        System.out.println("Your calculated income tax is: ₹" + tax);
        System.out.println("-------------------------------------");

        input.close();
    }
}
