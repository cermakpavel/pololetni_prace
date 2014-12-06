/*Program vypo��t� 3 odmocnina zadan�ho ��sla*/
/*Vyu�il jsem k�d z �e�en� druh� odmocniny v lekci 6 http://alej.alisma.cz/prog/pg06/sqrt.html */
package pololetni_prace;

//Vypo��t�me t�et� odmocninu pomoc� Babylonsk� metody
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
 
//Odmocninu vyp�eme    
    public static void ukaz(double cislo) {
        double moje = odmocnina(cislo);
        
        System.out.printf("Odmocnina z %f = %f\n", cislo, moje);
        System.out.printf("Pro overeni, vypocteno jinou metodou ");
        System.out.println(Math.pow(cislo, 1.0/3.0));
    }

//Zjist�me, jak� ��slo u�ivatel zadal    
    public static void main(String[] args) {
    	double x = Double.parseDouble(args[0]);
        ukaz(x);
    }
}
