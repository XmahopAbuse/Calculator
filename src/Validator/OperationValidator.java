package Validator;

import java.util.regex.Pattern;

public class OperationValidator implements Validator {

    @Override
    public boolean validate(String userInput) {
        return Pattern.compile("^[-+*/]?").matcher(userInput).matches();
    }
}
