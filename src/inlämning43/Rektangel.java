package inlämning43;

class Rektangel {

	double a;
	double b;

	public Rektangel(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Rektangel(double a) {
		this.a = a;
		this.b = a;
	}
	
	public String avläsArea() {
		double area = a*b;
		String s = String.format("%.2f", area);
		return s;
	}
	public String avläsOmkrets() {
		double omkrets = a*2 + b*2;
		String s = String.format("%.2f", omkrets);
		return s;
	}
	
}