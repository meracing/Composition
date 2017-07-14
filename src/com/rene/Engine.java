package com.rene;

/**
 * Created by RCornella on 14-7-2017.
 */
public class Engine {

    private String name;
    private String manufacture;
    private EngineDetail power;

    public Engine(String name, String manufacture, EngineDetail power) {
        this.name = name;
        this.manufacture = manufacture;
        this.power = power;
    }

    public void engineDetail2 (int cylinder, int ccm, int PS){
        System.out.println("Engine -> Engine details : Cylinder: " + cylinder + " CCM: " + ccm + " PS: "+PS);
    }

    public String getName() {
        return name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public EngineDetail getPower() {
        return power;
    }
}
