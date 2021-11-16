package Homework;

import java.util.Random;
import java.util.Scanner;


public class Matrices
{

    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String atbilde;
        String answer = "";

        do
        {
            int userInput = 0;

            int[][] array2D = new int[r.nextInt(3, 6)][r.nextInt(3, 6)];

            System.out.println("""
                    1] Aizpildīt masīvu ar nejauši uzģenerētām vērtībām
                    2] Aizpildīt masīvu manuāli
                    """);

            userInput = sc.nextInt();

            switch (userInput)
            {
                case 1:
                    for (int i = 0; i < array2D.length; i++)
                    {
                        for (int j = 0; j < array2D[i].length; j++)
                        {
                            array2D[i][j] = r.nextInt(1, 101);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < array2D.length; i++)
                    {
                        for (int j = 0; j < array2D[i].length; j++)
                        {
                            System.out.printf("%-5d", array2D[i][j]);
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < array2D.length; i++)
                    {
                        for (int j = 0; j < array2D[i].length; j++)
                        {
                            System.out.printf("Masīva elements [%d][%d]", i, j);
                            array2D[i][j] = sc.nextInt();
                        }
                    }
                    break;
                default:
                    System.out.println("Ievadītā izvēle neatbilst paredzētajām operācijām!");
                    System.out.println("Vai vēlies atkārtot savu izvēli? jā vai nē");
                    answer = sc.next();
            }
            while (answer.equals("jā"));


            for (int i = 0; i < array2D.length; i++)
            {
                for (int j = 0; j < array2D[i].length; j++)
                {
                    System.out.printf("%-5d", array2D[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            for (int row = 0; row < array2D.length; row++)
            {
                for (int column = 0; column < array2D[row].length; column++)
                {

                    if (column == row) ;
                    else
                        array2D[row][column] = 0;
                }
            }
            for (int i = 0; i < array2D.length; i++)
            {
                for (int j = 0; j < array2D[i].length; j++)
                {
                    System.out.printf("%-5d", array2D[i][j]);
                }
                System.out.println();

            }
            System.out.println("Programmas beigas.");
            System.out.println("Vai vēlies atkārtot programmu? jā vai nē");
            atbilde = sc.next();
        }
        while (atbilde.equals("jā"));

        sc.close();
    }
}