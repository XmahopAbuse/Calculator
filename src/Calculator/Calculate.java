package Calculator;

public class Calculate {

    final Calculator calculator = new Calculator();

    public int doCalculate(String operation, int firstNumber, int secondNumber){
        switch (operation){
            case ("+"):
                return calculator.Sum(firstNumber, secondNumber);
            case ("-"):
                return this.calculator.Substract(firstNumber, secondNumber);
            case ("/"):
                return this.calculator.Divide(firstNumber, secondNumber);
            case ("*"):
                return this.calculator.Multiply(firstNumber, secondNumber);
        }
    return 0;
    }
}
