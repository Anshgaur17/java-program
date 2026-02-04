class palindrome {
    public static void main(String[] args) {
        int num = 353, rev = 0, temp;
        temp = num;
        while(num > 0) {
            int rem=num%10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrom");
    }
}
