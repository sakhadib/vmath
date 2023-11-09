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
    public  int BitWiseOR(int a, int b) {
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
    public  int BitWiseAND(int a, int b) {

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


    /**
     * Return the NOT value
     * @param a is the int value
     * @return the NOT value
     */
    

    public int BitWishNOT (int a){


        int result = 0;

        for(int i= 0; i<32; i++){ // asuming 32-bit integer

            int  bit = ( a >>i) & 1;

            int  invertedBit = ( bit == 0 ) ? 1 : 0 ;

            result |= ( invertedBit << i );
        }

        return  result;

    }


    /**
     * Return the XOR value
     * @param a is the int value
     * @param b is the int value
     * @return the XOR value
     */


     public int BitWishXOR( int a, int b){

        int result = 0;


        for (int i= 0; i<32; i++){

            int bit1 = (a >> i ) & 1 ;

            int  bit2 = (b >> i ) & 1;

            int xorResult = bit1 ^ bit2 ;

            result |= ( xorResult << i );

        }

        return result;

     }


    /**
     * Return the rightshift value
     * @param num the int value
     * @param shiftBy is the value of how much value need to be shifted
     * @return the rightshift value
     */


    public int RightShift (int num, int shiftBy){

        for( int i=0; i<shiftBy; i++ ){

            num >>= 1;

        }

        return num;

     }




}
