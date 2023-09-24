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
     * Converts a number from one base to another.
     * @param number The number to convert
     * @param fromBase The base to convert from
     * @param toBase The base to convert to
     * @return The converted number
     */

}
