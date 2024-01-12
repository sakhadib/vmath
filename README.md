
# Welcome to MathVoyage!

mathVoyage is a Java toolkit offering versatile math functions. In this library, we tried to implement coordinate geometry, trigonometry, matrix operations, combinatorics, vector, number system module, and more. It streamlines mathematical tasks using several well-known algorithms, saving developer's time and ensuring precision in Java application


## Team Voyagers

 1. Adib Sakhawat
 2. Tahsin Islam
 3. Takia Farhin 

## Supervised by
**Syed Rifat Raiyan** <br>
Lecturer <br>
Department of Computer Science and Engineering <br>
Islamic University of Technology <br>

## Key Features

 1. Algebraic Module
 2. Trigonometry Module
 3. Matrix Module
 4. Vector Module
 5. Number System Module
 6. Coordinate Geometry Module
 7. Combinatorics
 8. Bit-wise Operation

## Tools

 - JAVA (as Programming Language)
 - IntelliJ IDEA (as IDE)
 - GitHub (For Version Control)
 - Javadoc (Documentation)
 - Google Meet and Discord (Collaboration)

## Installation

## Algebraic Module

 **01. `double floor(double number)`** <br>
It returns the floor of a double type number.  The **time complexity** of this function is **$O(1)$** <br>
**Sample Input:** $3.14$<br>
**Sample Output:** $3.00$
<hr>
 
 **02. `Comparable min(Comparable num1, Comparable num2)`** <br>
It returns the minimum value between two comparable type inputs. The **time complexity** of this function is **$O(1)$**<br>
**Sample Input:** $7$, $13$<br>
**Sample Output:** $7$<br>
<br>
**Sample Input:** $7.15 ,$  $7.11$<br>
**Sample Output:** $7.11$
<hr>
 
 **03. `Comparable min(Comparable[] array)`** <br>
It returns the minimum value of an array. The **time complexity** of this function is **$O(n)$**<br>
**Sample Input:** $\{1, 5, 2, 4, 7, 3, 9, 8, 6, 10\}$<br>
**Sample Output:** $1$
<hr>
 
 **04. `Comparable argmin(Comparable[] array)`** <br>
It returns the index of the minimum value of an array. The **time complexity** of this function is **$O(n)$** <br>
**Sample Input:** $\{1, 5, 2, 4, 7, 3, 9, 8, 6, 10\}$ <br>
**Sample Output:** $0$
<hr>
 
 **05. `Comparable max(Comparable num1, Comparable num2)`** <br>
It returns the maximum value between two comparable type inputs. The **time complexity** of this function is **$O(1)$** <br>
**Sample Input:** $7$, $13$<br>
**Sample Output:** $13$<br>
<br>
**Sample Input:** $7.15$, $7.11$<br>
**Sample Output:** $7.15$
<hr>
 
 **06. `Comparable max(Comparable[] array)`** <br>
It returns the maximum value of an array. The **time complexity** of this function is **$O(n)$**<br>
**Sample Input:** $\{1, 5, 2, 4, 7, 3, 9, 8, 6, 10\}$<br>
**Sample Output:** $10$
<hr>
 
 **07. `Comparable argmax(Comparable[] array)`** <br>
It returns the index of the maximum value of an array. The **time complexity** of this function is **$O(n)$**<br>
**Sample Input:** $\{1, 5, 2, 4, 7, 3, 9, 8, 6, 10\}$<br>
**Sample Output:** $9$
<hr>
 
 **08. `double pow(Comparable base, int exponent)`** <br>
 It calculates the power of a number. The **time complexity** of this function is **$O(1)$**<br>
**Sample Input:** $3$, $4$<br>
**Sample Output:** $81.0$
<hr>
 
 **09. `double sqrt(Comparable number)`** <br>
 It calculates the square root of a number. The **time complexity** of this function is **$O(log(n))$**<br>
**Sample Input:** $16$<br>
**Sample Output:** $4.0$
<hr>
 
 **10. `double cubeRoot(Comparable number)`** <br>
 It calculates the cube root of a number. The **time complexity** of this function is **$O(log(n))$**<br>
 **Sample Input:** $27$<br>
**Sample Output:** $3.0$
<hr>
 
 **11. `double nthRoot(Comparable number)`** <br>
 It calculates the $n^{th}$ root of a number. The **time complexity** of this function is **$O(log(n))$**<br>
**Sample Input:** $64, 6$<br>
**Sample Output:** $2.0$
<hr>
 
 **12. `int abs(int number)`** <br>
 It returns the absolute value of an integer-type number. The **time complexity** of this function is **$O(1)$**<br>
**Sample Input:** $-5$<br>
**Sample Output:** $5$
<hr>
 
 **13. `double abs(double number)`** <br>
 It returns the absolute value of a double-type number. The **time complexity** of this function is **$O(1)$**<br>
**Sample Input:** $-5.69$<br>
**Sample Output:** $5.69$
<hr>
 
 **14. `double factorial(int number)`** <br>
 It returns the factorial of a number. The **time complexity** of this function is **$O(n)$**<br>
 **Sample Input:** $5$<br>
**Sample Output:** $120.0$
<hr>
 
 **15. `int gcd(int num1, int num2)`** <br>
 It returns the greatest common divisor between two integer-type numbers. The **time complexity** of this function is **$O(log(n))$**<br>
 **Sample Input:** $12, 18$<br>
**Sample Output:** $6$
<hr>
 
 

## Number Theory Module
 **01. `double binToDec(String bineryNumber)`** <br>
    It converts a binary number (string) to a decimal number (double).  The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $1010$ <br>
    **Sample Output:**  $10.0$
 <hr>

 **02. `String decToBin(double decimalNumber)`**  <br>
    It converts a decimal number (double) to a binary number (string).  The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $10$ <br>
    **Sample Output:**  $1010$
 <hr>

 **03. `String decToHex(double decimalNumber)`**  <br>
    It converts a decimal number (double) to a Hexadecimal number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $10$ <br>
    **Sample Output:**  $A$
 <hr>

 **04. `double hexToDec(String hexadecimalString)`**  <br>
    It converts a Hexadecimal number (string) to a decimal number (double). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $A$ <br>
    **Sample Output:**  $10.0$
 <hr>

 **05. `double octToDec(String octalString)`**  <br>
 It converts an Octal number (String) to a Decimal number (double). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $12$ <br>
    **Sample Output:**  $10.0$
 <hr>

 **06. `String decToOct(double decimalNumber)`**  <br>
    It converts a decimal number (double) to an Octal number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $10$ <br>
    **Sample Output:**  $12$
 <hr>
 
 **07. `String decToN(double decimalNumber, int base)`**  <br>
    It converts a decimal number (double) to a number of any base (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $10, 6$ <br>
    **Sample Output:**  $14$
 <hr>
 
 **08. `double nToDec(String number, int base)`**  <br>
    It converts a number of any base (string) to a decimal number (double). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $14, 6$ <br>
    **Sample Output:**  $10.0$
 <hr>

 **09. `String binToOct(String binaryString)`**  <br>
    It converts a binary number (string) to an Octal number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $1010$ <br>
    **Sample Output:**  $12$
 <hr>
 
 **10. `String octToBin(String octalString)`**  <br>
    It converts an Octal number (string) to a binary number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $12$ <br>
    **Sample Output:**  $1010$
 <hr>

 **11. `String binToHex(String binaryString)`**  <br>
    It converts a binary number (string) to a Hexadecimal number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $1010$ <br>
    **Sample Output:**  $A$
 <hr>

 **12. `String hexToBin(String hexadecimalString)`**  <br>
    It converts a Hexadecimal number (string) to a binary number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $A$ <br>
    **Sample Output:**  $1010$
 <hr>

 **13. `String binToN(String binaryString, int base)`**  <br>
    It converts a binary number (string) to a number of any base (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $1010$ <br>
    **Sample Output:**  $14$
 <hr>
 
 **14. `String octToHex(String octalString)`**  <br>
    It converts an Octal number (string) to a Hexadecimal number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $12$ <br>
    **Sample Output:**  $A$
 <hr>

 **15. `String hexToOct(String hexadecimalString)`**  <br>
    It converts a Hexadecimal number (string) to an Octal number (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $A$ <br>
    **Sample Output:**  $12$
 <hr>

 **16. `String octToN(String octalString, int base)`**  <br>
    It converts an Octal number (string) to a number of any base (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $12$ <br>
    **Sample Output:**  $14$
 <hr>
 
 **17. `String hexToN(String hexadecimalString, int base)`**  <br>
    It converts a Hexadecimal number (string) to a number of any base (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $A$ <br>
    **Sample Output:**  $14$
 <hr>

 **18. `String nToK(String number, int base1, int base2)`**  <br>
    It converts a number of any base $n$ (string) to a number of any base $k$ (string). The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $``8", 10, 8$ <br>
    **Sample Output:**  $10$
 
 ## Trigonometry Module
 **01. `double degreeToRadian(double angleDegree)`** <br>
 It converts an angle from the Sexagesimal to the Circular unit.  The **time complexity** of this function is **$O(1)$**. <br>
 **Sample Input:**  $30$ <br>
**Sample Output:**  $0.5235987755982988$
<hr>

 **02. `double radianToDegree(double angleRadian)`**  <br>
 It converts an angle from the Circular to the Sexagesimal unit.  The **time complexity** of this function is **$O(1)$**. <br>
 **Sample Input:**  $\pi/6$ <br>
**Sample Output:**  $29.999999999999996$
<hr>

 **03. `double sin(double angle, Angle unit)`**  <br>
It returns the sine of an angle given in radians or degrees. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $30, Angle.DEGREE$ <br>
**Sample Output:**  $0.49999999999999994$ <br> <br>
 **Sample Input:**  $0.523599, Angle.RADIAN$ <br>
**Sample Output:**  $0.49999999999999994$
<hr>

 **04. `double cos(double angle, Angle unit)`**  <br>
 It returns the cosine of an angle given in radians or degrees. The **time complexity** of this function is **$O(n)$**. <br>
**Sample Input:**  $30, Angle.DEGREE$ <br>
**Sample Output:**  $0.8660254037844386$ <br> <br>
**Sample Input:**  $0.523599, Angle.RADIAN$ <br>
**Sample Output:**  $0.8660254037844386$
<hr>

 **05. `double tan(double angle, Angle unit)`**  <br>
 It returns the tangent of an angle given in radians or degrees. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $30, Angle.DEGREE$ <br>
**Sample Output:**  $0.5773502691896257$ <br> <br>
**Sample Input:**  $0.523599, Angle.RADIAN$ <br>
**Sample Output:**  $0.5773502691896257$
<hr>

 **06. `double cot(double angle, Angle unit)`**  <br>
  It returns the cotangent of an angle given in radians or degrees. The **time complexity** of this function is **$O(n)$**. <br>
**Sample Input:**  $30, Angle.DEGREE$ <br>
**Sample Output:**  $1.7320508075688774$ <br> <br>
**Sample Input:**  $0.523599, Angle.RADIAN$ <br>
**Sample Output:**  $1.7320508075688774$
 <hr>
 
 **07. `double sec(double angle, Angle unit)`**  <br>
  It returns the secant of an angle given in radians or degrees. The **time complexity** of this function is **$O(n)$**. <br>
  **Sample Input:**  $30, Angle.DEGREE$ <br>
**Sample Output:**  $1.1547005383792517$ <br> <br>
**Sample Input:**  $0.523599, Angle.RADIAN$ <br>
**Sample Output:**  $1.1547005383792517$
 <hr>
 
 **08. `double cosec(double angle, Angle unit)`**  <br>
  It returns the cosecant of an angle given in radians or degrees. The **time complexity** of this function is **$O(n)$**. <br>
**Sample Input:**  $30, Angle.DEGREE$ <br>
**Sample Output:**  $2.0000000000000004$ <br> <br>
**Sample Input:**  $0.523599, Angle.RADIAN$ <br>
**Sample Output:**  $2.0000000000000004$
 <hr>
 
 **09. `double arcsin(double number, Angle unit)`**  <br>
  It returns the arc sin of a number in the preferred unit. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $0.5, Angle.DEGREE$ <br>
**Sample Output:**  $30.0$ <br> <br>
**Sample Input:**  $0.5, Angle.RADIAN$ <br>
**Sample Output:**  $0.523598775598299$
 <hr>
 
 **10. `double arccos(double number, Angle unit)`**  <br>
   It returns the arc cos of a number in the preferred unit. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $0.5, Angle.DEGREE$ <br>
**Sample Output:**  $60.0$ <br> <br>
**Sample Input:**  $0.5, Angle.RADIAN$ <br>
**Sample Output:**  $1.0471975511965974$
 <hr>
 
 **11. `double arctan(double number, Angle unit)`**  <br>
   It returns the arc tan of a number in the preferred unit. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $\sqrt3, Angle.DEGREE$ <br>
**Sample Output:**  $60.0$ <br> <br>
**Sample Input:**  $\sqrt3, Angle.RADIAN$ <br>
**Sample Output:**  $1.0471975511965976$
 <hr>
 
 **12. `double arccot(double number, Angle unit)`** 
   It returns the arc cot of a number in the preferred unit. The **time complexity** of this function is **$O(n)$**. <br>
**Sample Input:**  $\sqrt3, Angle.DEGREE$ <br>
**Sample Output:**  $30.0$ <br> <br>
**Sample Input:**  $\sqrt3, Angle.RADIAN$ <br>
**Sample Output:**  $0.5235987755982989$
 <hr>
 
 **13. `double arcsec(double number, Angle unit)`** 
   It returns the arc sec of a number in the preferred unit. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $2, Angle.DEGREE$ <br>
**Sample Output:**  $30.0$ <br> <br>
**Sample Input:**  $2, Angle.RADIAN$ <br>
**Sample Output:**  $0.523598775598299$
 <hr>
 
 **14. `double arccosec(double number, Angle unit)`**  <br>
   It returns the arc cosec of a number in the preferred unit. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $2, Angle.DEGREE$ <br>
**Sample Output:**  $60.0$ <br> <br>
**Sample Input:**  $2, Angle.RADIAN$ <br>
**Sample Output:**  $1.0471975511965974$

## Combinatorics Module
 **01. `double combination(int n, int r)`** <br>
 It returns the number of ways of choosing $r$ objects from $n$ objects. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $5, 2$ <br>
**Sample Output:**  $10.0$
<hr>

 **02. `double permutation(int n, int r)`**  <br>
 It returns the number of ways of choosing $r$ objects from $n$ objects when the order matters. The **time complexity** of this function is **$O(n)$**. <br>
 **Sample Input:**  $5, 2$ <br>
**Sample Output:**  $20.0$
<hr>

 **03. `double numberOfSubsets(int n)`**  <br>
    It returns the number of subsets of a set of $n$ elements. The **time complexity** of this function is **$O(n)$**. <br>
    **Sample Input:**  $5$ <br>
    **Sample Output:**  $32.0$
    <hr>

   **04. `ArrayList<ArrayList<Integer>> generateSubsets(Integer[] set)`**  <br>
    It returns all the subsets of a set. The **time complexity** of this function is **$O(2^n)$**. <br>
    **Sample Input:**  $\{1, 2, 3\}$ <br>
    **Sample Output:**  $\{\{\}, \{1\}, \{2\}, \{3\}, \{1, 2\}, \{1, 3\}, \{2, 3\}, \{1, 2, 3\}\}$
