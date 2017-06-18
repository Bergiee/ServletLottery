package inlämning53;

public class bart {
	private int antalGgrCitat1;
	private int antalGgrCitat2och3;
	private String citat1;
	private String citat2;
	private String citat3;
	
	public bart() {
		antalGgrCitat1 = 10;
		antalGgrCitat2och3 = 20;
	}
	public bart(int antalGgrCitat1, int antalGgrCitat2och3) {
		this.antalGgrCitat1 = antalGgrCitat1;
		this.antalGgrCitat2och3 = antalGgrCitat2och3;
	}
	
	public void setCitat(String citat1, String citat2, String citat3) {
		this.citat1 = citat1;
		this.citat2 = citat2;
		this.citat3 = citat3;
	}
	
	public void getCitat() {
		for (int i = 0; i < antalGgrCitat1; i++) {
			System.out.println(citat1);
		}
		for (int i = 0; i < antalGgrCitat2och3; i++) {
			System.out.println(citat2);
		}
		for (int i = 0; i < antalGgrCitat2och3; i++) {
			System.out.println(citat3);
		}
	}

}