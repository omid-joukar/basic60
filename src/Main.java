import java.util.Scanner;

/**
 * Created by KPS on 7/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String ss = scanner.nextLine();
        String word[] = ss.split(" ");
        System.out.println(word[word.length-2]);

    }
}
