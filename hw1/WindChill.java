public class WindChill {

	public static void main(String[] args) { 
		double temperature = Double.parseDouble(args[0]);
		double windSpeed = Double.parseDouble(args[1]);
		double chill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
		
		System.out.println(chill);
	}

}
