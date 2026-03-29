class DefaultValues {

    int i;
    float f;
    double d;
    char c;
    boolean b;
    long l;
    short s;
    byte by;
    String str;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();

        System.out.println("int = " + obj.i);
        System.out.println("float = " + obj.f);
        System.out.println("double = " + obj.d);
        System.out.println("char = " + obj.c);
        System.out.println("boolean = " + obj.b);
        System.out.println("long = " + obj.l);
        System.out.println("short = " + obj.s);
        System.out.println("byte = " + obj.by);
        System.out.println("String = " + obj.str);
    }
}