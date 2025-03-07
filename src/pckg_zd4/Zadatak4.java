package pckg_zd4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak4 {
    public static void main(String[] args) {
        // deklariranje i inicijalizacija 2D niza
        double[][] vars = new double[3][5];
        int nrows = vars.length;
        int nclmns = vars[0].length;
        double min = 500.45;
        double max = 12578.32;

        // popunjavanje vrijednosti 2D niza
        for (int i = 0; i < nrows; i++) {
            for (int j = 0; j < nclmns; j++) {

                // Generiranje slučajne vrijednosti između zadanih granica
                vars[i][j] = ThreadLocalRandom.current().nextDouble(min, max);
            }
        }

        System.out.println(Arrays.deepToString(vars));
        // Ispis 2D niza pomocu for petlje
        //      for (int k = 0; k < vars.length; k++) {
        //          System.out.println(Arrays.toString(vars[k]));
        //      }


//		 //For each petlja
//		for(double[] rw : vars) {
//			System.out.println(Arrays.toString(rw));
//		}

    }

}
// ispis nedostatan ako nam treba prilagođeniji ili detaljniji


