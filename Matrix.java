package com.company.Flock;

public class Matrix {

    public double a00, a01, a10, a11;

    public Matrix(double a00, double a01, double a10, double a11){
        this.a00 = a00;
        this.a01 = a01;
        this.a10 = a10;
        this.a11 = a11;
    }

    public static Matrix sum(Matrix a, Matrix b) {
        Matrix c = new Matrix(0, 0, 0, 0);
        c.a00 = a.a00 + b.a00;
        c.a01 = a.a01 + b.a01;
        c.a10 = a.a10 + b.a10;
        c.a11 = a.a11 + b.a11;
        return c;
    }

    public static Matrix minus(Matrix a, Matrix b) {
        Matrix c = new Matrix(0, 0, 0, 0);
        c.a00 = a.a00 - b.a00;
        c.a01 = a.a01 - b.a01;
        c.a10 = a.a10 - b.a10;
        c.a11 = a.a11 - b.a11;
        return c;
    }

    public static Matrix mulNum(Matrix a, double b) {
        Matrix c = new Matrix(0, 0, 0, 0);
        c.a00 = a.a00 * b;
        c.a01 = a.a01 * b;
        c.a10 = a.a10 * b;
        c.a11 = a.a11 * b;
        return c;
    }

    public static Matrix mulMat(Matrix a, Matrix b) {
        Matrix c = new Matrix(0, 0, 0, 0);
        c.a00 = a.a00 * b.a00 + a.a01 * b.a10;
        c.a01 = a.a00 * b.a01 + a.a01 * b.a11;
        c.a10 = a.a10 * b.a00 + a.a11 * b.a10;
        c.a11 = a.a10 * b.a01 + a.a11 * b.a11;
        return c;
    }

    public static double det(Matrix a) {
        double c = a.a00 * a.a11 - a.a01 * a.a10;
        return c;
    }

    public static Matrix rev(Matrix a){
        Matrix c = new Matrix(0, 0, 0, 0);
        c.a00 = a.a01;
        c.a01 = a.a11;
        c.a10 = a.a00;
        c.a11 = a.a01;
        return mulNum(c, 1/det(a));
    }
}