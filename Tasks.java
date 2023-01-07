public class Tasks extends Entity implements Interaction{
    public final String name;

    public Tasks(String name) {
        this.name = name;
    }
    @Override
    public void combine(Mineral lunite, Mineral antilunite){
        if (!lunite.compare(antilunite)){
            System.out.print("Предположив, что " + antilunite + " обладает своствами противоположными " + lunite + "у," + "\n" +  "пришли в выводу, что если ");
        }
    }
    @Override
    public String toString() {
        return name;
    }
}
