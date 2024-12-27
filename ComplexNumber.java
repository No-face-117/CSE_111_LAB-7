// CSE-111 LAB - 7 TASK - 5     []
// T-5 ComplexNumber class

public class ComplexNumber {
    public double real_value;
    public double imaginary_value;
    
    public ComplexNumber() {
        this(1.0, 1.0);
    }
    
    public ComplexNumber(double real_value, double imaginary_value) {
        this.real_value = real_value;
        this.imaginary_value = imaginary_value;
    }
    
    public String toString(){
        return "RealPart: " + real_value + "\nImaginaryPart: " + imaginary_value;
    }
    
}


