package demo.parallel;

/**
 * @author Lennart Draeger
 *
 * abstract class Complex which is used to create to derived classes ComplexMutable and ComplexImmutable.
 */

public abstract class ComplexAbstract {

    private double real = real();
    private double imag = imag();

    double real() { return real; }

    double imag() { return imag; }

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract String toString();


}



