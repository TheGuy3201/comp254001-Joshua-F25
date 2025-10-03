package exercise3;

public class Driver3 {
    public static void main(String[] args) {
        System.out.println("=== Finding Maximum n for Uniqueness Algorithms ===");

        // Find max n for unique1 (O(n^2) algorithm)
        System.out.println("\nTesting unique1 (O(n^2))...");
        int maxN1 = findMaxN(true);
        System.out.println("Maximum n for unique1: " + maxN1);

        // Find max n for unique2 (O(n log n) algorithm)
        System.out.println("\nTesting unique2 (O(n log n))...");
        int maxN2 = findMaxN(false);
        System.out.println("Maximum n for unique2: " + maxN2);

        System.out.println("unique1 max n: " + maxN1);
        System.out.println("unique2 max n: " + maxN2);
    }

    // Binary search to find largest n where algorithm runs in <= 60 seconds
    private static int findMaxN(boolean useUnique1) {
        int low = 100;      // Start small
        int high = 100000;  // Start large
        int maxN = low;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int[] testArray = generateRandomArray(mid);

            System.out.print("Testing n=" + mid + "... ");
            long startTime = System.currentTimeMillis();

            boolean result;
            if (useUnique1) {
                result = Uniqueness.unique1(testArray);
            } else {
                result = Uniqueness.unique2(testArray);
            }

            long endTime = System.currentTimeMillis();
            long elapsed = endTime - startTime;

            System.out.println("took " + elapsed + " ms, result: " + result);

            if (elapsed <= 60000) { // 60 seconds = 60000 milliseconds
                maxN = mid;
                low = mid + 1;  // Try larger n
            } else {
                high = mid - 1; // Try smaller n
            }
        }

        return maxN;
    }

    private static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n * 2); // Random values with some duplicates
        }
        return arr;
    }
}