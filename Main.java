import enums.*;


public class Main {
    public static void main(String[] args){
        Man znaika = new Man("Знайка");
        Man professor = new Man("Профессор Звездочкин");
        Man fuksiya = new Man("Фукусия");
        Man seledochkin = new Man("Селедочкин");
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
                .setLocation(Location.DEEP)
                .build();
        znaika.decide(professor, firstTask, lunite, antilunite);
        lunite.determine(antilunite);
        NaturePower spacePower = new NaturePower("Космические магнитные силы", Conditions.UNKNOWN);
        Things device = new Things("прибор невесомости", Size.SMALL);
        spacePower.combine(lunite, lunite);
        spacePower.combine(lunite, antilunite);
        fuksiya.decide(seledochkin, secondTask, device, spacePower);
        device.decide(antilunite);
        Things magnet = new Things("магнит", Size.BIG);
        Things pieceLunite = new Things("Кристалл лунита", Size.BIG);
        pieceLunite.bild(magnet, device);



    }

}
