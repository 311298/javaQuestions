class printTillGivenNumber {
    public static void main(String[] args) {
        when(5);
    }

    public static void when(int number) {
        if (number < 1) {
            System.out.println("n is less than 1");
        } else {
            System.out.println(number); // descending order
            when(number - 1);
            // System.out.println(number); // ascending order
        }
    }
}