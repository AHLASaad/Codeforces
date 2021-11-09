//https://codeforces.com/problemset/problem/758/A
import java.util.Scanner;

public class HolidayOfEquality_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[number];
        int max = 0;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < number; i++) {
            if (array[i] < max) {
                sum += max - array[i];
            }
        }
        System.out.println(sum);
    }
}
