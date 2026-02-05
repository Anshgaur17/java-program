class sumfibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int sum = 0;
        while (a <= 25) {
            if (a % 2 == 0)
                sum += a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Even sum = " + sum);
    }
}
