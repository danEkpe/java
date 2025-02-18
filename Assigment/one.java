public class FindLargestElement {
    public static void main(String[] args) {
        // Example array
        int[] array = {10, 20, 30, 40, 50};

        // Initialize the maximum element
        int max = array[0];

        // Iterate through the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + max);
    }
}
