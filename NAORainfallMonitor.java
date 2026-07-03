import java.util.Random;

public class NAORainfallMonitor {
    public static void main(String[] args) {
        Random random = new Random();
        int[] rainfall = new int[30];
        int total = 0;
        int wetDays = 0;

        for (int day = 0; day < rainfall.length; day++) {
            rainfall[day] = random.nextInt(61); // 0 to 60 mm inclusive
            total += rainfall[day];
            System.out.println("Day " + (day + 1) + ": " + rainfall[day] + " mm");
            if (rainfall[day] > 30) {
                wetDays++;
            }
        }

        double average = (double) total / rainfall.length;

        System.out.println();
        System.out.println("--- Monthly Summary ---");
        System.out.println("Total rainfall: " + total + " mm");
        System.out.printf("Average daily rainfall: %.2f mm%n", average);
        System.out.println("Number of wet days (>30mm): " + wetDays);

        String classification;
        if (total <= 300) {
            classification = "Dry";
        } else if (total <= 600) {
            classification = "Normal";
        } else {
            classification = "Flood-risk";
        }
        System.out.println("Month classification: " + classification);
    }
}