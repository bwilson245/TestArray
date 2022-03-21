import java.util.*;

public class main {


    public static void main(String... args) {
        TestArrayMethods();
        TestObjectMethods();
        TestObjectHashCode();
    }

    public static void TestArrayMethods() {
        System.out.println("-----TestArrayMethods()-----");
        int start = 0;
        // Target is the number you are looking for in an array
        int target = 31000;
        TestArray arr = new TestArray();
        long time = System.currentTimeMillis();

        arr.nonRecursiveMethod(arr.getArray(), start, arr.getArray().length - 1, target);

        System.out.println("nonRecursive total execution time: " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();

        arr.recursiveMethod(arr.getArray(), start, arr.getArray().length - 1, target);

        System.out.println("recursive total execution time: " + (System.currentTimeMillis() - time));
    }

    // Generates a list of TestObjects and sorts them by String, Int, Double.
    public static void TestObjectMethods() {
        System.out.println();
        System.out.println("-----TestObjectMethods()-----");
        List<TestObject> list = new ArrayList<>();
        String s;
        int i;
        double d;
        Random random = new Random();
        char c;

        // Total number of objects to create and add to the list.
        for (int j = 0; j < 10; j++) {

            // Total characters in the String
            s = "";
            for (int k = 0; k < 1; k++) {
                c = (char) (random.nextInt(26) + 'a');
                s += c;
            }

            // Size of the int
            i = (int) (Math.random() * 10);

            // Size of the double
            d = Math.random() * 10000 / (Math.random() + 10);
            list.add(new TestObject(s, i, d));
        }
        System.out.println("Before Sorting:");
        for (TestObject o : list) {
            System.out.println(o.toString());
        }
        Collections.sort(list);

        System.out.println();
        System.out.println("After Sorting:");
        for (TestObject o : list) {
            System.out.println(o.toString());
        }
    }


    //Generates list of TestObjects like the previous method. Sorts the objects by hashcode and prints the code and contents of the object.
    public static void TestObjectHashCode() {
        System.out.println();
        System.out.println("-----TestObjectHashCode()-----");
        List<TestObject> list = new ArrayList<>();
        String s;
        int i;
        double d;
        Random random = new Random();
        char c;

        // Total number of objects to create and add to the list.
        for (int j = 0; j < 10; j++) {

            // Total characters in the String
            s = "";
            for (int k = 0; k < 1; k++) {
                c = (char) (random.nextInt(26) + 'a');
                s += c;
            }

            // Size of the int
            i = (int) (Math.random() * 10);

            // Size of the double
            d = Math.random() * 10000 / (Math.random() + 10);
            list.add(new TestObject(s, i, d));
        }

        List<Integer> hashcodeList = new ArrayList<>();
        for (TestObject t : list) {
            hashcodeList.add(t.hashCode());
        }
        System.out.println("Before Sorting:");
        for (Integer o : hashcodeList) {
            System.out.print("Hashcode: " + o.toString() + "  ");
            for (TestObject t : list) {
                if (t.hashCode() == o) {
                    System.out.println(t.toString());
                }
            }
        }
        Collections.sort(hashcodeList);

        System.out.println();
        System.out.println("After Sorting:");
        for (Integer o : hashcodeList) {
            System.out.print("Hashcode: " + o.toString() + "  ");
            for (TestObject t : list) {
                if (t.hashCode() == o) {
                    System.out.println(t.toString());
                }
            }
        }

    }
}
