package Jan.ex_30012025;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Task5_Grade_Based_on_Marks {
    public static void main(String[] args) {
//    Marks Range Grade
//90 - 100  A+
//  80 - 89  A
//70 - 79  B
//60 - 69 C
//50 - 59 D
//40 - 49 E
//Below 40 Fail
        Scanner Sc  = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = Sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A+");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade A");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade B");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade C");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade D");
        } else if (marks >= 40 && marks <= 49) {
            System.out.println("Grade E");
        } else if (marks < 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered");
        }

}
}
