package Inlämning58;

import java.util.*;

public class inlämning58 {
public static void main(String[] args) {
		
		Elev e1 = new Elev("Carl", 1992);
		Elev e2 = new Elev("Adam", 1991);
		Elev e3 = new Elev("Desmond", 1993);
		Elev e4 = new Elev("Erik", 1994);
		
		List<Elev> elever = new ArrayList<Elev>();
		elever.add(e1);
		elever.add(e2);
		elever.add(e3);
		elever.add(e4);
		
		Collections.sort(elever);
		
		for (int i = 0; i < elever.size(); i++) {
		System.out.printf("%-20s %d %n", elever.get(i).getName(), elever.get(i).getYearOfBirth() );
		
		}
	}
}