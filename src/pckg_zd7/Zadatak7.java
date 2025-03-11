package pckg_zd7;

import java.util.Arrays;

public class Zadatak7 {
    public static void main(String[] args) {

        int[] [] niz = {{1,2,3},{10,20,30},{100,200,300},{5,7,900}};

        int maxVal = niz[0][0];

        for (int i=0; i<niz.length; i++){
            for (int j=0; j<niz[j].length; j++ ){
                if (niz[i][j] > maxVal){
                    maxVal = niz[i][j];
                }

            }
        }
        System.out.println("Niz je: " + Arrays.deepToString(niz));
        System.out.println("Max je: " + maxVal);


    }
}
