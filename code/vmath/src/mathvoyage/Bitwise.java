package mathvoyage;

public class Bitwise {
private static Bitwise instance;

    private Bitwise() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     * @return The singleton instance
     */
    public static Bitwise getInstance() {
        if (instance == null) {
            instance = new Bitwise();
        }
        return instance;
    }


}
