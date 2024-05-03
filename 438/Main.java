import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

            double a = x1 - x2;
            double b = y1 - y2;
            double c = x1 - x3;
            double d = y1 - y3;
            double e = ((x1 * x1) - (x2 * x2) + (y1 * y1) - (y2 * y2)) / 2;
            double f = ((x1 * x1) - (x3 * x3) + (y1 * y1) - (y3 * y3)) / 2;
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            double r = Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));

            System.out.printf("%.2f\n", 2 * Math.PI * r);
        }
        scanner.close();
    }
}

