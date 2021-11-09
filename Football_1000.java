//Petya loves football very much. One day, as he was watching a football match, he was writing the players' current positions on a piece of paper. To simplify the situation he depicted it as a string consisting of zeroes and ones. A zero corresponds to players of one team; a one corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is considered dangerous. For example, the situation 00100110111111101 is dangerous and 11110111011101 is not. You are given the current situation. Determine whether it is dangerous or not.
//
//Input
//The first input line contains a non-empty string consisting of characters "0" and "1", which represents players. The length of the string does not exceed 100 characters. There's at least one player from each team present on the field.
//
//Output
//Print "YES" if the situation is dangerous. Otherwise, print "NO".
//
//Examples
//inputCopy
//001001
//outputCopy
//NO
//inputCopy
//1000000001
//outputCopy
//YES
import java.util.Scanner;

public class Football_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] stringToChar = line.toCharArray();
        int count = 0;
        for (int i = 1; i < stringToChar.length; i++) {
            if (stringToChar[i - 1] == stringToChar[i]) {
                count++;
                if (count == 6) {
                    System.out.println("YES");
                    break;
                }
            } else {
                count = 0;
            }
        }
        if (count != 6) {
            System.out.println("NO");
        }

    }
}
