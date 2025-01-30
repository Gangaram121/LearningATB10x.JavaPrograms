package Jan.ex_25012025;

import java.util.Scanner;

public class if_else_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age(as integer)");
        int age = sc.nextInt();
        if (age >=18)
        {
        System.out.println("we can vote");
        }
        else
        {
            System.out.println("we can not vote");
        }


    }
}
