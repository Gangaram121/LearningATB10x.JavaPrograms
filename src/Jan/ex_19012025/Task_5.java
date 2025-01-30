package Jan.ex_19012025;

public class Task_5 {
    public static void main(String[] args) {
        int n1=120;
        int n2=227;
        //String largest = n1 > n2 ? "n1 is greater" : "n2 is greater";
        //System.out.println(largest);
        int n3=220;
        String result = (n1>n2 && (n1>n3)) ? "n1 is greater" : (n2>n3) ?"n2 is greater": "n3 is greater";
        System.out.println(result);
    }
}
