//Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.
//
//Note, that during capitalization all the letters except the first one remains unchanged.
//
//Input
//A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.
//
//Output
//Output the given word after capitalization.
//
//Examples
//input
//ApPLe
//output
//ApPLe
//input
//konjac
//output
//Konjac
import java.util.Scanner;

public class WordCapitalization_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to capitalize :");
        String word = scanner.nextLine();
        char[] lettre = word.toCharArray();
        for (int i = 0; i < lettre.length; i++) {
            while (word.length() > 1000 || word.isEmpty() || Character.isLetter(lettre[i])==false) {
                System.out.println("Enter a word to capitalize :");
                word = scanner.nextLine();
                lettre = word.toCharArray();
            }
        }
        System.out.print("The given word after capitalization is :" + Character.toUpperCase(lettre[0]));
//        System.out.print(Character.toUpperCase(lettre[0]));
        for (int i = 1; i < lettre.length; i++) {
            System.out.print(lettre[i]);
        }

    }
}
