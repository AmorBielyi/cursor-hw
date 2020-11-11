package org.romanbielyi;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Cursor!\n These are basic arithmetic operations with Java primitive types according to HW1 :)\n");

        System.out.println("play with byte");
        byte b1 = 33, b2 = 57;
        byte b = (byte)(b1 + b2);
        System.out.println("Addition:\t\t" + b1 + " + " + b2 + " = " + b);
        b = (byte) (b1 - b2);
        System.out.println("Subtraction:\t\t" + b1 + " - " + b2 + " = " + b);
        b = (byte) (b1*b2);
        System.out.println("Multiplication:\t\t" + b1 + " * " + b2 + " = " + b);
        b = (byte) (b1/b2);
        System.out.println("Division:\t\t" + b1 + " / " + b2 + " = " + b);

        System.out.println("\nplay with short");
        short s1 = 11343, s2 = 500;
        short s = (short) (s1 + s2);
        System.out.println("Addition:\t\t" + s1 + " + " + s2 + " = " + s);
        s = (short) (s1 - s2);
        System.out.println("Subtraction:\t\t" + s1 + " - " + s2 + " = " + s);
        s = (short) (s1*s2);
        System.out.println("Multiplication:\t\t" + s1 + " * " + s2 + " = " + s);
        s = (short) (s1/s2);
        System.out.println("Division:\t\t" + s1 + " / " + s2 + " = " + s);

        System.out.println("\nplay with long");
        long l1= 25345L, l2 = 8000L;
        long l = l1+l2;
        System.out.println("Addition:\t\t" + l1 + " + " + l2 + " = " + l);
        l = l1-l2;
        System.out.println("Subtraction:\t\t" + l1 + " - " + l2 + " = " + l);
        l = l1*l2;
        System.out.println("Multiplication:\t\t" + l1 + " * " + l2 + " = " + l);
        l = l1/l2;
        System.out.println("Division:\t\t" + l1 + " / " + l2 + " = " + l);

        System.out.println("\nplay with float");
        float f1 = 5.354533F, f2 = 10.3423F;
        float f = f1 + f2;
        System.out.println("Addition:\t\t" + f1 + " + " + f2 + " = " + f);
        f = f1 - f2;
        System.out.println("Subtraction:\t\t" + f1 + " - " + f2 + " = " + f);
        f = f1 * f2;
        System.out.println("Multiplication:\t\t" + f1 + " * " + f2 + " = " + f);
        f = f1 / f2;
        System.out.println("Division:\t\t" + f1 + " / " + f2 + " = " + f);

        System.out.println("\nplay with double");
        double d1 = 5.3545332345, d2 = 10.345434321;
        double d = d1 +d2;
        System.out.println("Addition:\t\t" + d1 + " + " + d2 + " = " + d);
        d = d1 - d2;
        System.out.println("Subtraction:\t\t" + d1 + " - " + d2 + " = " + d);
        d = d1 * d2;
        System.out.println("Multiplication:\t\t" + d1 + " * " + d2 + " = " + d);
        d = d1 / d2;
        System.out.println("Division:\t\t" + d1 + " / " + d2 + " = " + d);
    }
}
