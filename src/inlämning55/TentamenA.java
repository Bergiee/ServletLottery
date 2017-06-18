package inlämning55;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TentamenA {
	private int antalStudenter = 0;
	private int gränsG;
	private int gränsVG;
	private int maxPoäng;
	private int summaPoäng;
	private String filnamn;

	private String[] namn;
	private int[] poäng;
	private String[] betyg;

	public void setMaxPoäng(int maxPoäng) {
		this.maxPoäng = maxPoäng;
	}

	public void addNamnToArray(String namn, int platsIArray) {
		this.namn[platsIArray] = namn;
	}

	public void addPoängToArray(int poäng, int platsIArray) {
		this.poäng[platsIArray] = poäng;
	}

	public void addBetygToArray(String betyg, int platsIArray) {
		this.betyg[platsIArray] = betyg;
	}

	public int getMaxPoäng() {
		return maxPoäng;
	}

	public void setSummaPoäng(int summaPoäng) {
		this.summaPoäng = summaPoäng;
	}

	public void setAntalStudenterOchPoäng(int antalStudenter, int gränsG, int gränsVG) {
		this.antalStudenter = antalStudenter;
		this.gränsG = gränsG;
		this.gränsVG = gränsVG;

		namn = new String[antalStudenter];
		poäng = new int[antalStudenter];
		betyg = new String[antalStudenter];
	}

	public double getPoängGenomsnitt() {
		return summaPoäng / antalStudenter;
	}

	public String[] getArrayNamn() {
		return namn;
	}

	public int[] getArrayPoäng() {
		return poäng;
	}

	public String[] getArrayBetyg() {
		return betyg;
	}

	public void setFilnamn(String filnamn) {
		this.filnamn = filnamn;
	}

	public int getAntalVärden() {
		return antalStudenter;
	}

	public void skrivTillFil() throws IOException {
		PrintWriter utFil = new PrintWriter(new BufferedWriter(new FileWriter(filnamn)));

		utFil.println("Resultat " + filnamn);
		utFil.println();
		utFil.printf("Maxpoäng %-30d", maxPoäng);
		utFil.println();
		utFil.printf("G Gräns %-30d", gränsG);
		utFil.println();
		utFil.printf("VG Gräns %-30d", gränsVG);
		utFil.println();
		utFil.println();

		String n = "Namn";
		String p = "Poäng";
		String b = "Betyg";
		utFil.printf("%-30s %-10s %s", n, p, b);
		utFil.println();
		for (int i = 0; i < 31; i++) {
			utFil.print("==");
			if (i == 30) {
				utFil.println();
			}
		}
		for (int i = 0; i < namn.length; i++) {
			utFil.printf("%-30s %-10s %s", namn[i], poäng[i], betyg[i]);
			utFil.println();
		}
		utFil.println();
		utFil.println();
		utFil.println("Genomsnittspoäng: " + this.getPoängGenomsnitt());
		utFil.close();
	}
}