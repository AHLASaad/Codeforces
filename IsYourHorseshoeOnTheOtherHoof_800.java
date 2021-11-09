//https://codeforces.com/problemset/problem/228/A
import java.util.Arrays;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ColorsOfHorseShoes = new int[4];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            ColorsOfHorseShoes[i] = scanner.nextInt();
        }
        Arrays.sort(ColorsOfHorseShoes);
        for (int i = 0; i < 4; i++) {
            if (i < 3 && ColorsOfHorseShoes[i] == ColorsOfHorseShoes[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
