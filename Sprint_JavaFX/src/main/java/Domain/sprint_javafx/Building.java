package Domain.sprint_javafx;

import java.util.ArrayList;

public class Building implements IBuildingManagementSystem {
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
    @Override
    public void removeSensor(Sensor sensor){
        this.sensorList.remove(sensor);
    }
    public void addActuator(Actuator actuator){
        this.actuatorList.add(actuator);
    }
    @Override
    public void removeActuator(Actuator actuator){
        this.actuatorList.remove(actuator);
    }
    public ArrayList getSensorList(){
        return sensorList;
    }
    public ArrayList getActuatorList(){
        return actuatorList;
    }

    @Override
    public String getBuildingInformation() {
        return this.name;
    }

    @Override
    public ArrayList getSensorInformation() {
        ArrayList sensorInfoList = new ArrayList<String>();
        for (int i = 0; i<this.sensorList.size(); i++) {
            Sensor iSensor = (Sensor) this.sensorList.get(i);
            String iSensorInfo = iSensor.name+" "+iSensor.value+" "+iSensor.type+" ";
            sensorInfoList.add(iSensorInfo);

        }
        return sensorInfoList;
    }

    @Override
    public ArrayList getActuatorInformation() {
        ArrayList actuatorInfoList = new ArrayList<String>();
        for (int i = 0; i<this.actuatorList.size(); i++) {
            Actuator iActuator = (Actuator) this.actuatorList.get(i);
            String iActuatorInfo = iActuator.name+" "+iActuator.value+" "+iActuator.type+" ";
            actuatorInfoList.add(iActuatorInfo);

        }
        return actuatorInfoList;
    }

    @Override
    public void addTemperatureSensor(Sensor sensor) {
        if (sensor.type=="Temperatur") {
            this.sensorList.add(sensor);
        }
    }

    @Override
    public void addCo2Sensor(Sensor sensor) {
        if (sensor.type=="CO2") {
            this.sensorList.add(sensor);
        }
    }
    @Override
    public void addVentilationActuator(Actuator actuator) {
        if (actuator.type=="Ventilation") {
            this.actuatorList.add(actuator);
        }
    }
}
