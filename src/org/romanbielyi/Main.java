package org.romanbielyi;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Cursor!\n These are basic arithmetic operations with Java primitive types according to HW1 :)\n");

        System.out.println("play with byte");
        byte b1 = 33, b2 = 57;
        byte b_res_sum = (byte) (b1 + b2);
        System.out.println("Addition:\t\t" + b1 + " + " + b2 + " = " + b_res_sum);
        byte b_res2_diff = (byte) (b1 - b2);
        System.out.println("Subtraction:\t\t" + b1 + " - " + b2 + " = " + b_res2_diff);
        byte b_res3_prod = (byte) (b1 * b2);
        System.out.println("Multiplication:\t\t" + b1 + " * " + b2 + " = " + b_res3_prod);
        byte b_res4_quotient = (byte) (b1 / b2);
        System.out.println("Division:\t\t" + b1 + " / " + b2 + " = " + b_res4_quotient);

        System.out.println("play with short");
        short s1 = 11343, s2 = 500;
        short s_res_sum = (short) (s1 + s2);
        System.out.println("Addition:\t\t" + s1 + " + " + s2 + " = " + s_res_sum);
        short s_res2_diff = (short) (s1 - s2);
        System.out.println("Subtraction:\t\t" + s1 + " - " + s2 + " = " + s_res2_diff);
        short s_res3_prod = (short) (s1 * s2);
        System.out.println("Multiplication:\t\t" + s1 + " * " + s2 + " = " + s_res3_prod);
        short s_res4_quotient = (short) (s1 / s2);
        System.out.println("Division:\t\t" + s1 + " / " + s2 + " = " + s_res4_quotient);

        System.out.println("play with long");
        long l1 = 25345L, l2 = 8000L;
        long l_res_sum = l1 + l2;
        System.out.println("Addition:\t\t" + l1 + " + " + l2 + " = " + l_res_sum);
        long l_res2_diff = l1 - l2;
        System.out.println("Subtraction:\t\t" + l1 + " - " + l2 + " = " + l_res2_diff);
        long l_res3_prod = l1 * l2;
        System.out.println("Multiplication:\t\t" + l1 + " * " + l2 + " = " + l_res3_prod);
        long l_res4_quotient = l1 / l2;
        System.out.println("Division:\t\t" + l1 + " / " + l2 + " = " + l_res4_quotient);

        System.out.println("play with float");
        float f1 = 5.354533F, f2 = 10.3423F;
        float f_res_sum = f1 + f2;
        System.out.println("Addition:\t\t" + f1 + " + " + f2 + " = " + f_res_sum);
        float f_res2_diff = f1 - f2;
        System.out.println("Subtraction:\t\t" + f1 + " - " + f2 + " = " + f_res2_diff);
        float f_res3_prod = f1 * f2;
        System.out.println("Multiplication:\t\t" + f1 + " * " + f2 + " = " + f_res3_prod);
        float f_res4_quotient = f1 / f2;
        System.out.println("Division:\t\t" + f1 + " / " + f2 + " = " + f_res4_quotient);

        System.out.println("play with double");
        double d1 = 5.3545332345, d2 = 10.345434321;
        double d_res_sum = d1 + d2;
        System.out.println("Addition:\t\t" + d1 + " + " + d2 + " = " + d_res_sum);
        double d_res2_diff = d1 - d2;
        System.out.println("Subtraction:\t\t" + d1 + " - " + d2 + " = " + d_res2_diff);
        double d_res3_prod = d1 * d2;
        System.out.println("Multiplication:\t\t" + d1 + " * " + d2 + " = " + d_res3_prod);
        double d_res4_quotient = d1 / d2;
        System.out.println("Division:\t\t" + d1 + " / " + d2 + " = " + d_res4_quotient);
    }
}
