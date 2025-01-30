package Jan.ex_25012025;

import java.util.Scanner;

public class Switch_Basics_1 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = sc.nextLine();
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                System.out.println("chrome code executed");
                break;
            case "firefox":
                System.out.println("firefox code executed");
                break;
            case "edge":
                System.out.println("edge code executed");
                break;
            default:
                System.out.println("Please enter correct browser name");
                break;
        }
    }
}
