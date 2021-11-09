//"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.
//
//A total of n participants took part in the contest (n≥k), and you already know their scores. Calculate how many participants will advance to the next round.
//
//Input
//The first line of the input contains two integers n and k (1≤k≤n≤50) separated by a single space.
//
//The second line contains n space-separated integers a1,a2,...,an (0≤ai≤100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n-1 the following condition is fulfilled: ai≥ai+1).
//
//Output
//Output the number of participants who advance to the next round.
//
//Example
//input
//8 5
//10 9 8 7 7 7 5 5
//output
//6
//input
//4 2
//0 0 0 0
//output
//0
import java.util.Arrays;
import java.util.Scanner;

public class NextRound_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(Arrays.toString(firstLineWithoutSpace));
        int[] firstLineInteger = {0, 70};
            while ( firstLineInteger[0] < firstLineInteger[1] || firstLineInteger[0] < 1 || firstLineInteger[0] > 50 || firstLineInteger[1] < 1 || firstLineInteger[1] > 50) {
                System.out.println("Enter the number of participants and the place that participants will advance to the next round:");
                 String firstLine = scanner.nextLine();
                 String[] firstLineWithoutSpace = firstLine.split(" ");
                for (int j = 0; j < 2; j++) {
                    firstLineInteger[j] = Integer.parseInt(firstLineWithoutSpace[j]);
                }
                System.out.println(Arrays.toString(firstLineInteger));
            }

        System.out.println("Enter score of each " + firstLineInteger[0] + " participants in increasing order :");
        String secondLine = scanner.nextLine();
        String[] secondLineWithoutLine = secondLine.split(" ");
        int[] secondLineInteger = new int[firstLineInteger[0]];
        for (int i = 0; i < firstLineInteger[0]; i++) {
            secondLineInteger[i] = Integer.parseInt(secondLineWithoutLine[i]);
//            System.out.println(secondLineInteger[i]);
            if (i > 0) {
                while (secondLineInteger[i-1] < secondLineInteger[i] || secondLineInteger[i - 1] < 0 || secondLineInteger[i - 1] > 100) {
                    System.out.println("Enter score of each " + firstLineInteger[0] + " participants in increasing order :");
                    secondLine = scanner.nextLine();
                    secondLineWithoutLine = secondLine.split(" ");
                    secondLineInteger = new int[firstLineInteger[0]];
                    for (int j = 0; j < firstLineInteger[0]; j++) {
                        secondLineInteger[j] = Integer.parseInt(secondLineWithoutLine[j]);
                    }
                    i = 1;
                }
            }
        }
        int count = 0;
        System.out.println(Arrays.toString(secondLineInteger));
        for (int i = 0; i < firstLineInteger[0]; i++) {
            if (secondLineInteger[i] != 0 &&secondLineInteger[i]>=secondLineInteger[firstLineInteger[1]-1]) {
                count++;
            }
            else continue;

        }
        System.out.println("the qualified one are :"+count);
//        System.out.println(count);
    }
}
