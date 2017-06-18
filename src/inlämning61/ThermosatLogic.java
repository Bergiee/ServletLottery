package inlämning61;

public class ThermosatLogic {
	public double convertToFahrenheit(double input){
		
		double far;
		
		far = (input*9) / 5 + 32;
			return far;
	}
	
	public double convertToCelcius(double input){
		
		double cel;
		
		cel=((input-32)*5) / 9;
		return cel;
	}
}
	
