public class firstoccurence {
    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3, 2};
        int target = 2;
        int index = firstOccurrence(arr, target);
        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
    
}
