import enums.*;

import java.util.Objects;

public class Mineral extends Entity implements Coloring{
    public final String name;
    private Transparency transparency;
    private Color color;
    private ThermalConductivity thermalConductivity;
    private ElectricalСonductivity electricalConductivity;
    private Weight weight;
    private MeltingTemperature meltingTemperature;
    private Location location;
    public Mineral(String name, Transparency transparency, Color color, ThermalConductivity thermalConductivity,
                   ElectricalСonductivity electricalConductivity, Weight weight, MeltingTemperature meltingTemperature, Location location) {
        this.name = name;
        this.transparency = transparency;
        this.color = color;
        this.thermalConductivity = thermalConductivity;
        this.electricalConductivity = electricalConductivity;
        this.weight = weight;
        this.meltingTemperature = meltingTemperature;
        this.location = location;
    }
    @Override
    public Color chooseColor(String name) {
        if (name == "антилунит") {
            double c = Math.floor(Math.random() * 2);
            if (c == 0) {
                return Color.VIOLET;
            } else {
                return Color.BLUE;
            }
        } else {
            double c = Math.floor(Math.random() * 3);
            if (c == 0) {
                return Color.YELLOW;
            } else if (c == 1) {
                return Color.GREEN;
            } else {
                return Color.GRAY_BROWN_CRIMSON;
            }
        }
    }
    public void determine(Mineral second){
        StringBuffer dataLunite = new StringBuffer();
        dataLunite.append(this);
        StringBuffer dataAntilunite = new StringBuffer();
        dataAntilunite.append(second);
        if (this.transparency.equals(Transparency.OPAQOE)) {
            second.transparency = Transparency.TRANSPARENT;
            dataLunite.append("непрозрачный, ");
            dataAntilunite.append("прозрачный, ");
        }
        if (this.color.equals(Color.YELLOW) || this.color.equals(Color.GREEN) || this.color.equals(Color.GRAY_BROWN_CRIMSON)){
            second.color = chooseColor(second.name);
            dataLunite.append("желтоватый, зеленоватый или серо-буромалиновый, ");
            dataAntilunite.append("фиолетовый или синеватый, ");
        }
        if (this.thermalConductivity.equals(ThermalConductivity.GOOD)){
            second.thermalConductivity = ThermalConductivity.BAD;
            dataLunite.append("имеет хорошую теплопровдность, ");
            dataAntilunite.append("имеет плохую теплопроводность, ");
        }
        if (this.electricalConductivity.equals(ElectricalСonductivity.BAD)){
            second.electricalConductivity = ElectricalСonductivity.GOOD;
            dataLunite.append("плохую электропроводность, ");
            dataAntilunite.append("хорошую электропроводность, ");
        }
        if (this.weight.equals(Weight.BIG)){
            second.weight = Weight.SMALL;
            dataLunite.append("большой удельный вес, ");
            dataAntilunite.append("небольшой удельный вес, ");
        }
        if (this.meltingTemperature.equals(MeltingTemperature.HIGH)){
            second.meltingTemperature = MeltingTemperature.LOW;
            dataLunite.append("низкую температуру плавления, ");
            dataAntilunite.append("высокую температуру плавления ");
        }
        if (this.location.equals(Location.DEEP)){
            second.location = Location.NOTDEEP;
            dataLunite.append("и залегает неглубоко в недрах Луны, то");
            dataAntilunite.append("и залегает неглубоко в недрах Луны. ");
        }
        System.out.println(dataLunite);
        System.out.println(dataAntilunite);
    }
    public boolean compare(Mineral mineral){
        if (this.equals(mineral)){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mineral mineral = (Mineral) o;
        return this.hashCode() == mineral.hashCode();
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, transparency, color, thermalConductivity, electricalConductivity, weight, meltingTemperature, location);
    }
    @Override
    public String toString() {
        return name;
    }
}





