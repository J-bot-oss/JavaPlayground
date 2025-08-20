import java.util.Arrays;

public class arrays_02 {
    public static void main(String[] args) {
        int n = 0;
        int index = 0;
        int[] arr = new int[10];

        do {
            if (n % 2 == 0) {
                arr[index] = n;
                n += 1;
                index += 1;
            } else {
                n += 1;
            }
        } while (index < 10);

        System.out.println(Arrays.toString(arr));
    }
}
