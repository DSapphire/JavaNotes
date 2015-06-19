import java.util.Scanner;
public class ConvertionFC{
	/** Converts from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit;
		fahrenheit=9.0*celsius/5+32;
		return fahrenheit;
	}
	//** Converts from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit){
		double celsius;
		celsius=(fahrenheit-32)*5/9.0;
		return celsius;
	}
	public static void main(String[] args) {
		double fahrenheit=41;
		double celsius=5;
		System.out.println(fahrenheitToCelsius(fahrenheit));
		System.out.println(celsiusToFahrenheit(celsius));
	}
}