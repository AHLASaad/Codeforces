//https://codeforces.com/problemset/problem/1367/A
import java.util.Scanner;

public class ShortSubstrings_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[number];
        for (int i = 0; i < number; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < number; i++) {
            char[] array = strings[i].toCharArray();
            for (int j = 2; j < strings[i].length(); j += 2) {
                array[j] = '*';
            }
            System.out.println(String.valueOf(array).replaceAll("\\*",""));
        }
    }
}
