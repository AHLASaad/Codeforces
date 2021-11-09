//https://codeforces.com/problemset/problem/122/A
import java.util.Scanner;

public class LuckyDivision_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a lucky number :");
        int luckyNumber = scanner.nextInt();
        scanner.nextLine();
        while (luckyNumber < 1 || luckyNumber > 1000) {
//            System.out.println("Enter a lucky number :");
            luckyNumber = scanner.nextInt();
            scanner.nextLine();
        }
        boolean isLucky = true;
        String luckyNumberString =  Integer.toString(luckyNumber);
        for (int i = 0; i < luckyNumberString.length(); i++) {
            if (luckyNumberString.charAt(i) != '4' && luckyNumberString.charAt(i) != '7') {
                isLucky = false;
            }
        }
        boolean isDivisibleByLucky = true;
        if (luckyNumber % 4 == 0 || luckyNumber % 7 == 0 || luckyNumber % 44 == 0 || luckyNumber % 47 == 0 | luckyNumber % 74 == 0 || luckyNumber % 77 == 0 || luckyNumber % 444 == 0 || luckyNumber % 447 == 0 || luckyNumber % 477 == 0) {
            isDivisibleByLucky = true;
        } else {
            isDivisibleByLucky = false;
        }
        if (isLucky || isDivisibleByLucky) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
