package homework.calculator;

import homework.calculator.interfaces.Addiction;
import homework.calculator.interfaces.Divide;
import homework.calculator.interfaces.Multiply;
import homework.calculator.interfaces.Substract;

public class Calc {

    public static <T, U extends Number> T add(T first, U second, Addiction<T, U> addiction) {
        return addiction.add(first, second);
    }

    public static <T, U extends Number> T divide(T first, U second, Divide<T, U> divide){
        return second.doubleValue() != 0 ? divide.divide(first, second) : null;
    }

    public static <T, U extends Number> T multiply(T first, U second, Multiply<T, U> multiply) {
        return multiply.multiply(first, second);
    }

    public static <T, U extends Number> T substract(T first, U second, Substract<T, U> substract){
        return substract.substract(first, second);
    }

}
