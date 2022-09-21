package chapters.chapter_06;

public class Exercise_08 {

	public static void main(String[] args) {
		
		System.out.println("Celsius        Fahrenheit     |         Fahrenheit     Celsius");		
		System.out.print("---------------------------------------------------------------");
		
		double celsius = 40.0;
		double fahrenheit = 120.0;

		while (celsius >= 31.0 && fahrenheit >= 30.0) {
			System.out.println();
			System.out.printf("%-15.1f%-15.1f", celsius, celsiusToFahrenheit(celsius));
			System.out.printf("|%15.1f%15.2f", fahrenheit, fahrenheitToCelsius(fahrenheit));

			celsius -= 1.0;
			fahrenheit -= 10.0;

		}

	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
