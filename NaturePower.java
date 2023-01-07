import enums.Konditions;
public class NaturePower extends Entity implements Interaction{
    public final String name;
    public Konditions condition;

    public NaturePower(String name, Konditions condition) {
        this.name = name;
        this.condition = condition;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public void combine(Mineral lunite, Mineral antilunite) {
        if (!lunite.compare(antilunite)){
            this.condition = Konditions.WEIGHT;
            System.out.println("Поэтому " + antilunite + "у сопутствует " + lunite + ", так как состояние невесомости не наблюдается.");
        }
        else{
            this.condition = Konditions.WEIGHTLESSNESS;
            System.out.print(this + " взаимодействуя с " + lunite + "ом, создают состояние невисомости. ");
        }
    }
}
