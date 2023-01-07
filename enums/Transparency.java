package enums;

public enum Transparency {
    TRANSPARENT ("прозрачный"),
    OPAQOE ("непрозрачный"),
    UNKNOWN ("неизвестный");
    private String title;

    Transparency(String title){
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
