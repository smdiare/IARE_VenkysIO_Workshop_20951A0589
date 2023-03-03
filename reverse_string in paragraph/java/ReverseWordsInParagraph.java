import java.util.Scanner;

public class ReverseWordsInParagraph {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String para = scanner.nextLine();
        revPara(para);
    }

    public static void revPara(String para) {
        String[] words = para.split("\\s+");
        for (String word : words) {
            System.out.print(rev(word)+" ");
        }
    }

    public static String rev(String word) {
        if (word.length() == 0) {
            return word;
        } else {
            return rev(word.substring(1)) + word.charAt(0);
        }
    }
}



