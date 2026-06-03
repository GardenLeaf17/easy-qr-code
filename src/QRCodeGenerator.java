public class QRCodeGenerator {


    public static boolean storedInArray(char[] array, char find) {
        boolean found = false;

        for (int i = 0, size = array.length; i < size; i++) {
            if (array[i] == find) {
                found = true;
            }
        }

        return found;

    }

    public static void main() {

        int[][] qrCodeSizeArray = {};
        String userInput = "";

        // flags for variety of symbols in user input
        // 0 - numeric, 1 - alphanumeric, 2 - kanji, 3 - 8-bit byte data
        boolean[] characterTypes = {false, false, false, false};

        // exclusive numeric characters: 0 1 2 3 4 5 6 7 8 9
        char[] numericSubset = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        // exclusive alphanumeric characters: SP $ * + - . / : and capital letters A to Z
        char[] alphaNumericSubset = {' ', '$', '*', '+', '-', '.', '/', ':', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


        for (int i = 0, inputLength = userInput.length(); i < inputLength; i++ ) { // n is defined so that userInput.length() is evaluated once
            char symbol = userInput.charAt(i);
            int symbolCode = (int) symbol;

            // checking for exclusive numeric characters 0 - 9
            if (storedInArray(numericSubset, symbol)) {
                characterTypes[0] = true;

            // checks for exclusive alphanumeric characters SP $ * + - . / : and capital letters A to Z
            } else if (storedInArray(alphaNumericSubset, symbol)) {
                characterTypes[1] = true;

            }

        }

    }

}
