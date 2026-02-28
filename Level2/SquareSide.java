import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int perimeter = input.nextInt();

        int side = perimeter / 4;

        System.out.println("Side of square is " + side);

        input.close();
    }
}