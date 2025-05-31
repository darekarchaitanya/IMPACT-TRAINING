import java.util.Scanner;

public class tarif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        double roomRent = sc.nextDouble();
        int daysStayed = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid Input");
        } else {
            double totalTariff = roomRent * daysStayed;

            // Check for peak season: April-June or November-December
            if ((month >= 4 && month <= 6) || (month == 11 || month == 12)) {
                totalTariff *= 1.2; // Add 20% to the tariff
            }

            System.out.printf("Hotel Tariff: %.2f", totalTariff);
        }
    }
}
