import java.util.Objects;

public abstract class Entity {
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode()
                && obj.getClass() == this.getClass();
    }
}
