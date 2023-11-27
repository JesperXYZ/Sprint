package Domain;

public class Sensor {
    String name;
    double value;
    String type;
    Sensor(String name, double value, String type){
        this.name=name;
        this.value=value;
        this.type=type;
    }
    public double getValue() {
        return value;
    }
}
