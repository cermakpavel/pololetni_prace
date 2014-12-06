package pololetni_prace;

public class Elipsa {
	    /* Je bod na souøadnicích [x,y] v kruhu K([0,0], r=polomer)? */
	    private static boolean vKruhu(double x, double y, double polomer1, double polomer2) {
	        return (x/polomer1)*(x/polomer1)+(y/polomer2)*(y/polomer2) == 1;
	    }
	     
	    public static void kresli(double polomer1, double polomer2) {
	        for (double y = -polomer2; y <= polomer2; y++) {
	            for (double x = -polomer1; x <= polomer1; x++) {
	                char znak = vKruhu(x, y, polomer1, polomer2) ? 'X' : ' ';
	                System.out.printf("%c", znak);
	            }
	            System.out.println();
	        }
	    }
	     
	    public static void ukaz(double polomer1, double polomer2) {
	        kresli(polomer1, polomer2);
	        System.out.printf("\n\n");
	    }
	     
	    public static void main(String[] args) {
	        ukaz(30,6);
	    }
}
