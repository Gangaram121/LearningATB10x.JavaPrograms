package Jan.ex_29012025_task;

import java.util.Scanner;

public class Vowel_Consonant_task4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the letter to check whether its vowel or constant");
        char n=sc.next().charAt(0);
        n = Character.toLowerCase(n);

        if(n=='a'|| n=='e'|| n=='i'|| n=='o'||n=='u'){
            System.out.println("This character is Vowels " +n);
        }
        else{
            System.out.println("This character is Consonants " +n);
        }

    }
}