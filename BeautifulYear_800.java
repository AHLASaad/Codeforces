//https://codeforces.com/problemset/problem/271/A
import java.util.Scanner;

public class BeautifulYear_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        for (int i = 1000; i <= 9000; i++) {
            year = String.valueOf(Integer.parseInt(year) + 1);
            if (year.charAt(0)!=year.charAt(1) && year.charAt(0)!=year.charAt(2)
                    && year.charAt(0)!=year.charAt(3) && year.charAt(1)!=year.charAt(2)
                    && year.charAt(1)!=year.charAt(3) && year.charAt(2)!=year.charAt(3))
            break;
        }
        System.out.println(year);
    }
}

