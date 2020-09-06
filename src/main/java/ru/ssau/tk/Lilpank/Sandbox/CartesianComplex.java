package ru.ssau.tk.Lilpank.Sandbox;

import static java.lang.Math.*;

public final class CartesianComplex implements Complex {

    private final double re;
    private final double im;

    public CartesianComplex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public double re() {
        return re;
    }

    @Override
    public double im() {
        return im;
    }

    @Override
    public double abs() {
        return sqrt(re * re + im * im);
    }

    @Override
    public double arg() {
        return atan2(im, re);
    }

    @Override
    public Complex plus(Complex other) {
        return new CartesianComplex(re + other.re(), im + other.im());
    }

    @Override
    public Complex minus(Complex other) {
        return new CartesianComplex(re - other.re(),im- other.im());
    }

    @Override
    public Complex tines(Complex other) {
        return new CartesianComplex(re*other.re()- im*other.im(),im*other.re()+re*other.im());
    }

    @Override
    public Complex divide(Complex other) {
        double otherAbsSqr = pow(other.abs(), 2);
        Complex inverted = new CartesianComplex(re / otherAbsSqr, -im / otherAbsSqr);
        return tines(inverted);
    }
}
