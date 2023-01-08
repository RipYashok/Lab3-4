package enums;

public enum ElectricalСonductivity {
    GOOD ("хорошую"),
    BAD ("плохую");
    private String title;

    ElectricalСonductivity(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title + " электропроводность";
    }
}

