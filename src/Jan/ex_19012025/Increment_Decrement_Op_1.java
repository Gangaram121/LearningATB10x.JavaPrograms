package Jan.ex_19012025;

public class Increment_Decrement_Op_1 {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(a++ + ++a);

        // a++ -> A - ExpA  -> 10 , a -> 11 - U1
        // +
        // ++a -> B -> ExpB -> 12 + 1 ,  a -> 12 - U2
        // ExpA + ExpB -> 22

        int a = 10;
        System.out.println(++a + ++a);

        // a++ -> A - ExpA  -> 1+10 , a -> 11 - U1
        // +
        // ++a -> B -> ExpB -> 1+11  ,  a -> 12 - U2
        // ExpA + ExpB -> 22

    }
}
