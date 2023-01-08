import enums.Size;
public class Things extends Entity{
    private String name;
    public Size size;
    public Things(String name, Size size) {
        this.name = name;
        this.size = size;
    }
    public static class Drawing{
        private String name;
        public Drawing(String name){
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
        public void createDrawing(Things first, Things second) {
            if (first.equals(second) && first.size == Size.BIG) {
                System.out.println("Если " + first + " " + first.size + ", и " + second + " " + second.size + ", то " + this + " будет увеличен до нужного размера.");
            }
        }
    }
    public void build(Things first, Things second){
        if (first.equals(second) && first.size == Size.BIG){
            this.size = Size.BIG;
            System.out.println(" Взяв " + first.size + " " + first + " и " + second.size + " " + second +  " коротышки построили новый " + this + ".");
        }
    }
    public class DetailsOfDevice{
        public void getCloser(){
            System.out.print("Как только детали прибора сблизились, возникло состояние невесомости.");
        }
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
}
