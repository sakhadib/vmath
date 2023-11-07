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
    public  int bitwiseOR(int a, int b) {
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


    /**
     * Return the bitwise And value
     * @param a is the given value
     * @param b is the given value
     * @return AND value
     */
    public  int BitWiseAnd(int a, int b) {

        int result = 0;
        int mask = 1;

        for (int i=0; i<32;i++) // assuming 32-bit integer
        {

            int bin1 = (a & mask) >> i;
            int bin2 = (b & mask) >> i;


            int bitWiseANDResult = bin1 & bin2;

            result |= (bitWiseANDResult << i);

            mask <<=1;

        }


        return  result;

    }





}
