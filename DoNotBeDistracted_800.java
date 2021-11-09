//https://codeforces.com/problemset/problem/1520/A
import java.util.Scanner;

public class DoNotBeDistracted_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[t];
        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            scanner.nextLine();
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < t; i++) {
            char[] array = new char[strings[i].length()];
            int count = 0;
            if (strings[i].length() <= 2) {
                result[i] = "YES";
            } else {
                for (int j = 1; j < array.length-1; j++) {
                    if (j == 1 && strings[i].charAt(j) != strings[i].charAt(j + 1) || strings[i].charAt(j) != strings[i].charAt(j - 1)) {
                        array[count] = strings[i].charAt(j - 1);
                        count++;
                    }
                    if (strings[i].charAt(j) != strings[i].charAt(j + 1) || strings[i].charAt(j) != strings[i].charAt(j - 1)) {
                        array[count] = strings[i].charAt(j);
                        count++;
                    }
                    if (j == array.length - 2 && strings[i].charAt(j) != strings[i].charAt(j + 1) ||strings[i].charAt(j) != strings[i].charAt(j - 1)) {
                        array[count] = strings[i].charAt(j + 1);
                    }
                }
                result[i] = "YES";
            }
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[j] == array[k] && Character.isLetter(array[k]) && Character.isLetter(array[j])) {
                        result[i] = "NO";
                    }
                }
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
