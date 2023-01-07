import enums.Conditions;
public class NaturePower extends Entity implements Interaction{
    public final String name;
    public Conditions condition;

    public NaturePower(String name, Conditions condition) {
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
            this.condition = Conditions.WEIGHT;
            System.out.println("Поэтому " + antilunite + "у сопутствует " + lunite + ", так как " + Conditions.WEIGHTLESSNESS + " не наблюдается.");
        }
        else{
            this.condition = Conditions.WEIGHTLESSNESS;
            System.out.print(this + " взаимодействуя с " + lunite + "ом, создают " + Conditions.WEIGHTLESSNESS + ".");
        }
    }
}
