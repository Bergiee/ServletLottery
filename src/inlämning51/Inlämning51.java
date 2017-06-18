package inlämning51;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inlämning51 {
		private static Scanner inmatning;

		public static void main(String[] args) throws IOException, InputMismatchException {

			inmatning = new Scanner(System.in);
			System.out.println("\n1.Cirkel\n2.Rektangel\n3.Kvadrat\n");
			System.out.println("Välj 1-3.");

			if (inmatning.hasNextInt()) {

				int valFigur = inmatning.nextInt();

				if (valFigur == 1) {

					Cirkel c = new Cirkel();
					System.out.println("Ange cirkelns radie:");
					double radie = inmatning.nextDouble();
					c.setRadie(radie);
					System.out.println("Cirkelns diameter: " + c.avläsDiameter());
					System.out.println("Cirkelns area: " + c.avläsArea());
					System.out.println("Cirkelns omkrets: " + c.avläsOmkrets());
				} else if (valFigur == 2) {

					Rektangel r = new Rektangel();
					System.out.println("Ange rektangelns höjd: ");
					double höjd = inmatning.nextDouble();
					r.setA(höjd);
					System.out.println("Ange rektangelns bredd: ");
					double bredd = inmatning.nextDouble();
					r.setB(bredd);
					System.out.println("Rektangelns diagonal: " + r.avläsDiagonal());
					System.out.println("Rektangelns area: " + r.avläsArea());
					System.out.println("Rektangelns omkrets: " + r.avläsOmkrets());
				} else if (valFigur == 3) {

					Kvadrat k = new Kvadrat();
					System.out.println("Ange kvadratens sida: ");
					double sida = inmatning.nextDouble();
					k.setA(sida);
					System.out.println("Kvadratens diagonal: " + k.avläsDiagonal());
					System.out.println("Kvadratens area: " + k.avläsArea());
					System.out.println("Kvadratens omkrets: " + k.avläsOmkrets());
				}
	
				else {
					System.out.println("Felaktig inmatning.");
				}
			}

			else {
				System.out.println("Felaktig inmatning.");
			}
		}

	}