package converter;

// Currency Converter
class CurrencyConverter {
    private static final double USD_TO_GH = 5.9; // Example rate
    private static final double EUR_TO_GH = 6.5; // Example rate
    private static final double YEN_TO_GH = 0.05; // Example rate

    public static double convert(double amount, String from, String to) {
        if (from.equals("USD") && to.equals("GH")) {
            return amount * USD_TO_GH;
        } else if (from.equals("EUR") && to.equals("GH")) {
            return amount * EUR_TO_GH;
        } else if (from.equals("YEN") && to.equals("GH")) {
            return amount * YEN_TO_GH;
        } else if (from.equals("GH") && to.equals("USD")) {
            return amount / USD_TO_GH;
        } else if (from.equals("GH") && to.equals("EUR")) {
            return amount / EUR_TO_GH;
        } else if (from.equals("GH") && to.equals("YEN")) {
            return amount / YEN_TO_GH;
        }
        return -1;
    }
}

// Distance Converter
class DistanceConverter {
    public static double metersToKm(double meters) {
        return meters / 1000;
    }

    public static double kmToMeters(double km) {
        return km * 1000;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km / 1.60934;
    }
}

// Time Converter
class TimeConverter {
    public static int hoursToMinutes(int hours) {
        return hours * 60;
    }

    public static int minutesToHours(int minutes) {
        return minutes / 60;
    }

    public static int hoursToSeconds(int hours) {
        return hours * 3600;
    }

    public static int secondsToHours(int seconds) {
        return seconds / 3600;
    }
}

// Main Application
public class ConverterApp {
    public static void main(String[] args) {
        // Currency conversion example
        double usdToGh = CurrencyConverter.convert(100, "USD", "GH");
        System.out.println("100 USD to GH: " + usdToGh);

        // Distance conversion example
        double metersToKm = DistanceConverter.metersToKm(5000);
        System.out.println("5000 meters to KM: " + metersToKm);

        // Time conversion example
        int hoursToMinutes = TimeConverter.hoursToMinutes(3);
        System.out.println("3 hours to minutes: " + hoursToMinutes);
    }
}
