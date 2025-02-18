public class SumOf2DArray {
    public static void main(String[] args) {
        // Example 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Calculate the sum of all elements in the array
        int sum = calculateSum(array);
        
        // Output: Display the sum
        System.out.println("The sum of all elements in the 2D array is: " + sum);
    }
    
    // Method to calculate the sum of all elements in the 2D array
    public static int calculateSum(int[][] array) {
        int sum = 0;
        
        // Loop through each element in the 2D array
        for (int i = 0; i < array.length