//https://codeforces.com/problemset/problem/61/A
import java.util.Scanner;

public class UltraFastMathematician_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        String output ="";
        for (int i = 0; i < number1.length(); i++) {
            if (number1.charAt(i) == number2.charAt(i)) {
                output += "0";
            } else output += "1";
        }
        System.out.println(output);
    }
}
