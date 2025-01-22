package Jan.ex_18012025;

public class Char1 {
    public static void main(String[] args) {
        // Chars - Store
        char c1 = 'A';
        // char c2 = "A"; // String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Ramyadav");
        System.out.println("Ram" + new_line + "yadav");
        System.out.println("Ram" + tab_line +  "Yadav");
        System.out.println("Ram"+ back_space +  "Ydav");
        System.out.println("Ram" + carriage_return + "yadav");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char ruppes = '₹';
        System.out.println("ram has "+ruppes+10);

    }
}
