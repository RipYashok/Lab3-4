package enums;

public enum Location {
    DEEP ("глубоко"),
    NOTDEEP ("неглубоко"),
    UNKNOWN ("неизвестный");
    private String title;

    Location(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return title + " в недрах Луны";
    }
}
