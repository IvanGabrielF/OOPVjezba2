package pckg_zd5;

public class Zadatak5 {
    public static void main(String[] args) {

        int[] mjesec = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] prihod = {125855,284569,324152,204563,452198,471326,505169,498569,367163,289568,115255,98544};
        int[] rashod = {105625,155748,198455,195251,257654,322188,355748,315782,389455,302369,109854,85223};
        int profitMjesec;
        int profitProsjek;
        int sum = 0;


        for (int i=0; i<mjesec.length; i++){
            if (prihod[i] > rashod[i]){
                profitMjesec = prihod[i] - rashod[i];
                System.out.println("Profit u " + mjesec[i] + ". mjesecu iznosi:" + profitMjesec );
                sum+=profitMjesec;
            }
            else {
                profitMjesec = rashod[i] - prihod[i];
                System.out.println("Gubitak u " + mjesec[i] + ". mjesecu je: " + profitMjesec);
                sum -= profitMjesec;

            }
        }
        System.out.println("PROSJEČNI PROFIT ZA GODINU");
        profitProsjek = sum/12;
        System.out.println("Prosječni godišnji profit je: " + profitProsjek);
    }
}
