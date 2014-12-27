package pololetni_prace;

import java.util.*;

public class Kalendar {
	public static void main (String [] args) {
			if (args.length == 0) {
				System.out.printf("Vypisu aktualni mesic tohoto roku \n");
				Calendar gcalendar = Calendar.getInstance();
				int month = gcalendar.get(Calendar.MONTH);
				int maxdate = gcalendar.getActualMaximum(Calendar.DATE);
				gcalendar.set(Calendar.DATE, 0);
				int firstday = gcalendar.get(Calendar.DAY_OF_WEEK);
				tiskniOramovanyKalendar(firstday, month, maxdate);
			}
			else {
				if (args.length == 1) {
					System.out.printf("Vypisu zadany mesic aktualniho roku");
					int y = Integer.parseInt(args[0]);
					Calendar gcalendar = Calendar.getInstance();
					gcalendar.set(Calendar.MONTH, y - 1);
					int z = gcalendar.getActualMaximum(Calendar.DATE);
					gcalendar.set(Calendar.DATE, 0);
					int x = gcalendar.get(Calendar.DAY_OF_WEEK);
			    	tiskniOramovanyKalendar(x, y - 1, z);
				}
				else {
					System.out.printf("Vypisu rok a mesic dle zadani");
					int a = Integer.parseInt(args[0]);
					int b = Integer.parseInt(args[1]);
					Calendar gcalendar = Calendar.getInstance();
					gcalendar.set(Calendar.YEAR, b);
					gcalendar.set(Calendar.MONTH, a - 1);
					int d = gcalendar.getActualMaximum(Calendar.DATE);
					gcalendar.set(Calendar.DATE, 0);
					int c = gcalendar.get(Calendar.DAY_OF_WEEK);
					tiskniOramovanyKalendar(c, a - 1, d);
				}
			}
	}
	private static void tiskniNazevMesice(int mesic) {
		if      (mesic ==  0) { System.out.printf("        leden         "); }
        else if (mesic ==  1) { System.out.printf("         unor         "); }
        else if (mesic ==  2) { System.out.printf("        brezen        "); }
        else if (mesic ==  3) { System.out.printf("        duben         "); }
        else if (mesic ==  4) { System.out.printf("        kveten        "); }
        else if (mesic ==  5) { System.out.printf("        cerven        "); }
        else if (mesic ==  6) { System.out.printf("       cervenec       "); }
        else if (mesic ==  7) { System.out.printf("        srpen         "); }
        else if (mesic ==  8) { System.out.printf("        zari          "); }
        else if (mesic ==  9) { System.out.printf("        rijen         "); }
        else if (mesic ==  10) { System.out.printf("       listopad       "); }
        else                  { System.out.printf("       prosinec       "); }
	}
	private static void tiskniOramovanyKalendar(int startDen, int mesic, int pocetDni) {
		System.out.printf("\n+----------------------+\n|");
		tiskniNazevMesice(mesic);
		System.out.printf("|\n");
		System.out.printf("+----------------------+\n");
		System.out.printf("| Po Ut St Ct Pa So Ne |\n");
		int sloupec = startDen;
		for (int i = 1; i <= startDen; i++) {
			if (i < startDen) {
            	System.out.printf("   ");            
            }
        }
        for (int den = 1; den <= pocetDni; den++) {
        	if (sloupec == 1) {
            	System.out.printf("|");
            }
            	System.out.printf("%3d", den);	            
            if (sloupec == 7) {
            	System.out.printf(" |\n");
                sloupec = 1;
            } else {
                sloupec++;
            }
        }
        if (sloupec > 1) {
        	while (sloupec !=8) {
        		System.out.printf("   ");
        		sloupec++; 
        	}            
        }
        System.out.printf(" |\n");
        System.out.printf("+----------------------+\n");
	}
}
