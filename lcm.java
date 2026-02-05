class lcm{
    public static void main(String[] args) {
        int a = 12, b = 18;
        int c = a*b;
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        int gcd = a;
        int lcm = c / gcd;
        System.out.println("HCF = " +gcd);
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}

