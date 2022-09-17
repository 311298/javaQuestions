class Main {
    public static void main(String[] args) {
        Main recursion = new Main();
        int rec = recursion.Fibonacci(4);
        System.out.println(rec);
    }

    public int Fibonacci(int number) {
        if (number < 0)
            return -1;
        if (number == 0 || number == 1) {
            return number;
        }
        return Fibonacci(number - 1) + Fibonacci(number - 2);
    }

}

/* fibonacci series */