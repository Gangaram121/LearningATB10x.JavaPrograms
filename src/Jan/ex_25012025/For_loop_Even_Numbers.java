package Jan.ex_25012025;

public class For_loop_Even_Numbers {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i%2==0){
            System.out.println("Even ->"+i);
            continue;
            }
            System.out.println(i);
        }
    }
}
