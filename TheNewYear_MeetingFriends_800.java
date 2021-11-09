//https://codeforces.com/problemset/problem/723/A
import java.util.Scanner;

public class TheNewYear_MeetingFriends_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] friends = new int[3];
        int min = 101, max = 0;
        for (int i = 0; i < 3; i++) {
            friends[i] = scanner.nextInt();
            if (friends[i] > max) {
                max = friends[i];
            }
            if (friends[i] < min) {
                min = friends[i];
            }
        }
        System.out.println(max - min);
    }
}
