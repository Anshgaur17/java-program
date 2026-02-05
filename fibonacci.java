class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        while (true) {
            c = a + b;
            if (c > 25)
                break;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
