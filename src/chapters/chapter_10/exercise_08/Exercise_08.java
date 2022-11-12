package chapters.chapter_10.exercise_08;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350},// Single filer
                {45200, 109250, 166500, 297350},// Married jointly-or qualifying widow(er)
                {22600, 54625, 83250, 148675}, // Married separately
                {36250, 93650, 151650, 297350}// Head of household
        };

        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

        int[][] brackets2009 = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950}};// Head of household


        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        System.out.println("(0-single filer, 1-married jointly or qualifying widow(er),\n" +
                "2-married separately, 3-head of household)");
        System.out.print("Enter the filling status : ");

        int status = input.nextInt();
        System.out.print("Enter the taxable income : ");

        double taxableIncome = input.nextDouble();

        Tax tax = createTaxObject(status, brackets2001, rates2001, taxableIncome);
        System.out.printf("Your tax is %.2f in 2001\n", tax.getTax());

        Tax tax1 = createTaxObject(status,brackets2009,rates2009,taxableIncome);
        System.out.printf("Your tax is %.2f in 2009\n", tax1.getTax());
    }

    public static Tax createTaxObject(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        Scanner input = new Scanner(System.in);
        switch (filingStatus) {
            case 0:
                return new Tax(Tax.SINGLE_FILER, brackets, rates, taxableIncome);
            case 1:
                return new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_OR_WIDOWER, brackets, rates, taxableIncome);
            case 2:
                return new Tax(Tax.MARRIED_SEPARATELY, brackets, rates, taxableIncome);
            case 3:
                return new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets, rates, taxableIncome);
            default:
                do {
                    System.out.println("Invalid input.Please re-enter status : ");
                    filingStatus = input.nextInt();
                } while (0 > filingStatus || filingStatus > 3);
        }
        return null;
    }
}
