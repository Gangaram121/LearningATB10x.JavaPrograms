package February.ex_01022025;

import java.util.Scanner;

public class Task3_SeniorCitizenBasedonAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>0 && age<=12) {
            System.out.println("child");
        }
        else if (age>=13 && age<=19) {
            System.out.println("teenager");
        }
        else if (age>=20 && age<=64){
            System.out.println("Adult ");
        }
        else if (age>=65){
            System.out.println("Senior Citizen");
        }
        else {
            System.out.println("Invalid age");
        }

    }
}
//Implement Age Category Logic:
//
//Define the criteria for different age categories:
//
//Child: Age 0 to 12
//
//Teenager: Age 13 to 19
//
//Adult: Age 20 to 64
//
//Senior Citizen: Age 65 and older