package February.ex_05022025;

import java.sql.SQLOutput;

public class Print_even_numbers_from1to20_Whileloop {
    public static void main(String[] args) {
        int i=1;
        while (i<=20){
            if(i%2==0){
                System.out.println(i);

            }
            i++;
        }
    }
}
