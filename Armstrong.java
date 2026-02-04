class Armstrong {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp;
        temp = num;
        while(num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if(temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}

