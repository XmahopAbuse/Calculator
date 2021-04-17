import Calculator.Calculator;
import Validator.Validator;
import Validator.ArabicNumberValidator;
import Validator.RomanNumberValidator;
import Validator.OperationValidator;
import Calculator.Calculate;

import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Validator arabicNumberValidator = new ArabicNumberValidator();
        Validator romanNumberValidator = new RomanNumberValidator();
        Validator operationValidator = new OperationValidator();

        Calculate calculate = new Calculate();

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        String[] userInputArray = userInput.split(" ");

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
//                    System.out.println("Arabic letters");
                    int result = calculate.doCalculate(operationLetter, Integer.parseInt(firstLetter), Integer.parseInt(secondLetter));
                    System.out.println(result);
                }
                else if (romanNumberValidator.validate(firstLetter) && romanNumberValidator.validate(secondLetter))
                {
//                    System.out.println("Roman letters");
                    int result = calculate.doCalculate(operationLetter, RomanNumber.RomanToArabic(firstLetter), RomanNumber.RomanToArabic(secondLetter));
                    System.out.println(RomanNumber.ArabicToRoman(result));
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
