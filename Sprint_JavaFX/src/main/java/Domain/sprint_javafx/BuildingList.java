package Domain.sprint_javafx;

import java.util.ArrayList;

public class BuildingList {
    ArrayList buildingList = new ArrayList<Building>();
    BuildingList(ArrayList buildingList){
        this.buildingList=buildingList;
    }
    public void addBuilding(Building building){
        this.buildingList.add(building);
    }
    public void removeBuilding(Building building){
        for (int i = 0; i<building.actuatorList.size(); i++) {
            building.actuatorList.remove(i);
        }
        for (int i = 0; i<building.sensorList.size(); i++) {
            building.sensorList.remove(i);
        }
        this.buildingList.remove(building);
    }
    public void printBuildingList(){
        for (int i = 0; i<this.buildingList.size(); i++) {
            Building iBuilding = (Building) this.buildingList.get(i);
            System.out.print("Bygning nr. "+(i+1)+" Navn: "+iBuilding.name+" ");
            if (iBuilding.actuatorList.size()>0){
                System.out.print("Associeret aktuatorer: ");
                for (int ii = 0; ii<iBuilding.actuatorList.size(); ii++)
                {
                    Actuator iActuator = (Actuator) iBuilding.actuatorList.get(ii);
                    System.out.print("["+iActuator.name+", "+iActuator.value+", "+iActuator.type+"] ");
                }
            }
            if (iBuilding.sensorList.size()>0){
                System.out.print("Associeret sensorer: ");
                for (int ii = 0; ii<iBuilding.sensorList.size(); ii++)
                {
                    Sensor iSensor = (Sensor) iBuilding.sensorList.get(ii);
                    System.out.print("["+iSensor.name+", "+iSensor.value+", "+iSensor.type+"] ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public ArrayList getBuildingList(){
    return buildingList;
    }
}
