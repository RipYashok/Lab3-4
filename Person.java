import enums.Conditions;
import enums.Fatigue;
import enums.PersonLocation;

public class Person extends Entity{
    public String name;
    public Fatigue fatigue;
    public PersonLocation location;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.fatigue = personBuilder.fatigue;
        this.location = personBuilder.location;
    }
    public void setName(String name){
        this.name = name;;
    }
    public static class PersonBuilder{
        public String name;
        public Fatigue fatigue;
        public PersonLocation location;
        public PersonBuilder(String name){
            this.name = name;
        }
        public PersonBuilder setFatigue(Fatigue fatigue){
            this.fatigue = fatigue;
            return this;
        }
        public PersonBuilder setLocation(PersonLocation location){
            this.location = location;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
    public static class Status{
        public String benefits;
        public String inconvenience;
        public Status(String benefits, String inconvenience){
            this.benefits = benefits;
            this.inconvenience = inconvenience;
        }
        public void count() throws СalculationException{
            if (this.benefits == "двадцать четыре" && this.inconvenience == "двести пятьдесят шесть"){
                System.out.print(this.benefits + " выгоды и " + this.inconvenience + " неудобства." + "\n");
            }
            else{
                throw new СalculationException("\n" + "Нет, нет, нет!!! Клепка не мог ошибиться");
            }
        }
    }
    public void dig(Person[] friends) throws ForgottenFriendsException{
        if (this.name.equals("Знайка") && friends.length == 4) {
            System.out.print(this + " и его друзья раскопали в глубине пещеры мощные залежи лунита.");
        }
        else{
            throw new ForgottenFriendsException("О нет, Знайка забыл друга.");
        }
    }
    public void jumping(){
        class SpaceSuit{
            protected String name;
            public SpaceSuit(String name){
                this.name = name;
            }
            public String getName(){
                return name;
            }
        }
        SpaceSuit armor = new SpaceSuit("скафандре ");
        this.fatigue = Fatigue.TIRED;
        System.out.print(this +" прыгая по Луне в " + armor.getName() + this.fatigue + " и ");
    }
    public void decide(Person man, Tasks task, Mineral lunite, Mineral antilunite){
        if ((this.name == "Знайка" || this.name == "Профессор Звездочкин") && (man.name == "Знайка" || man.name == "Профессор Звездочкин")){
            System.out.print(this + " и " + man + " решали " + task + ": какими свойствами обладает " + antilunite.name + ". " + "\n");
        }
    }
    public void decide(Person man, Tasks task, Things thing, NaturePower power){
        if ((this.name == "Фукусия" || this.name == "Селедочкин") && (man.name == "Фукусия" || man.name == "Селедочкин") && power.condition == Conditions.WEIGHT){
            System.out.println(this + " и " + man + " обсуждали " + task + ", что надо сделать, чтобы " + thing + " начал работать в новых условиях. ");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person man = (Person) o;
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


