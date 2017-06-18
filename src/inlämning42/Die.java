package inlämning42;
import java.util.*;

public class Die {

		private static Random diceRandom = new Random();
		private int dots;
		
		public Die(){
			roll();
		}
		public void roll(){
			dots = diceRandom.nextInt(6)+1;
		}
		public int getResult(){
			return dots;
		}
}