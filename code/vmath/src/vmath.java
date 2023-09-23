public class vmath {

    public class Matrix{
    }

    public class algebra{
        public static <T extends Comparable<T>> T min(T a, T b) {
            Algebra alg = Algebra.getInstance();
            return alg.min(a, b);
        }
    }
}
