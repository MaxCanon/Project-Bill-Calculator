import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static String summablyud = "";
    public static float sum = 0;

    public static float calc() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            System.out.println("Введите название блюда: ");
            String blyudo = scanner.next();
            summablyud += blyudo + "\n";
            float stoimost;
            while (true) {
                System.out.println("Введите стоимость блюда в формате 'рубли.копейки' : ");
                if (scanner.hasNextFloat()) {
                    stoimost = scanner.nextFloat();
                    if (stoimost < 0) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    scanner.next();
                    continue;
                }
            }
            System.out.println("Блюдо '" + blyudo + "' удачно добавлено!");
            sum += stoimost;
            System.out.format("Текущая сумма: " + "%.2f.\n", sum);
            System.out.println("Хотите добавить еще одно блюдо? Если нет, напишите 'завершить' ");
            String abc = scanner.next();
                if (abc.equalsIgnoreCase("Завершить")) {
                    break;
                } else {
                    continue;
                }
        }
        System.out.println("Добавленные товары:\n" + summablyud);
        return sum;
    }

    public static String rubles(double a) {
        double b = a % 100;
        double c = a % 10;
        if (b >= 11 && b <= 14) {
            return "рублей";
        } else if (c == 1) {
            return "рубль";
        } else if (c >= 2 && c <= 4) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}