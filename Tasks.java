public class Tasks extends Entity{
    public final String name;

    public Tasks(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
