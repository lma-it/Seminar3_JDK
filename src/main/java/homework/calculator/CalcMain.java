package homework.calculator;

public class CalcMain {
    public static void main(String[] args) {
        System.out.println(Calc.add(5.2, 3, (a, b) -> a + b));
        System.out.println(Calc.multiply(5.2, 3, (a, b) -> a * b));
        System.out.println(Calc.divide(5.2, 3.3f, (a, b) -> a / b));
        System.out.println(Calc.substract(5.2, 3, (a, b) -> a - b));
    }
}
