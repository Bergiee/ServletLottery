package inlämning51;

class Kvadrat extends Rektangel {
	
	public Kvadrat() {}
	

	public void setA(double a) {

		super.setA(a);

		super.setB(super.a);
	}

}