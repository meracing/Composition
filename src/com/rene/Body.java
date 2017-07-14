package com.rene;

/**
 * Created by RCornella on 14-7-2017.
 */
public class Body {

    private String model;
    private String color;
    private String material;
    private int doors;

    public Body(String model, String color, String material, int doors) {
        this.model = model;
        this.color = color;
        this.material = material;
        this.doors = doors;
    }

    public void unlockcar(){
        System.out.println("Body -> doors are locked");



    //public void unlockcar(String lockDors){
    //    System.out.println("Body -> doors are : " + lockDors);
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getDoors() {
        return doors;
    }
}
