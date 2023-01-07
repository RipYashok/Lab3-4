package enums;

public enum Weight {
    SMALL ("небольшой удельный вес"),
    BIG ("большой удельный вес"),
    UNKNOMN ("неизвестный");
    private String title;

    Weight(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
