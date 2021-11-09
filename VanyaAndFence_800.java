//https://codeforces.com/problemset/problem/677/A
import java.util.Scanner;

public class VanyaAndFence_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = scanner.nextInt();
        int height = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        int[] heightOfEachPerson = new int[numberOfPerson];
        for (int i = 0; i < numberOfPerson; i++) {
            heightOfEachPerson[i] = scanner.nextInt();
            if (heightOfEachPerson[i] > height) {
                count += 2;
            } else count++;
        }
        System.out.println(count);

    }
}
