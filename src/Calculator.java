public class Calculator {
    public int sum(int a, int b)
    {
        return a + b;
    }

    public int sub(int a, int b)
    {
        return a - b;
    }

    public static void main(String args[])
    {
        Calculator calc = new Calculator();

        System.out.println("9 + 8 = " + calc.sum(9, 8));
        System.out.println("9 - 8 = " + calc.sub(9, 8));
    }
}
