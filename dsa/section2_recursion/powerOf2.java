import java.util.Scanner;

class powerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        System.out.println(recursionMethod(power));
        scanner.close();
    }

    public static int recursionMethod(int power) {
        if (power == 1) {
            return 2;
        } else {
            return 2 * recursionMethod(power - 1);
        }
    }
}