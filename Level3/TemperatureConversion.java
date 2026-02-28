import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        input.close();
    }
}