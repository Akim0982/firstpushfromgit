import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int number1 = number();
        int number2 = number();
        char operation = (char) operation();
        int result = calc(number1, number2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int number(){
        int number;
        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        } else {
            System.out.println("Это не число. Введите число: ");
            number = number();
        }
        return number;
    }

    public static int operation() {

        System.out.println("Введите операцию: ");
        int operation;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Введите операцию: ");
            operation = operation();
        }
        return operation;
    }

    public static int calc(int number1, int number2, char operation){
        int result;
        switch (operation){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Введите число: ");
                result = calc(number1, number2, (char) operation());
        }
        return result;

    }
}
