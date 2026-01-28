import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш рост в метрах: ");
        double heightInMeters = scanner.nextDouble();
        System.out.println("Введите ваш вес в кг: ");
        double weightInKg = scanner.nextDouble();
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println("Ваш индекс массы тела " + bmi);
    }
}
