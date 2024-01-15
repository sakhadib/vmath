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
    

    public int BitWiseNOT (int a){


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


     public int BitWiseXOR( int a, int b){

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
     * @param isUnsigned is the boolean value
     * @return the rightshift value
     */


    public int rightShift(int num, int shiftBy, boolean isUnsigned) {
        if (isUnsigned) {
            return num >>> shiftBy;
        } else {
            for (int i = 0; i < shiftBy; i++) {
                num >>= 1;
            }
            return num;
        }
    }


    /**
     * Return the LeftShift value
     * @param num the int value
     * @param shiftBy is the value of how much value need to be shifted
     * @param isUnsigned is the boolean value
     * @return the LeftShift value
     */

    public int leftShift(int num, int shiftBy, boolean isUnsigned) {
        if (isUnsigned) {
            return num << shiftBy;
        } else {
            for (int i = 0; i < shiftBy; i++) {
                num <<= 1;
            }
            return num;
        }
    }

  /**
    * Returns the binary representation of a number.
    * @param binaryNumber The number to be converted
   * @param shiftAmount The number of bits to shift
    * @return The binary representation of the bitwiseZeroFillRightShift number

   */
  public  String bitwiseZeroFillRightShift(int binaryNumber, int shiftAmount) {
    binaryNumber = binaryNumber >> shiftAmount;
     String r = BaseConverter.getInstance().decimalToBinary(binaryNumber);

      return r;
  }



    public static int getByte(int x, int n, boolean isUnsigned) {
        if (isUnsigned) {
            // Use bitwise AND to mask out the desired byte, no need for sign extension
            return (x >> (n << 3)) & 0xff;
        } else {
            // Use the existing logic for signed integers
            int res = ((x & (0xff << (n << 3))) >> (n << 3)) & 0xff;
            return res;
        }
    }

    

    public static int setBit0(int n, int i) {
        return (n & ~(1 << i));
    }
    public static int setBit1(int n, int i) {
        return (n | (1 << i));
    }






    
    public static int toggleBit(int n, int i) {
        return (n ^ (1 << i));
    }





    public static int logicalShift(int x, int n, boolean isUnsigned) {
        if (isUnsigned) {
            return x >>> n;
        } else {
            int res = (x >> n) & (~(((1 << 31) >> n) << 1));
            return res;
        }
    }



//    public static int rotateRight(int x, int n, boolean isUnsigned) {
//        if (isUnsigned) {
//            // Ensure n is in the range [0, 31] for unsigned rotation
//            n = n % 32;
//            return (x >>> n) | (x << (32 - n));
//        } else {
//            int m = x << (32 + ((~n) + 1));
//            int p = ~((~0) << (32 + ((~n) + 1)));
//            int k = x >> n;
//            k = k & p;
//            return (k + m);
//        }
//    }


//    public static boolean addOK(int x, int y, boolean isUnsigned) {
//        int sum = x + y;
//
//        if (isUnsigned) {
//            // Check for overflow in unsigned addition
//            return sum >= 0;
//        } else {
//            // Check for overflow in signed addition
//            int xsign = x >> 31;
//            int ysign = y >> 31;
//            int xysign = sum >> 31;
//
//            // Check for overflow (sum has different sign than x or y)
//            return (xsign == ysign) || (ysign != xysign);
//        }
//    }




}
