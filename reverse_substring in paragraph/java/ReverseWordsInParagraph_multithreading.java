import java.util.Scanner;

public class ReverseWordsInParagraph_multithreading implements Runnable {
    
    private String word;
    
    public ReverseWordsInParagraph_multithreading(String word) {
        this.word = word;
    }
    
    public void run() {
        System.out.print(rev(this.word) + " ");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String para = scanner.nextLine();
        revParaMultithread(para);
    }
    
    public static void revParaMultithread(String para) {
        String[] words = para.split("\\s+");
        Thread[] threads = new Thread[words.length];
        for (int i = 0; i < words.length; i++) {
            ReverseWordsInParagraph_multithreading rwp = new ReverseWordsInParagraph_multithreading(words[i]);
            threads[i] = new Thread(rwp);
            /*threads[i].setPriority(Thread.MIN_PRIORITY); */
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static String rev(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString();
    }
}
