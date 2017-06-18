package inlamning54;

public class Main {
	public static void display(String[][] sverige){
		for (int row=0;row<sverige.length;row++){
			for(int column=0;column<sverige[row].length;column++){
				System.out.print(sverige[row][column]+"\t");
			}
			System.out.println();
			}
		}
}