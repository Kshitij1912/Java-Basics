public class lastoccurence {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 2, 5};
        int target = 2;
        int lastIndex = findLastOccurrence(arr, target);
        System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
    }

    public static int findLastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Return -1 if the target is not found
    }
    
}
