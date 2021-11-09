//https://codeforces.com/problemset/problem/133/A
import java.util.Scanner;

public class HQ9plus_900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean isHQ9plusLanguage = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'H' || line.charAt(i) == 'Q' || line.charAt(i) == '9' ) {
                isHQ9plusLanguage = true;
            }
        }
        if (isHQ9plusLanguage) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
