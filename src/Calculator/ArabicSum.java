package Calculator;

public class ArabicSum  implements Calculator{

    @Override
    public int calculate(int firstLetter, int secondLetter, String numbersType) {
        if (numbersType == "Arabic") return firstLetter + secondLetter;

        return 0;
    }
}
