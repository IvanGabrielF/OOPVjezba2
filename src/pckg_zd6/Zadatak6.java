package pckg_zd6;

import java.util.Arrays;

public class Zadatak6 {
    public static void main(String[] args) {
        int[] niz = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,25};
        int[] nizKopija = Arrays.copyOf(niz,15);

        boolean jesuLiJednaki = Arrays.equals(niz,nizKopija);

        if(jesuLiJednaki){
            System.out.println("Jednaki");

        }
        else {
            System.out.println("Nisu jednaki");
        }
    }




}
