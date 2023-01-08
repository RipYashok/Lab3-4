import enums.Conditions;
public class NaturePower extends Entity implements Interaction{
    public String name;
    public Conditions condition;

    public NaturePower(NaturePowerBuilder naturePowerBuilder) {
        this.name = naturePowerBuilder.name;
        this.condition = naturePowerBuilder.condition;
    }
    public static class NaturePowerBuilder {
        public String name;
        public Conditions condition;
        public NaturePowerBuilder(String name) {
            this.name = name;
        }
        public NaturePowerBuilder setConditons(Conditions condition){
            this.condition = condition;
            return this;
        }
        public NaturePower build() {
            return new NaturePower(this);
        }
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public void combine(Mineral lunite, Mineral antilunite) {
        if (!lunite.compare(antilunite)){
            this.condition = Conditions.WEIGHT;
            System.out.println(" Поэтому " + antilunite + "у сопутствует " + lunite + ", так как " + Conditions.WEIGHTLESSNESS + " не наблюдается.");
        }
        else{
            this.condition = Conditions.WEIGHTLESSNESS;
            System.out.print(this + " взаимодействуя с " + lunite + "ом, создают " + Conditions.WEIGHTLESSNESS + ".");
        }
    }
}
