public class Calculator {
    public static int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("The value was too big");
        }
        return (int) result;
    }

    public int divide(int firstNum, int secondNum)
    {
        if (secondNum== 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return firstNum / secondNum;
    }
}
