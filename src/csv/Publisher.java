package general.csv;

public class Publisher {

    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'';
    }


}
