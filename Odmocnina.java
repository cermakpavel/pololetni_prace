/*Program vypoèítá 3 odmocnina zadaného èísla*/
/*Využil jsem kód z øešení druhé odmocniny v lekci 6 http://alej.alisma.cz/prog/pg06/sqrt.html */
package pololetni_prace;

//Vypoèítáme tøetí odmocninu pomocí Babylonské metody
public class Odmocnina {
    public static double odmocnina(double cislo) {
    	double odm = 0;
    	double odhad = 1;
        for (int i = 0 ; i < 200; i++) {
        	odm = (1.0 / 3.0) * ((2 * odhad) + (cislo / (odhad * odhad)));
        	odhad = odm;
        }
    	return odm;
    }
 
//Odmocninu vypíšeme    
    public static void ukaz(double cislo) {
        double moje = odmocnina(cislo);
        
        System.out.printf("Odmocnina z %f = %f\n", cislo, moje);
        System.out.printf("Pro overeni, vypocteno jinou metodou ");
        System.out.println(Math.pow(cislo, 1.0/3.0));
    }

//Zjistíme, jaké èíslo uživatel zadal    
    public static void main(String[] args) {
    	double x = Double.parseDouble(args[0]);
        ukaz(x);
    }
}
