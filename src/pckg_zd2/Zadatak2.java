package pckg_zd2;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj mjerenja: ");
        int brojMjerenja = scanner.nextInt();

        double[] temp = new double[brojMjerenja];
        double suma = 0;

        for (int i=0; i<brojMjerenja; i++){
            System.out.print("Unesi temperaturu: ");
            temp[i] = scanner.nextDouble();
            suma+=temp[i];
        }
        int iznad = 0;
        int ispod = 0;
        double prosjecna = suma/brojMjerenja;

        for (int i=0; i<brojMjerenja;i++){
            if (temp[i] > prosjecna){
                iznad++;
            }
            else {
                ispod++;
            }
        }
        System.out.println("Broj mjerenja: " + brojMjerenja);
        System.out.println("Prosječna temperatura: " + prosjecna);
        System.out.println("Broj mjerenja iznad prosjeka: " + iznad);
        System.out.println("Broj mjerenja ispod prosjeka: " + ispod);




    }
}
