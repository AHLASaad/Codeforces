//https://codeforces.com/problemset/problem/1154/A
import java.util.Scanner;

public class RestoringThreeNumbers_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int sum = 0, sumIndex = 0;
        int[] abc = new int[3];
        int abcIndex = 0;
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > sum) {
                sum = numbers[i];
                sumIndex = i;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (i != sumIndex) {
                abc[abcIndex] = sum - numbers[i];
                System.out.print(abc[abcIndex]+" ");
                abcIndex++;
            }
        }

    }
}
