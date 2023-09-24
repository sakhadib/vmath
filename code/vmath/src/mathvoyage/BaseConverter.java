package mathvoyage;

public class BaseConverter {

    private static BaseConverter instance;

    private BaseConverter() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static BaseConverter getInstance() {
        if (instance == null) {
            instance = new BaseConverter();
        }
        return instance;
    }

    /**
     * Converts a binary string to a decimal number
     * @param binaryString The binary number as a string
     * @return The decimal number
     */
    public double binaryToDecimal(String binaryString) {
        String[] parts = binaryString.split("\\.");

        if (parts.length > 2) {
            throw new IllegalArgumentException("Invalid binary string");
        }

        int integerPart = 0;
        double fractionalPart = 0.0;

        // Convert the integer part
        for (int i = 0; i < parts[0].length(); i++) {
            char digit = parts[0].charAt(i);
            if (digit == '1') {
                integerPart = integerPart * 2 + 1;
            } else if (digit == '0') {
                integerPart = integerPart * 2;
            } else {
                throw new IllegalArgumentException("Invalid binary string");
            }
        }

        // Convert the fractional part if it exists
        if (parts.length == 2) {
            for (int i = 0; i < parts[1].length(); i++) {
                char digit = parts[1].charAt(i);
                if (digit == '1') {
                    fractionalPart += 1.0 / Math.pow(2, i + 1);
                } else if (digit != '0') {
                    throw new IllegalArgumentException("Invalid binary string");
                }
            }
        }
        return integerPart + fractionalPart;
    }

    /**
     * Converts a decimal number to a binary string
     * @param decimalNumber The decimal number
     * @return The binary string
     */
    public String decimalToBinary(double decimalNumber) {
        String binaryString = "";
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;

        // Convert the integer part
        while (integerPart > 0) {
            binaryString = (integerPart % 2) + binaryString;
            integerPart /= 2;
        }

        // Convert the fractional part if it exists
        if (fractionalPart > 0) {
            binaryString += ".";
            while (fractionalPart > 0) {
                fractionalPart *= 2;
                if (fractionalPart >= 1) {
                    binaryString += "1";
                    fractionalPart -= 1;
                } else {
                    binaryString += "0";
                }
            }
        }
        return binaryString;
    }


}
