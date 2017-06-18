package Inlämning58;

public class Elev extends Person{
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Elev(String name, int yearOfBirth) {
		super.setBirth(yearOfBirth);
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		if (this.name.compareTo(((Elev) o).name) > 0) {
			return 1;
		}
		else if (this.name.compareTo(((Elev) o).name) == 0) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
}
