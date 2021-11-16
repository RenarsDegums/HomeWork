package Homework;

import java.util.Scanner;

public class F_to_C
{

    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature/n");

        temp = sc.nextFloat();
        temp = ((temp-32)*5)/9;
        System.out.println("Celsius temperature is "+temp);
    }
}
