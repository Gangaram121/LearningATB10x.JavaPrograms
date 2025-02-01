package Jan.ex_30012025;

public class Task3_Smallest_of_3_Numbers {
    public static void main(String[] args) {
        int a=100;
        int b=20;
        int c=30;
        if (a<b && a>c){
            System.out.println("a is smallest");
        }
        else if(b<c){
            System.out.println("b is smallest");
        }
        else {
            System.out.println("c is smallest");
        }
    }
}
