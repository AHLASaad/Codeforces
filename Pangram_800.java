//https://codeforces.com/problemset/problem/520/A
import java.util.Scanner;

public class Pangram_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberChar = scanner.nextInt();
        scanner.nextLine();
        String string = scanner.nextLine();
        String newString = string.toLowerCase();
        int count = 0;
        for (int j = 97; j <= 122; j++) {
            if (newString.contains(Character.toString((char) j))) {
                count++;
            }
        }
        if (count == 26) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
