package February.ex_07022025;

import javax.xml.transform.Source;

public class Inverted_Right_Angled_Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
