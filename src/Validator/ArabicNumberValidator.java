package Validator;
import java.util.regex.Pattern;

public class ArabicNumberValidator implements Validator {
    @Override
    public boolean validate(String userInput) {
        return Pattern.compile("^(?:[1-9]|0[1-9]|10)").matcher(userInput).matches();
    }

}
