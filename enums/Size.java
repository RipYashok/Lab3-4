package enums;

public enum Size {
    SMALL ("маленький"),
    BIG ("большой");
    private String title;

    Size(String title){
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
