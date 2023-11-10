package exception;

public class Second {

    public static void main(String[] args) {
        // Вызов методов без исключений
        System.out.println("Вызов методов без исключений:");
        try {
            methodWithoutException();
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        try {
            methodWithPositiveValue(42);
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        try {
            methodWithString("Hello, World!");
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }

        // Вызов методов с исключениями
        System.out.println("\nВызов методов с исключениями:");
        try {
            methodWithDivisionByZero();
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        try {
            methodWithPositiveValue(-10);
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        try {
            methodWithString(null);
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
    }

    // Пример метода без исключений
    public static void methodWithoutException() {
        System.out.println("Метод без исключений вызван успешно");
    }

    // Пример метода с проверкой положительного значения
    public static void methodWithPositiveValue(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
        System.out.println("Метод с положительным значением вызван успешно");
    }

    // Пример метода с делением на ноль
    public static void methodWithDivisionByZero() {
        double result = 10 / 0; // Попытка деления на ноль
        System.out.println("Метод с делением на ноль вызван успешно");
    }

    // Пример метода с проверкой строки на null
    public static void methodWithString(String str) {
        if (str == null) {
            throw new NullPointerException("Строка не может быть null");
        }
        System.out.println("Метод с строкой вызван успешно: " + str);
    }
}
