package org.example;

import java.util.ArrayList;

public class Building {
    String name;
    ArrayList sensorList = new ArrayList<Sensor>();
    ArrayList actuatorList = new ArrayList<Actuator>();
    Building(String name, ArrayList sensorList, ArrayList actuatorList)
    {
        this.name=name;
        this.sensorList=sensorList;
        this.actuatorList=actuatorList;
    }
    public void addSensor(Sensor sensor){
        this.sensorList.add(sensor);
    }
    public void removeSensor(Sensor sensor){
        this.sensorList.remove(sensor);
    }
    public void addActuator(Actuator actuator){
        this.actuatorList.add(actuator);
    }
    public void removeActuator(Actuator actuator){
        this.actuatorList.remove(actuator);
    }
}
