package Jan.ex_25012025;

import java.util.Scanner;

public class If_elseif_else_1 {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59


        // Logic Building - Java


        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) | data type -> int
        // Output | grade -> data type -> char


        // Step 2. Basic Logic |  Rough Logic
        // if ( score >=90 && score <=100 -> return or print grade  - A
        // else if ( score >=80 && score >=80-> return or print grade  - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,
        //  // else -> grade -> F

        // 3. Write the code
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        char grade = 'F';
        if (score >=90 && score <=100)
        {
            grade = 'A';
        } else if (score >=80 && score <=89)
        {
            grade = 'B';
        }
        else if (score >=70 && score <=79)
        {
            grade = 'C';
        } else if (score >=60 && score <=69) {
           grade = 'D';

        }
        else if (score > 0 || score >100){
            System.out.println("god is score");


            grade = 'O';
        }
      else
        {
            grade = 'F';
        }
        System.out.println("your grade is ->" + grade);
    }
}
