package pckg_zd1;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nizOne = {"Vasa","vana plurimum","sonant"};
        String[] niztwo = new String[4];

        for (int i=0; i<niztwo.length; i++){
            System.out.print("Unesite element za drugi niz: ");
            niztwo[i] = scanner.nextLine();

        }
        System.out.println("Prvi niz: " + nizOne[0] + " " +  nizOne[1] + " " + nizOne[2]);


        System.out.println("Drugi niz: ");
            for (String element : niztwo){
                System.out.println(element);
            }

        }



    }

