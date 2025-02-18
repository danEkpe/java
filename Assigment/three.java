public class ReverseArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};
        
        // Print original array
        System.out.print("Original Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Reverse the array
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        
        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}   
