import java.util.Comparator;
import java.util.Objects;

public class TestObject implements Comparable<TestObject> {
    private String string;
    private int i;
    private double d;

    public TestObject(String string, int i, double d) {
        this.string = string;
        this.i = i;
        this.d = d;

    }
    public String getString() {
        return string;
    }
    public int getI() {
        return i;
    }
    public double getD() {
        return d;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TestObject that = (TestObject) o;
        return i == that.i && Double.compare(that.d, d) == 0 && Objects.equals(string, that.string);
    }
    @Override
    public int hashCode() {
        return Objects.hash(string, i, d);
    }

    @Override
    public String toString() {
        return "String: " + this.string + "  Int: " + i + "  Double: " + d;
    }

    @Override
    public int compareTo(TestObject o) {
        if (this.getString().compareTo(o.getString()) != 0) {
            return this.getString().compareTo(o.getString());
        } else if (this.getI() - o.getI() != 0) {
            return this.getI() - o.getI();
        } else {
            return (int)(this.getD() - o.getD());
        }


    }
}
