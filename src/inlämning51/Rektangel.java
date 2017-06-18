package inl�mning51;

class Rektangel {
	double a;
	double b;
	
	public Rektangel() {}
	
	public void setA(double a) {
		this.a=a;
	}
	public void setB(double b) {
		this.b=b;
	}
	
	public String avl�sArea() {
		double area = a*b;
		String s = String.format("%.2f", area);
		return s;
	}
	public String avl�sOmkrets() {
		double omkrets = a*2 + b*2;
		String s = String.format("%.2f", omkrets);
		return s;
	}
	public String avl�sDiagonal() {
		double diagonal = Math.sqrt(a*a+b*b);
		String s = String.format("%.2f", diagonal);
		return s;
	}
	
}