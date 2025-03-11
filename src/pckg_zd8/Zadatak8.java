package pckg_zd8;

import java.util.Arrays;
import java.util.Collections;

public class Zadatak8 {
    public static void main(String[] args) {

        double[] niz = {12.2, 11.1, 13.3, 8.2, 1.3, 100.2, 0.3, 300.2, 12.5, 789.3, 2.2, 34.5, 221.4, 345.4, 200.9};

        System.out.println("Niz: " + Arrays.toString(niz));

        Arrays.sort(niz);
        System.out.println("Niz silazno: ");

        for (int i = niz.length-1; i > 0; i--){
            System.out.println(niz[i] + " ");

        }




    }
}
