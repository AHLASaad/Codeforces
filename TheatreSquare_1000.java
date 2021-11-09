import java.util.Scanner;

public class TheatreSquare_1000 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long n = reader.nextInt();
        long m = reader.nextInt();
        long a = reader.nextInt();

        long countn=n/a;
//        System.out.println(countn);
        long countm=m/a;
//        System.out.println(countm);

        if(n%a != 0)
            ++countn;
//        System.out.println(countn);

        if(m%a != 0)
            ++countm;
//        System.out.println(countm);

        System.out.println(countn*countm);
    }
}
