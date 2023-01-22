package Task_3_2;

public abstract class Person {

    String name;

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
