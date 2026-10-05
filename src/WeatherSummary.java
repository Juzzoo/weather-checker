import java.util.Scanner;

public class WeatherSummary {

    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     *
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            double temperature = scanner.nextDouble();
            System.out.println(temperature);
        }
    }

}