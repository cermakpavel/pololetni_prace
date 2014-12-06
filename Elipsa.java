/*Program, který vykreslí elipsu dle polomìrù, které zadá uživatel*/
/*Využil jsem kód z øešení vykreslení kruhu v lekci 8 http://alej.alisma.cz/prog/pg08/kruh.html*/
package pololetni_prace;

public class Elipsa {
    /* Je bod na souøadnicích [x,y] v elipse K([0,0], a=polomer1, b=polomer2)? */
    private static boolean vElipse(double x, double y, double polomer1, double polomer2) {
        return (x/polomer1)*(x/polomer1)+(y/polomer2)*(y/polomer2) < 1;
    }
     
    /*Zjistíme rozsah (velikost elipsy)*/
    public static void kresli(double polomer1, double polomer2) {
        for (double y = -polomer2; y <= polomer2; y++) {
            for (double x = -polomer1; x <= polomer1; x++) {
                char znak = vElipse(x, y, polomer1, polomer2) ? 'X' : ' ';
                System.out.printf("%c", znak);
            }
            System.out.println();
        }
    }
     
    /*Vypíšeme elipsu*/
    public static void ukaz(double polomer1, double polomer2) {
        kresli(polomer1, polomer2);
        System.out.printf("\n\n");
    }
     
    public static void main(String[] args) {
    	double x = Integer.parseInt(args[0]);
    	double y = Integer.parseInt(args[1]);
    	ukaz(x,y);
    }
}
