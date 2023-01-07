package enums;

public enum ThermalConductivity {
    GOOD ("хорошую"),
    BAD ("плохую"),
    UNKNOWN ("неизвестный");
    private String title;

    ThermalConductivity(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title + " теплопроводность";
    }
}

