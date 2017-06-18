package inlämning43;

import javax.swing.JOptionPane;

public class InlämningB {

	public static void main(String[] args) {


		String input = JOptionPane.showInputDialog("Trycl 1:Cirkel | 2:Rektangel | 3:Kvadrat");
		int val = Integer.parseInt(input);
		switch (val) {
		case 1:

			Cirkel c1 = new Cirkel();

			input = JOptionPane.showInputDialog("Tryck för 1.Area | 2.Omkrets | 3.Diamtern");
			val = Integer.parseInt(input);

			input = JOptionPane.showInputDialog("Vad är radien?");
			double radie = Double.parseDouble(input);

			c1.setRadie(radie);

			switch (val) {
			case 1:
				JOptionPane.showMessageDialog(null, "Arean är: " + c1.avläsArea());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Omkretsen är: " + c1.avläsOmkrets());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Diametern är: " + c1.avläsDiameter());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Felaktig inmatning!");
			}
			break;
		case 2:

			input = JOptionPane.showInputDialog("Vad vill du beräkna? (1.Area 2.Omkrets)");
			val = Integer.parseInt(input);
			input = JOptionPane.showInputDialog("Vilken längd har första sidan?");
			double sida1 = Double.parseDouble(input);
			input = JOptionPane.showInputDialog("Vilken längd har andra sidan?");
			double sida2 = Double.parseDouble(input);
			Rektangel r1 = new Rektangel(sida1, sida2);

			switch (val) {
			case 1:
				JOptionPane.showMessageDialog(null, "Arean är: " + r1.avläsArea());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Omkretsen är: " + r1.avläsOmkrets());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Felaktig inmatning!");
				break;
			}
			break;

		case 3:

			input = JOptionPane.showInputDialog("Vad vill du beräkna? (1.Area 2.Omkrets)");
			val = Integer.parseInt(input);
			input = JOptionPane.showInputDialog("Vilken längd har sidan?");
			sida1 = Double.parseDouble(input);
			Kvadrat k1 = new Kvadrat(sida1);
			switch (val) {
			case 1:
				JOptionPane.showMessageDialog(null, "Arean är: " + k1.avläsArea());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Omkretsen är: " + k1.avläsOmkrets());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Felaktig inmatning!");

			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Felaktig inmatning!");
			break;
		}

	}
}