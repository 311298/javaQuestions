class PrintString {
    public static void main(String[] args) {
        openRussianDolls(5);
    }

    public static void openRussianDolls(int number) {
        if (number == 1) {
            System.out.println("All dolls are opened");
        } else {
            System.out.printf("%d russion doll opened", number).println();
            ;
            openRussianDolls(number - 1);
        }
    }
}