public class ComplexNumber extends RealNumber{
    public double imaginary_part;
    public ComplexNumber(){
        super(1.0);
        imaginary_part = 1.0;
    }
    public ComplexNumber(double real, double imaginary){
        super(real);
        imaginary_part = imaginary;
    }
    public String toString(){
        return super.toString() + "\nImaginaryPart: " + imaginary_part;
    }
}
