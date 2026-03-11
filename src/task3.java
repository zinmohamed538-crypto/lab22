public class task3 {

    static int amountOfBricksGuenfaf = 73;
    static int containerCapacityGuenfaf = 8;

    public static void main(String[] args) {

        System.out.println("Step 1 - Amount of Lego bricks: " + amountOfBricksGuenfaf);
        System.out.println("Step 1 - Container capacity: " + containerCapacityGuenfaf);

        int fullContainersGuenfaf = amountOfBricksGuenfaf / containerCapacityGuenfaf;
        System.out.println("Step 2 - Number of full containers: " + fullContainersGuenfaf);

        int totalContainersGuenfaf = fullContainersGuenfaf + 1;
        System.out.println("Step 3 - Total number of containers needed (full + partial): " + totalContainersGuenfaf);

        int leftoverBricksGuenfaf = amountOfBricksGuenfaf % containerCapacityGuenfaf;
        System.out.println("Step 4 - Bricks in the last incomplete container: " + leftoverBricksGuenfaf);
    }

}
