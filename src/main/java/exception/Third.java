package exception;

public class Third {
    public static void main(String[] args) {
        try {
            // Сценарий 1: Вызов метода, при котором исключение бросается
            throwCustomException(true);
        } catch (CustomException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }

        try {
            // Сценарий 2: Вызов метода, при котором исключение не бросается
            throwCustomException(false);
        } catch (CustomException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
    }

    // Метод, который может бросить собственное исключение
    public static void throwCustomException(boolean shouldThrow) throws CustomException {
        if (shouldThrow) {
            throw new CustomException("Тупое исключение");
        } else {
            System.out.println("Метод выполнен успешно");
        }
    }
}
