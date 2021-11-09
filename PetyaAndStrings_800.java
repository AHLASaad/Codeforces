//Input
//Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.
//
//Output
//If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.
//
//Examples
//input
//aaaa
//aaaA
//output
//0
//input
//abs
//Abz
//output
//-1
//input
//abcdefg
//AbCdEfF
//output
//1
import java.util.Scanner;

public class PetyaAndStrings_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string :");
        String string2 = scanner.nextLine();
        while (string1.length() != string2.length()) {
            System.out.println("Enter the first string :");
            string1 = scanner.nextLine();
            System.out.println("Enter the second string :");
            string2 = scanner.nextLine();
        }
        int string1CompareString2 = string1.toLowerCase().compareTo(string2.toLowerCase());

        if (string1CompareString2 ==0) {
            System.out.println(0+" means "+string1+" is equal to "+string2+" ");
        }
        if (string1CompareString2 >= 1) {
            System.out.println(1+" means "+string1+" is big than  "+string2+" ");
        }
        if (string1CompareString2<=-1) {
            System.out.println(-1+" means "+string1+" is less than "+string2+" ");
        }

    }
}
