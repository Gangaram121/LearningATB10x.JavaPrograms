package Jan.ex_19012025;

public class Max_3_T_O {
    public static void main(String[] args) {
        //  Finding the Largest Number , n1, n2, 3 => max(n1,n2,n3)

        // Step 1 : Find inputs /oupts
        // n1,n2,n3 -> data type -> int
        // o/p ->  int
        // 100,34,10 ->  100


        // Step 2 :  rough logic
//        n1 >= n2  -> Y1 :  N1
//        Y1 ->  n1 >= n3 : Y (n1) : N (n3)
//        N1 ->  n2 > n3  : Y (n2) : N (n3)

        int n1 = 2, n2 = 9, n3 = -11;

        //  100,34,10 ->  100

        int small = (n1 <= n2) ? ((n1 <= n3) ? n1 : n3) : ((n2 <= n3) ? n2 : n3) ;
        System.out.println("Smallest Number: " + small);


    }
}
