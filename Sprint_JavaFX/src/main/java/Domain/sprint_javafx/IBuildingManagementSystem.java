/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.sprint_javafx;

import java.util.ArrayList;

/**
 *
 * @author ancla
 */
public interface IBuildingManagementSystem {   
    /**
     *
     * @return Map containing UUIDs of all buildings in the system along with an associated description (i.e. name)
     */
    public String getBuildingInformation();

    /**
     * //* @param buildingId Building from which sensors are acquired
     *
     * @return Map containing UUIDs of all sensors in building with buildingId, along with associated description of each sensor (i.e. name)
     */
    public ArrayList getSensorInformation();

    /**
     *
     //* @param buildingId Building from which sensors are acquired
     * @return Map containing UUIDs of all actuators in building with buildingId, along with associated description of each actuator (i.e. name)
     */
    public ArrayList getActuatorInformation();
    
    /**
     *
     //* @param buildingId Id of building to which sensor should be added.
     //* @param name Name of the new sensor.
     //* @return the UUID of the newly created sensor.
     */
    public void addTemperatureSensor(Sensor sensor);

    /**
     *
     //* @param buildingId Id of building to which sensor should be added.
     //* @param name Name of the new sensor.
     //* @return the UUID of the newly created sensor.
     */
    public void addCo2Sensor(Sensor sensor);

    /**
     *
     //* @param buildingId id of building from which the sensor should be removed.
     //* @param sensorId  id of sensor to remove.
     */
    public void removeSensor(Sensor sensor);
    
    /**
     *
     //* @param buildingId id of building to which actuator should be added.
     //* @param name Name of the new actuator.
     //* @return the UUID of the newly created actuator.
     */
    public void addVentilationActuator(Actuator actuator);

    /**
     *
     //* @param buildingId id of building from which actuator should be removed.
     //* @param actuatorId id of actuator to remove.
     */
    public void removeActuator(Actuator actuator);
    
}
