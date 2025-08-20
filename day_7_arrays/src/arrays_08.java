import java.util.Arrays;

public class arrays_08 {
    public static void main(String[] args) {
        int[] arrforth = {1,2,3,4,5,6,7,8,9,10};

        int[] arrback = new int[10];
        int ind = 0;

        for (int i = arrforth.length - 1; i >= 0; i--) {
            arrback[ind] = arrforth[i];
            ind += 1;
        }

        System.out.println(Arrays.toString(arrforth));
        System.out.println("... and backwards!...");
        System.out.println(Arrays.toString(arrback));
    }
}
