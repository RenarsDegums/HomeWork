package Homework;

import java.util.Scanner;

public class X_Y_coordinates
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet X:");
        int x = sc.nextInt();

        System.out.println("Ievadiet Y:");
        int y = sc.nextInt();

        if((x > -2 && x < 3) && (y > -4 && y <1)) {
            System.out.println("Koordinātas (x;y) atrodas figūras iekšienē!");

        } else if ((x >= -2 && x <= 3) && (y >= -4 && y <= 1)) {
            System.out.println("Koordinātas (x;y) atrodas uz figūras līnijas!");

        } else {
            System.out.println("Koordinātas (x;y) atrodas figūras ārpusē!");
        }
    }
}
