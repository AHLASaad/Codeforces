//https://codeforces.com/problemset/problem/581/A
import java.util.Scanner;

public class VasyaTheHipster_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            a -= b;
            a /= 2;
            System.out.println(b + " " + a);
        } else {
            b -= a;
            b /= 2;
            System.out.println(a + " " + b);
        }
    }
}
