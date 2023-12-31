package Domain.sprint;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor("SensorGang", 5.0, "CO2");
        Sensor sensor2 = new Sensor("SensorGoat", 2.0, "Temperatur");

        Actuator actuator1 = new Actuator("AktuatorWeed", 3.0,"Ventilation");
        Actuator actuator2 = new Actuator("AktuatorHog", 1.0,"Ventilation");

        Building building1 = new Building("SommerHus",new ArrayList<>(), new ArrayList<>());
        Building building2 = new Building("GamingHus",new ArrayList<>(), new ArrayList<>());

        building1.addActuator(actuator1);
        building1.addSensor(sensor1);
        building2.addActuator(actuator2);
        building2.addSensor(sensor2);

        BuildingList buildingList1 = new BuildingList(new ArrayList<>());

        buildingList1.addBuilding(building1);
        buildingList1.addBuilding(building2);

        buildingList1.printBuildingList();

        building1.removeActuator(actuator1);

        buildingList1.printBuildingList();

        buildingList1.removeBuilding(building1);

        buildingList1.printBuildingList();

        IBuildingManagementSystem bms = new Building("bms",new ArrayList<>(), new ArrayList<>());
    }
}