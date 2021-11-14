package Homework;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray
{

    public static void main(String[] args) {

//        Uzrakstīt programmu klasē "SortArray", kas aicina lietotāju ievadīt masīva izmēru robežās no 20 līdz 40
//        1) Programma izveido int masīvu ar izmēru, ko saņēma no lietotāja
//        2) Masīvs tiek aizpildīts ar gadījuma skaitļiem(int) robežās no 10 līdz 99
//        3) Izvadam uz ekrāna visus masīvā esošos skaitļus atdalītus ar komatu un atstarpi
//        4) Veicam masīvā esošo elementu kārtošanu augošā secībā (neveidojam jaunu masīvu)
//        5) Izvadam uz ekrāna sakārtotos masīva elementus

        Scanner sc = new Scanner(System.in);          // Izveidoju skeneri ar nosaukumu sc
        Random r = new Random();                      // Izveidoju randomaizeri ar nosaukumu r
        System.out.println("Lūdzu ievadiet masīva izmēru robežās no 20 līdz 40"); // Lūdzu lietotājam ievadīt skaitli
        int[] myArr = new int[sc.nextInt()];          // Izveidoju masīvu ar izmēru, ko saņēma no lietotāja

        // TRENIŅA NOLŪKOS.
        // Te es mēģinu manuāli ievadīt noteiktam ( šājā gadījumā 21 ) elementam random vērtību
        // (kā arī pats varu katram elementam iedot vērtību nezimantojot randomaizeri)
//
//        myArr[0] = r.nextInt(10,100);
//        myArr[1] = r.nextInt(10,100);
//        myArr[2] = r.nextInt(10,100);
//        myArr[3] = r.nextInt(10,100);
//        myArr[4] = r.nextInt(10,100);
//        myArr[5] = r.nextInt(10,100);
//        myArr[6] = r.nextInt(10,100);
//        myArr[7] = r.nextInt(10,100);
//        myArr[8] = r.nextInt(10,100);
//        myArr[9] = r.nextInt(10,100);
//        myArr[10] = r.nextInt(10,100);
//        myArr[11] = r.nextInt(10,100);
//        myArr[12] = r.nextInt(10,100);
//        myArr[13] = r.nextInt(10,100);
//        myArr[14] = r.nextInt(10,100);
//        myArr[15] = r.nextInt(10,100);
//        myArr[16] = r.nextInt(10,100);
//        myArr[17] = r.nextInt(10,100);
//        myArr[18] = r.nextInt(10,100);
//        myArr[19] = r.nextInt(10,100);
//        myArr[20] = r.nextInt(10,100);

        for (int i = 0; i < myArr.length; i++)        // Ar for ciklu katram elementam iedodu random vērtību
            myArr[i] = r.nextInt(10,100);             // robežās no 10 līdz 100, noteikumā minēts līdz 99, tādēļ 100, jo pirmais sākas no 0
        System.out.println(Arrays.toString(myArr));   // Izvadu uz ekrāna visus masīvā esošos skaitlus

        for(int i = 0 ; i < myArr.length;i++)         // Cikls, kas ies cauri visam masīvam
        {
            for(int j = i; j< myArr.length;j++)       // Cikls ciklā, kas ies cauri līdz beigām, pievienos vienu
            {
                if(myArr[i] > myArr[j])               // If statement - vai 1.elements ir lielāks par otro elementu, ja apgalvojums ir patiess, tad kaut ko daram
                {                                     // Apgalvojums ir patiess
                    int temp = myArr[i];              // Pagaidu mainīgajā pieglabājam pirmā mainīgā vērtību
                    myArr[i] = myArr[j];              // Pirmajai vērtībai pārrakstam pāri jauno vērtību
                    myArr[j] = temp;                  // Veco vērtību samainu uz iepriekš pieglabāto vēŗtību no 1.elemnta
                }
            }
        }
        System.out.println(Arrays.toString(myArr));   // Izvadu uz ekrāna sakārtotos masīva elementus
    }
}
