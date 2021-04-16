public class RomanNumber {

    public static int RomanToArabic(String number){
        int result = 0;
        while (!number.isEmpty()){
            if (number.startsWith("XC")) { result += 90; number = number.substring(2, number.length()); }
            if (number.startsWith("XL")) { result += 40; number = number.substring(2, number.length()); }
            if (number.startsWith("C")) { result += 100; number = number.substring(1, number.length()); }
            if (number.startsWith("L")) { result += 50; number = number.substring(1, number.length()); }
            if (number.startsWith("X")) { result += 10; number = number.substring(1, number.length()); }
            if (number.startsWith("V")) { result += 5; number = number.substring(1, number.length()); }
            if (number.startsWith("IV")) { result += 4; number = number.substring(2, number.length()); }
            if (number.startsWith("IX")) { result += 9; number = number.substring(2, number.length()); }
            if (number.startsWith("I")) { result += 1; number = number.substring(1, number.length()); }

        }

        return result;
    }


    public static String ArabicToRoman(int number){

        int [] numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] letters = {"C", "CX", "L", "XL", "X", "IX", "V", "IV", "I"};

        String roman = "";

        for (int i = 0; i < numbers.length; i++) {
            while (number + 1 > numbers[i]){
                roman += letters[i];
                number -= numbers[i];
            }
        }

        return roman;
    }
}