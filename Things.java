import enums.Size;
public class Things extends Entity{
    private String name;
    public Size size;
    public Things(String name, Size size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Things things = (Things) o;
        return this.hashCode() == things.hashCode();
    }
    @Override
    public int hashCode() {
        return this.size.hashCode();
    }
    public void decide(Mineral antilunite){
        if (this.size.equals(Size.SMALL)) {
            System.out.print("Они решили, что увеличив " + this + " получится победить силы противодействия " + antilunite + "a. ");
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public void bild(Things first, Things second) {
        if (this.equals(first) && this.size == Size.BIG) {
            second.size = Size.BIG;
            System.out.println(this + " большой, " + first + " большой, " + second + " увеличен до нужного размера.");
        }
    }
}
