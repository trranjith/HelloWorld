package SimpleCalculator;

/**
 * Hello world! this is a simple calculator java code. Go through the code for better understanding of logic
 *
 */

public class Calculator {
    public double doAdd(double a, double b){
    	double sum = a + b;
        return sum;
    }
    public double doSub(double num1, double num2){
        double SUB = 0;
        SUB = num1 - num2;
    	return SUB;
    }
    public double doMul(double num1, double num2){
    	double prod = 0;
        prod = num1 * num2;
        return prod;
    }
    public double doDiv(double num1, double num2) throws Exception{
        if(num2 == 0){
        	throw new Exception();
        }
    	return num1 / num2;
    }
}
