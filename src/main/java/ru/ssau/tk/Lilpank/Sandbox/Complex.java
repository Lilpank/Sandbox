package ru.ssau.tk.Lilpank.Sandbox;

public interface Complex {

    double re();

    double im();

    double abs();

    double arg();

    Complex plus(Complex other);

    Complex minus(Complex other);

    Complex tines(Complex other);

    Complex divide(Complex other);
}
