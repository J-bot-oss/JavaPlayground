public class arrays_06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double ave = Double.valueOf(sum) / Double.valueOf(arr.length);

        System.out.println("The average of all elements is: " + ave);
    }
}