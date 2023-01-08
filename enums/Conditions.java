package enums;

public enum Conditions {
    WEIGHTLESSNESS ("невесомости"),
    WEIGHT ("весомости");
    private String title;
    Conditions(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return "состояние " + title;
    }
}
