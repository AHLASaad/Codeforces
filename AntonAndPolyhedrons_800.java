//https://codeforces.com/problemset/problem/785/A
import java.util.Scanner;

public class AntonAndPolyhedrons_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPolyhedrons = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[numberOfPolyhedrons];
        int faces = 0;
        for (int i = 0; i < numberOfPolyhedrons; i++) {
            names[i] = scanner.nextLine();
            if (names[i].equals("Tetrahedron")) {
                faces += 4;
            }
            if (names[i].equals("Cube")) {
                faces += 6;
            }
            if (names[i].equals("Octahedron")) {
                faces += 8;
            }
            if (names[i].equals("Dodecahedron")) {
                faces += 12;
            }
            if (names[i].equals("Icosahedron")) {
                faces += 20;
            }
        }
        System.out.println(faces);
    }
}

