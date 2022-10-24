public class Errors {

    public static  double FtoC (double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double roundingOff = Math.round(celsius * 100);
        double finalAnswer = roundingOff / 100;
        return finalAnswer;
    }
    
    public static void main(String[] args) {

        System.out.println("Fahrenheit to Celsius converter:");

        double degreesFahrenheit = 54.3;
        double degreesCelsius = FtoC(degreesFahrenheit);
        System.out.println(degreesFahrenheit + "°F = " + degreesCelsius + "°C");
        
    } 
}

// Once you've corrected all the errors, the answer should be 12.39°C