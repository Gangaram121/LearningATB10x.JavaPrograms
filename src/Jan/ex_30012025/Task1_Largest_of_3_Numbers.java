package Jan.ex_30012025;

import java.sql.SQLOutput;

public class Task1_Largest_of_3_Numbers {
    public static void main(String[] args) {
       int a=100;
       int b=20;
       int c=30;
       if(a>b && a>c){
           System.out.println("a is largest");
       }
       else if(b>c){
           System.out.println("b is largest");
       }
       else{
           System.out.println("c is largest");
       }
    }
}
