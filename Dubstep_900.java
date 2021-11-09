//https://codeforces.com/problemset/problem/208/A
import java.util.Scanner;

public class Dubstep_900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] newString = line.split("WUB");
        for (int i = 0; i < newString.length; i++) {
            if (newString[i].compareTo(" ") != 0) {
                System.out.print(newString[i]+" ");
            }
        }
    }
}
