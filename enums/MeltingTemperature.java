package enums;

public enum MeltingTemperature {
    LOW ("низкую"),
    HIGH ("высокую");
    private String title;

    MeltingTemperature(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title + " температуру плавления";
    }
}
