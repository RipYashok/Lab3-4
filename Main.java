import enums.*;


public class Main {
    public static void main(String[] args){
        Man znaika = new Man("Знайка");
        Man professor = new Man("Профессор Звездочкин");
        Man fuksiya = new Man("Фукусия");
        Man seledochkin = new Man("Селедочкин");
        Tasks firstTask = new Tasks("вопрос");
        Tasks secondTask = new Tasks("вопрос");
        Mineral antilunite = new Mineral("антилунит", Transparency.UNKNOWN, Color.UNKNOWN, ThermalConductivity.UNKNOWN,
                ElectricalСonductivity.UNKNOWN, Weight.UNKNOMN, MeltingTemperature.UNKNOWN, Location.UNKNOWN);
        Mineral lunite = new Mineral("лунит", Transparency.OPAQOE, antilunite.chooseColor("лунит"),
                ThermalConductivity.GOOD, ElectricalСonductivity.BAD, Weight.BIG, MeltingTemperature.HIGH, Location.DEEP);
        znaika.decide(professor, firstTask, lunite, antilunite);
        lunite.determine(antilunite);
        NaturePower spacePower = new NaturePower("Космические магнитные силы", Konditions.UNKNOWN);
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
