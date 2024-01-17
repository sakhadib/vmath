package mathvoyage.NumberSystem;

import mathvoyage.vmath;

/**
 * The type Base converter.
 */
public class BaseConverter {

    private static BaseConverter instance;

    private BaseConverter() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     *
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
     *
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

        int partlength = parts[0].length();
        // Convert the integer part
        for (int i = 0; i < partlength; i++) {
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
                    fractionalPart += 1.0 / vmath.algebra.pow(2, i + 1);
                } else if (digit != '0') {
                    throw new IllegalArgumentException("Invalid binary string");
                }
            }
        }
        return integerPart + fractionalPart;
    }

    /**
     * Converts a decimal number to a binary string
     *
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

    /**
     * Converts a decimal number to a hexadecimal string
     *
     * @param decimalNumber The decimal number
     * @return The hexadecimal string
     */
    public String decimalToHexadecimal(double decimalNumber) {
        String hexadecimalString = "";
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;

        // Convert the integer part
        while (integerPart > 0) {
            int remainder = integerPart % 16;
            if (remainder < 10) {
                hexadecimalString = remainder + hexadecimalString;
            } else {
                hexadecimalString = (char) ('A' + remainder - 10) + hexadecimalString;
            }
            integerPart /= 16;
        }

        // Convert the fractional part if it exists
        if (fractionalPart > 0) {
            hexadecimalString += ".";
            while (fractionalPart > 0) {
                fractionalPart *= 16;
                int digit = (int) fractionalPart;
                if (digit < 10) {
                    hexadecimalString += digit;
                } else {
                    hexadecimalString += (char) ('A' + digit - 10);
                }
                fractionalPart -= digit;
            }
        }
        return hexadecimalString;
    }

    /**
     * Converts a hexadecimal string to a decimal number
     *
     * @param hexadecimalString The hexadecimal number as a string
     * @return The decimal number
     */
    public double hexadecimalToDecimal(String hexadecimalString) {
        String[] parts = hexadecimalString.split("\\.");

        if (parts.length > 2) {
            throw new IllegalArgumentException("Invalid hexadecimal string");
        }

        int integerPart = 0;
        double fractionalPart = 0.0;

        // Convert the integer part
        for (int i = 0; i < parts[0].length(); i++) {
            char digit = parts[0].charAt(i);
            if (digit >= '0' && digit <= '9') {
                integerPart = integerPart * 16 + digit - '0';
            } else if (digit >= 'A' && digit <= 'F') {
                integerPart = integerPart * 16 + digit - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal string");
            }
        }

        // Convert the fractional part if it exists
        if (parts.length == 2) {
            for (int i = 0; i < parts[1].length(); i++) {
                char digit = parts[1].charAt(i);
                if (digit >= '0' && digit <= '9') {
                    fractionalPart += (digit - '0') / Math.pow(16, i + 1);
                } else if (digit >= 'A' && digit <= 'F') {
                    fractionalPart += (digit - 'A' + 10) / Math.pow(16, i + 1);
                } else {
                    throw new IllegalArgumentException("Invalid hexadecimal string");
                }
            }
        }
        return integerPart + fractionalPart;
    }

    /**
     * Converts a decimal number to an octal string
     *
     * @param decimalNumber The decimal number
     * @return The octal string
     */
    public String decimalToOctal(double decimalNumber) {
        String octalString = "";
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;

        // Convert the integer part
        while (integerPart > 0) {
            octalString = (integerPart % 8) + octalString;
            integerPart /= 8;
        }

        // Convert the fractional part if it exists
        if (fractionalPart > 0) {
            octalString += ".";
            while (fractionalPart > 0) {
                fractionalPart *= 8;
                if (fractionalPart >= 1) {
                    octalString += (int) fractionalPart;
                    fractionalPart -= (int) fractionalPart;
                } else {
                    octalString += "0";
                }
            }
        }
        return octalString;
    }

    /**
     * Converts an octal string to a decimal number
     *
     * @param octalString The octal number as a string
     * @return The decimal number
     */
    public double octalToDecimal(String octalString) {
        String[] parts = octalString.split("\\.");

        if (parts.length > 2) {
            throw new IllegalArgumentException("Invalid octal string");
        }

        int integerPart = 0;
        double fractionalPart = 0.0;

        // Convert the integer part
        for (int i = 0; i < parts[0].length(); i++) {
            char digit = parts[0].charAt(i);
            if (digit >= '0' && digit <= '7') {
                integerPart = integerPart * 8 + digit - '0';
            } else {
                throw new IllegalArgumentException("Invalid octal string");
            }
        }

        // Convert the fractional part if it exists
        if (parts.length == 2) {
            for (int i = 0; i < parts[1].length(); i++) {
                char digit = parts[1].charAt(i);
                if (digit >= '0' && digit <= '7') {
                    fractionalPart += (digit - '0') / Math.pow(8, i + 1);
                } else {
                    throw new IllegalArgumentException("Invalid octal string");
                }
            }
        }
        return integerPart + fractionalPart;
    }

    /**
     * Converts a decimal number to a base-n string
     *
     * @param decimalNumber The decimal number
     * @param base          The base
     * @return The base-n string
     */
    public String decimalToBaseN(double decimalNumber, int base) {
        String baseNString = "";
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;

        // Convert the integer part
        while (integerPart > 0) {
            baseNString = (integerPart % base) + baseNString;
            integerPart /= base;
        }

        // Convert the fractional part if it exists
        if (fractionalPart > 0) {
            baseNString += ".";
            while (fractionalPart > 0) {
                fractionalPart *= base;
                if (fractionalPart >= 1) {
                    baseNString += (int) fractionalPart;
                    fractionalPart -= (int) fractionalPart;
                } else {
                    baseNString += "0";
                }
            }
        }
        return baseNString;
    }

    /**
     * Converts a base-n string to a decimal number
     *
     * @param baseNString The base-n number as a string
     * @param base        The base
     * @return The decimal number
     */
    public double baseNToDecimal(String baseNString, int base) {
        String[] parts = baseNString.split("\\.");

        if (parts.length > 2) {
            throw new IllegalArgumentException("Invalid base-n string");
        }

        int integerPart = 0;
        double fractionalPart = 0.0;

        // Convert the integer part
        for (int i = 0; i < parts[0].length(); i++) {
            char digit = parts[0].charAt(i);
            if (digit >= '0' && digit <= '9') {
                integerPart = integerPart * base + digit - '0';
            } else if (digit >= 'A' && digit <= 'Z') {
                integerPart = integerPart * base + digit - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid base-n string");
            }
        }

        // Convert the fractional part if it exists
        if (parts.length == 2) {
            for (int i = 0; i < parts[1].length(); i++) {
                char digit = parts[1].charAt(i);
                if (digit >= '0' && digit <= '9') {
                    fractionalPart += (digit - '0') / Math.pow(base, i + 1);
                } else if (digit >= 'A' && digit <= 'Z') {
                    fractionalPart += (digit - 'A' + 10) / Math.pow(base, i + 1);
                } else {
                    throw new IllegalArgumentException("Invalid base-n string");
                }
            }
        }
        return integerPart + fractionalPart;
    }

    /**
     * Converts a binary string to an octal string
     *
     * @param binaryString The binary string
     * @return The octal string
     */
    public String binaryToOctal(String binaryString) {
        return decimalToOctal(binaryToDecimal(binaryString));
    }

    /**
     * Converts an octal string to a binary string
     *
     * @param octalString The octal string
     * @return The binary string
     */
    public String octalToBinary(String octalString) {
        return decimalToBinary(octalToDecimal(octalString));
    }

    /**
     * Converts a binary string to a hexadecimal string
     *
     * @param binaryString The binary string
     * @return The hexadecimal string
     */
    public String binaryToHexadecimal(String binaryString) {
        return decimalToHexadecimal(binaryToDecimal(binaryString));
    }

    /**
     * Converts a hexadecimal string to a binary string
     *
     * @param hexadecimalString The hexadecimal string
     * @return The binary string
     */
    public String hexadecimalToBinary(String hexadecimalString) {
        return decimalToBinary(hexadecimalToDecimal(hexadecimalString));
    }

    /**
     * Binary to base n string.
     *
     * @param binaryString the binary string
     * @param base         the base
     * @return the string
     */
    public String binaryToBaseN(String binaryString, int base) {
        return decimalToBaseN(binaryToDecimal(binaryString), base);
    }

    /**
     * Octal to hexadecimal string.
     *
     * @param octalString the octal string
     * @return the string
     */
    public String octalToHexadecimal(String octalString) {
        return decimalToHexadecimal(octalToDecimal(octalString));
    }

    /**
     * Hexadecimal to octal string.
     *
     * @param hexadecimalString the hexadecimal string
     * @return the string
     */
    public String hexadecimalToOctal(String hexadecimalString) {
        return decimalToOctal(hexadecimalToDecimal(hexadecimalString));
    }

    /**
     * Octal to base n string.
     *
     * @param octalString the octal string
     * @param base        the base
     * @return the string
     */
    public String octalToBaseN(String octalString, int base) {
        return decimalToBaseN(octalToDecimal(octalString), base);
    }


    /**
     * Hexadecimal to base n string.
     *
     * @param hexadecimalString the hexadecimal string
     * @param base              the base
     * @return the string
     */
    public String hexadecimalToBaseN(String hexadecimalString, int base) {
        return decimalToBaseN(hexadecimalToDecimal(hexadecimalString), base);
    }

    /**
     * Base n to base k string.
     *
     * @param baseNString the base n string
     * @param baseN       the base n
     * @param baseK       the base k
     * @return the string
     */
    public String baseNToBaseK(String baseNString, int baseN, int baseK) {
        return decimalToBaseN(baseNToDecimal(baseNString, baseN), baseK);
    }
}
