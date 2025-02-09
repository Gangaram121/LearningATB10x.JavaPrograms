package February.ex_09022025;

import java.util.Arrays;

public class Second_smallest_number {
    public static void main(String[] args) {
        int[]array={12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(array);
        System.out.println("Second largest number in array = "+array[1]);
    }
}
