package Jan.ex_18012025;

import javax.management.MBeanAttributeInfo;

public class BODMAS {
    public static void main(String[] args) {
        System.out.println((9 * 4 / 9 + 5) * 5);
        System.out.println((25 / 8 + 7) * 7);

        // 9 * 4 - 36
        // 36/9 -> 4
        // 4+5 -> 9
        // 9 * 5-> 45
    }
}
