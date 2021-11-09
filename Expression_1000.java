//https://codeforces.com/problemset/problem/479/A
import java.util.Scanner;

public class Expression_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        if (numbers[0] + numbers[1] * numbers[2] > max) {
            max = numbers[0] + numbers[1] * numbers[2];
        }
        if (numbers[0] * (numbers[1] + numbers[2]) > max) {
            max = numbers[0] * (numbers[1] + numbers[2]);
        }
        if (numbers[0] * numbers[1] * numbers[2] > max) {
            max = numbers[0] * numbers[1] * numbers[2];
        }
        if ((numbers[0] + numbers[1]) * numbers[2] > max) {
            max = (numbers[0] + numbers[1]) * numbers[2];
        }
        if (numbers[0] + numbers[1] + numbers[2] > max) {
            max = numbers[0] + numbers[1] + numbers[2];
        }
        System.out.println(max);
    }
}
