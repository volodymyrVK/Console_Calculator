import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNumber, secondNumber, result;
        String answer = "Answer is: ";
        String operation;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter operation: ");
        operation = input.next();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();

        switch (operation){
            case "+":
                result = firstNumber + secondNumber;
                System.out.println(answer + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println(answer + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println(answer + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println(answer + result);
                break;
            case "%":
                result = firstNumber % secondNumber;
                System.out.println(answer + result);
                break;
            default:
                System.out.println("Incorrect operation");
                break;
        }

    }
}