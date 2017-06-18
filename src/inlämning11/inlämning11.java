package inlämning11;

import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JOptionPane;

public class inlämning11 {
	public static void main(String[] arg) throws ParseException {

		NumberFormat n = NumberFormat.getInstance();

		double pi = Math.PI;

		double yta;
		double omkrets;

		String indata = JOptionPane.showInputDialog("Vad är cirkelns radie?");

		double cirkelRadie = n.parse(indata).doubleValue();

		yta = pi * (cirkelRadie * cirkelRadie);
		omkrets = 2 * pi * cirkelRadie;

		n.setMaximumFractionDigits(2);
		n.setMinimumFractionDigits(2);

		String svarYta = n.format(yta);
		String svarOmkrets = n.format(omkrets);

		JOptionPane.showMessageDialog(null, "Din cirkels yte är: " + svarYta + "\n Din cirkels omkrets är: " + svarOmkrets);
		


	}

}
