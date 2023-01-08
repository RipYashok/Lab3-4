package enums;

public enum MineralLocation {
    DEEP ("глубоко"),
    NOTDEEP ("неглубоко");
    private String title;

    MineralLocation(String title){
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
