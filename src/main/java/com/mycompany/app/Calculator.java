package com.mycompany.app;

public class Calculator {

    public double sum(double first, double second) {
        return first + second;
    }

    public double sub(double first, double second) {
        return first - second;
    }

    public double mul(double first, double second) {
        return first*second;
    }

    public double div(double first, double second) {
        return first/second;
    }


    private double disc(double quadPoly, double poly, double cnst) {
        return (poly*poly - 4*quadPoly*cnst);
    }

    private double root(double quadPoly, double poly, double sqrD) {
        return (-1*poly + sqrD)/(quadPoly*2);
    }

    private double[] calcRoots(double quadPoly, double poly, double sqrD) {
        return new double[]{root(quadPoly, poly, sqrD), root(quadPoly, poly, -1*sqrD)};
    }

    public double[] quadEquate(double quadPoly, double poly, double cnst) {
        double D = disc(quadPoly, poly, cnst);
        if (D >= 0) {
            return calcRoots(quadPoly, poly, Math.sqrt(D));
        } else {
            return null;
        }
    }
}
