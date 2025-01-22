package Jan.ex_18012025;

public class concatenationinterview {
    public static void main(String[] args) {
        String first_name = "Ram";
        String last_name = "Yadav";
        int a = 30;
        int b = 40;

        System.out.println(first_name + last_name + a + b);
        // ramyadav3040 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // First + math -> 70Ramyadav



        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub

    }
}
