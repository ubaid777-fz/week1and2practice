import java.util.Scanner;

class QuotientReminder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int reminder = number1 % number2;

        System.out.println("Quotient = " + quotient +
                "\nReminder = " + reminder);

        input.close();
    }
}