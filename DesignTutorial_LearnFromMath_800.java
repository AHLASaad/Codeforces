//https://codeforces.com/problemset/problem/472/A
import java.util.Scanner;

public class DesignTutorial_LearnFromMath_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number-4+" 4");
        }else System.out.println(number-9+" 9");
    }
}
