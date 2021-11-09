//https://codeforces.com/problemset/problem/443/A
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set<Character> x = new HashSet<Character>();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                x.add(line.charAt(i));
            }
        }
        System.out.println(x.size());
    }
}
