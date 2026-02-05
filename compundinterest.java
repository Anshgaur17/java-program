class compundinterest {
    public static void main(String[] args) {
        double p = 1000;   
        double r = 10;     
        double t = 2;      

        double ci = p * Math.pow((1 + r / 100), t) - p;

        System.out.println("Compound Interest = " + ci);
    }
}


