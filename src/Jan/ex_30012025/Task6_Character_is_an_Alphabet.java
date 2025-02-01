package Jan.ex_30012025;

import java.util.Scanner;

public class Task6_Character_is_an_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
    }
}
//output:
//Enter the alphabets
//0,1,2 is not an alphabet.
//Enter the alphabets
//H,b,v,d is an alphabets
