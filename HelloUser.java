package Homework;

import java.util.Scanner;

public class HelloUser
{

    public static void main(String[] args) {
//
//        Uzrakstīt programmu klasē ar nosaukumu "HelloUser", kas
//        1) Aicina lietoāju ievadīt kādu vārdu un uzvārdu vienā rindā ar atstarpi
//        2) Sadala vārdu un uzvārdu divos mainīgajos.
//        3) Vārdu pārveido tā, lai tas sāktos ar lielo burtu un visi pārējie būtu mazie burti (Piemēram, "Kristaps")
//        4) Uzvārdu pārveido, lai tas viss sastāvētu no lielajiem burtiem (Piemēram, "KRŪMIŅŠ")
//        5) Izvada uz ekrāna pārveidoto vārdu un uzvārdu, katru savā rindiņā ievietotu single
//        quote pēdiņās(')


        Scanner sc = new Scanner(System.in);                  // Norādam, ka izmantosim šādu rīku
        System.out.print("Please enter your Name, Surname:"); // Izvadam tekstu uz ekrāna

        String str = sc.nextLine();                //Stringam iedodam vārdu, skenerim iedodam metodi.
        int lastIndexOfName = str.indexOf(' ');    // ints ar nosaukumu (l.I.O.N.),stringa nosaukums,atgriež indeksu

        String name = str.substring(0,lastIndexOfName);//Stings ar nosaukumu name,substring metode no pirmā indeksa līdz beigām/atstarpei
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();//Strings ar nosaukumu name,substringā norādam robežu,pārveršam norādīto indeksu uz lielo + substringā norādam robežu no pirmā indeksa neieskaitot līdz beigām pārvēŗst uz mazajiem burtiem.

        String surname = str.substring(lastIndexOfName + 1).toUpperCase();//Strings ar nosaukumu surname,stringma pievienojam metodi.Meklējam atstarpi LION + 1 un no šīs atstarpes lidz beigām pārvēršam visus indeksus uz lielajiem burtiem,jo nav norādītas robežas.

        name = String.format("\'%s\'",name);    // Stringam pievienojam metodi format,dubultpēdiņas, kas pieprasa tekstuālu vērtību,talāk ir speciālo zīmju kombinācija( oranžās slīpsvītras, (%) javā atslēgas simbols, kad lūlīt notiks kaut kāda formatēšana, (s) kods tam ka vēlos šo manīgo kā stringu ielikt iekšā. Bez šīm \\ izmetīs kļūdu.
        surname = String.format("\'%s\'",surname);

        System.out.println(name);        // Izprintējam vārdu uz ekrāna
        System.out.println(surname);     //Izprintējam uzvārdu uz ekrāna


    }
}
