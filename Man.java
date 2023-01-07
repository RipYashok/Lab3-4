import enums.Konditions;

public class Man extends Entity{
    protected String name;
    public Man(String name) {
        this.name = name;
    }
    public void setName(String name){
        this.name = name;;
    }
    public void decide(Man man, Tasks task, Mineral lunite, Mineral antilunite){
        if ((this.name == "Знайка" || this.name == "Профессор Звездочкин") && (man.name == "Знайка" || man.name == "Профессор Звездочкин")){
            System.out.print(this + " и " + man + " решали " + task + ": какими свойствами обладает " + antilunite.name + ". ");
            task.combine(lunite, antilunite);
        }
    }
    public void decide(Man man, Tasks task, Things thing, NaturePower power){
        if ((this.name == "Фукусия" || this.name == "Селедочкин") && (man.name == "Фукусия" || man.name == "Селедочкин") && power.condition == Konditions.WEIGHT){
            System.out.println(this + " и " + man + " обсуждали " + task + ", что надо сделать, чтобы " + thing + " начал работать в новых условиях. ");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return this.hashCode() == man.hashCode();
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    @Override
    public String toString() {
        return name;
    }
}


