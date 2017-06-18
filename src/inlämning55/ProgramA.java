package inlämning55;

import java.io.IOException;
import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ProgramA {
	public static void main(String[] args)
			throws IOException, NumberFormatException, IllegalStateException, NoSuchElementException {
		Scanner sc = new Scanner(System.in);
		TentamenA t1 = new TentamenA();
		int summaPoäng = 0;

		System.out.println("Ange maxpoäng: ");
		t1.setMaxPoäng(sc.nextInt());

		System.out.println("Hur många värden vill du mata in?");
		int antalStudenter = sc.nextInt();
		System.out.println("Ange gräns för G: ");
		int gränsG = sc.nextInt();
		System.out.println("Ange gräns för VG: ");
		int gränsVG = sc.nextInt();

		t1.setAntalStudenterOchPoäng(antalStudenter, gränsG, gränsVG);

		int poängStudent;
		for (int i = 0; i < antalStudenter; i++) {
			System.out.print("Skriv in namn: \n");
			sc.nextLine();
			t1.addNamnToArray(sc.nextLine(), i);
			
			while (true) {
				System.out.print("Ange poäng: \n");
				poängStudent = sc.nextInt();

				if (poängStudent > t1.getMaxPoäng()) {
					System.out.printf("värdet är över maxvärdet %d\n", t1.getMaxPoäng());
				} else {
					break;
				}
			}

			t1.addPoängToArray(poängStudent, i);

			summaPoäng += poängStudent;

			if (poängStudent >= gränsVG) {
				t1.addBetygToArray("VG", i);
			} else if (poängStudent >= gränsG) {
				t1.addBetygToArray("G", i);
			} else {
				t1.addBetygToArray("IG", i);
			}

		}
		t1.setSummaPoäng(summaPoäng);

		System.out.println("Ange skrivningens namn: ");
		String filnamn = sc.next();
		System.out.println("Skriv in dagens datum eller eget\n"
				+ "1. Använd dagens datum.\n2. Ange eget datum.");
		int val = sc.nextInt();
		if (val == 1) {
			LocalDate datum = LocalDate.now();
			int år = datum.getYear();
			int månad = datum.getMonthValue();
			int dag = datum.getDayOfMonth();
			filnamn = filnamn + år + månad + dag + ".txt";
		}
		if (val == 2) {
			sc.nextLine();
			System.out.println("Ange dagens datum (Anges som ååååMMDD): ");
			String datumNu = sc.nextLine();
			filnamn = filnamn + datumNu + ".txt";
		}

		t1.setFilnamn(filnamn);
		t1.skrivTillFil();
		
		System.out.println("Filen har nu skapats! Programmet avslutas.");
		
		sc.close();
		System.exit(0);
	}

}