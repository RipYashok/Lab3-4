package enums;

public enum PersonLocation {
    MOON ("на Луне");
    private String title;

    PersonLocation(String title){
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
