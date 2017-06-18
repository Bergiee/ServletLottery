package inlämning43;

public class Inlämning{
	public static void main(String[] args) {

		Rektangel rekt1 = new Rektangel(5.2 , 5.2);

		System.out.println(rekt1.avläsArea());
		System.out.println(rekt1.avläsOmkrets());

		Kvadrat kv1 = new Kvadrat(5.2);

		System.out.println(kv1.avläsArea());
		System.out.println(kv1.avläsOmkrets());

		Cirkel c1 = new Cirkel();

		c1.setRadie(5);
		System.out.println(c1.avläsArea());
		System.out.println(c1.avläsDiameter());
		System.out.println(c1.avläsOmkrets());
	}
}
