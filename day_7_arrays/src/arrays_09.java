public class arrays_09 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int search = 6;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println(search + " found at index " + i);
            }
        }
    }
}
