public class largest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int max = findLargest(arr);
        System.out.println("Largest element is: " + max);
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
