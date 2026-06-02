public class QRCodeGenerator {

    public static boolean checkIfInArray(int[] array, int find) {
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


        // flags for type of symbols in user input
        // 0 - numeric, 1 - alphanumeric, 2 - kanji, 3 - 8-bit byte data
        boolean[] characterTypes = {false, false, false, false};

        // alphaNumeric characters: 32: SP, 36: $, 42: *, 43: +, 45: -, 46: ., 47: /, 58: ":"
        int[] alphaNumericMiscChars = {32, 36, 42, 43, 45, 46, 47, 58};


        for (int i = 0, inputLength = userInput.length(); i < inputLength; i++ ) { // n is defined so that s.length() is evaluated once
            int characterCode = (int) userInput.charAt(i);

            // ASCII and Unicode characters 48 - 57 are 0 - 9
            if (characterCode >= 48 && characterCode <= 57) {
                characterTypes[0] = true;

            // ASCII and Unicode characters 65 - 90 are A - Z
            } else if (characterCode >= 65 && characterCode <= 90) {
                characterTypes[1] = true;

            // checks for the following alphanumeric characters: SP $ * + - . / :
            } else if (checkIfInArray(alphaNumericMiscChars, characterCode) == true) {
                characterTypes[1] = true;

            }

        }

    }

}
