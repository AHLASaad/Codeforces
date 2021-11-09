//Input
//The first line contains a word s — it consists of uppercase and lowercase Latin letters and possesses the length from 1 to 100.
//
//Output
//Print the corrected word s. If the given word s has strictly more uppercase letters, make the word written in the uppercase register, otherwise - in the lowercase one.
//
//Examples
//input
//HoUse
//output
//house
//input
//ViP
//output
//VIP
//input
//maTRIx
//output
//matrix
import java.util.Scanner;

public class Word_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = scanner.nextLine();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (int i = 0; i < word.length(); i++) {
            while (!Character.isLetter(word.charAt(i))) {
                System.out.println("Enter a word : ");
                word = scanner.nextLine();
                i = 0;
            }
            if (Character.isUpperCase(word.charAt(i))) {
                upperCaseCount++;
            }
            if (Character.isLowerCase(word.charAt(i))) {
                lowerCaseCount++;
            }
        }
        if (lowerCaseCount >= upperCaseCount) {
            System.out.println(word.toLowerCase());
        } else System.out.println(word.toUpperCase());
    }
}
