//https://codeforces.com/problemset/problem/318/A
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOdds_900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        if (k <= (n + 1) / 2) {
            System.out.println(k*2-1);
        }else System.out.println((k-(n+1)/2)*2);
    }
}
