package Jan.ex_19012025;

public class task_2 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++);
       System.out.println(a);
        //A + B +C
        //A->EXP1-1+10, a-11
        //B->EXP1-11, a-11+1
        //C->EXP1-12, a-12+1
        // 11 +11 + 13=34
    }
}
