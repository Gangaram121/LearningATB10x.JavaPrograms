package Jan.ex_29012025_task;

import java.util.Scanner;

public class Positive_Negative_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else if (n==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
