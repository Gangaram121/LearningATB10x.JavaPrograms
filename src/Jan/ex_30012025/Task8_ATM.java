package Jan.ex_30012025;

import java.util.Scanner;

public class Task8_ATM {
    public static void main(String[] args) {
        int account_balance=10000;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the amount to be withdraw : " );
        int withdraw=scan.nextInt();

        if(withdraw<=0)
        {
            System.out.println("Enter the VALID amount");
            scan.close();
            return;
        }
        else if (withdraw%100!=0)

        {
            System.out.println("Amount should be multiple of 100");
            scan.close();
            return;
        }
        else if(withdraw>account_balance)
        {
            System.out.println("Insufficient balance");
            scan.close();
            return;
        }
        account_balance-=withdraw;
        System.out.println("Transition sucessful");
        System.out.println("Balance amount is " +account_balance);
    }
}
