import java.util.Arrays;

public class arrays_03 {
    public static void main(String[] args) {
        int[] arr = {5,2,7,3,9,1,4};

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Maximum element is " + max + "!");
    }
}
