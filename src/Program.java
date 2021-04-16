import Validator.Validator;
import Validator.ArabicNumberValidator;
import Validator.RomanNumberValidator;
import Validator.OperationValidator;
import Calculator.Calculator;


public class Program {

    public static void main(String[] args) {

        Validator arabicNumberValidator = new ArabicNumberValidator();
        Validator romanNumberValidator = new RomanNumberValidator();
        Validator operationValidator = new OperationValidator();

        Operations operations = new Operations();

        String testData = "V + I";

        InputStringParser stringParser = new InputStringParser(testData);
        String [] userInputArray = stringParser.convertStringToArray();


        if (userInputArray.length < 3){
            System.out.println("Invalid input string");
        }

        else
        {
            String firstLetter = userInputArray[0];
            String secondLetter = userInputArray[2];
            String operationLetter = userInputArray[1];

            if (operationValidator.validate(operationLetter))
            {
                if (arabicNumberValidator.validate(firstLetter) && arabicNumberValidator.validate(secondLetter))
                {
                    System.out.println("Arabic letters");
                }
                else if (romanNumberValidator.validate(firstLetter) && romanNumberValidator.validate(secondLetter))
                {
                    System.out.println("Roman letters");
                    System.out.println(operations.Sum(RomanNumber.valueOf(firstLetter).toNumber(), RomanNumber.valueOf(secondLetter).toNumber()));
                }
                else
                {
                    System.out.println("Invalid numbers in user input");
                }
            }

            else
            {
                System.out.println("Invalid operation symbol");
            }
        }


    }
}
