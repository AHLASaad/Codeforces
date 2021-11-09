//https://codeforces.com/problemset/problem/703/A
import java.util.Scanner;

public class MishkaAndGame_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int countM = 0;
        int countC = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int c = scanner.nextInt();
            scanner.nextLine();
            if (m > c) {
                countM++;
            } else if (c > m) {
                countC++;
            }
        }
        if (countC > countM) {
            System.out.println("Chris");
        } else if (countM > countC) {
            System.out.println("Mishka");
        }else System.out.println("Friendship is magic!^^");
    }
}
