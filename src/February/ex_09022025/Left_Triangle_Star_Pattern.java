package February.ex_09022025;

public class Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
int n=5;
for (int i=n;i>=1;i--) {
    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
    }
}
