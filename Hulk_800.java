//https://codeforces.com/problemset/problem/705/A
import java.util.Scanner;

public class Hulk_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.print("I hate it ");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i == 1) {
                    System.out.print("I hate that ");
                }
                if (i > 1 && i < number && i % 2 == 0) {
                    System.out.print("I love that ");
                } else if (i > 1 && i < number && i % 2 != 0) {
                    System.out.print("I hate that ");
                }
                if (i == number && i % 2 == 0) {
                    System.out.print("I love it ");
                } else if (i == number && i % 2 != 0) {
                    System.out.print("I hate it ");
                }
            }
        }

    }
}
