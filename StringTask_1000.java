//Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:
//
//deletes all the vowels,
//inserts a character "." before each consonant,
//replaces all uppercase consonants with corresponding lowercase ones.
//Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.
//
//Help Petya cope with this easy task.
//
//Input
//The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.
//
//Output
//Print the resulting string. It is guaranteed that this string is not empty.
//
//Examples
//inputCopy
//tour
//outputCopy
//.t.r
//inputCopy
//Codeforces
//outputCopy
//.c.d.f.r.c.s
//inputCopy
//aBAcAba
//outputCopy
//.b.c.b
import java.util.Arrays;
import java.util.Scanner;

public class StringTask_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter string : ");
        String string = scanner.nextLine();
        String newString = string.toLowerCase();
        char[] a = newString.toCharArray();
//        System.out.println(newString);
        for (int i = 0; i < string.length(); i++) {
            if (a[i] == 'a' || a[i] == 'A' || a[i] == 'e' || a[i] == 'E' || a[i] == 'i' || a[i] == 'I' || a[i] == 'o' || a[i] == 'O' || a[i] == 'u' || a[i] == 'U' || a[i] == 'Y' || a[i] == 'y'|| a[i] == ' ' ) {
                continue;
            } else {
                System.out.print("."+a[i]);
            }
        }


    }
}
