package org.romanbielyi;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Cursor!\n These are basic arithmetic operations with Java primitive types according to HW1 :)\n");

        System.out.println("play with byte");
        byte b1 = 5, b2 = 10;
        byte b = (byte)(b1 + b2);
        System.out.println(b);
        b = (byte) (b1 - b2);
        System.out.println(b);
        b = (byte) (b1*b2);
        System.out.println(b);
        b = (byte) (b1/b2);
        System.out.println(b);

        System.out.println("play with short");
        short s1 = 5, s2 = 10;
        short s = (short) (s1 + s2);
        System.out.println(s);
        s = (short) (s1 - s2);
        System.out.println(s);
        s = (short) (s1*s2);
        System.out.println(s);
        s = (short) (s1/s2);
        System.out.println(s);

        System.out.println("play with long");
        long l1= 5L, l2 = 10L;
        long l = l1+l2;
        System.out.println(l);
        l = l1-l2;
        System.out.println(l);
        l = l1*l2;
        System.out.println(l);
        l = l1/l2;
        System.out.println(l);

        System.out.println("play with float");
        float f1 = 5.3F, f2 = 10.3F;
        float f = f1 + f2;
        System.out.println(f);
        f = f1 - f2;
        System.out.println(f);
        f = f1 * f2;
        System.out.println(f);
        f = f1 / f2;
        System.out.println(f);

        System.out.println("play with double");
        double d1 = 5.3, d2 = 10.3;
        double d = d1 +d2;
        System.out.println(d);
        d = d1 - d2;
        System.out.println(d);
        d = d1 * d2;
        System.out.println(d);
        d = d1 / d2;
        System.out.println(d);

    }
}
