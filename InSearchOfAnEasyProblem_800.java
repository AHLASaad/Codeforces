//https://codeforces.com/problemset/problem/1030/A
import java.util.Scanner;

public class InSearchOfAnEasyProblem_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = scanner.nextInt();
        scanner.nextLine();
        boolean isHard = false;
        int[] opinions = new int[numberOfPerson];
        for (int i = 0; i < numberOfPerson; i++) {
            opinions[i] = scanner.nextInt();
            if (opinions[i] == 1) {
                isHard = true;
            }
        }
        if (isHard) {
            System.out.println("HARD");
        }else System.out.println("EASY");
    }
}
