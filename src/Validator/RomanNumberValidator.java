package Validator;

import java.util.regex.Pattern;

public class RomanNumberValidator implements Validator{
    @Override
    public boolean validate(String userInput) {
        return Pattern.compile("(I{0,1}?X|I{0,3}?V?I{0,3})$").matcher(userInput).matches();
    }
}
