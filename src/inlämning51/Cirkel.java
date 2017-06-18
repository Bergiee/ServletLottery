package inl�mning51;

class Cirkel {
	double radie;
	

	public Cirkel(){}
	

	public void setRadie(double radie) {
		this.radie=radie;
	}
	
	public String avl�sArea() {
		double area = Math.PI*radie*radie;
		String s = String.format("%.2f", area);
		return s;
	}
	public String avl�sOmkrets() {
		double omkrets = 2*Math.PI*radie;
		String s = String.format("%.2f", omkrets);
		return s;
	}
	public String avl�sDiameter() {
		double diameter = radie*2;
		String s = String.format("%.2f", diameter);
		return s;
	}
}