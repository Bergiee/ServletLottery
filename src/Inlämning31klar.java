import static javax.swing.JOptionPane.*;
import java.util.*;
public class Inl�mning31klar {

	public static void main(String[] args) {
				String heltal;
				int i;
				int ny = 1;
				int total = 0;
				double resultat = 0;
				
				while(true) { 
					heltal = showInputDialog (null, "Ange heltal nummer " + ny);
					
					if (heltal == null) { 
						break;
					}

					Scanner sc = new Scanner(heltal); 
					if(!sc.hasNextInt()){ 
						break;
					}
					i = sc.nextInt();
					total = total + i;
					ny = ny + 1;
					resultat = (double)total / ((double)ny - 1);
				}
			
				showMessageDialog(null, "Medelv�rdet av dina " + (ny - 1) + " tal �r" + "\n" + resultat);
				
				if (resultat == 0) {
					showMessageDialog(null, "Du har inte skrivit n�gra tal!");
				}
			}
		}