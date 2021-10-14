import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final int DAYS_COUNT = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] temps = new int[DAYS_COUNT];
        boolean[] isFill = new boolean[DAYS_COUNT];

        while (true) {
            System.out.println("Введи день и температуру:");
            String line = scanner.nextLine(); // "13 -2"
            if (line.equals("end")) {
                break;
            }
            String[] parts = line.split(" "); // ["13", "-2"]
            int day = Integer.parseInt(parts[0]) - 1; // 13-1 = 12
            int temp = Integer.parseInt(parts[1]); // -2

            temps[day] = temp;
            isFill[day] = true;

            double sum = 0;
            for (int t : temps) {
                sum += t;
            }

            int count = 0;
            for (boolean f : isFill) {
                if (f) {
                    count++;
                }
            }

            System.out.println("Средняя температура: " + (sum / count));
        }
    }
}