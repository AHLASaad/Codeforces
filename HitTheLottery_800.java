//https://codeforces.com/problemset/problem/996/A
import java.util.Scanner;

public class HitTheLottery_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        if (number / 100 != 0) {
            count += (number / 100);
            number -= (number / 100) * 100;
        }

        if (number / 20 !=0) {
            count += (number / 20);
            number -= (number / 20) * 20;
        }

        if (number / 10 !=0) {
            count += (number / 10);
            number -= (number / 10) * 10;
        }

        if (number / 5 !=0) {
            count += (number / 5);
            number -= (number / 5) * 5;
        }

        count += number;

        System.out.println(count);
    }
}
