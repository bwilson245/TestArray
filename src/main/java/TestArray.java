public class TestArray {
    int[] array = new int[32000];
    int iterations = 0;

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
            iterations++;
            if (array[i] == target) {
                System.out.println("Number of iterations: " + iterations);
                iterations = 0;
                return true;
            }
        }
        return false;
    }



    public boolean recursiveMethod(int[] array, int start, int end, int target) {
        iterations++;
        int mid = (int) Math.floor((end - start) / 2 + start);
        if (array[mid] == target) {
            System.out.println("Number of iterations: " + iterations);
            iterations = 0;
            return true;
        }

        if (target > mid) return recursiveMethod(array, mid + 1, end, target);
        else return recursiveMethod(array, start, mid - 1, target);
    }

    public boolean binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start < end) {
            iterations++;
            mid = start + (end - start) / 2;

            if (array[mid] == target) {
                System.out.println("Number of iterations: " + iterations);
                return true;
            }

            if (target < mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
