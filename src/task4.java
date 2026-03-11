import java.math.BigDecimal;
import java.math.RoundingMode;

public class task4{

    public static void main(String[] args) {

        System.out.println("===== USING DOUBLE =====");

        double netPriceGuenfaf = 9.99;
        System.out.println("Step 1 - Net price: " + netPriceGuenfaf);

        double grossPriceGuenfaf = netPriceGuenfaf * 1.23;
        System.out.println("Step 2 - Gross price (with 23% VAT): " + grossPriceGuenfaf);

        double totalGrossGuenfaf = grossPriceGuenfaf * 10000;
        System.out.println("Step 3 - Total gross value (10,000 units): " + totalGrossGuenfaf);

        double totalNetGuenfaf = totalGrossGuenfaf / 1.23;
        System.out.println("Step 4 - Total value excluding VAT: " + totalNetGuenfaf);

        System.out.println();
        System.out.println("===== USING BIGDECIMAL =====");

        BigDecimal netPriceBdGuenfaf = new BigDecimal("9.99");
        System.out.println("Step 1 - Net price: " + netPriceBdGuenfaf);

        BigDecimal grossPriceBdGuenfaf = netPriceBdGuenfaf.multiply(new BigDecimal("1.23"));
        System.out.println("Step 2 - Gross price (with 23% VAT): " + grossPriceBdGuenfaf);

        BigDecimal totalGrossBdGuenfaf = grossPriceBdGuenfaf.multiply(new BigDecimal("10000"));
        System.out.println("Step 3 - Total gross value (10,000 units): " + totalGrossBdGuenfaf);

        BigDecimal totalNetBdGuenfaf =
                totalGrossBdGuenfaf.divide(new BigDecimal("1.23"), 2, RoundingMode.HALF_UP);
        System.out.println("Step 4 - Total value excluding VAT: " + totalNetBdGuenfaf);

        System.out.println();
        System.out.println("===== COMPARISON =====");
        System.out.println("double result:     " + totalNetGuenfaf);
        System.out.println("BigDecimal result: " + totalNetBdGuenfaf);
        System.out.println("Conclusion: double produces rounding errors due to binary floating point representation.");
        System.out.println("BigDecimal gives exact results, making it the correct choice for financial calculations.");
    }
}
