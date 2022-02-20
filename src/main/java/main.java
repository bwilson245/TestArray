public class main {


    public static void main(String... args) {
        int start = 0;
        int target = 31000;
        TestArray arr = new TestArray();
        long time = System.currentTimeMillis();

        arr.nonRecursiveMethod(arr.getArray(), start, arr.getArray().length - 1, target);

        System.out.println("nonRecursive total execution time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();

        arr.recursiveMethod(arr.getArray(), start, arr.getArray().length - 1, target);

        System.out.println("recursive total execution time: " + (System.currentTimeMillis() - time));
    }
}
