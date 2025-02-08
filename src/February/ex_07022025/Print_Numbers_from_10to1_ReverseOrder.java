package February.ex_07022025;

import java.util.Scanner;

public class Print_Numbers_from_10to1_ReverseOrder {
    public static void main(String[] args) {
//        for (int i=10;i>=1;i--){
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i=num;i>=1;i--){
            System.out.println(i);
        }
    }
}
