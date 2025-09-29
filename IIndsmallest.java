public class IIndsmallest {
    public static int findSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        

        int secondMin = findSecondSmallest(arr);
        System.out.println("Second smallest element is: " + secondMin);
    }
}
