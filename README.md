
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
    
## Matrix Module
 **01. `Matrix add(Matrix a, Matrix b)`** <br>
    It returns the sum of two matrices. The **time complexity** of this function is **$O(n^2)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}, \begin{bmatrix}9 & 8 & 7\\7 & 6 & 5\\5 & 4 & 3\end{bmatrix}$ <br>
   **Sample Output:**  $\begin{bmatrix}11 & 9 & 8\\8 & 9 & 7\\6 & 6 & 7\end{bmatrix}$
   <hr>
   
**02. `Matrix subtract(Matrix a, Matrix b)`**  <br>
It returns the difference of two matrices. The **time complexity** of this function is **$O(n^2)$**. <br>
**Sample Input:** $\begin{bmatrix}9 & 8 & 7\\7 & 6 & 5\\5 & 4 & 3\end{bmatrix} , \begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}$   <br>
**Sample Output:**  $\begin{bmatrix}7 & 7 & 6\\6 & 3 & 3\\4 & 2 & -1\end{bmatrix}$
<hr>

 **03. `Matrix multiply(Matrix a, Matrix b)`**  <br>
    It returns the product of two matrices. The **time complexity** of this function is **$O(n^3)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}, \begin{bmatrix}9 & 8 & 7\\7 & 6 & 5\\5 & 4 & 3\end{bmatrix}$ <br>
    **Sample Output:**  $\begin{bmatrix}30 & 26 & 22\\40 & 34 & 28\\43 &  36 & 29\end{bmatrix}$
   <hr>

 **04. `Matrix multiply(Matrix a, double scalar)`**  <br>
    It returns the product of a matrix and a scalar. The **time complexity** of this function is **$O(n^2)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}, 2$ <br>
    **Sample Output:**  $\begin{bmatrix}4 & 2 & 2\\2 & 6 & 4\\2 & 4 & 8\end{bmatrix}$
   <hr>

 **05. `Matrix transpose(Matrix a)`**  <br>
    It returns the transpose of a matrix. The **time complexity** of this function is **$O(n^2)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}$ <br>
    **Sample Output:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}$
   <hr>

 **06. `Matrix inverse(Matrix a)`**  <br>
    It returns the inverse of a matrix. The **time complexity** of this function is **$O(n^3)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}$ <br> <br>
    **Sample Output:**  $\begin{bmatrix}8/13 & -2/13 & -1/13\\-2/13 & 7/13 & -3/13\\-1/13 & -3/13 & 5/13\end{bmatrix}$
   <hr>

 **07. `double determinant(Matrix a)`**  <br>
    It returns the determinant of a matrix. The **time complexity** of this function is **$O(n^3)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}$ <br>
    **Sample Output:**  $13.0$
   <hr>

 **08. `Matrix ones(int rows, int cols)`**  <br>
    It returns a matrix of ones. The **time complexity** of this function is **$O(n^2)$**. <br>
    **Sample Input:**  $3, 3$ <br>
    **Sample Output:**  $\begin{bmatrix}1 & 1 & 1\\1 & 1 & 1\\1 & 1 & 1\end{bmatrix}$
   <hr>

 **09. `Matrix zeros(int rows, int cols)`**  <br>
    It returns a matrix of zeros. The **time complexity** of this function is **$O(n^2)$**. <br>
    **Sample Input:**  $3, 3$ <br>
    **Sample Output:**  $\begin{bmatrix}0 & 0 & 0\\0 & 0 & 0\\0 & 0 & 0\end{bmatrix}$
   <hr>

 **10. `Matrix identity(int n)`**  <br>
    It returns an identity matrix. The **time complexity** of this function is **$O(n^2)$**. <br>
    **Sample Input:**  $3$ <br>
    **Sample Output:**  $\begin{bmatrix}1 & 0 & 0\\0 & 1 & 0\\0 & 0 & 1\end{bmatrix}$
   <hr>

 **11. `boolean compare(Matrix a, Matrix b)`**  <br>
    It returns true if two matrices are equal. The **time complexity** of this function is **$O(n^2)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}, \begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}$ <br>
    **Sample Output:**  $true$
   <hr>

 **12. `Matrix pow(Matrix a, int power)`**  <br>
    It returns the power of a matrix. The **time complexity** of this function is **$O(n^3)$**. <br>
    **Sample Input:**  $\begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}, 2$ <br>
      **Sample Output:**  $\begin{bmatrix}6 & 7 & 8\\7& 14 & 15\\8 & 15 & 21\end{bmatrix}$

## Vector Module

**01. `Vector add(Vector a, Vector b)`** <br>
      It returns the sum of two vectors. The **time complexity** of this function is **$O(n)$**. <br>
      **Sample Input:**  $\begin{bmatrix}1\\2\\3\end{bmatrix}, \begin{bmatrix}4\\5\\6\end{bmatrix}$ <br>
      **Sample Output:**  $\begin{bmatrix}5\\7\\9\end{bmatrix}$
      <hr>
      
  **02. `Vector subtract(Vector a, Vector b)`**  <br>
      It returns the difference of two vectors. The **time complexity** of this function is **$O(n)$**. <br>
      **Sample Input:**  $\begin{bmatrix}4\\5\\6\end{bmatrix}, \begin{bmatrix}1\\2\\3\end{bmatrix}$ <br>
      **Sample Output:**  $\begin{bmatrix}3\\3\\3\end{bmatrix}$
      <hr>
      
   **03. `double scalerProduct(vector a, vector b)`**  <br>
      It returns the dot product of two vectors. The **time complexity** of this function is   **$O(n)$**. <br>
      **Sample Input:**  $\begin{bmatrix}1\\2\\3\end{bmatrix}, \begin{bmatrix}4\\5\\6\end{bmatrix}$ <br>
      **Sample Output:**  $32.0$
      <hr>   

   **04. `vector vectorProduct(vector a, vector b)`**  <br>
      It returns the cross product of two vectors. The **time complexity** of this function is **$O(n)$**. <br>
      **Sample Input:**  $\begin{bmatrix}1\\2\\3\end{bmatrix}, \begin{bmatrix}4\\5\\6\end{bmatrix}$ <br>
      **Sample Output:**  $\begin{bmatrix}-3.0\\6.0\\-3.0\end{bmatrix}$
      <hr>

   **05. `vector multiply(vector a, Matrix m)`**  <br>
      It returns the product of a vector and a matrix. The **time complexity** of this function is **$O(n^2)$**. <br>
      **Sample Input:**  $\begin{bmatrix}1\\2\\3\end{bmatrix}, \begin{bmatrix}2 & 1 & 1\\1 & 3 & 2\\1 & 2 & 4\end{bmatrix}$ <br>
      **Sample Output:**  $\begin{bmatrix}7\\13\\17\end{bmatrix}$
      <hr>

   **06. `boolean compare(vector a, vector b)`**  <br>
      It returns true if two vectors are equal. The **time complexity** of this function is **$O(n)$**. <br>
      **Sample Input:**  $\begin{bmatrix}1\\2\\3\end{bmatrix}, \begin{bmatrix}1\\2\\3\end{bmatrix}$ <br>
      **Sample Output:**  $true$
      <hr>

   **07. `double magnitude(vector a)`**  <br>
      It returns the magnitude of a vector. The **time complexity** of this function is **$O(n)$**. <br>
      **Sample Input:**  $\begin{bmatrix}1\\2\\3\end{bmatrix}$ <br>
      **Sample Output:**  $3.7416573867739413$
      <hr>

   **08. `vector unitVector(vector a)`**  <br>
      It returns the unit vector of a vector. The **time complexity** of this function is **$O(n)$**. <br>
      **Sample Input:**  $\begin{bmatrix}1\\2\\3\end{bmatrix}$ <br>
      **Sample Output:**  $\begin{bmatrix}0.2672612419124244\\0.5345224838248488\\0.8017837257372732\end{bmatrix}$

## Geometry Module
 **01. `double distance(Point p1, Point p2, DistanceType c)`**  <br>
      It returns the distance between two points. The **time complexity** of this function is **$O(1)$**. <br>
      **Sample Input:**  $(1, 2), (3, 4), DistanceType.EUCLIDEAN$ <br>
      **Sample Output:**  $2.8284271247461903$
      <hr>

 **02. `double slope(Point p1, Point p2)`**  <br>
      It returns the slope of a line passing through two points. The **time complexity** of this function is **$O(1)$**. <br>
      **Sample Input:**  $(1, 2), (3, 4)$ <br>
      **Sample Output:**  $1.0$
      <hr>

 **03. `Point midpoint(Point p1, Point p2)`**  <br>
      It returns the midpoint of a line passing through two points. The **time complexity** of this function is **$O(1)$**. <br>
      **Sample Input:**  $(1, 2), (3, 4)$ <br>
      **Sample Output:**  $(2.0, 3.0)$
      <hr>  

 **04. `Point centroid(Point p1, Point p2, Point p3)`**  <br>
      It returns the centroid of a triangle passing through three points. The **time complexity** of this function is **$O(1)$**. <br>
      **Sample Input:**  $(1, 2), (3, 4), (5, 6)$ <br>
      **Sample Output:**  $(3.0, 4.0)$
      <hr>

 **05. `double areaOfTriangle(Point p1, Point p2, Point p3)`**  <br>
      It returns the area of a triangle given three points. The **time complexity** of this function is **$O(1)$**. <br>
      **Sample Input:**  $(1, 1), (1, 4), (5, 6)$ <br>
      **Sample Output:**  $6.0$
      <hr>

 **06. `Point interleaverPoint(Point p1, Point p2, double m, double n)`**  <br>
   It returns the interleave point of two points that divide the connecting line in m:n. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(2, 0), (7, 5), 2, 3$ <br>
   **Sample Output:**  $(4.0, 2.0)$
   <hr>

   **07. `Point externalizerPoint(Point p1, Point p2, double m, double n)`**  <br>
   It returns the external point of two points that divide the connecting line in m:n. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(-2, 3), (6, -8), 1, 2$ <br>
   **Sample Output:**  $(-10.0, 14.0)$
   <hr>

   **08. `double areaOfCircle(Point p1, Point p2)`**  <br>
   It returns the area of a circle given two endpoints of the radius. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1, 1), (1, 3)$ <br>
   **Sample Output:**  $12.5663706143592$
   <hr>

   **09. `double circumferenceOfCircle(Point p1, Point p2)`**  <br>
   It returns the circumference of a circle given two endpoints of the radius. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1, 1), (1, 3)$ <br>
   **Sample Output:**  $12.566370614359187$
   <hr>

   **10. `boolean isTriangle(Point p1, Point p2, Point p3, triangleType c)`**  <br>
   It returns true if three points form a triangle. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1, 1), (1, 3), (3, 1), triangleType.ISOSCELES$ <br>
   **Sample Output:**  $true$
   <hr>

   **11. `double angleBetweenTwoSlopes(double m1, double m2)`**  <br>
   It returns the angle between two slopes. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $1.0, 2.0$ <br>
   **Sample Output:**  $45.0\degree$
   <hr>

   **12. `boolean isQuadrilateral(Point p1, Point p2, Point p3, Point p4, quadrilateralType c)`**  <br>
   It returns true if four points form a quadrilateral. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1, 1), (1, 3), (3, 1), (3, 3), quadrilateralType.RECTANGLE$ <br>
   **Sample Output:**  $true$
   <hr>

   **13. `boolean isLine(Line l1, Line l2, lineType c)`**  <br>
   It returns true if two lines are parallel, perpendicular or same. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1,2,3) , (2,4,6), lineType.SAME$ <br>
   **Sample Output:**  $true$
   <hr>

   **14. `boolean areThreeLinesSame(Line l1, Line l2, Line l3)`**  <br>
   It returns true if three lines are same. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1,2,3) , (2,4,6), (3,6,9)$ <br>
   **Sample Output:**  $true$
   <hr>

   **15. `Point intersectionOfTwoLines(Line l1, Line l2)`**  <br>
   It returns the intersection point of two lines. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1,2,3) , (1,-5,6)$ <br>
   **Sample Output:**  $(3.0, 0.0)$
   <hr>

   **16. `double slope(Line l)`**  <br>
   It returns the slope of a line. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(1,2,3)$ <br>
   **Sample Output:**  $-0.3333333333333333$
   <hr>

   **17. `double distanceBetweenTwoParallelLines(Line l1, Line l2)`**  <br>
   It returns the distance between two parallel lines. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(2,3,4) , (1,1)$ <br>
   **Sample Output:**  $2.4961508$
   <hr>

   **19. `Line getPerpendicularLine(Line l, Point p)`**  <br>
   It returns the perpendicular line of a line that goes through the point. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(3,12,-7) , (2,5)$ <br>
   **Sample Output:**  $(12.0, -3.0, -9.0)$
   <hr>

   **20. `Line getParallelLine(Line l, Point p)`**  <br>
   It returns the parallel line of a line that goes through the point. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(2, 11, -2) , (4, -3)$ <br>
   **Sample Output:**  $(2.0, 11.0, 25.0)$
   <hr>

   **21. `Line getLineFromIntersectionPoint(Line l1, Line l2)`**  <br>
   It returns the line that goes through the intersection point of two lines. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(2, 11, -2) , (3, 12, -7)$ <br>
   **Sample Output:**  $(54.99, 222.99, -125.66)$
   <hr>

   **22. `double areaOfQuadrilateral(Line l1, Line l2, Line l3, Line l4)`**  <br>
   It returns the area of a quadrilateral given four lines. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(4,-3,7) , (3,-4,21), (4,-3,0), (3,-4,14)$ <br>
   **Sample Output:**  $7.0$
   <hr>

**23. `double areaOfQuadrilateral(Point p1, Point p2, Point p3, Point p4)`**  <br>
   It returns the area of a quadrilateral given four points. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(6,8), (2,5), (5,9), (9,12)$ <br>
   **Sample Output:**  $7.0$
   <hr>

   **24. `double areaOfTriangle(Line l1, Line l2, Line l3)`**  <br>
   It returns the area of a triangle given three lines. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $(4,-3,7) , (1,1,-14), (3,-4,14)$ <br>
   **Sample Output:**  $3.5$
   <hr>

   **25. `double areaOfConvexPolygon(Point[] points)`**  <br>
   It returns the area of a convex polygon given its vertices. The **time complexity** of this function is **$O(n)$**. <br>
   **Sample Input:**  $\{(1,1), (1,5), (5,5), (5,1)\}$ <br>
   **Sample Output:**  $16.0$
   <hr>

**26. `boolean isPointInPolygon(Point[] points, Point p)`**  <br>
   It returns true if a point is inside a polygon. The **time complexity** of this function is **$O(n)$**. <br>
   **Sample Input:**  $\{(1,1), (1,5), (5,5), (5,1)\}, (2,2)$ <br>
   **Sample Output:**  $true$


## Bit-wise Operation Module
**01. `int and(int a, int b)`**  <br>
   It returns the bitwise and of two numbers. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $5, 6$ <br>
   **Sample Output:**  $4$
   <hr>

   **02. `int or(int a, int b)`**  <br>
   It returns the bitwise or of two numbers. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $5, 6$ <br>
   **Sample Output:**  $7$
   <hr>

   **03. `int xor(int a, int b)`**  <br>
   It returns the bitwise xor of two numbers. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $5, 6$ <br>
   **Sample Output:**  $3$
   <hr>

   **04. `int not(int a)`**  <br>
   It returns the bitwise not of a number. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $5$ <br>
   **Sample Output:**  $-6$
   <hr>

   **05. `int leftShift(int a, int b)`**  <br>
   It returns the bitwise left shift of a number. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $5, 2$ <br>
   **Sample Output:**  $20$
   <hr>

   **06. `int rightShift(int a, int b)`**  <br>
   It returns the bitwise right shift of a number. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $5, 2$ <br>
   **Sample Output:**  $1$
   <hr>

   **07. `String zeroFillRightShift(int a, int b)`**  <br>
   It returns the zero fill right shift of a number. The **time complexity** of this function is **$O(1)$**. <br>
   **Sample Input:**  $5, 2$ <br>
   **Sample Output:**  $1$
   <hr>
