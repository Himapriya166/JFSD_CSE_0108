import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("INR", 83.10);
        exchangeRates.put("EUR", 0.91);
        exchangeRates.put("GBP", 0.78);
        exchangeRates.put("JPY", 150.25);
        exchangeRates.put("CAD", 1.35);
        exchangeRates.put("AUD", 1.50);
        exchangeRates.put("CNY", 7.10);
        exchangeRates.put("SGD", 1.36);
        exchangeRates.put("AED", 3.67);
        exchangeRates.put("AFN", 72.60);
        exchangeRates.put("ALL", 102.20);
        exchangeRates.put("AMD", 388.50);
        exchangeRates.put("ANG", 1.79);
        exchangeRates.put("AOA", 827.50);
        exchangeRates.put("ARS", 947.75);
        exchangeRates.put("AZN", 1.70);
        exchangeRates.put("BAM", 1.80);
        exchangeRates.put("BDT", 109.20);
        exchangeRates.put("BGN", 1.79);
        exchangeRates.put("BHD", 0.38);
        exchangeRates.put("BIF", 2830.00);
        exchangeRates.put("BND", 1.36);
        exchangeRates.put("BOB", 6.91);
        exchangeRates.put("BRL", 5.08);
        exchangeRates.put("BWP", 13.60);
        exchangeRates.put("BYN", 3.45);
        exchangeRates.put("BZD", 2.01);
        exchangeRates.put("CHF", 0.90);
        exchangeRates.put("CLP", 860.25);
        exchangeRates.put("COP", 3935.00);
        exchangeRates.put("CRC", 530.00);
        exchangeRates.put("CZK", 22.10);
        exchangeRates.put("DKK", 6.80);
        exchangeRates.put("DOP", 58.00);
        exchangeRates.put("DZD", 135.80);
        exchangeRates.put("EGP", 30.80);
        exchangeRates.put("ETB", 57.75);
        exchangeRates.put("FJD", 2.25);
        exchangeRates.put("GEL", 2.70);
        exchangeRates.put("GHS", 13.20);
        exchangeRates.put("GTQ", 7.80);
        exchangeRates.put("HKD", 7.80);
        exchangeRates.put("HUF", 345.00);
        exchangeRates.put("IDR", 15250.00);
        exchangeRates.put("ILS", 3.70);
        exchangeRates.put("ISK", 143.50);
        exchangeRates.put("JMD", 154.20);
        exchangeRates.put("KES", 142.00);
        exchangeRates.put("KRW", 1335.00);
        exchangeRates.put("KWD", 0.31);
        exchangeRates.put("KZT", 463.00);
        exchangeRates.put("LBP", 89000.00);
        exchangeRates.put("LKR", 323.00);
        exchangeRates.put("MAD", 10.30);
        exchangeRates.put("MKD", 56.80);
        exchangeRates.put("MNT", 3425.00);
        exchangeRates.put("MOP", 8.05);
        exchangeRates.put("MUR", 46.00);
        exchangeRates.put("MXN", 18.90);
        exchangeRates.put("MYR", 4.70);
        exchangeRates.put("NGN", 1500.00);
        exchangeRates.put("NOK", 10.80);
        exchangeRates.put("NPR", 133.50);
        exchangeRates.put("NZD", 1.65);
        exchangeRates.put("OMR", 0.38);
        exchangeRates.put("PEN", 3.70);
        exchangeRates.put("PHP", 56.00);
        exchangeRates.put("PKR", 280.00);
        exchangeRates.put("PLN", 4.40);
        exchangeRates.put("QAR", 3.64);
        exchangeRates.put("RON", 4.50);
        exchangeRates.put("RUB", 91.00);
        exchangeRates.put("SAR", 3.75);
        exchangeRates.put("SEK", 10.50);
        exchangeRates.put("THB", 35.20);
        exchangeRates.put("TRY", 32.50);
        exchangeRates.put("TWD", 31.50);
        exchangeRates.put("UAH", 39.50);
        exchangeRates.put("UGX", 3775.00);
        exchangeRates.put("UYU", 39.20);
        exchangeRates.put("VEF", 36.30);
        exchangeRates.put("VND", 24500.00);
        exchangeRates.put("ZAR", 18.40);
        exchangeRates.put("ZMW", 24.50);

        System.out.println("Available currencies: " + exchangeRates.keySet());
        System.out.print("\nEnter the base currency (e.g., USD, EUR, GBP, JPY, etc.): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        if (!exchangeRates.containsKey(baseCurrency)) {
            System.out.println("Invalid base currency! Please enter a valid one from the list.");
            return;
        }

        System.out.print("Enter the target currency (e.g., USD, EUR, GBP, JPY, etc.): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        if (!exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid target currency! Please enter a valid one from the list.");
            return;
        }

        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amount;
        try {
            amount = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount! Please enter a numeric value.");
            return;
        }

        double baseToINR = (amount / exchangeRates.get(baseCurrency)) * exchangeRates.get("INR");
        double result = (baseToINR / exchangeRates.get("INR")) * exchangeRates.get(targetCurrency);

        System.out.printf("\n%s %.2f → %.2f %s\n", baseCurrency, amount, result, targetCurrency);

        scanner.close();
    }
}
