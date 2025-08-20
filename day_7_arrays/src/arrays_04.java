import java.util.Arrays;

public class arrays_04 {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,9,1,4};

        int max = Arrays.stream(arr).min().getAsInt();

        System.out.println("Minimum element is " + max + "!");
    }
}