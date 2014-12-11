import java.util.*;

public class Kalendar {
	public static void main (String [] args) {
		if (args.length == 0) {
			System.out.printf("Vypisu aktualni mesic tohoto roku \n");
			String months[] = {
      		"Jan", "Feb", "Mar", "Apr",
      		"May", "Jun", "Jul", "Aug",
      		"Sep", "Oct", "Nov", "Dec"};
			int year;
			Calendar gcalendar = Calendar.getInstance();
			System.out.print(months[gcalendar.get(Calendar.MONTH)]);
			System.out.println(year = gcalendar.get(Calendar.YEAR));
			System.out.println(year = gcalendar.getActualMaximum(Calendar.DATE));
			System.out.print(gcalendar.get(Calendar.MONTH));
			gcalendar.set(Calendar.DATE, 0);
			System.out.print(gcalendar.get(Calendar.DAY_OF_WEEK));
			tiskniOramovanyKalendar(gcalendar.get(Calendar.DAY_OF_WEEK), gcalendar.get(Calendar.MONTH) + 1, gcalendar.getActualMaximum(Calendar.DATE));
		}
		else {
			if (args.length == 1) {
				System.out.printf("Vypisu zadany mesic aktualniho roku");
				
			}
			else {
				System.out.printf("Vypisu rok a mesic dle zadani");			
			} 
		}
	}
 
    private static void tiskniNazevMesice(int mesic) {
        if      (mesic ==  1) { System.out.printf("        leden         "); }
        else if (mesic ==  2) { System.out.printf("         unor         "); }
        else if (mesic ==  3) { System.out.printf("        brezen        "); }
        else if (mesic ==  4) { System.out.printf("        duben         "); }
        else if (mesic ==  5) { System.out.printf("        kveten        "); }
        else if (mesic ==  6) { System.out.printf("        cerven        "); }
        else if (mesic ==  7) { System.out.printf("       cervenec       "); }
        else if (mesic ==  8) { System.out.printf("        srpen         "); }
        else if (mesic ==  9) { System.out.printf("        zari          "); }
        else if (mesic == 10) { System.out.printf("        rijen         "); }
        else if (mesic == 11) { System.out.printf("       listopad       "); }
        else                  { System.out.printf("       prosinec       "); }
    }
 
    private static void tiskniOramovanyKalendar(int startDen, int mesic, int pocetDni) {
        System.out.printf("\n+----------------------+\n|");
        tiskniNazevMesice(mesic);
        System.out.printf("|\n");
        System.out.printf("+----------------------+\n");
        for (int i = 1; i < startDen; i++) {
            if (i == 1) {
                System.out.printf("|");
            }
            System.out.printf("   ");
        }
        int sloupec = startDen;
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
            while (sloupec != 8) {
                System.out.printf("   ");
                sloupec++;
            }
            System.out.printf(" |\n");
        }
        System.out.printf("+----------------------+\n");
    }
}
