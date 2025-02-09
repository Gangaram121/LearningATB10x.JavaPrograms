package February.ex_07022025;

public class Right_Angled_Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i=n;i>=1;i--){
            for (int a=1;a<=i;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
