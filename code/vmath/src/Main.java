
import mathvoyage.*;

import mathvoyage.geometry.*;
import mathvoyage.matrix.Matrix;
import mathvoyage.matrix.vector;
import mathvoyage.vmath;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//
        //For Algebraic Functions
//        Integer[] arr = {1, 5, 2, 4, 7, 3, 9, 8, 6, 10};
//
//        System.out.println("Algebraic Functions");
//        System.out.println("____________________________________________");
//        System.out.println("Absolute Value of -5: " + vmath.algebra.abs(-5));
//        System.out.println("3 to the power of 4: " + vmath.algebra.pow(0, 4));
//        System.out.println("Square root of 16: " + vmath.algebra.sqrt(16));
//        System.out.println("Cube root of 27: " + vmath.algebra.cubeRoot(27));
//        System.out.println("6th root of 64: " + vmath.algebra.nthRoot(64, 6));
//        System.out.println("Factorial of 5: " + vmath.algebra.factorial(5));
//        System.out.println("GCD of 12 and 18: " + vmath.algebra.gcd(12, 18));
//        System.out.println("LCM of 12 and 18: " + vmath.algebra.lcm(12, 18));
//        System.out.println("Max of 7 and 13 is " + vmath.algebra.max(7, 13));
//        System.out.println("Min of 7 and 13 is " + vmath.algebra.min(7, 13));
//        System.out.println("Min of 7.15 and 7.11 is " + vmath.algebra.min(7.15, 7.11));
//        System.out.println("Max value in array test is " + vmath.algebra.max(arr));
//        System.out.println("Min value in array test is " + vmath.algebra.min(arr));
//        System.out.println("Index of maximum value in array test is " + vmath.algebra.argMax(arr));
//        System.out.println("Index of minimum value in array test is " + vmath.algebra.argMin(arr));
//        System.out.println("Floor of 3.14 is " + vmath.algebra.floor(3.14));
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
//        System.out.println("Arc-tangent of 0.5: " + vmath.Trigonometry.arctan((vmath.algebra.sqrt(3)), Angle.DEGREE));
//        System.out.println("Arc cotangent of 2: " + vmath.Trigonometry.arccot((vmath.algebra.sqrt(3)), Angle.DEGREE));
//        System.out.println("Arccosecant of 2: " + vmath.Trigonometry.arccosec(2, Angle.DEGREE));
//        System.out.println("Arcsecant of 2: " + vmath.Trigonometry.arcsec(2, Angle.DEGREE));


//        System.out.println("Arcsine of 0.5: " + vmath.Trigonometry.arcsin(0.5, Angle.RADIAN));
//        System.out.println("Arccosine of 0.5: " + vmath.Trigonometry.arccos(0.5, Angle.RADIAN));
//        System.out.println("Arctangent of 0.5: " + vmath.Trigonometry.arctan((vmath.algebra.sqrt(3)), Angle.RADIAN));
//        System.out.println("Arccotangent of 2: " + vmath.Trigonometry.arccot((vmath.algebra.sqrt(3)), Angle.RADIAN));
//        System.out.println("Arccosecant of 2: " + vmath.Trigonometry.arccosec(2, Angle.RADIAN));
//        System.out.println("Arcsecant of 2: " + vmath.Trigonometry.arcsec(2, Angle.RADIAN));
//        System.out.println("____________________________________________\n\n\n\n");

//        System.out.println(vmath.Trigonometry.arctan(1, Angle.DEGREE));
//        System.out.println(vmath.Trigonometry.arctan(-1, Angle.DEGREE));
//        System.out.println(vmath.Trigonometry.arctan(0, Angle.DEGREE));
//        System.out.println(vmath.Trigonometry.arctan(1*vmath.algebra.sqrt(3), Angle.DEGREE));
//        System.out.println(vmath.Trigonometry.arctan(-1*vmath.algebra.sqrt(3), Angle.DEGREE));
//        System.out.println(vmath.Trigonometry.arctan(1/vmath.algebra.sqrt(3), Angle.DEGREE));
//        System.out.println(vmath.Trigonometry.arctan(-1/vmath.algebra.sqrt(3), Angle.DEGREE));
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
////        //For Base Conversion Functions
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

//        System.out.println(" Decimal of 10(base 6): " + vmath.baseConverter.decToN(10, 6));
//        System.out.println(" 14 of base 6 to Decimal: " + vmath.baseConverter.nToDec("14", 6));

//        System.out.println("12(Oct) to base 6 : " + vmath.baseConverter.octToN("12", 6));
//        System.out.println("A(Hex) to base 6: " + vmath.baseConverter.hexToN("A", 6));
//        System.out.println("1010(bin) to base 6: " + vmath.baseConverter.binToN("1010", 6));


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
//        c.multiply(d).printMatrix();
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


//        System.out.println("Matrix Functions");
//        System.out.println("____________________________________________");
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
//        System.out.println("Matrix A: ");
//        a.printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix B: ");
//        b.printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix C: ");
//        c.printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix D: ");
//        d.printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix A + Matrix B: ");
//        vmath.matrix.add(a, b).printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix B - Matrix A: ");
//        vmath.matrix.subtract(b, a).printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix A * Matrix B: ");
//        vmath.matrix.multiply(a, b).printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix A * 2: ");
//        vmath.matrix.multiply(a, 2).printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix A Transpose: ");
//        vmath.matrix.transpose(a).printMatrix();
//        System.out.println("\n");
//        System.out.println("Matrix A Inverse: ");
//        vmath.matrix.inverse(a).printMatrix();
//        System.out.println("\n");
//        System.out.println("Determinant of Matrix A: "+ vmath.matrix.determinant(a));
//        System.out.println("\n");
//        System.out.println("Create a 3x4 Zero Matrix: ");
//        vmath.matrix.zeros(3,4).printMatrix();
//        System.out.println("\n");
//        System.out.println("Create a 3x4 One Matrix: ");
//        vmath.matrix.ones(3,4).printMatrix();
//        System.out.println("\n");
//        System.out.println("Create a 3x3 Identity Matrix: ");
//        vmath.matrix.eye(3).printMatrix();
//        System.out.println("\n");
//        System.out.println("Compare Matrix A and Matrix B: "+ vmath.matrix.compare(a, b));
//        System.out.println("\n");
//        System.out.println("2 power of Matrix A: ");
//        vmath.matrix.pow(a, 2).printMatrix();
//        System.out.println("\n");


//        System.out.println("____________________________________________\n\n\n\n");





//        System.out.println("Vector Functions");
//        System.out.println("____________________________________________");
//
//        double[] data1 = {1, 2, 3};
//        double[] data2 = {4, 5, 6};
//        double[][] data3 = {{2, 1, 1}, {1, 3, 2}, {1, 2, 4}};
//
//        vector a = new vector(data1);
//        vector b = new vector(data2);
//        Matrix c = new Matrix(data3);

//        System.out.println("Vector A + Vector B: ");
//        vmath.Vector.add(a, b).printVector();
//        System.out.println("\n");
//        System.out.println("Vector B - Vector A: ");
//        vmath.Vector.subtract(b, a).printVector();
//        System.out.println("\n");
//        System.out.println("Vector A . Vector B: ");
//        System.out.println(vmath.Vector.scalerProduct(a, b));
//        System.out.println("\n");
//        System.out.println("Vector A x Vector B: ");
//        vmath.Vector.vectorProduct(a, b).printVector();
//        System.out.println("\n");
//        System.out.println("Vector A x Matrix C: ");
//        vmath.Vector.multiply(a, c).printVector();
//        System.out.println("\n");
//        System.out.println("Compare Vector A and Vector B: "+ vmath.Vector.compare(a, b));
//        System.out.println("\n");
//        System.out.println("Magnitude of Vector A: "+ vmath.Vector.magnitude(a));
//        System.out.println("\n");
//        System.out.println("Unit Vector of Vector A: ");
//        vmath.Vector.unitVector(a).printVector();
//        System.out.println("\n");

//        System.out.println("____________________________________________\n\n\n\n");




//        System.out.println("Geometry Functions");
//        System.out.println("____________________________________________");
//        System.out.println("Cartesian Distance between (1, 2) and (3, 4): " + vmath.geometry.distance(new CartesianPoint(1,2), new CartesianPoint(3,4), DistanceType.CARTESIAN));
//        Point pp = new CartesianPoint(0,0);
//        System.out.println(pp.getR());
        //        System.out.println("Slope between (1, 2) and (3, 4): " + vmath.geometry.slope(new CartesianPoint(1,2), new CartesianPoint(3,4)));
//        Point p1 = vmath.geometry.midpoint(new CartesianPoint(1,2), new CartesianPoint(3,4));
//        System.out.println("Midpoint between (1, 2) and (3, 4): (" + p1.getX() + ", " + p1.getY() + ")");
//        Point p2 = vmath.geometry.centroid(new CartesianPoint(1,2), new CartesianPoint(3,4), new CartesianPoint(5,6));
//        System.out.println("Centroid between (1, 2), (3, 4) and (5, 6): (" + p2.getX() + ", " + p2.getY() + ")");
//        System.out.println("Area of Triangle with vertices (1, 1), (1, 4) and (5, 6): " + vmath.geometry.areaOfTriangle(new CartesianPoint(1,1), new CartesianPoint(1,4), new CartesianPoint(5,6)));
//        Point p3 = vmath.geometry.interleaverPoint(new CartesianPoint(2,0), new CartesianPoint(7,5), 2, 3);
//        System.out.println("Interleaver point of (2,0) and (7,5) that divides the connecting line in a ratio of 2:3: (" + p3.getX() + ", " + p3.getY() + ")");
//        Point p4 = vmath.geometry.externalizerPoint(new CartesianPoint(-2,3), new CartesianPoint(6,-8), 1, 2);
//        System.out.println("Externalizer point of (-2,3) and (6,-8) that divides the connecting line in a ratio of 1:2: (" + p4.getX() + ", " + p4.getY() + ")");
//        System.out.println("Area of circle has (1,1) and (1,3) points as two end points of radius: "+ vmath.geometry.areaOfCircle(new CartesianPoint(1,1), new CartesianPoint(1,3)));
//        System.out.println("Circumference of circle has (1,1) and (1,3) points as two end points of radius: "+ vmath.geometry.circumferenceOfCircle(new CartesianPoint(1,1), new CartesianPoint(1,3)));
//        System.out.println("(1,1), (1,3) and (3,1) are the vertices of a triangle is Isosceles: "+ vmath.geometry.isTriangle(new CartesianPoint(1,1), new CartesianPoint(1,3), new CartesianPoint(3,1), triangleType.ISOSCELES));
//        System.out.println("Angle between slope 1 and slope 2: " + vmath.geometry.angleBetweenTwoSlopes(1, 2));
//        System.out.println("(1,1), (1,3), (3,1) and (3,3) are the vertices of a rectangle: "+ vmath.geometry.isQuadrilateral(new CartesianPoint(1,1), new CartesianPoint(1,3), new CartesianPoint(3,1), new CartesianPoint(3,3), quadrilateralType.PARALLELOGRAM));
//        System.out.println("Is x+2y+3=0 and 2x+4y+6=0 are same lines: "+ vmath.geometry.isLine(new NormalLine(1,2,3), new NormalLine(2,4,6), lineType.SAME));
//        System.out.println("Are x+2y+3=0, 2x+4y+6=0 and 3x+6y+9=0 same lines: "+ vmath.geometry.areThreeLinesSame(new NormalLine(1,2,3), new NormalLine(2,4,6), new NormalLine(3,6,9)));
//        Point p5 = vmath.geometry.intersectionOfTwoLines(new NormalLine(1,-5,6), new NormalLine(1,4,4));
//        System.out.println("Intersection point of x-5y+6=0 and x+4y+4=0: ("+ p5.getX() + ", " + p5.getY() + ")");
//        System.out.println("Slope of x-5y+6=0: " + vmath.geometry.slope(new NormalLine(1,-5,6)));
//        System.out.println("Distance between two parallel lines 4x-3y-8 and 4x-3y+2=0: " + vmath.geometry.distanceBetweenTwoParallelLines(new NormalLine(4,-3,-8), new NormalLine(4,-3,2)));
//        System.out.println("Distance of (1,1) from line 2x+3y+4=0: " + vmath.geometry.perpendicularDistanceFromAPointToALine(new NormalLine(2,3,4), new CartesianPoint(1,1)));
//        Line l1 = vmath.geometry.getPerpendicularLine(new NormalLine(3,12,-7), new CartesianPoint(2,5));
//        System.out.println("Line that is perpendicular to 3x+12y-7=0 and passes through (2,5): (" + l1.getCoefficientOfX() + ", " + l1.getCoefficientOfY() + ", " + l1.getConstant() + ")");
//        Line l2 = vmath.geometry.getParallelLine(new NormalLine(2, 11, -2), new CartesianPoint(4, -3));
//        System.out.println("Line that is parallel to 2x+11y-2=0 and passes through (4,-3): (" + l2.getCoefficientOfX() + ", " + l2.getCoefficientOfY() + ", " + l2.getConstant() + ")");
//        Line l3 = vmath.geometry.getLineFromIntersectionPoint(new NormalLine(2, 11, -2), new NormalLine(3, 12, -7), new CartesianPoint(2, 5));
//        System.out.println("Line that passes through the intersection point of 2x+11y-2=0 and 3x+12y-7=0 and goes through (2,5): (" + l3.getCoefficientOfX() + ", " + l3.getCoefficientOfY() + ", " + l3.getConstant() + ")");
//        System.out.println("Area of quadrilateral with vertices (6,8), (2,5), (5,9) and (9,12): " + vmath.geometry.areaOfQuadrilateral(new CartesianPoint(6,8), new CartesianPoint(2,5), new CartesianPoint(5,9), new CartesianPoint(9,12)));
//        System.out.println("Area of quadrilateral created by 4x-3y+7=0, 3x-4y+21=0, 4x-3y=0 and 3x-4y+14=0 : " + vmath.geometry.areaOfQuadrilateral(new NormalLine(4,-3,7), new NormalLine(3,-4,21), new NormalLine(4,-3,0), new NormalLine(3,-4,14)));
//        System.out.println("Area of a triangle created by 4x-3y+7=0, x+y-14=0 and 3x-4y+14=0: " + vmath.geometry.areaOfTriangle(new NormalLine(4,-3,7), new NormalLine(1,1,-14), new NormalLine(3,-4,14)));
//        Point[] points = {new CartesianPoint(1,1), new CartesianPoint(1,5), new CartesianPoint(5,5), new CartesianPoint(5,1)};
//        System.out.println("Area of Polygon with (1,1), (1,5), (5,5), (5,1) vertices: " + vmath.geometry.areaOfConvexPolygon(points));
//        System.out.println("Is (2,2) inside the polygon with (1,1), (1,5), (5,5), (5,1) vertices: " + vmath.geometry.isPointInPolygon(points, new CartesianPoint(2,2)));
//
//        System.out.println("____________________________________________\n\n\n\n");
//
//        System.out.println("Bitwise Functions");
//        System.out.println("____________________________________________");
//
//        System.out.println("Bitwise AND of 5 and 6: " + vmath.bitwise.and(5, 6));
//        System.out.println("Bitwise OR of 5 and 6: " + vmath.bitwise.or(5, 6));
//        System.out.println("Bitwise XOR of 5 and 6: " + vmath.bitwise.xor(5, 6));
//        System.out.println("Bitwise NOT of 5: " + vmath.bitwise.not(5));
//        System.out.println("Bitwise Left Shift of 5 by 2: " + vmath.bitwise.leftShift(5, 2));
//        System.out.println("Bitwise Right Shift of 5 by 2: " + vmath.bitwise.rightShift(5, 2));
//        System.out.println("Bitwise Zero Fill Right Shift of 5 by 2: " + vmath.bitwise.zeroFillRightShift(5, 2));
//
//        Line ll = new NormalLine(1,0,0);
//        Line ll2 = new NormalLine(0,1,0);
//        System.out.println(ll.getSlope());
//        System.out.println(ll2.getSlope());
//        System.out.println(vmath.geometry.angleBetweenTwoSlopes(ll.getSlope(), ll2.getSlope()));


    }



}
