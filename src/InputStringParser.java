public class InputStringParser {

    String userInput;

    public InputStringParser(String userInput) {
        this.userInput = userInput;
    }

    public String[] convertStringToArray(){
        String[] userInputArray = this.userInput.split("\\s");
        return userInputArray;
    }

}
