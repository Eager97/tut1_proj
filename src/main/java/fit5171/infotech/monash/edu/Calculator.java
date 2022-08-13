package fit5171.infotech.monash.edu;

import java.lang.Exception;
/**
 * Created by yli on 6/03/15.
 */
public class Calculator {
	
    private int convert(String x) {
        return Integer.parseInt(x);
    }

    public int add(String x, String y) {
        return convert(x) + convert(y);
    }
    public int add(int x, int y) {
        return x + y;
    }
    public int subtract(int x, int y) {
        return x - y;
    }
    public int multiply(int x, int y) {
        return x * y;
    }
    public int divide(int x, int y) {
     return x / y;
    /*if(y != 0) {
    	 return x / y;
     }
     else throw new java.lang.ArithmeticException("Divide by Zero not allowed");
    */
    }


}
