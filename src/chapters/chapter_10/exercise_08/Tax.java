package chapters.chapter_10.exercise_08;

public class Tax {
    private static int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_OR_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this(SINGLE_FILER, null, null, 0);
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        if (taxableIncome < brackets[filingStatus][0]) {
            return 0;
        }
        double tax = 0;

        for (int i = brackets[filingStatus].length - 1; i >= 0; i--) {
            if (taxableIncome > brackets[filingStatus][i]) {
                tax += (taxableIncome - brackets[filingStatus][i]) * rates[i + 1];
                taxableIncome = brackets[filingStatus][i];
            }
        }
        tax += brackets[filingStatus][0] * rates[0];
        return tax;
    }

    public double getTaxableIncome() {
        return this.taxableIncome;
    }

    public double[] getRates() {
        return this.rates;
    }

    public int getFilingStatus() {
        return this.filingStatus;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
