import mathvoyage.geometry.CartesianPoint;
import mathvoyage.geometry.Geometry;
import mathvoyage.geometry.Point;
import mathvoyage.geometry.PolarPoint;
import mathvoyage.vmath;

public class Main {
    public static void main(String[] args) {
//
//        //For Algebraic Functions
//        Integer[] arr = {1, 5, 2, 4, 7, 3, 9, 8, 6, 10};
//
//        System.out.println("Algebraic Functions");
//        System.out.println("____________________________________________");
//        System.out.println("Absolute Value of -5: " + vmath.algebra.abs(-5));
//        System.out.println("3 to the power of 4: " + vmath.algebra.pow(3, 4));
//        System.out.println("Square root of 16: " + vmath.algebra.sqrt(16));
//        System.out.println("Cube root of 27: " + vmath.algebra.cubeRoot(27));
//        System.out.println("6th root of 64: " + vmath.algebra.nthRoot(64, 6));
//        System.out.println("Factorial of 5: " + vmath.algebra.factorial(5));
//        System.out.println("GCD of 12 and 18: " + vmath.algebra.gcd(12, 18));
//        System.out.println("LCM of 12 and 18: " + vmath.algebra.lcm(12, 18));
//        System.out.println("Max of 7 and 13 is " + vmath.algebra.max(7, 13));
//        System.out.println("Min of 7 and 13 is " + vmath.algebra.min(7, 13));
//        System.out.println("Max value in array test is " + vmath.algebra.max(arr));
//        System.out.println("Min value in array test is " + vmath.algebra.min(arr));
//        System.out.println("Index of maximum value in array test is " + vmath.algebra.argMax(arr));
//        System.out.println("Index of minimum value in array test is " + vmath.algebra.argMin(arr));
//        System.out.println("____________________________________________\n\n\n\n");
//
//        //For Trigonometric Functions
//        System.out.println("Trigonometric Functions");
//        System.out.println("____________________________________________");
//        System.out.println("30 Degrees in Radian: " + vmath.Trigonometry.degreeToRadian(30));
//        System.out.println("PI/6 Radians in Degree: " + vmath.Trigonometry.radianToDegree(vmath.constant.PI/6));
//        System.out.println("Sine of 30 degrees: " + vmath.Trigonometry.sin(30, Angle.DEGREE));
//        System.out.println("Cosine of 30 degrees: " + vmath.Trigonometry.cos(30, Angle.DEGREE));
//        System.out.println("Tangent of 30 degrees: " + vmath.Trigonometry.tan(30, Angle.DEGREE));
//        System.out.println("Cotangent of 30 degrees: " + vmath.Trigonometry.cot(30, Angle.DEGREE));
//        System.out.println(("Cosecant of 30 degrees: " + vmath.Trigonometry.cosec(30, Angle.DEGREE)));
//        System.out.println("Secant of 30 degrees: " + vmath.Trigonometry.sec(30, Angle.DEGREE));
//        System.out.println("Sine of 0.523599 radians: " + vmath.Trigonometry.sin(0.523599, Angle.RADIAN));
//        System.out.println("Cosine of 0.523599 radians: " + vmath.Trigonometry.cos(0.523599, Angle.RADIAN));
//        System.out.println("Tangent of 0.523599 radians: " + vmath.Trigonometry.tan(0.523599, Angle.RADIAN));
//        System.out.println("Cotangent of 0.523599 radians: " + vmath.Trigonometry.cot(0.523599, Angle.RADIAN));
//        System.out.println(("Cosecant of 0.523599 radians: " + vmath.Trigonometry.cosec(0.523599, Angle.RADIAN)));
//        System.out.println("Secant of 0.523599 radians: " + vmath.Trigonometry.sec(0.523599, Angle.RADIAN));
//        System.out.println("____________________________________________\n\n\n\n");
//
//        //For Inverse Trigonometric Functions
//        System.out.println("Inverse Trigonometric Functions");
//        System.out.println("____________________________________________");
//        System.out.println("Arc sine of 0.5: " + vmath.Trigonometry.arcsin(0.5, Angle.DEGREE));
//        System.out.println("Arc cosine of 0.5: " + vmath.Trigonometry.arccos(0.5, Angle.DEGREE));
//        System.out.println("Arc-tangent of 0.5: " + vmath.Trigonometry.arctan(0.5, Angle.DEGREE));
//        System.out.println("Arc cotangent of 2: " + vmath.Trigonometry.arccot(2, Angle.DEGREE));
//        System.out.println("Arccosecant of 2: " + vmath.Trigonometry.arccosec(2, Angle.DEGREE));
//        System.out.println("Arcsecant of 2: " + vmath.Trigonometry.arcsec(2, Angle.DEGREE));
//        System.out.println("Arcsine of 0.5: " + vmath.Trigonometry.arcsin(0.5, Angle.RADIAN));
//        System.out.println("Arccosine of 0.5: " + vmath.Trigonometry.arccos(0.5, Angle.RADIAN));
//        System.out.println("Arctangent of 0.5: " + vmath.Trigonometry.arctan(0.5, Angle.RADIAN));
//        System.out.println("Arccotangent of 2: " + vmath.Trigonometry.arccot(2, Angle.RADIAN));
//        System.out.println("Arccosecant of 2: " + vmath.Trigonometry.arccosec(2, Angle.RADIAN));
//        System.out.println("Arcsecant of 2: " + vmath.Trigonometry.arcsec(2, Angle.RADIAN));
//        System.out.println("____________________________________________\n\n\n\n");
//
//        //For Combinatorics Functions
//        System.out.println("Combinatorics Functions");
//        System.out.println("____________________________________________");
//        System.out.println("Permutation of 5 and 3: " + vmath.combinatorics.permutation(5, 3));
//        System.out.println("Combination of 5 and 3: " + vmath.combinatorics.combination(5, 3));
//        System.out.println("Number of subesets for a set size of 3 is " + vmath.combinatorics.numberOfSubsets(3));
//        Integer[] set = {1, 2, 3};
//        ArrayList<ArrayList<Integer>> subsets = vmath.combinatorics.generateSubsets(set);
//        System.out.println("Subsets of {1, 2, 3} are: ");
//        // Print the subsets
//        int count = 1;
//        for (ArrayList<Integer> subset : subsets) {
//            System.out.println(count + " : " + subset);
//            count++;
//        }
//        System.out.println("____________________________________________\n\n\n\n");
//
//        //For Base Conversion Functions
//        System.out.println("Base Conversion Functions");
//        System.out.println("____________________________________________");
//        System.out.println("Binary of 10(dec) : " + vmath.baseConverter.decToBin(10));
//        System.out.println("Octal of 10(dec) : " + vmath.baseConverter.decToOct(10));
//        System.out.println("Hexadecimal of 10(dec) : " + vmath.baseConverter.decToHex(10));
//        System.out.println("Decimal of 1010(bin) : " + vmath.baseConverter.binToDec("1010"));
//        System.out.println("Octal of 1010(bin) : " + vmath.baseConverter.binToOct("1010"));
//        System.out.println("Hexadecimal of 1010(bin) : " + vmath.baseConverter.binToHex("1010"));
//        System.out.println("Binary of 12(oct) : " + vmath.baseConverter.octToBin("12"));
//        System.out.println("Decimal of 12(oct) : " + vmath.baseConverter.octToDec("12"));
//        System.out.println("Hexadecimal of 12(oct) : " + vmath.baseConverter.octToHex("12"));
//        System.out.println("Binary of A(Hex) : " + vmath.baseConverter.hexToBin("A"));
//        System.out.println("Octal of A(Hex) : " + vmath.baseConverter.hexToOct("A"));
//        System.out.println("Decimal of A(Hex) : " + vmath.baseConverter.hexToDec("A"));
//        System.out.println("1010 of base 2 to base 10 : " + vmath.baseConverter.nToK("8", 10, 8));
//        System.out.println("____________________________________________\n\n\n\n");



//        //After Progress Presentation
//
//        double[][] data1 = {{2, 1, 1}, {1, 3, 2}, {1, 2, 4}};
//        double[][] data2 = {{9, 8, 7}, {7, 6, 5}, {5, 4, 3}};
//        double[][] data3 = {{2, 7}, {3, 9}, {4, 8}, {5, 6}};
//        double[][] data4 = {{1, 2, 3}, {4, 5, 6}};
//        Matrix a = new Matrix(data1);
//        Matrix b = new Matrix(data2);
//        Matrix c = new Matrix(data3);
//        Matrix d = new Matrix(data4);
//
////        Matrix a = new Matrix(3, 3);
////        Matrix b = new Matrix(3, 3);
//
//        //c.multiply(d).printMatrix();
//        try {
//            c.inverse().printMatrix();
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }

//        double[][] data1 = {{1, 2, 3}, {4, 5, 6}};


        //For Base Conversion Functions
//        System.out.println("Base Conversion Functions");
//        System.out.println("____________________________________________");
//        System.out.println("Binary of 10(dec) : " + vmath.baseConverter.decToBin(10));
//        System.out.println("Octal of 10(dec) : " + vmath.baseConverter.decToOct(10));
//        System.out.println("Hexadecimal of 10(dec) : " + vmath.baseConverter.decToHex(10));
//        System.out.println("Decimal of 1010(bin) : " + vmath.baseConverter.binToDec("1010"));
//        System.out.println("Octal of 1010(bin) : " + vmath.baseConverter.binToOct("1010"));
//        System.out.println("Hexadecimal of 1010(bin) : " + vmath.baseConverter.binToHex("1010"));
//        System.out.println("Binary of 12(oct) : " + vmath.baseConverter.octToBin("12"));
//        System.out.println("Decimal of 12(oct) : " + vmath.baseConverter.octToDec("12"));
//        System.out.println("Hexadecimal of 12(oct) : " + vmath.baseConverter.octToHex("12"));
//        System.out.println("Binary of A(Hex) : " + vmath.baseConverter.hexToBin("A"));
//        System.out.println("Octal of A(Hex) : " + vmath.baseConverter.hexToOct("A"));
//        System.out.println("Decimal of A(Hex) : " + vmath.baseConverter.hexToDec("A"));
//        System.out.println("1010 of base 2 to base 10 : " + vmath.baseConverter.nToK("8", 10, 8));
//        System.out.println("____________________________________________\n\n\n\n");
//
        Geometry g = Geometry.getInstance();
        Point p1 = new CartesianPoint(3, 2);
        Point p2 = new CartesianPoint(2, -1);
        Point p3 = new CartesianPoint(8, -3);
        Point p4 = new CartesianPoint(9, 0);


        double area = g.areaOfQuadrilaterial(p1, p2, p3, p4);
        System.out.println(area);

    }




}
