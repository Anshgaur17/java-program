class largest{
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15, d = 20;
        int largest;

        largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;

        System.out.println("Largest number is: " + largest);
    }
}

