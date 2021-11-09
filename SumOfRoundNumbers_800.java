//https://codeforces.com/problemset/problem/1352/A
import java.util.Scanner;

public class SumOfRoundNumbers_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] numbers = new int[t];
        int[][] result = new int[t][4];
        int count = 0;
        for (int i = 0; i < t; i++) {
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        int index = 0;
        for (int i = 0; i < t; i++) {
            if (numbers[i] / 10000 != 0) {
                count++;
                result[i][index] = (numbers[i] / 10000) * 10000;
                numbers[i] -= (numbers[i] / 10000) * 10000;
                index++;
            }
            if (numbers[i] / 1000 != 0) {
                count++;
                result[i][index] = (numbers[i] / 1000) * 1000;
                numbers[i] -= (numbers[i] / 1000) * 1000;
                index++;
            }
            if (numbers[i] / 100 != 0) {
                count++;
                result[i][index] = (numbers[i] / 100) * 100;
                numbers[i] -= (numbers[i] / 100) * 100;
                index++;
            }
            if (numbers[i] / 10 != 0) {
                count++;
                result[i][index] = (numbers[i] / 10) * 10;
                numbers[i] -= (numbers[i] / 10) * 10;
                index++;
            }
            for (int j = 9; j >= 2; j--) {
                if (numbers[i] / j != 0) {
                    count++;
                    result[i][index] = (numbers[i] / j) * j;
                    numbers[i] -= (numbers[i] / j) * j;
                    index++;
                }
            }
            if (numbers[i] == 1) {
                count++;
                result[i][index] = 1;
                numbers[i]--;
                index++;
            }
            if (numbers[i] == 0) {
                System.out.println(count);
                index = 0;
                for (int k = 0; k < 4; k++) {
                    if (result[i][k] != 0) {
                        System.out.print(result[i][k]+" ");
                    }
                }
            }
            count = 0;
            System.out.println();
        }
    }
}
