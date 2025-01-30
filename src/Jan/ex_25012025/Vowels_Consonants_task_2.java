package Jan.ex_25012025;

public class Vowels_Consonants_task_2 {
    public static void main(String[] args) {
        // Vowels and Consonants
        // a,e,i,o,u
        // Consonants - rest of the alphabets

//        char ch = 'R';
//        switch (ch){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonant");
//        }
        String str = "Ram babu";
        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels - " + vowels + ", Consonants - " + consonants);
    }
}
