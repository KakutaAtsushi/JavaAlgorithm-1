import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = new Main().math();
        System.out.println(result);
    }

    public int math() {
        Scanner scanner = new Scanner(System.in);
        int left_operand = scanner.nextShort();
        int right_operand = scanner.nextShort();

        return left_operand + right_operand;
    }
}