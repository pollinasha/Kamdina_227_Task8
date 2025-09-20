import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        // считайте сумму перевода при помощи scanner.nextDouble()
        double amount = scanner.nextDouble();

        boolean isValid = TransactionValidator.isValidAmount(amount);  // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
    }
}


class TransactionValidator {
    // объявите константы
    public static final double MIN_VALUE = 1;
    public static final double MAX_VALUE = 5000;


    public static boolean isValidAmount(double amount) {
        if (amount < MIN_VALUE) {
            System.out.println("Минимальная сумма перевода: " + MIN_VALUE + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_VALUE) {
            System.out.println("Максимальная сумма перевода: " + MAX_VALUE + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}
