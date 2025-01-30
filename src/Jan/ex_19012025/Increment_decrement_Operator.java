package Jan.ex_19012025;

public class Increment_decrement_Operator {
    public static void main(String[] args) {
        // Take inputs
        // Take inputs
        String age_string = args[0]; // 100
        int age = Integer.parseInt(age_string);
        System.out.println(age);
        System.out.println(args[1]); //90
        System.out.println(args[2]); //80
        System.out.println(args[3]); //70
        System.out.println(args[4]); //60 java.lang.ArrayIndexOutOfBoundsException
        // 100 90 80 70 60

//        int age = 17;
//        String canIGoGoa = age >=18 ? "Yes" : "No";
//        System.out.println(canIGoGoa);

    }
}
