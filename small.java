public class small {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int min = findSmallest(arr);
        System.out.println("Smallest element is: " + min);
    }

    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
}
