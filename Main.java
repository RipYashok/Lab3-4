import enums.*;


public class Main {
    public static void main(String[] args){
        Person klepka = new Person.PersonBuilder("Инженер Клепка")
                .setLocation(PersonLocation.MOON)
                .build();
        Person.Status status = new Person.Status("двадцать четыре", "двести пятьдесят шесть");
        Thinking klepkaThink = () -> System.out.print("подумал, какие выгоды и неудобства испытывает на Луне. ");
        Thinking klepkaCount = () -> System.out.print("Сделав точный подсчёт, он решил, что получает ");
        Person znaika = new Person.PersonBuilder("Знайка").build();
        Person professor = new Person.PersonBuilder("Профессор Звездочкин").build();
        Person fuksiya = new Person.PersonBuilder("Фукусия").build();
        Person seledochkin = new Person.PersonBuilder("Селедочкин").build();
        Tasks firstTask = new Tasks("вопрос");
        Tasks secondTask = new Tasks("вопрос");
        Mineral antilunite = new Mineral.MineralBuilder("антилунит").build();
        Mineral lunite = new Mineral.MineralBuilder("лунит")
                .setTransparency(Transparency.OPAQOE)
                .setColor(antilunite.chooseColor("лунит"))
                .setThermalConductivity(ThermalConductivity.GOOD)
                .setElectricalСonductivity(ElectricalСonductivity.BAD)
                .setWeight(Weight.BIG)
                .setMeltingTemperature(MeltingTemperature.HIGH)
                .setLocation(MineralLocation.DEEP)
                .build();
        NaturePower spacePower = new NaturePower.NaturePowerBuilder("Космические магнитные силы").build();
        Things device = new Things("прибор невесомости", Size.SMALL);
        Things magnet = new Things("магнит", Size.BIG);
        Things pieceLunite = new Things("Кристалл лунита", Size.BIG);
        Things.Drawing drawing = new Things.Drawing("прибор невесомости");
        Interaction interactionInTheory = new Interaction() {
            @Override
            public void combine(Mineral lunite, Mineral antilunite) {
                if (!lunite.compare(antilunite)){
                    System.out.print("Предположив, что " + antilunite + " обладает своствами противоположными " + lunite + "у," +  "пришли в выводу, что если ");
                }

            }
        };
        Person[] friends = new Person[] {klepka, professor, fuksiya, seledochkin};
        Things.DetailsOfDevice details = device.new DetailsOfDevice();
        klepka.jumping();
        klepkaThink.think();
        klepkaCount.think();
        try{
            status.count();
        } catch (СalculationException e){
            System.out.println(e.getMessage());
            System.out.println("Проверяем вычисления" + "\n" + status.benefits + "\n" + status.inconvenience);
        }
        znaika.decide(professor, firstTask, lunite, antilunite);
        interactionInTheory.combine(lunite, antilunite);
        lunite.determine(antilunite);
        spacePower.combine(lunite, lunite);
        spacePower.combine(lunite, antilunite);
        fuksiya.decide(seledochkin, secondTask, device, spacePower);
        device.decide(antilunite);
        drawing.createDrawing(pieceLunite, magnet);
        try{
            znaika.dig(friends);
        } catch (ForgottenFriendsException e){
            System.out.print(e.getMessage());
            System.out.println("Перекличка:");
            for (int i = 0; i < friends.length; i++){
                System.out.println(friends[i].name);
            }
        }
        device.build(pieceLunite, magnet);
        details.getCloser();

    }

}
