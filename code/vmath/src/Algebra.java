public class Algebra {
    private static Algebra instance;

    private Algebra() {
        // Private constructor to prevent external instantiation
    }

    public static Algebra getInstance() {
        if (instance == null) {
            instance = new Algebra();
        }
        return instance;
    }

    public <T extends Comparable<T>> T min(T a, T b) {
        try {
            if (a.compareTo(b) < 0) {
                return a;
            } else {
                return b;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
