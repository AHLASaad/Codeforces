//Input
//The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
//
//Output
//Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
//
//Examples
//input//
//4
//word
//localization
//internationalization
//pneumonoultramicroscopicsilicovolcanoconiosis
//output//
//word
//l10n
//i18n
//p43s
import java.util.Scanner;

public class WayTooLongWords_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        scanner.nextLine();
        while (number < 1 || number > 100) {
            number = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Enter a string : ");
            String string = scanner.nextLine();
            if (string.length()>10) {
                System.out.println(string.charAt(0)+""+(string.length()-2)+""+string.charAt(string.length()-1));
            }else {
                System.out.println(string);
            }
        }

    }
}
