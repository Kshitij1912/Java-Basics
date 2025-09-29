public class IIndlargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int secondMax = findSecondLargest(arr);
        System.out.println("Second largest element is: " + secondMax);
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
    
}
