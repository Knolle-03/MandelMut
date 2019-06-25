package demo.parallel;

import java.util.Objects;

/**
 * @author Lennart Draeger
 *
 * derived class from the abstract class Complex. Can construct object in mutiple ways
 * equals and hashCode is overridden, so that only ComplexMutable objects can be
 * compared in terms of attributes.
 */

public class ComplexMutable extends ComplexAbstract {

    private double real;
    private double imag;

    ComplexMutable(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    ComplexMutable add(ComplexMutable b) {
        real += b.real;
        imag += b.imag;
        return this;
    }

    ComplexMutable mul(ComplexMutable b) {
        double real = this.real * b.real - this.imag * b.imag;
        double imag = this.real * b.imag + this.imag * b.real;
        this.real = real;
        this.imag = imag;
        return this;
    }

    double getAbs() {
        return real * real + imag * imag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexMutable that = (ComplexMutable) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return 13 * Objects.hash(real, imag);
    }

    @Override
    public String toString() {
        return "ComplexMutable{" + "real=" + real +
                ", imag=" + imag +
                '}';
    }
}