package February.ex_01022025;

import java.util.Scanner;

public class Task4_TypeofWebsiteBasedonDomain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the site URl");
        String domain = sc.nextLine();
        String website_url = sc.next().toLowerCase();
        if (website_url.endsWith("xyz")) {
            System.out.println("The website type is: Unknown or other types of websites");
        } else if (website_url.endsWith("com")) {
            System.out.println("The website type is: Commercial");
        } else if (website_url.endsWith("org")) {
            System.out.println("The website type is: Organization");
        } else if (website_url.endsWith("net")) {
            System.out.println("The website type is: Network");
        } else if (website_url.endsWith("gov")) {
            System.out.println("The website type is: Government");
        } else if (website_url.endsWith("edu")) {
            System.out.println("The website type is: Educational Institution");
        } else if (website_url.endsWith("info")) {
            System.out.println("The website type is: Informational");
        } else {
            System.out.println("Invalid domain");
        }

    }

}
