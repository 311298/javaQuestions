import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(recursionMethod(number));
        scanner.close();
    }

    public static int recursionMethod(int number) {
        if (number < 1) {
            return -1;
        } else if (number == 1 || number == 0)
            return 1;
        else
            return number * recursionMethod(number - 1);
    }
}

/* factorial using the recursion */