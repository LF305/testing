public class Power {
    double base;
    int exponent;
    double result;
    public Power(double base, int exponent) {
            this.base = base;
            this.exponent = exponent;
        }
    public double powerOf(double base, int exponent) {
        result = 1;
        while (exponent>0){
            result = result*base;
            exponent--;
        }
        return result;
    }
}
