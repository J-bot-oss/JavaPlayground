import java.util.Arrays;

public class arrays_10 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,7,2,8};
        int[] arr2 = new int[6];

        System.out.println("Array 1 is " + Arrays.toString(arr1) + " and array 2  is " + Arrays.toString(arr2));

        System.out.println(" ");
        System.out.println("Now, after copying:");

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("-array 1 is " + Arrays.toString(arr1) + " and array 2 is " + Arrays.toString(arr2));
    }
}
