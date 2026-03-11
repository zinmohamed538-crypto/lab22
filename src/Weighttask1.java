public class Weighttask1 {

    static float earthWeightGuenfaf = 80.0f;
    static float marsGravityGuenfaf = 0.38f;

    public static void main(String[] args) {

        double marsWeightGuenfaf = earthWeightGuenfaf * marsGravityGuenfaf;
        System.out.println("Step 2 - Calculated Mars weight (double): " + marsWeightGuenfaf);

        System.out.printf("Step 3 - Mars weight formatted to 4 decimal places: %.4f%n", marsWeightGuenfaf);

        int marsWeightIntGuenfaf = (int) marsWeightGuenfaf;
        System.out.println("Step 4 - Mars weight cast to int (decimals removed): " + marsWeightIntGuenfaf);

        char marsWeightCharGuenfaf = (char) marsWeightIntGuenfaf;
        System.out.println("Step 5 - Mars weight cast to char (ASCII character): " + marsWeightCharGuenfaf);

        int marsWeightMathGuenfaf = marsWeightCharGuenfaf + 10;
        System.out.println("Step 6 - Added 10 to the char value (result as int): " + marsWeightMathGuenfaf);
    }
}