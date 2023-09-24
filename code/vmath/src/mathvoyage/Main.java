package mathvoyage;

public class Main {
    public static void main(String[] args) {
        BaseConverter bc = BaseConverter.getInstance();
        System.out.println(vmath.baseConverter.binaryToDecimal("1100.010101110000101000111101011100001010001111010111"));
        System.out.println(bc.decimalToBinary(12.34));
    }
}