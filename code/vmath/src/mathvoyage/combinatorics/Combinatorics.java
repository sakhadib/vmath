package mathvoyage.combinatorics;
import mathvoyage.vmath;

import java.util.ArrayList;

/**
 * The type Combinatorics.
 */
public class Combinatorics {
    private static Combinatorics instance;

    private Combinatorics() {
        // Private constructor to prevent external instantiation
    }

    /**
     * Returns the singleton instance of this class.
     *
     * @return The singleton instance
     */
    public static Combinatorics getInstance() {
        if (instance == null) {
            instance = new Combinatorics();
        }
        return instance;
    }

    /**
     * Returns combination value.
     *
     * @param n is the total number of items.
     * @param r is the number of items to be chosen.
     * @return the combination value.
     */
    public  double combination(int n, int r){
        if(n>=r && n>=0 && r>=0){
            double nFactorial = vmath.algebra.factorial(n);
            double rFactorial = vmath.algebra.factorial(r);
            double nMinusrFactorial = vmath.algebra.factorial(n-r);

            return nFactorial / (rFactorial*nMinusrFactorial);
        }
        else{
            throw new IllegalArgumentException("n must be greater than r and n and r must be positive");
        }
    }

    /**
     * Returns permutation value.
     *
     * @param n is the total number of items.
     * @param r is the number of items to be arranged.
     * @return the permutation value.
     */
    public double permutation (int n, int r){
            if ( n>=r & n>=0 & r>=0 ){
                double nFctorial = vmath.algebra.factorial(n);
                double nMinusrFctorial = vmath.algebra.factorial(n-r);

                return nFctorial/nMinusrFctorial;
            }
            else{
                throw new IllegalArgumentException("n must be greater than r and n and r must be positive");
            }
    }

    /**
     * Returns subsets of set.
     *
     * @param set is the set we want to show subsets
     * @return the subsets of a sets.
     */
    public static ArrayList<ArrayList<Integer>> generateSubsets(Integer[] set){
         int n = set.length;
         ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
         for (int i=0;i<(1<<n);i++){
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j=0; j<n; j++){
                if ((i&(1<<j))>0){
                    subset.add(set[j]);
                }
            }
            subsets.add(subset);
         }
         return subsets;
    }

    /**
     * Return number of subsets of a set.
     *
     * @param setSize is the number of elements of a set.
     * @return number of subsets of a set.
     */
    public double numberOfSubsets(int setSize){
             return  vmath.algebra.pow(2,setSize);
       }

}
