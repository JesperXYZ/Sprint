package Domain;

public class Actuator {
    String name;
    double value;
    String type;
    Actuator(String name, double value, String type){
        this.name=name;
        this.value=value;
        this.type=type;
    }
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
