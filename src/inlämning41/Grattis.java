package inlämning41;
import static javax.swing.JOptionPane.showInputDialog;
import java.text.DateFormat;
import java.util.Date;

public class Grattis {

	public static void main(String[] args) {
		String dat = showInputDialog("Ange ditt personnummer (åååå-mm-dd)");
		Date nu = new Date();
		DateFormat f3 = DateFormat.getDateInstance(DateFormat.SHORT);
		
		String fyller = (f3.format(nu)).substring(0,4);
		int fyller1 = Integer.parseInt(fyller);
		String året = dat.substring(0,4);
		int året1 =  Integer.parseInt(året);
		int ålder = fyller1-året1;
		
		if (dat.substring(5,7).equals((f3.format(nu)).substring(5,7)) &&
			dat.substring(8,10).equals((f3.format(nu)).substring(8,10)))
			System.out.println("Grattis du fyller: " +ålder +" år!!!");
		
		else System.out.println("Tyvärr du fyller inte år än :(");
		
	}
}
		