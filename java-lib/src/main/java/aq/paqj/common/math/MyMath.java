package aq.paqj.common.math;

import org.apache.commons.math3.complex.Complex;

public class MyMath {
    public static Complex add(double a, double b) {
        Complex ca = new Complex(a);
        Complex cb = new Complex(b);

        return ca.add(cb);
    }
}