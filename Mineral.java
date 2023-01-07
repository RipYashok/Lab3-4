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
    public Mineral(MineralBuilder mineralBuilder) {
        this.name = mineralBuilder.name;
        this.transparency = mineralBuilder.transparency;
        this.color = mineralBuilder.color;
        this.thermalConductivity = mineralBuilder.thermalConductivity;
        this.electricalConductivity = mineralBuilder.electricalConductivity;
        this.weight = mineralBuilder.weight;
        this.meltingTemperature = mineralBuilder.meltingTemperature;
        this.location = mineralBuilder.location;
    }
    public static class MineralBuilder{
        public String name;
        private Transparency transparency;
        private Color color;
        private ThermalConductivity thermalConductivity;
        private ElectricalСonductivity electricalConductivity;
        private Weight weight;
        private MeltingTemperature meltingTemperature;
        private Location location;
        public MineralBuilder(String name){
            this.name = name;
        }
        public MineralBuilder setTransparency(Transparency transparency){
            this.transparency = transparency;
            return this;
        }
        public MineralBuilder setColor(Color color){
            this.color = color;
            return this;
        }
        public MineralBuilder setThermalConductivity(ThermalConductivity thermalConductivity){
            this.thermalConductivity = thermalConductivity;
            return this;
        }
        public MineralBuilder setElectricalСonductivity(ElectricalСonductivity electricalConductivity){
            this.electricalConductivity = electricalConductivity;
            return this;
        }
        public MineralBuilder setWeight(Weight weight) {
            this.weight = weight;
            return this;
        }
        public MineralBuilder setMeltingTemperature(MeltingTemperature meltingTemperature) {
            this.meltingTemperature = meltingTemperature;
            return this;
        }
        public MineralBuilder setLocation(Location location) {
            this.location = location;
            return this;
        }
        public Mineral build(){
            return new Mineral(this);
        }
    }
    public void determine(Mineral second){
        StringBuffer dataLunite = new StringBuffer();
        dataLunite.append(this + " ");
        StringBuffer dataAntilunite = new StringBuffer();
        dataAntilunite.append(second + " ");
        if (this.transparency.equals(Transparency.OPAQOE)) {
            second.transparency = Transparency.TRANSPARENT;
            dataLunite.append(Transparency.OPAQOE + ", ");
            dataAntilunite.append(Transparency.TRANSPARENT + ", ");
        }
        if (this.color.equals(Color.YELLOW) || this.color.equals(Color.GREEN) || this.color.equals(Color.GRAY_BROWN_CRIMSON)){
            second.color = chooseColor(second.name);
            dataLunite.append(Color.YELLOW + ", " + Color.GREEN + " или " + Color.GRAY_BROWN_CRIMSON + ", ");
            dataAntilunite.append(Color.VIOLET + " или " + Color.BLUE + ", ");
        }
        if (this.thermalConductivity.equals(ThermalConductivity.GOOD)){
            second.thermalConductivity = ThermalConductivity.BAD;
            dataLunite.append("имеет " + ThermalConductivity.GOOD + ", ");
            dataAntilunite.append("имеет " + ThermalConductivity.BAD + ", ");
        }
        if (this.electricalConductivity.equals(ElectricalСonductivity.BAD)){
            second.electricalConductivity = ElectricalСonductivity.GOOD;
            dataLunite.append(ElectricalСonductivity.BAD + ", ");
            dataAntilunite.append(ElectricalСonductivity.GOOD + ", ");
        }
        if (this.weight.equals(Weight.BIG)){
            second.weight = Weight.SMALL;
            dataLunite.append(Weight.BIG + ", ");
            dataAntilunite.append(Weight.SMALL + ", ");
        }
        if (this.meltingTemperature.equals(MeltingTemperature.HIGH)){
            second.meltingTemperature = MeltingTemperature.LOW;
            dataLunite.append(MeltingTemperature.LOW + " ");
            dataAntilunite.append(MeltingTemperature.HIGH + " ");
        }
        if (this.location.equals(Location.DEEP)){
            second.location = Location.NOTDEEP;
            dataLunite.append("и залегает " + Location.DEEP + ", то");
            dataAntilunite.append("и залегает " +  Location.NOTDEEP + ".");
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





