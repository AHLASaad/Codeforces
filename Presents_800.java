//https://codeforces.com/problemset/problem/136/A
import java.util.Scanner;

public class Presents_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int[] gifts = new int[people];
        for (int i = 0; i <people; i++) {
            gifts[i] = scanner.nextInt();
        }
        int count = 0;
        int i = 1;
        while (i <= people) {
            if (gifts[count] == i) {
                System.out.print((count + 1) + " ");
                i++;
            }
            count++;
            if (count == people - 1) {
                if (gifts[count] == i) {
                    System.out.print((count + 1) + " ");
                    i++;
                }
                count = 0;
            }
        }

    }
}
