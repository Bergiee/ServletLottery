package Inlämning58;

public class Person implements Comparable<Object> {
	private int yearOfBirth;
	
	public void setBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public int compareTo(Object o) {
		if (this.yearOfBirth > ((Person) o).yearOfBirth) {
			return 1;
		}
		else if (this.yearOfBirth == ((Person) o).yearOfBirth) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
}