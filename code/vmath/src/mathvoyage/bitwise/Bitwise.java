package mathvoyage.bitwise;

import mathvoyage.NumberSystem.BaseConverter;
import mathvoyage.algebra.Algebra;
import mathvoyage.vmath;

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

    /**
     * Return the OR value
     * @param a is the int value given
     * @param b is the int value given
     * @return or value
      */
    public static int bitwiseOR(int a, int b) {
        int result = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) { // Assuming 32-bit integers
            int bitA = (a & mask) >> i;
            int bitB = (b & mask) >> i;
            int bitwiseOR = (bitA | bitB) << i;

            result |= bitwiseOR;
            mask <<= 1;
        }

        return result;
    }




   











//    public class BitWiseAnd(String bin1, String bin2){
//
//    }





}
