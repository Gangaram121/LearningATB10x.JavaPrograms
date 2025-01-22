package Jan.ex_19012025;

public class Test2 {
    public static void main(String[] args) {
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
        int marks = 60;

        String result = (marks >=90 && marks <= 100) ? " A Grade" :
                (marks >=80 && marks <= 89) ? " B Grade":
                        (marks >=70 && marks <= 79) ? " C Grade" :
                                (marks >=60 && marks <= 69) ? " D Grade":
                                        (marks >=0 && marks <= 59) ? " F Grade" :"Enter Input";

        System.out.println(result);
    }

}
