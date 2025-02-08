package February.ex_07022025;

public class FactorialofaNumber {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        for (int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
//Factorial number count
//5*1=5
//4*5=20
//3*20=60
//2*60=120
//1*120=120
