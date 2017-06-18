package inlämning53;

public class bart2 {
public static void main(String[] args) {
		
		bart bart1 = new bart();
		
		bart bart2 = new bart(10, 20);
		
		bart1.setCitat("Jag ska inte rita bilder av nakna kvinnor i klassen.", "Jag ska "
				+ "inte skrika\"Elden är lös\" i ett fullt klassrum.", "Jag ska inte göra "
						+ "fotostatkopior av min rumpa.");
		bart2.setCitat("Jag ska inte rita bilder av nakna kvinnor i klassen.", "Jag ska "
				+ "inte skrika\"Elden är lös\" i ett fullt klassrum.", "Jag ska inte göra "
						+ "fotostatkopior av min rumpa.");
		
		bart1.getCitat();
		bart2.getCitat();
		
	}

}