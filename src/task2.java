
public static void main(String[] args) {

    int randomNumberGuenfaf = (int) (Math.random() * 100) + 1;
    System.out.println("Step 1 - Generated random number between 1 and 100: " + randomNumberGuenfaf);

    int moduloResultGuenfaf = randomNumberGuenfaf % 2;
    System.out.println("Step 2 - Modulo result (number % 2): " + moduloResultGuenfaf);

    if (moduloResultGuenfaf == 0) {
        System.out.println("Step 3 - " + randomNumberGuenfaf + " is an EVEN number");
    } else {
        System.out.println("Step 3 - " + randomNumberGuenfaf + " is an ODD number");
    }
}