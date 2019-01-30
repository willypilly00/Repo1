public class ComplexNumber {
    private double real;
    private double imaginary;

    ComplexNumber(){
    }

    ComplexNumber(double re, double im){
        real = re;
        imaginary = im;
    }
    public void add(ComplexNumber comp){
        ComplexCalculator cmpC = new ComplexCalculator();
        cmpC.add(comp);
    }

    @Override
    public String toString(){
      return ("("+ real + ", " + imaginary + "i)");
    }

    class ComplexCalculator{
        public void add(ComplexNumber comp){
            real += comp.real;
            imaginary += comp.imaginary;

        }
    }
}
