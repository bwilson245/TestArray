public class TestArray {
    int[] array = new int[32000];

    public TestArray() {
        for (int i = 0; i < array.length; i++) {
            this.array[i] = i;
        }
    }

    public int[] getArray() {
        return this.array;
    }

    public boolean nonRecursiveMethod(int[] array, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            if (array[i] == target) return true;
        }
        return false;
    }

    int iterations = 0;
    public boolean recursiveMethod(int[] array, int start, int end, int target) {
        iterations++;
        System.out.println("Number of iterations: " + iterations);

        int mid = (int) Math.floor((end - start) / 2 + start);
        if (array[mid] == target) return true;

        if (target > mid) return recursiveMethod(array, mid + 1, end, target);
        else return recursiveMethod(array, start, mid - 1, target);
    }
}
