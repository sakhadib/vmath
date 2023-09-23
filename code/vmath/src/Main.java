public class Main {
    public static void main(String[] args) {
        int x = vmath.algebra.min(5, 7);
        System.out.println(x);

        Algebra alg = Algebra.getInstance();
        Integer[] array = {1, 2, 3, 4, 12};
        int y = alg.max(array);
        System.out.println(y);


        //System.out.println(vmath.algebra.pow(3.2465446, 4));
        //System.out.println(alg.sqrt(21));


    }
}